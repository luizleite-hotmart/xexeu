package com.luizleite.xexeu.xexeu.controller

import com.luizleite.xexeu.xexeu.services.BucketService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("rest/v1/bucket")
class BucketController {

    private var bucketService: BucketService

    @Autowired
    constructor(bucketService: BucketService) {
        this.bucketService = bucketService
    }

    @GetMapping
    fun getUserBucket(user: String) : ResponseEntity<*> {
        val list = bucketService.findAllFilesFromUser(user)
        return ResponseEntity.ok(list)
    }
}
