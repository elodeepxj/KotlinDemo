package com.joker.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import java.util.*
import kotlinx.android.synthetic.main.activity_main2.*



class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvContent.text = ""
        val mList = ArrayList<String>()
        for(i in 1..100){
            mList.add("第"+i+"条")
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(mList,this)
        listOf("a","b","c")
    }
}
