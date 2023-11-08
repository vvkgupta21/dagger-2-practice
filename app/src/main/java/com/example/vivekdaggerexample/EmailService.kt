package com.example.vivekdaggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

@Singleton
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d("TAG", "Email Sent")
    }
}

class MessageService(private var retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d("TAG", "Message Sent - $retryCount")
    }
}