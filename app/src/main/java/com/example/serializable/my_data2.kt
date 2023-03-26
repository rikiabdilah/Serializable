package com.example.serializable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.serializable.databinding.ActivityMyData2Binding

class my_data2 : AppCompatActivity() {
    private lateinit var binding: ActivityMyData2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMyData2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val showData2 = intent.getParcelableExtra<Parcelizable>("User2") as Parcelizable
        val name2 = showData2.name
        val email2 = showData2.email
        val phone2 = showData2.phone
        val address2 = showData2.address
        val age2 = showData2.age

        binding.dataNama.text = showData2.name
        binding.dataEmail.text = showData2.email
        binding.dataPhone.text = showData2.phone.toString()
        binding.dataAlamat.text = showData2.address
        binding.dataUmur.text = showData2.age.toString()

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
    }

}