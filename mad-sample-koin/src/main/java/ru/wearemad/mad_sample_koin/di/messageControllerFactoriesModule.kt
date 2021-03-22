package ru.wearemad.mad_sample_koin.di

import org.koin.dsl.module
import ru.wearemad.mad_base.message.factory.DefaultSnackbarFactory
import ru.wearemad.mad_base.message.factory.DefaultToastFactory
import ru.wearemad.mad_base.message.factory.SnackbarFactory
import ru.wearemad.mad_base.message.factory.ToastFactory

val messageControllerFactoriesModule = module {

    factory<SnackbarFactory> { DefaultSnackbarFactory(get()) }
    factory<ToastFactory> { DefaultToastFactory(get()) }
}