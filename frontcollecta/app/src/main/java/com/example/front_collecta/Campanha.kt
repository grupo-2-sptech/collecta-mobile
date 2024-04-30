package com.example.front_collecta

import android.os.Bundle
import android.widget.Button
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.front_collecta.ui.theme.FrontcollectaTheme

class Campanha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrontcollectaTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Column {
            TopBar()
            Spacer(modifier = Modifier.weight(1f))
            BottomNavigation()
        }
    }

    @Composable
    fun TopBar() {
        var showMenu by remember { mutableStateOf(false) }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(id = R.color.tufts))
                .padding(0.dp, 5.dp, 0.dp, 5.dp)
        ) {
            IconButton(
                onClick = { showMenu = !showMenu },
                modifier = Modifier.size(24.dp)
            ) {
                Icon(imageVector = Icons.Filled.Menu,
                    contentDescription = "Menu",
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .size(30.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1f)) // Fill remaining space

            Image(
                painter = painterResource(id = R.drawable.menuicon), // Change to your profile picture
                contentDescription = "Pesquisar",
                Modifier.size(40.dp)
            )

            Spacer(modifier = Modifier.weight(1f)) // Fill remaining space

            Image(
                imageVector = Icons.Filled.Search, // Replace with your profile picture
                contentDescription = "Pesquisar",
                modifier = Modifier
                    .size(30.dp)
                    .align(Alignment.CenterVertically)
            )
        }

        if (showMenu) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colorResource(id = R.color.tufts))
                    .padding(16.dp)
            ) {
                MenuItem(
                    text = "Opção 1",
                    onClick = { /* Handle option 1 click */ }
                )

                MenuItem(
                    text = "Opção 2",
                    onClick = { /* Handle option 2 click */ }
                )

                MenuItem(
                    text = "Opção 3",
                    onClick = { /* Handle option 3 click */ }
                )
            }
        }
    }

    @Composable
    fun MenuItem(
        text: String,
        onClick: () -> Unit
    ) {
        Button(
            onClick = onClick,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(text)
        }
    }


    @Composable
    fun BottomNavigation() {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {

            IconButton(onClick = { /*Vai pra tela de voluntário*/ }) {
                Icon(Icons.Filled.Face, contentDescription = "Volunteer")
            }

            IconButton(onClick = { /*Vai pra tela de doação*/ }) {
                (Image(painter = painterResource(id = R.drawable.maos),
                    contentDescription = "Doações",
                    modifier = Modifier
                        .background(colorResource(id = R.color.tufts))
                        .padding(5.dp)
                )
                        )
            }

            IconButton(onClick = { /*Vai pra outra tela*/ }) {
                Icon(Icons.Filled.AccountCircle, contentDescription = "Feed")
            }
        }
    }


}