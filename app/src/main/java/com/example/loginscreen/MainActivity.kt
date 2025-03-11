package com.example.loginscreen
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.activity.ComponentActivity



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //to run linear layout
        setContentView(R.layout.linear)

        //to run relative layout
        //setContentView(R.layout.relative)

        //to run constraint layout
        //setContentView(R.layout.constraint)

    }
}
