package com.luizleite.xexeu.xexeu.repositorys

import com.luizleite.xexeu.xexeu.entity.User
import com.luizleite.xexeu.xexeu.entity.UserFile
import org.springframework.data.repository.PagingAndSortingRepository

interface UserFileRepository:PagingAndSortingRepository<UserFile, String> {

    fun findAllFilesFromUser(user:User)
}