package com.company.app.services

import com.company.app.models.User
import com.company.app.repositories.UserRepository

class UserService {
    private val userRepository: UserRepository = UserRepository()

    fun processRequest() {
        val user: User = userRepository.fetchUser()
        println(user)
    }
}