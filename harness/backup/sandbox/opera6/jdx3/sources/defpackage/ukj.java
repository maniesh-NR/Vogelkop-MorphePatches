package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ukj {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public ukj(d2c d2cVar, n27 n27Var, mh9 mh9Var, ikl iklVar, Object obj) {
        this.b = d2cVar;
        this.c = n27Var;
        this.d = mh9Var;
        this.e = iklVar;
        this.f = obj;
        this.g = hyg.k(Boolean.TRUE);
        this.a = 0L;
    }

    public ukj(hq8 hq8Var) {
        this.a = hq8Var.e();
        this.b = hq8Var.c();
        this.c = hq8Var.h();
        this.d = hq8Var.i(p6l.a);
        this.e = hq8Var.i(p6l.b);
        this.f = hq8Var.g();
        this.g = hq8Var instanceof tq8 ? ((tq8) hq8Var).z() : new Date(0L);
    }

    public static void a(ukj ukjVar, d2c d2cVar, n27 n27Var, ikl iklVar, int i) {
        if ((i & 1) != 0) {
            d2cVar = (d2c) ukjVar.b;
        }
        if ((i & 2) != 0) {
            n27Var = (n27) ukjVar.c;
        }
        mh9 mh9Var = (mh9) ukjVar.d;
        if ((i & 8) != 0) {
            iklVar = (ikl) ukjVar.e;
        }
        Object obj = ukjVar.f;
        d2c d2cVar2 = (d2c) ukjVar.b;
        t0g t0gVar = (t0g) ukjVar.g;
        if (d2cVar == d2cVar2 && Intrinsics.a(n27Var, (n27) ukjVar.c) && Intrinsics.a(mh9Var, (mh9) ukjVar.d) && iklVar.equals((ikl) ukjVar.e)) {
            if (Intrinsics.a(obj, ukjVar.f)) {
                return;
            }
            ukjVar.f = obj;
            t0gVar.setValue(Boolean.TRUE);
            return;
        }
        ukjVar.b = d2cVar;
        ukjVar.c = n27Var;
        ukjVar.d = mh9Var;
        ukjVar.e = iklVar;
        t0gVar.setValue(Boolean.TRUE);
    }
}
