package dora.lifecycle.activity

import android.app.Activity
import android.app.Application
import android.os.Bundle
import org.greenrobot.eventbus.EventBus

class EventBusActivityLifecycle : Application.ActivityLifecycleCallbacks {
    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        EventBus.getDefault().register(activity)
    }

    override fun onActivityStarted(activity: Activity) {
    }

    override fun onActivityResumed(activity: Activity) {
    }

    override fun onActivityPaused(activity: Activity) {
    }

    override fun onActivityStopped(activity: Activity) {
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
    }

    override fun onActivityDestroyed(activity: Activity) {
        if (EventBus.getDefault().isRegistered(activity)) {
            EventBus.getDefault().unregister(activity)
        }
    }
}