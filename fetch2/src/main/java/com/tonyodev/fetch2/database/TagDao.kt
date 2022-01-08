package com.tonyodev.fetch2.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.IGNORE
import androidx.room.Transaction
import androidx.room.Update

@Dao
abstract class TagDao {

    @Insert(onConflict = IGNORE)
    abstract fun addTag(tag: Tag): Long

    @Update
    abstract fun updateTag(tag: Tag)

    @Transaction
    open fun addOrUpdateTag(tag: Tag) {
        if (addTag(tag) == -1L) {
            updateTag(tag)
        }
    }
}