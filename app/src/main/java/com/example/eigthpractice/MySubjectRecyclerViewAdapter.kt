package com.example.eigthpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eigthpractice.data.Subject
import com.example.eigthpractice.databinding.FragmentSubjectBinding

/**
 * [RecyclerView.Adapter] that can display a [Subject].
 * TODO: Replace the implementation with code for your data type.
 */
class MySubjectRecyclerViewAdapter(
    private val values: List<Subject>,
    private val onItemClickListener: SubjectFragment.OnItemClickListener
) : RecyclerView.Adapter<MySubjectRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentSubjectBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.subjectIcon.setImageResource(item.iconID)
        holder.subjectName.text = item.name
        holder.itemView.setOnClickListener {
            onItemClickListener.onItemClick(item)
        }
    }


    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentSubjectBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val subjectIcon: ImageView = binding.subjectIcon
        val subjectName: TextView = binding.subjectText

        override fun toString(): String {
            return super.toString() + " '" + subjectName.text + "'"
        }
    }

}