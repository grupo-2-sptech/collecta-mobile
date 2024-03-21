package com.example.front_collecta

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AlertDialog
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.front_collecta.ui.theme.FrontcollectaTheme

class MainActivity : ComponentActivity() {

    private lateinit var dialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrontcollectaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
//        findViewById<Button>(R.id.btn_linha2).setOnClickListener {
//            showDialogNormal()
//        }
    }

//    private fun showDialogNormal(){
//        val build = AlertDialog.Builder(this)
//        val view = layoutInflater.inflate(R.layout.customdialog, null)
//
//        build.setView(view)
//
//        dialog = build.create()
//        dialog.show()
//    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FrontcollectaTheme {
        Greeting("Android")
    }
}