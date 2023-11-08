package com.example.vivekdaggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AnalyticsModule {
    @Provides
    fun getAnalyticalModule(): AnalyticsService {
        return Mixpanel()
    }
}