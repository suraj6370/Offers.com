package com.example.offer

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShopFragment(context:Context,activity:Activity):Fragment(){



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater?.inflate(R.layout.shop,
            container, false);
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val toolbar1: Toolbar? = view.findViewById<Toolbar>(R.id.toolbar1)
        val drawer1 = view.findViewById<DrawerLayout>(R.id.drawer1)
        var drawerToggle = ActionBarDrawerToggle(activity,drawer1,toolbar1,0,0)
        setRecyclerView(context!!,view)
        drawerToggle.syncState()

    }
    private fun setRecyclerView(context: Context,view: View)
    {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview0);
        recyclerView.apply {
            setHasFixedSize(true);
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false);
            val list = prepareList();
            adapter = Adapter(list);
        }
    }

    private fun prepareList():ArrayList<ItemList>
    {
        val list = ArrayList<ItemList>();
        list.add(ItemList("1",R.drawable.noti));
        list.add(ItemList("1",R.drawable.noti));
        list.add(ItemList("1",R.drawable.noti));
        list.add(ItemList("1",R.drawable.noti));
        return (list);
    }

}