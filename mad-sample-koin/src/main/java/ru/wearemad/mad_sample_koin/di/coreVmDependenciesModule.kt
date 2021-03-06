package ru.wearemad.mad_sample_koin.di

import org.koin.dsl.module
import ru.wearemad.mad_core.vm.VmDependencies

val coreVmDependenciesModule = module {

    single {
        VmDependencies(get(), get(), get(), get())
    }
}