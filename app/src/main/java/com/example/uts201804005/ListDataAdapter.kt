package com.example.uts201804005

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions



class ListDataAdapter(private val listDatadiri: ArrayList<Datadiri>) : RecyclerView.Adapter<ListDataAdapter.ListViewHolder>() {
        inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
            var tvAlamat: TextView = itemView.findViewById(R.id.tv_alamat)
            var tvNomor: TextView = itemView.findViewById(R.id.tv_nomor)
            var ivGambar: ImageView = itemView.findViewById(R.id.civ_gambar)

        }

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): ListViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_data_diri, parent, false)
            return ListViewHolder(view)
        }

        override fun getItemCount(): Int {
            return listDatadiri.size
        }

        override fun onBindViewHolder(holder: ListDataAdapter.ListViewHolder, position: Int) {
            val data = listDatadiri[position]

            Glide.with(holder.itemView.context)
                .load(data.gambar)
                .apply(RequestOptions().override(60, 60))
                .into(holder.ivGambar)
            holder.tvNama.text = data.nama
            holder.tvAlamat.text = data.alamat
            holder.tvNomor.text = data.nomor
        }
    }