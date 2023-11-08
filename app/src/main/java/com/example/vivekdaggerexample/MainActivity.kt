package com.example.vivekdaggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService


    @Inject
    lateinit var emailService: EmailService


    @Inject
    lateinit var emailService1: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationComponent = (application as UserApplication).userRegistrationComponent
        userRegistrationComponent.mainActivityInject(this)
        userRegistrationService.registerUser("vvkgupta21@gmail.com", "1111")
    }
}