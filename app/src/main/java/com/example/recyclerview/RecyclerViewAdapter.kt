package com.example.recyclerview

import android.provider.ContactsContract.Profile
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(val itemList: ArrayList<BoardItem>) : RecyclerView.Adapter<RecyclerViewAdapter.BoardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.BoardViewHolder {
        //뷰가 만들어질때 호출되는 메서드
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return BoardViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        //뷰가 바인드 될때 호출되는 메서드, 뷰에 내용이 씌어질때 호출되는 메서드라 생각하면 될듯
        holder.name.text = itemList[position].age
        holder.age.text = itemList[position].name
        holder.major.text = itemList[position].major
    }

    override fun getItemCount(): Int {
        //리스트의 수를 리턴한다.
        return itemList.count()
    }

    inner class BoardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name = itemView.findViewById(R.id.tvName) as TextView
        val age = itemView.findViewById(R.id.tvAge) as TextView
        val major = itemView.findViewById(R.id.tvMajor) as TextView
    }
}