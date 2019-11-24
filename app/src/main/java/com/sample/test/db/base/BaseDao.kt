package com.sample.test.db.base

import androidx.room.Insert
import androidx.room.OnConflictStrategy


abstract class BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract suspend fun insert(users: List<T>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract suspend fun insert(user: T)
}