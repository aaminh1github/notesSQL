package com.example.notessql

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.toSpanned
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val obj by lazy{
        DBhlpr(applicationContext)
    }
    lateinit var rvMain: RecyclerView
    lateinit var etNote:EditText
    lateinit var btn   :Button
    private var n=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvMain=findViewById(R.id.rvMain)
        etNote=findViewById(R.id.etNote)
        btn=findViewById(R.id.btn)
        btn.setOnClickListener {
           try {
               n = etNote.text.toString()
               obj.saveNote(n)
               Toast.makeText(this, "Saved successfully!", Toast.LENGTH_SHORT).show()

           }catch(e:Exception){
               Toast.makeText(this, "something went wrong", Toast.LENGTH_SHORT).show()
           }  }
    }
}