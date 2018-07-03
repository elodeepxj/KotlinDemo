package com.joker.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_add.setOnClickListener { add() }

    }

    private fun startActivity() {
        var intent = Intent()
        intent.setClass(this, Main2Activity::class.java)
        startActivity(intent)
    }

    fun add() {
        val one = et_one?.text?.toString()
        val two = et_two?.text?.toString()
        if ((TextUtils.isEmpty(one)) or (TextUtils.isEmpty(two))) {
            Toast.makeText(this, "输入数字，想害我空指针吗？", Toast.LENGTH_LONG).show()
        } else {
            val result = (Integer.valueOf(one) + Integer.valueOf(two))
            when (result) {
                520 -> {
                    tv_result.text = "结果：" + result.toString()
                    Toast.makeText(this, "我擦，这都能猜对", Toast.LENGTH_LONG).show()
                    btn.setOnClickListener {
                        startActivity()
                    }
                }
                else -> Toast.makeText(this, "哎哟，不错哦，离答案很近了", Toast.LENGTH_LONG).show()
            }

        }
    }
}
