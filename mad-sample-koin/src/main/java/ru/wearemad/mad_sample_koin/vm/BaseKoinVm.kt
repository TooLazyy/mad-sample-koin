package ru.wearemad.mad_sample_koin.vm

import org.koin.core.KoinComponent
import ru.wearemad.mad_core.vm.BaseVm
import ru.wearemad.mad_core.vm.BaseVmState
import ru.wearemad.mad_core.vm.VmDependencies

abstract class BaseKoinVm<S : BaseVmState>(
    state: S,
    dependencies: VmDependencies
) : BaseVm<S>(state, dependencies),
    KoinComponent