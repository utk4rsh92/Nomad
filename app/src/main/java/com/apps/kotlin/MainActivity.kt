package com.apps.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.apps.kotlin.Model.User
import com.apps.kotlin.ViewHolder.UserViewModel

class MainActivity : AppCompatActivity() {
  private lateinit var recyclerview:RecyclerView
  private lateinit var userAdapter:UserAdapter
  private lateinit var userViewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRec()
        userViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        userViewModel.getUserList()
        userViewModel.userList.observe(this, Observer{
        userAdapter.setUserData(it as ArrayList<User>)
        })

    }

    private fun initRec() {
        recyclerview = findViewById(R.id.recyclerView)
        userAdapter = UserAdapter(this, ArrayList())
        recyclerview.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = userAdapter
        }
    }


}