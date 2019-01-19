package com.luizleite.xexeu.xexeu.controller

import com.luizleite.xexeu.xexeu.entity.User
import com.luizleite.xexeu.xexeu.services.BucketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("rest/v1/bucket")
class BucketController @Autowired constructor(private val bucketService: BucketService){


    @GetMapping
    fun getUserBucket(user: User) : ResponseEntity<*> {
        val list = bucketService.findAllFilesFromUser(user.slug,user.name)
        return ResponseEntity.ok("start is ok ${user.slug}")
    }
}
