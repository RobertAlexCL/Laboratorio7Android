package com.example.lab5

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class adaptor(var list: ArrayList<row>):RecyclerView.Adapter<adaptor.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        var v = LayoutInflater.from(p0.context).inflate(R.layout.item,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        p0.bindItem(list[p1])
    }

    class ViewHolder(view:View): RecyclerView.ViewHolder(view){
        fun bindItem(data: row){

            val plus: Button = itemView.findViewById(R.id.plus)
            val sub: Button = itemView.findViewById(R.id.sub)
            val Pname: TextView = itemView.findViewById(R.id.Pname)
            val quantity: TextView = itemView.findViewById(R.id.quantity)
            Pname.text = data.product.Pname
            quantity.text = data.quantity.toString()



            sub.setOnClickListener(){
                if(data.quantity!=0){
                    var num = data.quantity-1
                    data.quantity = num
                    quantity.text=num.toString()
                }


                plus.setOnClickListener(){
                    var num = data.quantity+1
                    data.quantity = num
                    quantity.text=num.toString()
                }
            }
        }
    }
}