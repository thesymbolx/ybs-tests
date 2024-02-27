package com.example.ybstests

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ybstests.ui.theme.YbsTestsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YbsTestsTheme {
                var showScreenOne by remember { mutableStateOf(true) }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    if(showScreenOne) {
                        ScreenOne {
                            showScreenOne = false
                        }
                    } else {
                        ScreenTwo {
                            showScreenOne = true
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ScreenOne(showScreenOne: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Hello Dale!",
            modifier = Modifier.weight(1f)
        )

        Button(
            onClick = showScreenOne,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Next Screen")
        }
    }
}

@Composable
fun ScreenTwo(showScreenTwo: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Hello World!",
            modifier = Modifier.weight(1f)
        )

        Button(
            onClick = showScreenTwo,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Previous Screen")
        }
    }
}