package com.example.contactpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvContacts = findViewById(R.id.rvContacts)
        displayContact()
    }
    fun displayContact() {


        var contacts = listOf(
            Contacts(
                "Mwembe",
                "0795468998",
                "mwembesharone@gmail.com",
                "https://cdn.pixabay.com/photo/2019/09/17/20/47/prague-4484517__340.jpg"
            ),
            Contacts(
                "James",
                "0795498989",
                "james@gmail.com",
                "https://cdn.pixabay.com/photo/2020/09/25/16/50/portrait-5601950__340.jpg"
            ),
            Contacts(
                "Evance",
                "0789456790",
                "mwembesharone@gmail.com",
                "https://cdn.pixabay.com/photo/2021/07/11/19/07/girl-6404712__340.jpg"
            ),
            Contacts(
                "Jeff",
                "0745890976",
                "oborijeff@gmail.com",
                "https://cdn.pixabay.com/photo/2021/07/08/13/18/woman-6396875__340.jpg"
            ),
            Contacts(
                "Dovine",
                "0765282113",
                "dovine@gmail.com",
                "https://cdn.pixabay.com/photo/2021/05/14/12/26/man-6253257__340.jpg"
            ),
            Contacts(
                "Pamela",
                "07925475796",
                "pamacha@gmail.com",
                "https://cdn.pixabay.com/photo/2021/07/09/02/29/family-6398107__340.jpg"
            ),
        )
        rvContacts = findViewById(R.id.rvContacts)
        var contactAdapter = RvContactAdapter(contacts,baseContext)
        rvContacts.layoutManager = LinearLayoutManager(baseContext)
        rvContacts.adapter = contactAdapter


    }


}