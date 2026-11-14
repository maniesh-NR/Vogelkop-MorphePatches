package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public class puo implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public Object e;

    private final void e(Activity activity, Bundle bundle) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity, Bundle bundle) {
    }

    private final void onActivityCreated$ads_mobile_sdk$gk(Activity activity, Bundle bundle) {
    }

    private final void onActivityDestroyed$ads_mobile_sdk$gk(Activity activity) {
    }

    private final void onActivityPaused$ads_mobile_sdk$gk(Activity activity) {
    }

    private final void onActivityResumed$ads_mobile_sdk$gk(Activity activity) {
    }

    private final void onActivitySaveInstanceState$ads_mobile_sdk$gk(Activity activity, Bundle bundle) {
    }

    public void a(boolean z) {
    }

    public final boolean a() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || b();
    }

    public boolean b() {
        return false;
    }

    public void c(boolean z) {
    }

    public boolean d() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        byte b = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        byte b = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        byte b = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        byte b = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        byte b = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    this.c = true;
                    if (this.b) {
                        c(true);
                        jto jtoVar = (jto) this.e;
                        if (jtoVar != null) {
                            jtoVar.a(true);
                            break;
                        }
                    }
                }
                break;
            default:
                if (!this.c) {
                    this.c = true;
                    if (this.b) {
                        a(true);
                        vzo vzoVar = (vzo) this.e;
                        if (vzoVar != null) {
                            vzoVar.a(true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 0:
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                boolean z = runningAppProcessInfo.importance == 100 || d();
                if (this.c != z) {
                    this.c = z;
                    if (this.b) {
                        c(z);
                        jto jtoVar = (jto) this.e;
                        if (jtoVar != null) {
                            jtoVar.a(z);
                            break;
                        }
                    }
                }
                break;
            default:
                boolean zA = a();
                if (this.c != zA) {
                    this.c = zA;
                    if (this.b) {
                        a(zA);
                        vzo vzoVar = (vzo) this.e;
                        if (vzoVar != null) {
                            vzoVar.a(zA);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
