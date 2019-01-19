package com.luizleite.xexeu.xexeu.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserFile(
        @Column
        var slug:String,
        @Column
        var webPath:String,
        @Column
        var name:String,
        @Id
        var fileHash:String)