package com.example.contactpage

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RvContactAdapter(var contact_list:List<Contacts> ,var context:Context):
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
        Picasso.get()
            .load(currrentContact.imageUrl)
            . resize(80,100)
            .centerCrop()
            .into(holder.ivContact)


        holder.ivContact.setOnClickListener {
            var intent=Intent(context,contact_activities::class.java)
            intent.putExtra("name",currrentContact.name)
            intent.putExtra("email",currrentContact.email)
            intent.putExtra("phoneNumber",currrentContact.phoneNumber)
            intent.putExtra("ImgeUrl",currrentContact.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)


        }
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
    //var cvContact=itemView.findViewById<CardView>(R.id.cdContact)
    var ivContact=itemView.findViewById<ImageView>( R.id.ivContact)
}

