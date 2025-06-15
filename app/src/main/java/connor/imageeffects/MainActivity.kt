package connor.imageeffects

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import connor.imageeffects.ui.theme.ImageEffectsTheme
import connor.imageeffects.view.PlaneLoopPathing

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImageEffectsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PlaneLoopPathing(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
