package org.geeksforgeeks.appheapsize

import android.app.ActivityManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextView = findViewById<TextView>(R.id.text_view_1)

        val mActivityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val mMemoryClass: Int = Objects.requireNonNull(mActivityManager).memoryClass

        mTextView.text = "Heap Size: $mMemoryClass MB"
    }
}