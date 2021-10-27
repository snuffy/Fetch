package com.tonyodev.fetch2.database.models

import androidx.room.ColumnInfo
import com.tonyodev.fetch2.database.DownloadDatabase
import com.tonyodev.fetch2core.Extras

data class ExtraUpdater(
    @ColumnInfo(
        name = DownloadDatabase.COLUMN_ID,
        typeAffinity = ColumnInfo.INTEGER
    ) val id: Int,
    @ColumnInfo(
        name = DownloadDatabase.COLUMN_EXTRAS,
        typeAffinity = ColumnInfo.TEXT
    ) val extras: Extras
)
