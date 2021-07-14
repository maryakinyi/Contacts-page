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
        rvContacts=findViewById(R.id.rvContacts)

        var contacts= listOf<Contacts>(
            Contacts("Mwembe","0795468998","mwembesharone@gmail.com"),
            Contacts("James","0795498989","james@gmail.com"),
            Contacts("Evance","0789456790","mwembesharone@gmail.com"),
            Contacts("Jeff","0745890976","oborijeff@gmail.com"),
            Contacts("Dovine","0765282113","dovine@gmail.com"),
            Contacts("Pamela","07925475796","pamacha@gmail.com"),
        )
        var contactAdapter=RvContactAdapter(contacts)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactAdapter

    }




}