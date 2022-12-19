package com.example.belajarrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var rotiAdapter:RotiRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
            tambahDataset()
    }
    private fun tambahDataset(){
        val data :ArrayList<ListObjRoti> = SumberData.buatsetData()
        rotiAdapter.submitList(data)
    }
    private fun initRecyclerView(){
        recycler_view.apply{
            layoutManager=LinearLayoutManager(this@MainActivity)
            val spacingAtas = DekorasiSpasiGambar(20)
            addItemDecoration(spacingAtas)
            rotiAdapter = RotiRecyclerAdapter()
            adapter=rotiAdapter

        }
    }
}