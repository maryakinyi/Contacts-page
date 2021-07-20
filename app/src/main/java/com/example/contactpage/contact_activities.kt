package com.example.contactpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class contact_activities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_activities)

        val tvName=findViewById<TextView>(R.id.tvname)
        Toast.makeText(baseContext,"name",Toast.LENGTH_LONG).show()
        val tvemail=findViewById<TextView>(R.id.tvemail)
        val tvPhones=findViewById<TextView>(R.id.tvphone)
        val imageUrl=findViewById<ImageView>(R.id.ivPerson)


        var nameIntent=intent.getStringExtra("name")
        var emailIntent=intent.getStringExtra("email")
        var phoneIntent=intent.getStringExtra("phone")
        var imageUrlIntent=intent.getStringExtra("image")
             Picasso.get()
            .load(imageUrlIntent).
                 resize(80,100)
                 .into(imageUrl)
        tvName.text=nameIntent
        tvemail.text=emailIntent
        tvPhones.text=phoneIntent


    }
}