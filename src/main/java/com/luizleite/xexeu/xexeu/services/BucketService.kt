package com.luizleite.xexeu.xexeu.services

import com.luizleite.xexeu.xexeu.repositorys.UserFileRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BucketService @Autowired constructor(private val userFileRepository:UserFileRepository){


}