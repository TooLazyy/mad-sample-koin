package ru.wearemad.mad_sample_koin

import androidx.multidex.MultiDexApplication
import org.koin.android.ext.android.inject
import ru.wearemad.mad_base.activity.CurrentActivityHolderActivityCallback
import ru.wearemad.mad_base.message.MessageControllerActivityCallback

abstract class MadKoinApplication : MultiDexApplication() {

    private val activityHolderCallback: CurrentActivityHolderActivityCallback by inject()
    private val messageControllerCallback: MessageControllerActivityCallback by inject()

    override fun onCreate() {
        super.onCreate()

        initKoin()
        initCallbacks()
    }

    abstract fun initKoin()

    private fun initCallbacks() {
        registerActivityLifecycleCallbacks(activityHolderCallback)
        registerActivityLifecycleCallbacks(messageControllerCallback)
    }
}