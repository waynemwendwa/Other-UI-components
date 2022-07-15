package com.wayne.components

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressCircular : ProgressBar = findViewById(R.id.progressBarCircular)
        val progressHorizontal : ProgressBar = findViewById(R.id.progressBarHorizontal)
        val buttonStart :Button = findViewById(R.id.buttonStart)
        val buttonScroll :Button = findViewById(R.id.buttonScrolling)

        buttonStart.setOnClickListener {
            if(progressCircular.isVisible)
            {
                progressCircular.visibility = View.GONE
                progressHorizontal.visibility = View.GONE
            }else{
                progressCircular.visibility = View.VISIBLE
                progressHorizontal.visibility = View.VISIBLE
            }
        }

        buttonScroll.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }


    }
}