package com.peacecodes.kotlinlistviewexample

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class FactAdapter(context: Context, fact:List<FactModel>):ArrayAdapter<FactModel>(context,0,fact) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val fact = getItem(position)
        if (view == null) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        }
        val logo = view?.findViewById<ImageView>(R.id.logoIv)
        val name = view?.findViewById<TextView>(R.id.nameTv)
        fact?.logo?.let { logo?.setImageResource(fact?.logo) }
        fact?.name?.let { name?.text = fact?.name }

        view?.setOnClickListener{
            val intent = Intent(parent.context,DetailsActivity::class.java)
            intent.putExtra(LOGO_EXTRAs, fact?.logo)
            intent.putExtra(NAME_EXTRAs, fact?.name)
            intent.putExtra(FACT_EXTRAs, fact?.funFact)
            context.startActivity(intent)
        }
        return view!!
    }
    companion object{
        val LOGO_EXTRAs = "logo_extra"
        val NAME_EXTRAs = "name_extra"
        val FACT_EXTRAs = "fact_extra"
    }
}