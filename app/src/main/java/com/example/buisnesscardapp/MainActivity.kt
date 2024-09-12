package com.example.buisnesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuisnessCardAppTheme {
                // A surface container using the 'background' color
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color(FFBB86FC)
                ) {
                    BuisnessCard()
                }
            }
        }
        }
    }


@Composable
fun BuisnessCard (){
    Column ()
        horizontalAlignment = Alignment.CenterHorizontally; VerticalArrangement = Arrangement.Center) run {
        val image = painterResource(id = R.drawable.android_logo)
        Image(
            painter = image, contentDescription = null, Modifier.fillMaxWidth(0.4f)
        )
        Text(text = stringResource(R.string.name), fontSize = 60.sp, color = Color(FFFFFFFF))
        Text(text = stringResource(R.string.title), fontSize = 25.sp, color = Color(FFFFFFFF))
        Spacer(modifier = Modifier.padding(bottom = 200.dp))
        Divider(modifier = Modifier.fillMaxWidth(), color = Color(FFBB86FC))
        ContactRow(
            text = stringResource(R.string.phone_number),
            icon = Icons.Rounded.Phone
        )
        Divider(modifier = Modifier.fillMaxWidth(), color = Color(FFFFFFFF))
        ContactRow(
            text = stringResource(R.string.email), icon = Icons.Rounded.Email
        )
        Divider(modifier = Modifier.fillMaxWidth(), color = Color(FFFFFFFF))
        ContactRow(
            text = stringResource(R.string.location), icon = Icons.Rounded.Location
        )
    }
}

@Composable
fun ContactRow(
    text: String, icon: ImageVector, textBlur: Dp = 0.dp
){
    Row (
        horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(16.dp)
    ){
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = White,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = text, color = Color.White, modifier = Modifier.weight(3f)
        )
    }
}

@Preview(showBackground = true, showSystemUi = True)
@Composable
fun BuisnessCardPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = Color.White
    ){
        BuisnessCardTheme{
            BuisnessCard()
        }
    }
}
