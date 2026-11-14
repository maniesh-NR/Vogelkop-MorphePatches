package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.opera.android.OperaApplication;
import java.util.HashSet;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class jtm implements Application.ActivityLifecycleCallbacks {
    public static final HashSet b = new HashSet();
    public int a;

    public static void a(Activity activity) {
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) activity.getApplicationContext()).L().d;
        new rml(Unit.a, x5fVar.b).a(new i5f(x5fVar, (byte) 0)).m(x5fVar.e);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (b.contains(activity.getClass())) {
            return;
        }
        if (this.a == 0) {
            a(activity);
        }
        this.a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (b.contains(activity.getClass())) {
            return;
        }
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            a(activity);
        }
    }
}
