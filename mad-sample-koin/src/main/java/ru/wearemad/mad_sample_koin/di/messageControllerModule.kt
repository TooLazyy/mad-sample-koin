package ru.wearemad.mad_sample_koin.di

import org.koin.dsl.module
import ru.wearemad.mad_base.message.DefaultMessageController
import ru.wearemad.mad_base.message.MessageController

val messageControllerModule = module {

    single<MessageController> {
        DefaultMessageController(
            get(), get(), get()
        )
    }
}