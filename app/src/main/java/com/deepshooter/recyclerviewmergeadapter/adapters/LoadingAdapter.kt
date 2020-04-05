package com.deepshooter.recyclerviewmergeadapter.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.deepshooter.recyclerviewmergeadapter.R

class LoadingAdapter() :
    RecyclerView.Adapter<LoadingAdapter.ViewHolderOne>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolderOne {
        return ViewHolderOne(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_loading,
                parent,
                false
            )
        )
    }


    override fun getItemCount(): Int {
        return 1
    }

    override fun onBindViewHolder(holder: ViewHolderOne, position: Int) {
        holder.title.text = "Loading..."
    }

    class ViewHolderOne(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.loading_tv)
    }

}

