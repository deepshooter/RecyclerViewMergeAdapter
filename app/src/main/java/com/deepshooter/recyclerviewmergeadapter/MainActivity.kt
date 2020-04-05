package com.deepshooter.recyclerviewmergeadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.MergeAdapter
import com.deepshooter.recyclerviewmergeadapter.adapters.FruitAdapter
import com.deepshooter.recyclerviewmergeadapter.adapters.HobbyAdapter
import com.deepshooter.recyclerviewmergeadapter.adapters.LoadingAdapter
import com.deepshooter.recyclerviewmergeadapter.model.Fruit
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hobbyAdapter = HobbyAdapter(loadHobby())
        val fruitAdapter = FruitAdapter(loadFruit())
        val loadingAdapter = LoadingAdapter()
        val mergeAdapter = MergeAdapter(hobbyAdapter, fruitAdapter,loadingAdapter)
        recyclerView.adapter = mergeAdapter
    }


    companion object {
        fun loadFruit(): List<Fruit> {
            val fruits = ArrayList<Fruit>()
            fruits.add(Fruit("Apple", R.drawable.apple))
            fruits.add(Fruit("Orange", R.drawable.orange))
            fruits.add(Fruit("Banana", R.drawable.banana))
            return fruits
        }

        fun loadHobby(): List<String> {
            val hobby = ArrayList<String>()
            hobby.add("Reading")
            hobby.add("Travelling")
            return hobby
        }
    }

}
