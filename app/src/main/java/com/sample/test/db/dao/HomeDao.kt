package com.sample.test.db.dao

import androidx.room.Dao
import androidx.room.Query
import com.sample.test.db.base.BaseDao
import com.sample.test.db.entity.Home


@Dao
abstract class HomeDao : BaseDao<Home>() {

    suspend fun save(item: Home) {
        insert(item)
    }

    suspend fun saveAll(items: List<Home>) {
        insert(items)
    }

    @Query("SELECT * from Home")
    abstract suspend fun getAllData(): List<Home>
}
