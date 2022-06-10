package com.example.medapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import java.util.ArrayList

class Page1Activity : AppCompatActivity() {
    var listView: ListView? = null
    override fun onResume() {
        super.onResume()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        listView = findViewById<View>(R.id.listView) as ListView
        val items = ArrayList<String>()
        items.add("advil")
        items.add("centrum")
        items.add("depas")
        items.add("suspen")
        items.add("impactamin")
        items.add("tylenol")
        val adapter = CustomAdapter(this, 0, items)
        listView!!.adapter = adapter
    }

    private inner class CustomAdapter(
        context: Context?,
        textViewResourceId: Int,
        private val items: ArrayList<String>
    ) : ArrayAdapter<String?>(
        context!!, textViewResourceId, items as List<String?>
    ) {
        override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
            var v = convertView
            if (v == null) {
                val vi = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
                v = vi.inflate(R.layout.listview, null)
            }
            // ImageView 인스턴스
            val imageView = v!!.findViewById<View>(R.id.imageView) as ImageView
            // 리스트뷰의 아이템에 이미지를 변경한다.
            if ("advil" == items[position]) imageView.setImageResource(R.drawable.advil) else if ("centrum" == items[position]) imageView.setImageResource(
                R.drawable.centrum
            ) else if ("depas" == items[position]) imageView.setImageResource(R.drawable.depas) else if ("impactamin" == items[position]) imageView.setImageResource(
                R.drawable.impactamin
            ) else if ("suspen" == items[position]) imageView.setImageResource(R.drawable.suspen) else if ("tylenol" == items[position]) imageView.setImageResource(
                R.drawable.tylenol
            )
            val textView = v.findViewById<View>(R.id.textView) as TextView
            textView.text = items[position]
            val text = items[position]
            /*Button button = (Button)v.findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
            });*/return v
        }
    }
}