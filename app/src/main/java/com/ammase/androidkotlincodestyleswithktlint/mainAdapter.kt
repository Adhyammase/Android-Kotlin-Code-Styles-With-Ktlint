package com.ammase.androidkotlincodestyleswithktlint

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ammase.androidkotlincodestyleswithktlint.databinding.ItemListViewBinding

class mainAdapter : RecyclerView.Adapter<mainAdapter.ViewHolder>() {

    private var items = listOf<modul>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ItemListViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindUI(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setResultList(items: List<modul>) {
        this.items = items
        notifyDataSetChanged()
    }

    inner class ViewHolder(var binding: ItemListViewBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindUI(modul: modul) {
            binding.run {
                modul.let {
                    textName.text = it.name
                    textDesk.text = it.desk
                }
            }
        }
    }
}
