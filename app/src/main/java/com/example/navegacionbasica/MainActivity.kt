package com.example.navegacionbasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegacionbasica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //New Method
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // XML -> View
        setContentView(binding.root)
        //launcher = registerForActivityResult(startActivityForResult(::showSelector())

        // Method to the other activity

        fun changeActivity() {
            when(binding.root.id) {

            }
        }

        binding.platoBtn.setOnClickListener{
            val intent : Intent = Intent(this, DinosaurioFiuFiu::class.java)
            startActivity(intent)

        }





    }
}