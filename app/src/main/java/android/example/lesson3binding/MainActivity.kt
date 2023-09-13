package android.example.lesson3binding

import android.annotation.SuppressLint
import android.example.lesson3binding.databinding.ActivityMainBinding
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding  // ActivityMainBinding это тип разметки

    override fun onCreate(s: Bundle?){
        super.onCreate(s)
        bindingClass=ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {
            val resultValue : Int = bindingClass.edValue.text.toString().toInt()
           // Log.d("MyLog2", "Result =  $resultValue")
            when(resultValue){

                in 0..1000 -> {
                    bindingClass.tvResult.visibility=View.VISIBLE
                    bindingClass.tvResult.text = "Вы начинающий блогер"
                }
                in 1000..100000 ->{
                    bindingClass.tvResult.visibility=View.VISIBLE
                    bindingClass.tvResult.text = "Вы средний блогер"
                }
                else ->{
                    bindingClass.tvResult.visibility=View.VISIBLE
                    bindingClass.tvResult.text = "Вы супер ЗВЕЗДА!"
                }

            }
        }
    }



}