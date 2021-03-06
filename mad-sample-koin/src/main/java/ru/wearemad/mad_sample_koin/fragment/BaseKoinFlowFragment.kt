package ru.wearemad.mad_sample_koin.fragment

import androidx.annotation.LayoutRes
import org.koin.android.ext.android.inject
import ru.wearemad.mad_core.fragment.BaseFlowFragment
import ru.wearemad.mad_navigation.CiceroneHolder

abstract class BaseKoinFlowFragment(
    @LayoutRes layoutId: Int
) : BaseFlowFragment(layoutId) {

    override val ciceroneHolder: CiceroneHolder by inject()
}