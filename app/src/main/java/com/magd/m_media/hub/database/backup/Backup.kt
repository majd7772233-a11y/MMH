package com.magd.m_media.hub.database.backup

import com.magd.m_media.hub.database.objects.CommandTemplate
import com.magd.m_media.hub.database.objects.DownloadedVideoInfo
import com.magd.m_media.hub.database.objects.OptionShortcut
import kotlinx.serialization.Serializable

@Serializable
data class Backup(
    val templates: List<CommandTemplate>? = null,
    val shortcuts: List<OptionShortcut>? = null,
    val downloadHistory: List<DownloadedVideoInfo>? = null,
)
