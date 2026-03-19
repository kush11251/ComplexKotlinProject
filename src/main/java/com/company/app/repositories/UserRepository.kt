package com.company.app.repositories

import com.company.app.models.User

class UserRepository {
    fun fetchUser(): User {
        // Simulating a database query
        return User(1, "John Doe")
    }
}