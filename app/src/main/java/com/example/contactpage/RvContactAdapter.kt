package com.example.contactpage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvContactAdapter(var contact_list:List<Contacts>):
    RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView=LayoutInflater.from(parent.context).
        inflate(R.layout.list_of_contacts,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

       var currrentContact=contact_list.get(position)
        holder.tvName.text=currrentContact.name
        holder.tvEmail.text=currrentContact.email
        holder.tvPhone.text=currrentContact.phoneNumber

    }

    override fun getItemCount(): Int {
        return contact_list.size
    }
}
class ContactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
{
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhone=itemView.findViewById<TextView>(R.id.tvPhone)
    var tvEmail =itemView.findViewById<TextView>(R.id.tvEmail)
}

