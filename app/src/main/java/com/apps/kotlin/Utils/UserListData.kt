package com.apps.kotlin.Utils

import com.apps.kotlin.Model.User

object UserListData {

    fun setUserList():List<User>{
     var  userList:ArrayList<User> = ArrayList();
        userList.add(User("Aakesh"));
        userList.add(User("Aarav"));
        userList.add(User("Evak"));
        userList.add(User("Ekansh"));
        userList.add(User("Girik"));
        userList.add(User("Hredhaan"));
        userList.add(User("Ishaan"));
        userList.add(User("Jairaaj"));
        userList.add(User("Inesh"));
        userList.add(User("Manbir"));
        userList.add(User("Nishit"));
        userList.add(User("Nihal"));
        userList.add(User("Onkar"));
        userList.add(User("Parijat"));
        userList.add(User("Pranit"));
        userList.add(User("Rayaan"));
        userList.add(User("Samesh"));
        userList.add(User("Tejas"));
        userList.add(User("Vedant"));
        userList.add(User("Yatin"));
        userList.add(User("Yagnesh"));
        userList.add(User("Yug"));
        return userList
    }

}
