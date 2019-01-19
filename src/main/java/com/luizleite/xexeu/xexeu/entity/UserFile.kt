package com.luizleite.xexeu.xexeu.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserFile(
        @Id
        var fileHash:String? = null,
        @Column
        var slug:String? = null,
        @Column
        var webPath:String? = null,
        @Column
        var name:String? = null)