package com.tonyodev.fetch2.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = DownloadDatabase.TABLE_TAG_NAME)
data class Tag(
        @PrimaryKey
        @ColumnInfo(name = DownloadDatabase.COLUMN_TAG_ID,
                typeAffinity = ColumnInfo.INTEGER)
        val id: Int,

        @ColumnInfo(name = DownloadDatabase.COLUMN_TITLE,
                typeAffinity = ColumnInfo.TEXT)
        val title: String
)