package com.example.eigthpractice

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eigthpractice.data.Subject

class MainActivity : AppCompatActivity(), SubjectFragment.OnItemClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onItemClick(data: Subject) {
        findViewById<TextView>(R.id.header_title).text = data.name
        val variantFragment = VariantFragment()
        val bundle = Bundle()
        bundle.putParcelable("subject", data)
        bundle.putParcelable("data", data)
        variantFragment.arguments = bundle
        supportFragmentManager.beginTransaction()
            .replace(R.id.variantsFragmentContainerView, variantFragment)
            .addToBackStack(null)
            .commit()
    }
}