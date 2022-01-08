package com.tonyodev.fetch2.database.join

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.tonyodev.fetch2.database.DownloadDatabase
import com.tonyodev.fetch2.database.DownloadInfo
import com.tonyodev.fetch2.database.Tag
import com.tonyodev.fetch2.database.TagRef

data class DownloadWithTags(
    @Embedded val download: DownloadInfo,
    @Relation(
        parentColumn = DownloadDatabase.COLUMN_ID,
        entityColumn = DownloadDatabase.COLUMN_TAG_ID,
        associateBy = Junction(TagRef::class)
    ) val tags: List<Tag>,
)
