package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class wb5 implements dg8 {
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final ioj d;
    public final jvg e;

    static {
        qs7.B("CommandHandler");
    }

    public wb5(Context context, ioj iojVar, jvg jvgVar) {
        this.a = context;
        this.d = iojVar;
        this.e = jvgVar;
    }

    public static w4o c(Intent intent) {
        return new w4o(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, w4o w4oVar) {
        intent.putExtra("KEY_WORKSPEC_ID", w4oVar.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", w4oVar.b);
    }

    public final void a(w4o w4oVar, boolean z) {
        synchronized (this.c) {
            c17 c17Var = (c17) this.b.remove(w4oVar);
            this.e.B(w4oVar);
            if (c17Var != null) {
                c17Var.c(z);
            }
        }
    }

    public final void b(Intent intent, int i, ezk ezkVar) {
        List<w8k> listC;
        String action = intent.getAction();
        byte b = 6;
        int i2 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            qs7 qs7VarX = qs7.x();
            Objects.toString(intent);
            qs7VarX.getClass();
            Context context = this.a;
            zo5 zo5Var = new zo5(context, this.d, i, ezkVar);
            ArrayList arrayListE = ezkVar.e.c.C().e();
            int i3 = lo5.a;
            int size = arrayListE.size();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListE.get(i4);
                i4++;
                xo5 xo5Var = ((h5o) obj).j;
                z |= xo5Var.e;
                z2 |= xo5Var.c;
                z3 |= xo5Var.f;
                z4 |= xo5Var.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            int i5 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(arrayListE.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListE.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayListE.get(i6);
                i6++;
                h5o h5oVar = (h5o) obj2;
                if (jCurrentTimeMillis >= h5oVar.a()) {
                    if (h5oVar.b()) {
                        List list = (List) zo5Var.c.a;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list) {
                            if (((go5) obj3).a(h5oVar)) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            qs7 qs7VarX2 = qs7.x();
                            int i7 = q4o.a;
                            CollectionsKt.P(arrayList2, (CharSequence) null, (CharSequence) null, (String) null, 0, k0l.E, 31);
                            qs7VarX2.getClass();
                        }
                        if (arrayList2.isEmpty()) {
                        }
                    }
                    arrayList.add(h5oVar);
                }
            }
            int size3 = arrayList.size();
            while (i2 < size3) {
                Object obj4 = arrayList.get(i2);
                i2++;
                h5o h5oVar2 = (h5o) obj4;
                String str = h5oVar2.a;
                int i8 = h5oVar2.t;
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                intent3.putExtra("KEY_WORKSPEC_ID", str);
                intent3.putExtra("KEY_WORKSPEC_GENERATION", i8);
                qs7.x().getClass();
                ezkVar.b.d.execute(new sq1(ezkVar, intent3, zo5Var.b, b));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            qs7 qs7VarX3 = qs7.x();
            Objects.toString(intent);
            qs7VarX3.getClass();
            ezkVar.e.f();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            qs7.x().getClass();
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.a;
            w4o w4oVarC = c(intent);
            qs7 qs7VarX4 = qs7.x();
            w4oVarC.toString();
            qs7VarX4.getClass();
            WorkDatabase workDatabase = ezkVar.e.c;
            workDatabase.c();
            try {
                h5o h5oVarG = workDatabase.C().g(w4oVarC.a);
                if (h5oVarG == null) {
                    qs7 qs7VarX5 = qs7.x();
                    w4oVarC.toString();
                    qs7VarX5.getClass();
                } else if (z1m.a(h5oVarG.b)) {
                    qs7 qs7VarX6 = qs7.x();
                    w4oVarC.toString();
                    qs7VarX6.getClass();
                } else {
                    long jA = h5oVarG.a();
                    if (h5oVarG.b()) {
                        qs7 qs7VarX7 = qs7.x();
                        w4oVarC.toString();
                        qs7VarX7.getClass();
                        uy0.b(context2, workDatabase, w4oVarC, jA);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ezkVar.b.d.execute(new sq1(ezkVar, intent4, i, b));
                    } else {
                        qs7 qs7VarX8 = qs7.x();
                        w4oVarC.toString();
                        qs7VarX8.getClass();
                        uy0.b(context2, workDatabase, w4oVarC, jA);
                    }
                    workDatabase.v();
                }
                return;
            } finally {
                workDatabase.p();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.c) {
                w4o w4oVarC2 = c(intent);
                qs7 qs7VarX9 = qs7.x();
                w4oVarC2.toString();
                qs7VarX9.getClass();
                if (this.b.containsKey(w4oVarC2)) {
                    qs7 qs7VarX10 = qs7.x();
                    w4oVarC2.toString();
                    qs7VarX10.getClass();
                } else {
                    c17 c17Var = new c17(this.a, i, ezkVar, this.e.D(w4oVarC2));
                    this.b.put(w4oVarC2, c17Var);
                    c17Var.b();
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                qs7 qs7VarX11 = qs7.x();
                intent.toString();
                qs7VarX11.getClass();
                return;
            } else {
                w4o w4oVarC3 = c(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                qs7 qs7VarX12 = qs7.x();
                intent.toString();
                qs7VarX12.getClass();
                a(w4oVarC3, z5);
                return;
            }
        }
        jvg jvgVar = this.e;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i9 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList3 = new ArrayList(1);
            w8k w8kVarB = jvgVar.B(new w4o(string, i9));
            listC = arrayList3;
            if (w8kVarB != null) {
                arrayList3.add(w8kVarB);
                listC = arrayList3;
            }
        } else {
            listC = jvgVar.C(string);
        }
        for (w8k w8kVar : listC) {
            qs7.x().getClass();
            ezkVar.j.c(w8kVar, -512);
            Context context3 = this.a;
            WorkDatabase workDatabase2 = ezkVar.e.c;
            w4o w4oVar = w8kVar.a;
            int i10 = uy0.a;
            vzk vzkVarZ = workDatabase2.z();
            tzk tzkVarP = vzkVarZ.P(w4oVar);
            if (tzkVarP != null) {
                uy0.a(context3, w4oVar, tzkVarP.c);
                qs7 qs7VarX13 = qs7.x();
                w4oVar.toString();
                qs7VarX13.getClass();
                String str2 = w4oVar.a;
                int i11 = w4oVar.b;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) vzkVarZ.a;
                workDatabase_Impl.b();
                uzk uzkVar = (uzk) vzkVarZ.c;
                ap9 ap9VarF = uzkVar.f();
                ap9VarF.w(1, str2);
                ap9VarF.T0(2, i11);
                try {
                    workDatabase_Impl.c();
                    try {
                        ap9VarF.h();
                        workDatabase_Impl.v();
                        workDatabase_Impl.p();
                    } catch (Throwable th) {
                        workDatabase_Impl.p();
                        throw th;
                    }
                } finally {
                    uzkVar.m(ap9VarF);
                }
            }
            ezkVar.a(w8kVar.a, false);
        }
    }
}
