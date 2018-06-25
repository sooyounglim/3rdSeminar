package com.gmail.stella1198.a3rdseminar

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class KakaoViewAdapter(private var kakaoItems : ArrayList<KakaoData>) : RecyclerView.Adapter<KakaoViewHolder>() {
    private lateinit var OnItemClick: View.OnClickListener

    fun setOnItemClickListener(l: View.OnClickListener){
        OnItemClick = l
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KakaoViewHolder {
        val mainView : View = LayoutInflater.from(parent.context).inflate(R.layout.kakao_item, parent, false)
        mainView.setOnClickListener(OnItemClick)
        return KakaoViewHolder(mainView)
    }

    override fun getItemCount(): Int = kakaoItems.size

    override fun onBindViewHolder(holder: KakaoViewHolder, position: Int) {
        holder.kakaoProfile.setImageResource(kakaoItems[position].profile)
        holder.kakaoName.text = kakaoItems[position].name
        holder.kakaoDate.text = kakaoItems[position].date
        holder.kakaoPreview.text = kakaoItems[position].preView
    }
}