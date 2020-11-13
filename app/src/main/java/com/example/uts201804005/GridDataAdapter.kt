package com.example.uts201804005

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridDataAdapter(val listDatadiri: ArrayList<Datadiri>): RecyclerView.Adapter<GridDataAdapter.GridViewHolder>() {
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgGambar: ImageView = itemView.findViewById(R.id.civ_data_grid)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_data_grid, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDatadiri.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listDatadiri[position].gambar)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgGambar)
    }
}