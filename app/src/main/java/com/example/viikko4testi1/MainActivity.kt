package com.example.viikko4testi1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.* //fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.viikko4testi1.ui.theme.Viikko4testi1Theme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Viikko4testi1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/*
//lisään MyApp osion tähän viikkotehtävää varten
@Composable
fun MyApp(
    //Define a Modifier to be reused across multiple components
    val appModifier: Modifier
    .fillMaxWidth()
    .padding(8.dp)

    //The Column holds the composables vertically
    Column(
        modifier = Modifier.fillMaxSize(),
        vertcalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "My Title"
            style = MaterialTheme.typography.headlineSmall,
            modifier = appModifier
        )

    //
    }
)*/



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Hello $name!")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /* Tee jotain kun nappia painetaan */ }) {
            Text(text = "Test")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Viikko4testi1Theme {
        Greeting("Android")
    }
}