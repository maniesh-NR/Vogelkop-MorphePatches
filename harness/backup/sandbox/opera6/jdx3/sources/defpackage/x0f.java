package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class x0f extends e43 {
    public final Context a;
    public final umi b;
    public final qie c = new qie((byte) 19);
    public final LinkedHashMap d = new LinkedHashMap();
    public final ode e = new ode((Object) null);

    public x0f(Context context, umi umiVar) {
        this.a = context;
        this.b = umiVar;
    }

    public final ode a(String str) {
        boolean z;
        LinkedHashMap linkedHashMap = this.d;
        Object odeVar = linkedHashMap.get(str);
        if (odeVar == null) {
            odeVar = new ode();
            linkedHashMap.put(str, odeVar);
            z = true;
        } else {
            z = false;
        }
        ode odeVar2 = (ode) odeVar;
        if (z) {
            this.c.n(this.b.e(new u0f(this, (byte) 0)).c(new u0f(this, (byte) 1)), Collections.singleton(str));
        }
        return odeVar2;
    }

    @Override // defpackage.e43, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Set setN0 = CollectionsKt.n0(this.d.keySet());
        this.c.n(this.b.e(new u0f(this, (byte) 0)).c(new u0f(this, (byte) 1)), setN0);
    }
}
