package com.osmankale.nuvio.launcher
class EpgBridge {
    data class Channel(val name: String, val now: String, val progress: Float)
    fun getChannels() = listOf(
        Channel("TRT1", "Haber", 0.5f),
        Channel("Kanal D", "Dizi", 0.3f),
        Channel("Show", "Film", 0.7f)
    )
}
