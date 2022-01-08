package com.tonyodev.fetch2.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(
        tableName = DownloadDatabase.TABLE_TAG_REF_NAME,
        primaryKeys = [DownloadDatabase.COLUMN_TAG_ID,
            DownloadDatabase.COLUMN_ID],
        foreignKeys = [
            ForeignKey(
                    entity = DownloadInfo::class,
                    parentColumns = [DownloadDatabase.COLUMN_ID],
                    childColumns = [DownloadDatabase.COLUMN_ID],
                    onDelete = CASCADE
            ),
            ForeignKey(
                    entity = Tag::class,
                    parentColumns = [DownloadDatabase.COLUMN_TAG_ID],
                    childColumns = [DownloadDatabase.COLUMN_TAG_ID],
                    onDelete = CASCADE
            )
        ]
)
data class TagRef(
        @ColumnInfo(name = DownloadDatabase.COLUMN_TAG_ID,
                typeAffinity = ColumnInfo.INTEGER)
        val tagId: Int,

        @ColumnInfo(name = DownloadDatabase.COLUMN_ID,
                typeAffinity = ColumnInfo.INTEGER,
                index = true)
        val refId: Int
)
