package com.gmail.stella1198.a3rdseminar

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class KakaoViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
    var kakaoProfile : ImageView = itemView!!.findViewById(R.id.item_profile_image) as ImageView
    var kakaoName : TextView = itemView!!.findViewById(R.id.item_name_tv) as TextView
    var kakaoDate : TextView = itemView!!.findViewById(R.id.item_date_tv) as TextView
    var kakaoPreview: TextView = itemView!!.findViewById(R.id.item_preview_tv) as TextView
}