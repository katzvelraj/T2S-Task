package com.sample.test.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity
data class Home(
    @PrimaryKey
    val id: Long,
    val name: String,
    val price: Double
)
