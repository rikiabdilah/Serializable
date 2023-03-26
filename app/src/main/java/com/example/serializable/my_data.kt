package com.example.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.serializable.databinding.ActivityMainBinding
import com.example.serializable.databinding.ActivityMyDataBinding

class my_data : AppCompatActivity() {
    private lateinit var binding: ActivityMyDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val showData = intent.getSerializableExtra("User") as Serializable
        val name = showData.name
        val email = showData.email
        val phone = showData.phone
        val address = showData.address
        val age = showData.age

        binding.dataNama.text = showData.name
        binding.dataEmail.text = showData.email
        binding.dataPhone.text = showData.phone
        binding.dataAlamat.text = showData.address
        binding.dataUmur.text = showData.age

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

//        val showData2 = intent.getParcelableExtra<Parcelizable>("User2") as Parcelizable
//        val name2 = showData2.name
//        val email2 = showData2.email
//        val phone2 = showData2.phone
//        val address2 = showData2.address
//        val age2 = showData2.age
//
//        binding.dataNama.text = showData2.name
//        binding.dataEmail.text = showData2.email
//        binding.dataPhone.text = showData2.phone.toString()
//        binding.dataAlamat.text = showData2.address
//        binding.dataUmur.text = showData2.age.toString()
//
//        binding.btnBack.setOnClickListener {
//            startActivity(Intent(this, MainActivity::class.java))
//
//        }
    }
}