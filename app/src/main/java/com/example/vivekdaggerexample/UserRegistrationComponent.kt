package com.example.vivekdaggerexample

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    fun mainActivityInject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance retryCount: Int): UserRegistrationComponent
    }
}