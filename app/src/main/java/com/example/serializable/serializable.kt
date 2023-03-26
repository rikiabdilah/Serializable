package com.example.serializable

data class Serializable(val name :String, val email : String, val phone : String,
                        val address : String, val age : String) : java.io.Serializable{

}