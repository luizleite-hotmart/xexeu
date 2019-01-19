package com.luizleite.xexeu.xexeu.services

import com.luizleite.xexeu.xexeu.entity.UserFile
import com.luizleite.xexeu.xexeu.repositorys.UserFileRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BucketService @Autowired constructor(private val userFileRepository:UserFileRepository,
                                           private val userService: UserService){

    fun findAllFilesFromUser(slug:String, name:String?):List<UserFile> {
        val user = userService.createUserOrReturnIfExists(slug, name)
        val files = userFileRepository.findAllFilesFromUser(user!!)
        return files
    }

}