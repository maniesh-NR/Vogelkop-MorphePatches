package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;
import defpackage.mcc;
import defpackage.occ;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/ReportFragment;", "Landroid/app/Fragment;", "<init>", "()V", "a", "androidx/lifecycle/a", "lifecycle-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class ReportFragment extends Fragment {
    public static final /* synthetic */ int a = 0;

    public static final class a implements Application.ActivityLifecycleCallbacks {

        @NotNull
        public static final b Companion = new b();

        public static final void registerIn(@NotNull Activity activity) {
            Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@NotNull Activity activity, Bundle bundle) {
            int i = ReportFragment.a;
            androidx.lifecycle.a.a(activity, occ.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@NotNull Activity activity) {
            int i = ReportFragment.a;
            androidx.lifecycle.a.a(activity, occ.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@NotNull Activity activity) {
            int i = ReportFragment.a;
            androidx.lifecycle.a.a(activity, occ.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@NotNull Activity activity) {
            int i = ReportFragment.a;
            androidx.lifecycle.a.a(activity, occ.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@NotNull Activity activity) {
            int i = ReportFragment.a;
            androidx.lifecycle.a.a(activity, occ.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@NotNull Activity activity) {
            int i = ReportFragment.a;
            androidx.lifecycle.a.a(activity, occ.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mcc mccVar = occ.Companion;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        mcc mccVar = occ.Companion;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        mcc mccVar = occ.Companion;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        mcc mccVar = occ.Companion;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        mcc mccVar = occ.Companion;
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        mcc mccVar = occ.Companion;
    }
}
