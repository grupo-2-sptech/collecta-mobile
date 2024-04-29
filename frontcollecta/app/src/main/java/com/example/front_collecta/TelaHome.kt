package com.example.front_collecta

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.front_collecta.ui.theme.FrontcollectaTheme

class TelaHome : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrontcollectaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Home("Android")
                }
            }
        }
    }
}

@Composable
fun Home(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF1F1F1))
            .padding(start = 30.dp, end = 30.dp)
    ) {
        Column {
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
                horizontalArrangement = Arrangement.Center){
                    Text(
                        text = "Campanhas destaque",
                        color = Color(0xFF4E7AC7),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                    Box(modifier = Modifier
                        .size(40.dp)
                        .padding(start = 8.dp)){
                        Image(
                            painter = painterResource(R.drawable.fuego),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
            }
            Text(
                text = "Assinatura",
                color = Color(0xFF4E7AC7),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier
                .height(8.dp))
            Box(modifier = Modifier
                .border(
                    width = 2.dp,
                    color = Color(0xFFA0A0A0),
                    shape = RoundedCornerShape(5.dp)
                )
                .background(Color(0xFFFFFFFF))
                .fillMaxWidth()
                .padding(10.dp)
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth(),
                    verticalAlignment  = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center
                ){
                    Text(text = "Campanhas para apoiar mensalmente",
                        color = Color(0xFF4E4E4E)
                    )
                    Box(modifier = Modifier
                        .size(30.dp)
                        .padding(start = 8.dp)){
                            Image(
                                painter = painterResource(R.drawable.info),
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(8.dp))
            ) {
                Row {
                    Box(modifier = Modifier.width(120.dp)
                        .clip(shape = RoundedCornerShape(8.dp))
                        )
                     {
                        Image(
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth(),
                            painter = painterResource(R.drawable.imagemcampanha),
                            contentDescription = null
                        )
                         Image(
                             painter = painterResource(R.drawable.destaque),
                             contentDescription = null
                         )
                    }
Box (modifier = Modifier.padding(16.dp)) {
    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "Ação de rua", fontWeight = FontWeight.Bold, fontSize = 17.sp)
        Spacer(modifier = Modifier
            .height(8.dp))
        Row {
            Box(modifier = Modifier
                .size(25.dp)
                .padding(end = 8.dp)){
                Image(
                    painter = painterResource(R.drawable.ilocal),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Text(text = "São Paulo, SP")
        }
        Spacer(modifier = Modifier
            .height(8.dp))
        Row {
            Box(modifier = Modifier
                .size(25.dp)
                .padding(end = 8.dp)){
                Image(
                    painter = painterResource(R.drawable.icategoria),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Text(text = "Literatura")
        }
        Box(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            LinearProgressIndicator(
                progress = 0.5f,
                color = Color(0xFFADD5F7),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            )
            Text(
                text = "50%",
                modifier = Modifier.align(Alignment.BottomEnd)
                , color = Color.Black
                , fontWeight = FontWeight.Bold
            )
        }
    }
}
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    FrontcollectaTheme {
//        Home("Android")
//    }
//}