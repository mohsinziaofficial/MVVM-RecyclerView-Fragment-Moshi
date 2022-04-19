package com.example.mvvmrecyclerviewfragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmrecyclerviewfragment.booksDataClass.Item
import com.example.mvvmrecyclerviewfragment.databinding.RowItemBinding

class MainAdapter : RecyclerView.Adapter<MyViewHolder>() {

    private val bookResponseList = ArrayList<Item>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context)
        val binding = RowItemBinding.inflate(layout, parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(bookResponseList[position])
    }

    override fun getItemCount(): Int {
        return bookResponseList.size
    }

    fun setResponseList(item : List<Item>) {
        bookResponseList.clear()
        bookResponseList.addAll(item)
        notifyDataSetChanged()
    }
}

class MyViewHolder(private val binding: RowItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindData(data : Item) {
        binding.apply {
            tvTitle.text = data.volumeInfo?.title
            tvDescription.text = data.volumeInfo?.description
            tvPublisher.text = data.volumeInfo?.publisher

            val imgUrl = data.volumeInfo?.imageLinks?.smallThumbnail

            Glide.with(itemView)
                .load(imgUrl)
                .centerCrop()
                .circleCrop()
                .into(thumbImageView)
        }
    }
}