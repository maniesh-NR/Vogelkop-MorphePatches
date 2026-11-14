package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class l4j implements Application.ActivityLifecycleCallbacks {
    public static final HashSet c = new HashSet();
    public final yv4 a = new yv4((byte) 9);
    public int b;

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
        if (c.contains(activity.getClass())) {
            return;
        }
        if (this.b == 0) {
            yv4 yv4Var = this.a;
            yv4Var.getClass();
            yv4Var.l().a = System.nanoTime() - yv4Var.b;
        }
        this.b++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        long j;
        hf0 hf0Var;
        if (c.contains(activity.getClass())) {
            return;
        }
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            yv4 yv4Var = this.a;
            yv4Var.getClass();
            long jNanoTime = System.nanoTime() - yv4Var.b;
            sql sqlVarL = yv4Var.l();
            long j2 = sqlVarL.a;
            if (j2 == 0) {
                j = 0;
            } else {
                long j3 = jNanoTime - j2;
                sqlVarL.a = 0L;
                yv4Var.b = (System.nanoTime() - System.nanoTime()) + yv4Var.b;
                j = j3 / 1000000;
            }
            if (j / 1000 > 2147483647L || j < 0) {
                j = 0;
            }
            if (j > 0) {
                String[] strArr = OperaApplication.K;
                x5f x5fVar = ((OperaApplication) activity.getApplicationContext()).L().c;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    uc0 uc0VarA = x56VarF.A(zpaVar);
                    List list = (List) uc0VarA.n(0);
                    if (list == null || list.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        uc0VarA.q(0, 1, arrayList);
                        hf0Var = new hf0(uc0VarA, 0, arrayList);
                    } else {
                        hf0Var = new hf0(uc0VarA, 0, list);
                    }
                    hf0Var.add(Long.valueOf(j));
                    x5fVar.U0(x56VarF);
                }
            }
        }
    }
}
