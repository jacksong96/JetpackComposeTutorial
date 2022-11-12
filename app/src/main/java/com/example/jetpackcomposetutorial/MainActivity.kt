package com.example.jetpackcomposetutorial

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    JetpackTutorialWithImage(stringResource(R.string.header_text), stringResource(R.string.para_one_text), stringResource(R.string.para_two_text))
                }
            }
        }
    }
}

@Composable
fun JetpackTutorialWithImage(header: String, firstPara: String, secondPara: String){
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = "header image of mobile phone image with applications",
            modifier = Modifier.fillMaxWidth()
        )
        JetpackTutorialWithText(header = header, firstPara = firstPara, secondPara = secondPara)
    }
}

@Composable
fun JetpackTutorialWithText(header: String, firstPara: String, secondPara: String) {
    Column {
        Text(text = header,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(16.dp)
        )
        Text(text = firstPara,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(text = secondPara,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
                .padding(16.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTutorialTheme {
        JetpackTutorialWithImage(stringResource(R.string.header_text), stringResource(R.string.para_one_text), stringResource(R.string.para_two_text))
    }
}