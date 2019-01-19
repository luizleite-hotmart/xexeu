package com.luizleite.xexeu.xexeu.services

import com.luizleite.xexeu.xexeu.entity.User
import com.luizleite.xexeu.xexeu.repositorys.UserRepository
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.Mockito.`when`
import org.mockito.Mockito.any
import kotlin.test.assertEquals

@RunWith(MockitoJUnitRunner::class)
internal open class UserServiceTest {

    @Mock
    lateinit var userRepository:UserRepository

    @Test
    fun `'retrieveUsers' retrieve all user without doing anything should return null` () {
        `when`(userRepository.findAll()).thenReturn(emptyList())
        val userService = UserService(userRepository)
        val users = userService.retrieveAllUsers()
        Assert.assertEquals(users.isEmpty(), true)
    }

    @Test
    fun `'retrieveUsers' retrieve all user with one user` () {
        val user = User("slug", "name")
        val listUser = mutableListOf<User>()
        listUser.add(user)
        `when`(userRepository.findAll()).thenReturn(listUser)
        val userService = UserService(userRepository)
        val users = userService.retrieveAllUsers()
        Assert.assertEquals(users.size, 1)
        Assert.assertEquals(users.get(0).name, "name")
        Assert.assertEquals(users.get(0).slug, "slug")
    }

    @Test
    fun `'verifyUserExists' that not exists`() {

        val userService = UserService(userRepository)
        `when`(userRepository.findUserBySlug("test")).thenReturn(null)
        assertEquals(false, userService.verifyIfUserExists("test"))
    }

}