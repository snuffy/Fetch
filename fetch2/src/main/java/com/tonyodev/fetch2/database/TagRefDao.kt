package com.tonyodev.fetch2.database

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE

@Dao
abstract class TagRefDao {

    @Insert(onConflict = IGNORE)
    abstract fun addTagRef(ref: TagRef): Long

    @Update
    abstract fun updateTagRef(ref: TagRef)

    @Transaction
    open fun addOrUpdateTagRef(ref: TagRef) {
        if (addTagRef(ref) == -1L) {
            updateTagRef(ref)
        }
    }
}