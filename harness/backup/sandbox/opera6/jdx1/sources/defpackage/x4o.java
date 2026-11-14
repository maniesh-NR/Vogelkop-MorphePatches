package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.opera.android.OperaApplication;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x4o {
    public static x4o k;
    public static x4o l;
    public static final Object m;
    public final Context a;
    public final jl5 b;
    public final WorkDatabase c;
    public final a5o d;
    public final List e;
    public final t1h f;
    public final rua g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final azl j;

    static {
        qs7.B("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public x4o(Context context, final jl5 jl5Var, a5o a5oVar, final WorkDatabase workDatabase, final List list, t1h t1hVar, azl azlVar) {
        boolean z = false;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            qp2.n("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        qs7 qs7Var = new qs7(jl5Var.h);
        synchronized (qs7.e) {
            if (qs7.f == null) {
                qs7.f = qs7Var;
            }
        }
        this.a = applicationContext;
        this.d = a5oVar;
        this.c = workDatabase;
        this.f = t1hVar;
        this.j = azlVar;
        this.b = jl5Var;
        this.e = list;
        a64 a64VarB = sgb.b(a5oVar.b);
        this.g = new rua(workDatabase);
        final op1 op1Var = a5oVar.a;
        int i = ymi.a;
        t1hVar.a(new dg8() { // from class: xmi
            public final void a(w4o w4oVar, boolean z2) {
                op1Var.execute(new qn(list, w4oVar, jl5Var, workDatabase, (byte) 19));
            }
        });
        a5oVar.a(new hj9(applicationContext, this));
        int i2 = ukm.a;
        int i3 = o1h.a;
        if (Intrinsics.a(Application.getProcessName(), applicationContext.getApplicationInfo().processName)) {
            i5o i5oVarC = workDatabase.C();
            i5oVarC.getClass();
            TreeMap treeMap = e6i.i;
            e6i e6iVarE = aoh.e(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) i5oVarC.a;
            String[] strArr = {"workspec"};
            wg5 wg5Var = new wg5(new sxd((byte) 2, i5oVarC, e6iVarE, z), (byte) 7);
            pjb pjbVar = workDatabase_Impl.f;
            mt5 mt5Var = null;
            pjbVar = pjbVar == null ? null : pjbVar;
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            ynh.k(pjbVar.a);
            g7m g7mVar = pjbVar.b;
            Pair pairP = g7mVar.p(strArr2);
            j14.Y(new z99(qbe.t(ic4.l(new cw(new ya9(ic4.l(new x99(new z99(new bz1((byte) 15, (mt5) null, pjbVar), new xd6(new jj4((Object) g7mVar, pairP.b, pairP.a, mt5Var, (byte) 19), (byte) 11)), new uk3((byte) 2, (mt5) null, pjbVar), (byte) 0), -1), workDatabase_Impl, wg5Var, (byte) 1), new tkm(4, null), (byte) 5), -1)), new ty7(applicationContext, (mt5) null, (byte) 2), (byte) 2), a64VarB);
        }
    }

    public static x4o c(Context context) {
        x4o x4oVarC;
        Object obj = m;
        synchronized (obj) {
            synchronized (obj) {
                try {
                    x4oVarC = k;
                    if (x4oVarC == null) {
                        x4oVarC = l;
                    }
                } finally {
                }
            }
            return x4oVarC;
        }
        if (x4oVarC == null) {
            OperaApplication applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof gl5)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            d(applicationContext, (jl5) ((gl5) applicationContext).q.getValue());
            x4oVarC = c(applicationContext);
        }
        return x4oVarC;
    }

    public static void d(Context context, jl5 jl5Var) {
        synchronized (m) {
            if (k == null) {
                Context applicationContext = context.getApplicationContext();
                x4o x4oVarM = l;
                if (x4oVarM == null) {
                    x4oVarM = z4o.M(applicationContext, jl5Var);
                    l = x4oVarM;
                }
                k = x4oVarM;
            } else if (l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    public final void a(off offVar) {
        List listSingletonList = Collections.singletonList(offVar);
        if (listSingletonList.isEmpty()) {
            qp2.o("enqueue needs at least one WorkRequest.");
        } else {
            new r4o(this, null, listSingletonList).a();
        }
    }

    public final void b(String str, off offVar) {
        new r4o(this, str, Collections.singletonList(offVar)).a();
    }

    public final void e() {
        synchronized (m) {
            this.h = true;
            BroadcastReceiver.PendingResult pendingResult = this.i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public final void f() {
        ydp ydpVar = this.b.j;
        m2n m2nVar = new m2n(this, (byte) 14);
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            try {
                Trace.beginSection("ReschedulingWork");
            } finally {
                if (zIsEnabled) {
                    Trace.endSection();
                }
            }
        }
        m2nVar.invoke();
    }
}
