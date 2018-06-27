package com.gmail.stella1198.a3rdseminar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3() : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        val idx: Int = main_rv.getChildAdapterPosition(v!!)
        val name: String = kakaoItems[idx].name
        val profile: Int = kakaoItems[idx].profile
        val intent : Intent = Intent(applicationContext, ChatActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("profile", profile)
        startActivity(intent)
    }

    lateinit var kakaoItems: ArrayList<KakaoData>
    var kakaoItems2: ArrayList<KakaoData> = ArrayList()
    var kakaoItems3: ArrayList<KakaoData>? = null
    lateinit var kakaoAdapter: KakaoViewAdapter

    constructor(parcel: Parcel?) : this() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        kakaoItems = ArrayList()
        kakaoItems.add(KakaoData(R.drawable.pika1,"09의 바나나 안드로이드", "낰낰", "오후 4:39"))
        kakaoItems.add(KakaoData(R.drawable.pika2,"이돌이의 차근차근기획", "낰낰", "오후 3:05"))
        kakaoItems.add(KakaoData(R.drawable.pika3,"트카의 텔미텔미딪", "낰낰", "오후 1:07"))
        kakaoItems.add(KakaoData(R.drawable.pika4,"사과의 고속사과","낰낰", "오전 9:52"))
        kakaoItems.add(KakaoData(R.drawable.pika5,"섭이의 섭섭한칼퇴", "낰낰", "오전 8:38"))
        kakaoItems.add(KakaoData(R.drawable.pika6,"인누강의 웹마이웨이", "낰낰", "오전 2:27"))
        kakaoItems.add(KakaoData(R.drawable.pika7,"신선이의 힐링캠프", "낰낰", "오전 1:14"))
        kakaoItems.add(KakaoData(R.drawable.pika8,"할머니의 당찬하루", "낰낰", "오전 12:47"))
        kakaoItems.add(KakaoData(R.drawable.pika9,"이모님의 회계원리", "낰낰", "오전 12:25"))
        kakaoItems.add(KakaoData(R.drawable.pika10,"대장의 생방송", "낰낰", "오전 12:03"))

        kakaoAdapter = KakaoViewAdapter(kakaoItems)
        kakaoAdapter.setOnItemClickListener(this)
        main_rv.layoutManager = LinearLayoutManager(this)
        main_rv.adapter = kakaoAdapter
    }

    companion object CREATOR: Parcelable.Creator<MainActivity3> {
        override fun createFromParcel(parcel: Parcel?): MainActivity3 {
            return MainActivity3(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity3?> {
            return arrayOfNulls(size)
        }
    }
}
