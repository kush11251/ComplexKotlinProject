package com.company.app

import org.junit.Test
import com.company.app.models.User

class TestUser {
    @Test
    fun testUser() {
        val user: User = User(1, "John Doe")
        assert(user.id == 1)
        assert(user.name == "John Doe")
    }
}