package ru.wearemad.mad_sample_koin.di

import org.koin.dsl.module
import ru.wearemad.mad_base.activity.CurrentActivityHolder
import ru.wearemad.mad_base.activity.CurrentActivityHolderActivityCallback
import ru.wearemad.mad_base.coroutines.DefaultDispatchersProvider
import ru.wearemad.mad_base.coroutines.DispatchersProvider
import ru.wearemad.mad_base.message.MessageControllerActivityCallback

val applicationModule = module {

    single<DispatchersProvider> { DefaultDispatchersProvider() }

    single { CurrentActivityHolder() }
    single { CurrentActivityHolderActivityCallback(get()) }

    single { MessageControllerActivityCallback(get()) }
}