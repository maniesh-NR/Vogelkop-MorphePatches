package ads_mobile_sdk;

import android.os.SystemClock;
import defpackage.cs5;
import defpackage.f30;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class hh3 {
    public static final WeakHashMap a = new WeakHashMap();
    public static final f30 b = new f30((byte) 22);

    public static rg3 a() {
        rg3 rg3Var = b().a;
        if (rg3Var != null) {
            return rg3Var;
        }
        xp1 xp1VarB = b(fw0.CUI_NAME_UNKNOWN, l08.a, true);
        a(b(), xp1VarB);
        return xp1VarB;
    }

    public static rg3 a(fw0 fw0Var, List list, boolean z) {
        rg3 rg3Var = b().a;
        rg3 rg3VarA = rg3Var != null ? rg3Var.a(fw0Var, list, z) : b(fw0Var, list, z);
        a(b(), rg3VarA);
        return rg3VarA;
    }

    public static rg3 a(gh3 gh3Var, rg3 rg3Var) {
        rg3 rg3Var2 = gh3Var.a;
        if (rg3Var2 == rg3Var) {
            return rg3Var;
        }
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        if (rg3Var2 != null) {
            on7 on7Var = pn7.b;
            rg3Var2.e.addAndGet(pn7.f(cs5.y0(jCurrentThreadTimeMillis - gh3Var.b, un7.d)));
        }
        gh3Var.b = jCurrentThreadTimeMillis;
        gh3Var.a = rg3Var;
        e7 e7Var = gh3Var.c;
        if (e7Var == null) {
            return rg3Var2;
        }
        e7Var.a = rg3Var;
        return rg3Var2;
    }

    public static gh3 b() {
        f30 f30Var = b;
        Object gh3Var = f30Var.get();
        if (gh3Var == null) {
            gh3Var = new gh3(SystemClock.currentThreadTimeMillis());
            Thread threadCurrentThread = Thread.currentThread();
            WeakHashMap weakHashMap = a;
            synchronized (weakHashMap) {
            }
            f30Var.set(gh3Var);
        }
        return (gh3) gh3Var;
    }

    public static xp1 b(fw0 fw0Var, List list, boolean z) {
        nw.a("Attempted to start a trace " + fw0Var.name() + " without a parent. Did you forget to start a root trace or propagate an existing one?");
        return new xp1(fw0Var, list, UUID.randomUUID(), new kh3(new eq2(), new ih1(), new dt2(), new s8()), 0, 0, null, z);
    }
}
