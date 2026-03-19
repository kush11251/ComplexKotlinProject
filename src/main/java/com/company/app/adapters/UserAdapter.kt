package com.company.app.adapters

import com.company.app.models.User

interface UserAdapter {
    fun adapt(user: User): String
}

class UserAdapterImpl : UserAdapter {
    override fun adapt(user: User): String {
        return "User(${user.id}, ${user.name})"
    }
}