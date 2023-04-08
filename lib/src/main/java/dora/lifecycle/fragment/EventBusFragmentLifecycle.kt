package dora.lifecycle.fragment

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import org.greenrobot.eventbus.EventBus

class EventBusFragmentLifecycle : FragmentManager.FragmentLifecycleCallbacks() {

    override fun onFragmentAttached(fm: FragmentManager, f: Fragment, context: Context) {
        super.onFragmentAttached(fm, f, context)
        EventBus.getDefault().register(f)
    }

    override fun onFragmentDetached(fm: FragmentManager, f: Fragment) {
        super.onFragmentDetached(fm, f)
        if (EventBus.getDefault().isRegistered(f)) {
            EventBus.getDefault().unregister(f)
        }
    }
}