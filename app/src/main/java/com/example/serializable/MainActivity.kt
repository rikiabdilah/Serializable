package com.example.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.serializable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val inputName = binding.nama.text.toString()
            val inputEmail = binding.email.text.toString()
            val inputPhone = binding.phone.text.toString()
            val inputAddress = binding.address.text.toString()
            val inputAge = binding.age.text.toString()
            val user = Serializable(inputName, inputEmail, inputPhone, inputAddress, inputAge)
            val secondActivity = Intent(this, my_data::class.java)
            secondActivity.putExtra("User",user)
            startActivity(secondActivity)
        }

        binding.btnParcel.setOnClickListener {
            val inputName = binding.nama.text.toString()
            val inputEmail = binding.email.text.toString()
            val inputPhone = binding.phone.text.toString()
            val inputAddress = binding.address.text.toString()
            val inputAge = binding.age.text.toString()
            val user = Parcelizable(inputName, inputEmail, inputPhone, inputAddress, inputAge)
            val secondActivity = Intent(this, my_data2::class.java)
            secondActivity.putExtra("User2",user)
            startActivity(secondActivity)
        }
    }

}