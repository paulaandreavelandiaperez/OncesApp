package com.example.onces.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.onces.R
import com.example.onces.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.animationView.setAnimation(R.raw.animacion)
        binding.animationView.playAnimation()

        handler= Handler(Looper.myLooper()!!)
        handler.postDelayed({
            var intent=Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 9000)
    }
}