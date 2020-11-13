package com.example.uts201804005

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity3 : AppCompatActivity() {
    private  lateinit var rvDatadiri: RecyclerView
    private var list: ArrayList<Datadiri> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        rvDatadiri = findViewById(R.id.rv_data)
        rvDatadiri.setHasFixedSize(true)

        list.addAll(Datadiri2.listData)
//        showRecyclerViewListMode()
//        showRecyclerViewGridMode()
        showRecyclerViewCardMode()
    }

    private fun showRecyclerViewListMode(){
        rvDatadiri.layoutManager = LinearLayoutManager(this)
        val ListDataAdapter = ListDataAdapter(list)
        rvDatadiri.adapter = ListDataAdapter
    }
    private fun showRecyclerViewGridMode(){
        rvDatadiri.layoutManager = LinearLayoutManager(this)
        val gridDataAdapter = GridDataAdapter(list)
        rvDatadiri.adapter = gridDataAdapter
    }
    private fun showRecyclerViewCardMode(){
        rvDatadiri.layoutManager = LinearLayoutManager(this)
        val cardDataAdapter = CardDataAdapter(list)
        rvDatadiri.adapter = cardDataAdapter
    }
}
