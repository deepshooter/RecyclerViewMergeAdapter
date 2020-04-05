package com.deepshooter.recyclerviewmergeadapter.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.deepshooter.recyclerviewmergeadapter.R
import com.deepshooter.recyclerviewmergeadapter.model.Fruit

class FruitAdapter(private var dataSet: List<Fruit>) :
    RecyclerView.Adapter<FruitAdapter.ViewHolderTwo>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolderTwo {
        return ViewHolderTwo(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_fruit,
                parent,
                false
            )
        )
    }


    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolderTwo, position: Int) {
        holder.title.text = dataSet[position].name
        holder.image.setImageResource(dataSet[position].image)
    }

    class ViewHolderTwo(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.text_view)
        val image: ImageView = itemView.findViewById(R.id.image_view)
    }

}
