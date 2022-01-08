package com.tonyodev.fetch2.database

import androidx.room.*
import androidx.room.OnConflictStrategy.IGNORE
import com.tonyodev.fetch2.database.DownloadDatabase.Companion.COLUMN_TAG_ID
import com.tonyodev.fetch2.database.DownloadDatabase.Companion.TABLE_TAG_REF_NAME
import com.tonyodev.fetch2.database.join.DownloadInfoAndTag

@Dao
abstract class TagRefDao {

    @Query("SELECT * FROM $TABLE_TAG_REF_NAME WHERE $COLUMN_TAG_ID=:id")
    abstract fun getDownloadsByTag(id: Int): DownloadInfoAndTag?

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