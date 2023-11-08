package com.example.vivekdaggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Singleton
    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository
}