package com.example.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //test
        with(binding){
            ViewProfile.apply {
                setUserName("New User")
                setUserStatus("New status")
                setIMGNum(7)
                setSubsNum(7)
                setPostsNum(7)
                setBtnColor(R.color.md_theme_dark_error)
            }
        }
    }
}