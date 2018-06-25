package com.gmail.stella1198.a3rdseminar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        chat_name_tv.text = intent.getStringExtra("name")
        chat_profile_image.setImageResource(intent.getIntExtra("profile", 0))
    }
}
