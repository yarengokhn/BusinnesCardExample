package com.example.businesscardapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFB6D6C3)
                ) {
                BusinessCard(
                    modifier = Modifier.fillMaxSize(),
                    title = "Android Developer Extraordinaire" ,
                    name = "Jennifer Doe ",
                    imagePainter = painterResource(R.drawable.android_logo)


                )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(title: String, name: String,
             imagePainter: Painter, modifier: Modifier = Modifier) {
    Column(modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier.weight(0.7F),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = imagePainter,
                contentDescription = null,
                modifier=Modifier
                    .size(200.dp)

                )
            Text(
                text = name,
                modifier = Modifier,
                fontSize = 30.sp,

                )
            Text(
                text = title,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier,
                color= Color(0xFF20663D)
            )

        }

        Column(
            modifier = Modifier
                .padding(
                    bottom = 16.dp
                )
                .weight(0.3F),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Row (modifier=Modifier,
                verticalAlignment=Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center)
                {

                Icon(
                     Icons.Rounded.Phone,
                    contentDescription = null,
                    modifier = Modifier
                        .size(18.dp),
                    tint = Color(0xFF20663D)

                )
                Text(
                    text = "+90 (123) 444 55 66",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(8.dp)

                )
            }
            Row (modifier=Modifier,
                verticalAlignment=Alignment.CenterVertically,
               ){

                Icon(

                    Icons.Rounded.Share,
                    contentDescription = null,
                    modifier = Modifier
                        .size(18.dp),
                    tint = Color(0xFF20663D)


                )
                Text(
                    text = "@socialmediahandle",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(8.dp)
                )

            }
            Row (modifier=Modifier,
                verticalAlignment=Alignment.CenterVertically){

                Icon(
                    Icons.Rounded.Email,
                    contentDescription = null,
                    modifier = Modifier
                        .size(18.dp),
                    tint = Color(0xFF20663D)

                )
                Text(
                    text = "jen.doe@android.com",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(8.dp)
                )


            }

        }
    }
}
//Compact example
@Preview(
    showBackground = true,
    widthDp = 240, // width<600dp
    heightDp = 400 // height <480dp
)
@Composable
fun GreetingPreviewCompact() {
    BusinessCardAppTheme {
        BusinessCard(title = "Android Developer Extraordinaire", name = "Jennifer Doe ", imagePainter = painterResource(R.drawable.android_logo))
    }
}
// Common/Average screen dimension example
@Preview(
    showBackground = true,
    widthDp = 360,
    heightDp = 640
)
@Composable
fun GreetingPreviewCommon() {
    BusinessCardAppTheme {
        BusinessCard(title = "Android Developer Extraordinaire", name = "Jennifer Doe ", imagePainter = painterResource(R.drawable.android_logo))
    }
}

//Medium example
@Preview(
    showBackground = true,
    widthDp = 600, //600 dp ≤ weight < 840 dp
    heightDp = 800 // 480 dp ≤ height < 900 dp
)
@Composable
fun GreetingPreviewMedium() {
    BusinessCardAppTheme {
        BusinessCard(title = "Android Developer Extraordinaire", name = "Jennifer Doe ", imagePainter = painterResource(R.drawable.android_logo))
    }
}

//Expanded example
@Preview(
    showBackground = true,
    widthDp = 840,//width ≥ 840 dp
    heightDp = 900 // height ≥ 900 dp
)
@Composable
fun GreetingPreviewExpanded() {
    BusinessCardAppTheme {
        BusinessCard(title = "Android Developer Extraordinaire", name = "Jennifer Doe ", imagePainter = painterResource(R.drawable.android_logo))
    }
}

