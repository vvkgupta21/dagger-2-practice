package com.example.vivekdaggerexample

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {
    fun getUserRegistrationComponentFactory() : UserRegistrationComponent.Factory
}