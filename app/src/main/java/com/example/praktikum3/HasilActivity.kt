package com.example.praktikum3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.praktikum3.databinding.ActivityHasilBinding

class HasilActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHasilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fullName = intent.getStringExtra("fullName")
        val username = intent.getStringExtra("username")
        val age = intent.getStringExtra("age")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")

        binding.tvFullName.text = "$fullName"
        binding.tvUsername.text = "$username"
        binding.tvAge.text = "$age"
        binding.tvEmail.text = "$email"
        binding.tvGender.text = "$gender"

        if (gender.equals("Laki-laki", ignoreCase = true)) {
            binding.imgResult.setImageResource(R.drawable.lanang)
        } else if (gender.equals("Perempuan", ignoreCase = true)) {
            binding.imgResult.setImageResource(R.drawable.wadon)
        } else {
            binding.imgResult.setImageResource(R.mipmap.ic_launcher)
        }
    }
}
