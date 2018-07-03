package com.joker.kotlindemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

/**
 * @author: PengXiaoJie
 * @date: 2017/11/8 14:30
 * @detail:
 */
class RecyclerAdapter(val mList:List<String>,val mContext:Context) :RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.textView?.text = mList.get(position)
        holder?.textView?.setOnClickListener{judge(position)}
    }

    private fun judge(position: Int) {
        if(position > 50){
            toast("太大了")
        }else if(position < 50 ){
            toast("太小了")
        }else{
            toast("答对了")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
       return ViewHolder(TextView(parent?.context))
    }

    override fun getItemCount(): Int {
        return mList.size
    }


    class ViewHolder(val textView:TextView) : RecyclerView.ViewHolder(textView)

    fun toast(message:String){
        Toast.makeText(mContext,message,Toast.LENGTH_LONG).show()
    }

}