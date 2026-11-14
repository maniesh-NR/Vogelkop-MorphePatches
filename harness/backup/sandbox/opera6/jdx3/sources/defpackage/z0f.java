package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class z0f implements Application.ActivityLifecycleCallbacks {
    public final x5f a;
    public final td2 b;
    public int c;

    public z0f(umi umiVar, x5f x5fVar) {
        this.a = x5fVar;
        this.b = new td2(umiVar);
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
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            this.b.a((NotificationManager) activity.getSystemService("notification"), new y0f(this.a));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.c--;
    }
}
