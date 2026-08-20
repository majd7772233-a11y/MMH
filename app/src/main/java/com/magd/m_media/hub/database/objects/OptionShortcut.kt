package com.magd.m_media.hub.database.objects

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity
@Serializable
data class OptionShortcut(@PrimaryKey(autoGenerate = true) val id: Long = 0, val option: String)
