package dora.lifecycle.config

import android.app.Application
import android.content.Context
import androidx.fragment.app.FragmentManager
import dora.lifecycle.activity.EventBusActivityLifecycle
import dora.lifecycle.application.ApplicationLifecycleCallbacks
import dora.lifecycle.fragment.EventBusFragmentLifecycle

class EventBusGlobalConfig : GlobalConfig {
    override fun injectApplicationLifecycle(
        context: Context?,
        lifecycles: MutableList<ApplicationLifecycleCallbacks>?
    ) {
    }

    override fun injectActivityLifecycle(
        context: Context?,
        lifecycles: MutableList<Application.ActivityLifecycleCallbacks>?
    ) {
        lifecycles!!.add(EventBusActivityLifecycle())
    }

    override fun injectFragmentLifecycle(
        context: Context?,
        lifecycles: MutableList<FragmentManager.FragmentLifecycleCallbacks>?
    ) {
        lifecycles!!.add(EventBusFragmentLifecycle())
    }
}