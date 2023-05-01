package com.example.test

import java.io.Serializable

class User(var uid: String?, var password: String?): Serializable {
    override fun toString(): String {
        return "Login info: $uid / $password"
    }
}