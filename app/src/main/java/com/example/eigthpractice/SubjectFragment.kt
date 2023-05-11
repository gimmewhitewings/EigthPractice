package com.example.eigthpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eigthpractice.VariantFragment.Companion.ARG_COLUMN_COUNT
import com.example.eigthpractice.data.Repository
import com.example.eigthpractice.data.Subject

/**
 * A fragment representing a list of Items.
 */
class SubjectFragment : Fragment() {

    private var columnCount = 1
    private var onItemClickListener: OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(data: Subject)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        onItemClickListener = activity as? OnItemClickListener
        val view = inflater.inflate(R.layout.fragment_subject_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                adapter =
                    MySubjectRecyclerViewAdapter(Repository.subjects, object : OnItemClickListener {
                        override fun onItemClick(data: Subject) {
                            onItemClickListener?.onItemClick(data)
                        }
                    })
            }
        }
        return view
    }
}