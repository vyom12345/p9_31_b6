package com.example.p9_31_b6

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.p9_31_b6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var alarmimages_frameByFrameAnimation : AnimationDrawable
    lateinit var heart_frameByFrameAnimation : AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgAlarm.setBackgroundResource(R.drawable.alarm_image_list)

        binding.imgHeart.setBackgroundResource(R.drawable.heart_image_list)

        alarmimages_frameByFrameAnimation = binding.imgAlarm.background as AnimationDrawable

        heart_frameByFrameAnimation = binding.imgHeart.background as AnimationDrawable
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)

        if(hasFocus){
            alarmimages_frameByFrameAnimation.start()
            heart_frameByFrameAnimation.start()
        }
    }
}
