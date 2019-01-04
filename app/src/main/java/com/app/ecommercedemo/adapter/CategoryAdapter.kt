package com.app.ecommercedemo.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.ecommercedemo.R
import com.app.ecommercedemo.api_model.Products
import kotlinx.android.synthetic.main.item_category.view.*

class ProductsAdapter(val context: Context, var mProducts: ArrayList<Products>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val mView = LayoutInflater.from(context).inflate(R.layout.item_category, p0, false)
        return CategoryViewHolder(mView)

    }

    fun updateList(mCategoriesList: ArrayList<Products>) {
        this.mProducts = mCategoriesList
    }

    override fun getItemCount(): Int {
        return mProducts.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as CategoryViewHolder).bindItems(mProducts[position], position)
    }

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(item: Products, position: Int) {
            itemView.category_name.text = item.name
        }
    }
}