package com.example.belajarrecyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.layout_list_roti.view.*
import java.util.*

class RotiRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<ListObjRoti> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RotiViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_list_roti, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is RotiViewHolder -> {
                holder.bind(items.get(position))
                holder.klik.setOnClickListener{
                    holder.kalau_diklik(items.get(position))
                }
            }
        }
    }
    fun submitList(listRoti: List<ListObjRoti>){
        items = listRoti
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class RotiViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView){

        val gambar_roti: ImageView = itemView.gambar_roti
        val nama_roti: TextView = itemView.nama_roti
        val desc_roti: TextView = itemView.desc_roti
        val harga_roti: TextView = itemView.harga_roti
        var klik: RelativeLayout = itemView.findViewById(R.id.rl_klik)

        fun bind(listObjRoti: ListObjRoti){
            nama_roti.setText(listObjRoti.nama)
            desc_roti.setText(listObjRoti.desc)
            harga_roti.setText(listObjRoti.harga)

            val requestOp = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOp)
                .load(listObjRoti.gambar)
                .into(gambar_roti)
        }
        fun kalau_diklik(get: ListObjRoti) {
            val position: Int = adapterPosition
            Toast.makeText(itemView.context, "Kamu memilih : ${get.nama}",
                Toast.LENGTH_SHORT)
                .show()

            val intent = Intent(itemView.context, DetilRoti::class.java)
            intent.putExtra("namanya", get.nama)
            intent.putExtra("deskripsinya", get.desc)
            intent.putExtra("Fotonya", get.gambar)
            intent.putExtra("Harganya", get.harga)
            itemView.context.startActivity(intent)
        }

    }
}