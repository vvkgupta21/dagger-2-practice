package com.example.vivekdaggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @Singleton
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount: Int): NotificationService {
        return MessageService(retryCount)
    }

    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}