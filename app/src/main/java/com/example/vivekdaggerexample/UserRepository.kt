package com.example.vivekdaggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface UserRepository {
    fun saveUser(email: String, password: String)
}

@Singleton
class SQLRepository @Inject constructor(private val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("TAG", "User Saved in DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d("TAG", "User Saved in Firebase")
    }
}