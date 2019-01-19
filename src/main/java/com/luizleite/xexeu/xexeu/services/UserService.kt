package com.luizleite.xexeu.xexeu.services

import com.luizleite.xexeu.xexeu.entity.User
import com.luizleite.xexeu.xexeu.repositorys.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService @Autowired constructor(private val userRepository:UserRepository){


    fun verifyIfUserExists(slug: String): Boolean{
        val user = userRepository.findUserBySlug(slug)
        return user != null
    }

    fun createUserOrReturnIfExists(slug: String, name:String?): User? {
        if (!verifyIfUserExists(slug)) {
            val user = User(slug, name)
            userRepository.save(user)
            return user
        }
        return userRepository.findUserBySlug(slug)
    }

    fun retrieveAllUsers(): List<User> {
        return userRepository.findAll().toList()
    }

}