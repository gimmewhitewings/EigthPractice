package com.example.eigthpractice

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.eigthpractice.data.Variant
import com.example.eigthpractice.databinding.FragmentVariantBinding


/**
 * [RecyclerView.Adapter] that can display a [Variant].
 * TODO: Replace the implementation with code for your data type.
 */
class MyVariantRecyclerViewAdapter(
    private val values: List<Variant>,
    private val context: Context
) : RecyclerView.Adapter<MyVariantRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentVariantBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.variantText.text = "Variant " + item.number.toString()
        holder.itemView.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(item.url))
            context.startActivity(browserIntent)
        }
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentVariantBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val variantText: TextView = binding.variantTextView

        override fun toString(): String {
            return super.toString() + " '" + variantText.text + "'"
        }


    }

}