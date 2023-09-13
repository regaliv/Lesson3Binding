package android.example.lesson3binding

import android.annotation.SuppressLint
import android.example.lesson3binding.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var bandingClass : ActivityMainBinding  // ActivityMainBinding это тип разметки

    @SuppressLint("SetTextI18n")
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bandingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(bandingClass.root)

        bandingClass.b2.setOnClickListener{
            bandingClass.tv4.visibility=View.GONE
        }
    }
}