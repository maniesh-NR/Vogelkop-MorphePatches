package ads_mobile_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import defpackage.cs5;
import defpackage.fdp;
import defpackage.fsg;
import defpackage.hc1;
import defpackage.mip;
import defpackage.qlo;
import defpackage.sqo;
import defpackage.ybh;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g0 extends k61 implements Application.ActivityLifecycleCallbacks {
    public final Application c;
    public final WeakReference d;
    public final nx5 e;
    public final qr0 f;
    public final mip g;
    public final LinkedHashSet h;
    public final LinkedHashSet i;
    public s j;
    public Activity k;
    public boolean l;
    public d3k m;
    public boolean n;
    public boolean o;

    public g0(Context context, Application application, WeakReference weakReference, nx5 nx5Var, qr0 qr0Var, mip mipVar) {
        super(fw0.CUI_NAME_SDKINIT_ACTIVITY_TRACKER, 2);
        this.c = application;
        this.d = weakReference;
        this.e = nx5Var;
        this.f = qr0Var;
        this.g = mipVar;
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        this.j = s.NONE;
        this.o = ybh.b(context);
    }

    public final void a(Activity activity, s sVar) {
        synchronized (this) {
            if (Intrinsics.a(activity, this.k)) {
                this.j = sVar;
            } else {
                if (sVar.a < this.j.a) {
                    return;
                }
                this.k = activity;
                this.j = sVar;
            }
            byte b = 3;
            mt5 mt5Var = null;
            if (sVar == s.RESUMED) {
                this.l = false;
                if (c()) {
                    xu0.b("App is now foregrounded", null);
                    this.o = false;
                    d3k d3kVar = this.m;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    this.m = null;
                    this.n = true;
                    on7 on7Var = pn7.b;
                    this.g.getClass();
                    long jY0 = cs5.y0(SystemClock.elapsedRealtime(), un7.d);
                    for (qlo qloVar : this.h) {
                        defpackage.na2.B(this.e, h.a, null, new fsg(new v(qloVar, jY0, mt5Var, (byte) 0), mt5Var, b), 2);
                    }
                }
            } else if (sVar == s.STOPPED) {
                this.l = true;
                this.m = defpackage.na2.B(this.e, h.a, null, new fsg(new sqo((byte) 7, mt5Var, this), mt5Var, b), 2);
            }
        }
    }

    public final void a(Function1 function1) {
        synchronized (this) {
            Iterator it = CollectionsKt.k0(this.i).iterator();
            while (it.hasNext()) {
                fdp fdpVar = (fdp) ((WeakReference) it.next()).get();
                if (fdpVar != null) {
                    try {
                        function1.invoke(fdpVar);
                    } catch (Exception e) {
                        vr3 vr3Var = xu0.a;
                        xu0.c("Failed to dispatch Activity lifecycle event", e);
                    }
                }
            }
            Iterator it2 = this.i.iterator();
            while (it2.hasNext()) {
                if (((WeakReference) it2.next()).get() == null) {
                    it2.remove();
                }
            }
        }
    }

    public final Activity b() {
        Activity activity;
        synchronized (this) {
            activity = this.k;
        }
        return activity;
    }

    public final boolean c() {
        boolean z;
        synchronized (this) {
            z = this.o;
        }
        return z;
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        Unit unit;
        synchronized (this) {
            Context context = (Context) this.d.get();
            if (context != null && (context instanceof Activity)) {
                this.k = (Activity) context;
                this.j = s.INITIAL;
            }
        }
        this.c.registerActivityLifecycleCallbacks(this);
        boolean zC = c();
        vr3 vr3Var = xu0.a;
        xu0.b("App is initially ".concat(zC ? "backgrounded" : "foregrounded"), null);
        on7 on7Var = pn7.b;
        this.g.getClass();
        long jY0 = cs5.y0(SystemClock.elapsedRealtime(), un7.d);
        synchronized (this) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                xh3.a(this.e, new hc1(zC, (qlo) it.next(), jY0, null, (byte) 1));
            }
            unit = Unit.a;
        }
        return new hv0(unit);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, s.CREATED);
        a(new y(activity, (byte) 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this) {
            if (Intrinsics.a(activity, this.k)) {
                this.k = null;
                this.j = s.NONE;
            }
        }
        a(new y(activity, (byte) 6));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, s.PAUSED);
        a(new y(activity, (byte) 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity, s.RESUMED);
        a(new y(activity, (byte) 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new y(activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity, s.STARTED);
        a(new y(activity, (byte) 4));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(activity, s.STOPPED);
        a(new y(activity, (byte) 5));
    }
}
