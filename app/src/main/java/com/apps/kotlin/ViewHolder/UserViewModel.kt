package com.apps.kotlin.ViewHolder

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.apps.kotlin.Model.User
import com.apps.kotlin.Utils.UserListData

class UserViewModel : ViewModel() {
    val userList:MutableLiveData<List<User>> = MutableLiveData();
    fun getUserList(){
        val user = UserListData.setUserList()
        userList.value = user
    }
}