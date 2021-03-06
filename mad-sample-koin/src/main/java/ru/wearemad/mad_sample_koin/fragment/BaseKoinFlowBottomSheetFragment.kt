package ru.wearemad.mad_sample_koin.fragment

import androidx.annotation.LayoutRes
import org.koin.android.ext.android.inject
import ru.wearemad.mad_core.fragment.bottom.BaseFlowBottomSheetFragment
import ru.wearemad.mad_navigation.CiceroneHolder

abstract class BaseKoinFlowBottomSheetFragment(
    @LayoutRes
    layoutId: Int
) : BaseFlowBottomSheetFragment(layoutId) {

    override val ciceroneHolder: CiceroneHolder by inject()
}