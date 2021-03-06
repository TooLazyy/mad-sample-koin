package ru.wearemad.mad_sample_koin.activity

import androidx.annotation.LayoutRes
import com.github.terrakok.cicerone.NavigatorHolder
import org.koin.android.ext.android.inject
import ru.wearemad.mad_core.activity.BaseFlowActivity

abstract class BaseFlowKoinActivity(
    @LayoutRes
    layoutId: Int
) : BaseFlowActivity(layoutId) {

    override val navigationHolder: NavigatorHolder by inject()
}