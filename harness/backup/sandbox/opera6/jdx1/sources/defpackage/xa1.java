package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class xa1 implements Application.ActivityLifecycleCallbacks {
    public final double a;
    public final /* synthetic */ s14 b;

    public xa1(s14 s14Var, ylh ylhVar) {
        this.b = s14Var;
        wlh wlhVar = ylhVar.a;
        xm5 xm5Var = yxa.a;
        Object obj = wlhVar.b.d.a.get(yxa.d);
        this.a = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        if (this.a != 1.0d) {
            ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
            s14 s14Var = this.b;
            ylh ylhVar = (ylh) ((WeakReference) s14Var.c).get();
            if (ylhVar == null) {
                s14Var.I();
                return;
            }
            amh amhVarC = ylhVar.c();
            if (amhVarC != null) {
                synchronized (amhVarC.c) {
                    j = amhVarC.a.a;
                }
                amhVarC.a(j);
            }
        }
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
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
