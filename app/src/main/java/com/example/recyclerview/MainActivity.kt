package com.example.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvView = findViewById<RecyclerView>(R.id.recyclerView)

        val itemList = ArrayList<BoardItem>()

        itemList.add(BoardItem("parkhwan","24","컴퓨터공학과"))
        itemList.add(BoardItem("hanbi","26","영어영문학과"))



        val boardAdapter = RecyclerViewAdapter(itemList) //어뎁터를 만들고 아이템리스트 추가
        boardAdapter.notifyDataSetChanged()

        rvView.adapter = boardAdapter //리싸이클러뷰에 어댑터 붙여주기
        rvView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)// 레이아웃 매니저 설정




    }
}