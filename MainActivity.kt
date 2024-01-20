package com.example.cvresume

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cvresume.ui.theme.CvresumeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            setContentView(R.layout.activity_main)
            val buttonSkills=findViewById<Button>(R.id.button)
        buttonSkills.setOnClickListener{
            intent= Intent(this,skillsActivity::class.java)
            startActivity(intent)
        }
        }
    }}
