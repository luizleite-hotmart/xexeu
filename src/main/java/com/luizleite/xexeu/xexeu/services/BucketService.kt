package com.luizleite.xexeu.xexeu.services

import com.luizleite.xexeu.xexeu.entity.UserFile
import com.luizleite.xexeu.xexeu.repositorys.UserFileRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BucketService @Autowired constructor(private val userFileRepository:UserFileRepository){

    fun findAllFilesFromUser(slug:String):List<UserFile> {
        val files = userFileRepository.findUserFileBySlug(slug)
        return files
    }

}