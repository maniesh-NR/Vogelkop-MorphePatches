package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import androidx.lifecycle.ReportFragment;
import defpackage.ndc;
import defpackage.occ;
import defpackage.qdc;
import defpackage.tcc;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, occ occVar) {
        if (activity instanceof ndc) {
            tcc lifecycle = ((ndc) activity).getLifecycle();
            if (lifecycle instanceof qdc) {
                ((qdc) lifecycle).e(occVar);
            }
        }
    }

    public static void b(Activity activity) {
        ReportFragment.a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new ReportFragment.a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
