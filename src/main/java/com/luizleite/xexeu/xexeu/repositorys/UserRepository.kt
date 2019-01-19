package com.luizleite.xexeu.xexeu.repositorys

import com.luizleite.xexeu.xexeu.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository:CrudRepository<User,String>