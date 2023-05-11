package com.example.eigthpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.eigthpractice.data.Subject
import com.example.eigthpractice.data.Variant

/**
 * A fragment representing a list of Items.
 */
class VariantFragment : Fragment() {

    private var columnCount = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_variant_list, container, false)

        val variants = arguments?.getParcelable<Subject>("subject")?.variants
        val data = variants ?: listOf(Variant(0, "No variants"))

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                adapter = MyVariantRecyclerViewAdapter(data, context)
            }
        }
        return view
    }

    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) = VariantFragment().apply {
            arguments = Bundle().apply {
                putInt(ARG_COLUMN_COUNT, columnCount)
            }
        }
    }
}