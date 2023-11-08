package com.example.vivekdaggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule(private val retryCount: Int) {

    @Singleton
    @MessageQualifier
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService(retryCount)
    }

    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}