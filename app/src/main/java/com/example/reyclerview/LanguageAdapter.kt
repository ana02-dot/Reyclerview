package com.example.reyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.with as with1

class LanguageAdapter(private var languages: List<Language>): RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    class LanguageViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imageview: ImageView = itemView.findViewById(R.id.imageView)
        var textview: TextView = itemView.findViewById(R.id.textview_language)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item,parent,false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {

        val p = languages[position]


        if (p.image !== null) {
            Glide.with(holder.imageview.context)
                .load(p.image)
                .into(holder.imageview)
        } else {
            holder.imageview.setImageResource(R.drawable.ic_launcher_background)
        }

        holder.textview.text = p.title


    }

    override fun getItemCount(): Int = languages.size

}

