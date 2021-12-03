package com.example.mylayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mylayout.adapters.AlphaAdapters
import com.example.mylayout.model.AlphaChar

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var arrayList: ArrayList<AlphaChar>? = null
    private var gridLayoutManager: GridLayoutManager? = null
    private var alphaAdapters: AlphaAdapters? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycler_view)
        gridLayoutManager =
            GridLayoutManager(applicationContext, 3, LinearLayoutManager.VERTICAL, false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)

        arrayList = ArrayList()
        arrayList = setDataInList()
        alphaAdapters = AlphaAdapters(applicationContext, arrayList!!)
        recyclerView?.adapter = alphaAdapters
    }

    private fun setDataInList(): ArrayList<AlphaChar>? {

        var items: ArrayList<AlphaChar> = ArrayList()

        items.add(AlphaChar(R.drawable.letter_a, "A Latter"))
        items.add(AlphaChar(R.drawable.letter_b, "B Latter"))
        items.add(AlphaChar(R.drawable.letter_c, "C Latter"))
        items.add(AlphaChar(R.drawable.letter_d, "D Latter"))
        items.add(AlphaChar(R.drawable.letter_e, "E Latter"))
        items.add(AlphaChar(R.drawable.letter_f, "F Latter"))
        items.add(AlphaChar(R.drawable.letter_g, "G Latter"))
        items.add(AlphaChar(R.drawable.letter_h, "H Latter"))
        items.add(AlphaChar(R.drawable.letter_i, "I Latter"))
        items.add(AlphaChar(R.drawable.letter_j, "J Latter"))
        items.add(AlphaChar(R.drawable.letter_k, "K Latter"))
        items.add(AlphaChar(R.drawable.letter_l, "L Latter"))
        items.add(AlphaChar(R.drawable.letter_m, "M Latter"))
        items.add(AlphaChar(R.drawable.letter_n, "N Latter"))
        items.add(AlphaChar(R.drawable.letter_o, "o Latter"))
        items.add(AlphaChar(R.drawable.letter_p, "P Latter"))
        items.add(AlphaChar(R.drawable.letter_q, "Q Latter"))
        items.add(AlphaChar(R.drawable.letter_r, "R Latter"))
        items.add(AlphaChar(R.drawable.letter_s, "S Latter"))
        items.add(AlphaChar(R.drawable.letter_t, "T Latter"))
        items.add(AlphaChar(R.drawable.letter_u, "U Latter"))
        items.add(AlphaChar(R.drawable.letter_v, "V Latter"))
        items.add(AlphaChar(R.drawable.letter_w, "W Latter"))
        items.add(AlphaChar(R.drawable.letter_x, "X Latter"))
        items.add(AlphaChar(R.drawable.letter_y, "Y Latter"))
        items.add(AlphaChar(R.drawable.letter_z, "Z Latter"))

        return items
    }
}