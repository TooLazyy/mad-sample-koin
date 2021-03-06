package ru.wearemad.mad_sample_koin.di

import com.github.terrakok.cicerone.Cicerone
import org.koin.dsl.module
import ru.wearemad.mad_navigation.CiceroneHolder
import ru.wearemad.mad_navigation.router.AppRouter

val navigationModule = module {

    single { CiceroneHolder() }

    single { Cicerone.create(AppRouter()) }
    single {
        val cicerone: Cicerone<AppRouter> = get()
        cicerone.router
    }
    single {
        val cicerone: Cicerone<AppRouter> = get()
        cicerone.getNavigatorHolder()
    }
}