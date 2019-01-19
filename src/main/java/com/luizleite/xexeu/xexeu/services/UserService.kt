package com.luizleite.xexeu.xexeu.services

import com.luizleite.xexeu.xexeu.entity.User
import com.luizleite.xexeu.xexeu.repositorys.UserRepository

import org.springframework.stereotype.Service
@Service
class UserService {

    val userRepository:UserRepository

    constructor(userRepository: UserRepository) {
        this.userRepository = userRepository
    }

    fun verifyIfUserExists(slug: String): Boolean{
        val user = userRepository.findUserBySlug(slug)
        return user == null
    }

    fun createUser(slug: String, name:String?): User {
        if (!verifyIfUserExists(slug)) {
            val user = User(slug, name)
            userRepository.save(user)
            return user
        }
        return userRepository.findUserBySlug(slug)
    }

}