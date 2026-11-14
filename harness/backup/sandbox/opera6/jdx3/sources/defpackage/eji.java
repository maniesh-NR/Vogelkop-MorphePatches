package defpackage;

import android.app.Activity;

/* loaded from: classes.dex */
public final class eji extends e43 {
    public final /* synthetic */ iji a;

    public eji(iji ijiVar) {
        this.a = ijiVar;
    }

    @Override // defpackage.e43, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        iji ijiVar = this.a;
        if (activity == ijiVar.c) {
            ijiVar.G();
        }
    }

    @Override // defpackage.e43, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.a.Z();
    }
}
