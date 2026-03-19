package com.company.app.controllers

import com.company.app.services.UserService

class UserController {
    private val userService: UserService = UserService()

    fun handleRequest() {
        userService.processRequest()
    }
}