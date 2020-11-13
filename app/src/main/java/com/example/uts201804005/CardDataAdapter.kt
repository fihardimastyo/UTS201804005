package com.example.uts201804005

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions




class CardDataAdapter (private val listDatadiri: ArrayList<Datadiri>) : RecyclerView.Adapter<CardDataAdapter.CardViewHolder>() {
        inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
            var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
            var tvAlamat: TextView = itemView.findViewById(R.id.tv_alamat)
            var tvNomor: TextView = itemView.findViewById(R.id.tv_nomor)
            var ivGambar: ImageView = itemView.findViewById(R.id.civ_gambar)
            var btnPindah: Button = itemView.findViewById(R.id.btn_send)
        }

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): CardViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_data_card, parent, false)
            return CardViewHolder(view)
        }

        override fun getItemCount(): Int {
            return listDatadiri.size
        }

        override fun onBindViewHolder(holder: CardDataAdapter.CardViewHolder, position: Int) {
            val datadiri = listDatadiri[position]

            Glide.with(holder.itemView.context)
                .load(datadiri.gambar)
                .apply(RequestOptions().override(60, 60))
                .into(holder.ivGambar)
            holder.tvNama.text = datadiri.nama
            holder.tvAlamat.text = datadiri.alamat
            holder.tvNomor.text = datadiri.nomor
            holder.btnPindah.setOnClickListener {
                val intent = Intent(holder.itemView.context, MainActivity4::class.java)
                val bundle = Bundle()
                bundle.putString("data1", datadiri.nama)
                intent.putExtras(bundle)
                holder.itemView.context.startActivity(intent)
            }
        }
    }
