package android.example.lesson3binding

import android.annotation.SuppressLint
import android.example.lesson3binding.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var bandingClass : ActivityMainBinding  // ActivityMainBinding это тип разметки
    val a = 234
    val b = 34





    @SuppressLint("SetTextI18n")
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bandingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(bandingClass.root)

        bandingClass.b1.setOnClickListener {
            val result = a+b
            bandingClass.tvResult.text = "Резльтат сложения равен $result"
        }
        bandingClass.b2.setOnClickListener {
            val result = a-b
            bandingClass.tvResult.text = "Результат вычитания равен $result "
        }
        bandingClass.b3.setOnClickListener {
            val result = a*b
            bandingClass.tvResult.text = "Результат умножения равен $result"
        }



    }
}