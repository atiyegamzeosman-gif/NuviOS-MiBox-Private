package com.osmankale.nuvio.launcher
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

class TvOsHomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("NuviOS - Mi Box 4K\nPrivate - Osman Kale\nAkcakoca/Duzce\n\n- Ince EPG 38px\n- Bos Panel\n- 5dk Manzara\n- Hava + Haber\n- Simdi Calan")
        }
    }
}
