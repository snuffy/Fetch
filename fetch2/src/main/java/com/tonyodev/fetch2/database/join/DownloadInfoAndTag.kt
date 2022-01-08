package com.tonyodev.fetch2.database.join

import androidx.room.Embedded
import androidx.room.Relation
import com.tonyodev.fetch2.database.DownloadDatabase
import com.tonyodev.fetch2.database.DownloadInfo
import com.tonyodev.fetch2.database.TagRef

data class DownloadInfoAndTag(
        @Embedded val tag: TagRef,
        @Relation(
                parentColumn = DownloadDatabase.COLUMN_ID,
                entityColumn = DownloadDatabase.COLUMN_ID
        ) val downloads: List<DownloadInfo> = emptyList()
)
