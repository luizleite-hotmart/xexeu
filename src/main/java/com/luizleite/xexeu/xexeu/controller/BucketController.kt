package com.luizleite.xexeu.xexeu.controller

import com.luizleite.xexeu.xexeu.entity.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("rest/v1/bucket")
class BucketController {

    @GetMapping
    fun getUserBucket(user: User) : ResponseEntity<*> {
        return ResponseEntity.ok("start is ok ${user.slug}")
    }
}
