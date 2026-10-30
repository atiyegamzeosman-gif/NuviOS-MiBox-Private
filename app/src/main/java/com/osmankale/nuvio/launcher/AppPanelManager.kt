package com.osmankale.nuvio.launcher
import android.content.Context
import android.content.pm.PackageManager

class AppPanelManager(private val context: Context) {
    data class App(val name: String, val pkg: String)
    fun getInstalledApps(): List<App> {
        val pm = context.packageManager
        return pm.getInstalledApplications(PackageManager.GET_META_DATA)
            .filter { pm.getLaunchIntentForPackage(it.packageName) != null }
            .map { App(pm.getApplicationLabel(it).toString(), it.packageName) }
            .take(20)
    }
}
