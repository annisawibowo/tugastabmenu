package com.example.tabmenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment


class fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
      val listview = view.findViewById<ListView>(R.id.lv)
        val items =
            arrayOf("Annisa Raudya Wibowo", "Nuke Nidya", "Dinda Siti Fatimah","Aisyah Firdausi Rahmah","Dimitra Izzati Putri","Aishka Syakirah Wibowo")
        val adapter =
            ArrayAdapter(activity!!, android.R.layout.simple_list_item_1, items)
        listview.setAdapter(adapter)

    }





    companion object {

        fun newInstance(): fragment2{
            return fragment2()         }
    }
}
