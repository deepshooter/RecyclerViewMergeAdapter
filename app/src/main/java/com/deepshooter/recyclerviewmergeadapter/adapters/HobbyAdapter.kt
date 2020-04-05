package com.deepshooter.recyclerviewmergeadapter.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.deepshooter.recyclerviewmergeadapter.R

class HobbyAdapter(private var dataSet: List<String>) :
    RecyclerView.Adapter<HobbyAdapter.ViewHolderOne>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolderOne {
        return ViewHolderOne(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_hobby,
                parent,
                false
            )
        )
    }


    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolderOne, position: Int) {
        holder.title.text = dataSet[position]
    }

    class ViewHolderOne(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title)
    }

}

