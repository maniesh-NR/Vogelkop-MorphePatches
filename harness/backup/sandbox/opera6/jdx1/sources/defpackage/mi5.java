package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class mi5 {
    public static final hp7 a = new hp7(new mf5((byte) 12), (byte) 1);
    public static final hp7 b = new hp7(new mf5((byte) 13), (byte) 1);
    public static final hp7 c = new hp7(new mf5((byte) 18), (byte) 1);
    public static final hp7 d = new hp7(new mf5((byte) 19), (byte) 1);
    public static final hp7 e = new hp7(new mf5((byte) 20), (byte) 1);
    public static final hp7 f = new hp7(new mf5((byte) 21), (byte) 1);
    public static final hp7 g = new hp7(new mf5((byte) 22), (byte) 1);
    public static final hp7 h = new hp7(new mf5((byte) 24), (byte) 1);
    public static final hp7 i = new hp7(new mf5((byte) 25), (byte) 1);
    public static final hp7 j = new hp7(new mf5((byte) 26), (byte) 1);
    public static final hp7 k = new hp7(new mf5((byte) 23), (byte) 1);
    public static final hp7 l = new hp7(new mf5((byte) 27), (byte) 1);
    public static final hp7 m = new hp7(new mf5((byte) 28), (byte) 1);
    public static final hp7 n = new hp7(new mf5((byte) 29), (byte) 1);
    public static final hp7 o = new hp7(new ki5((byte) 0), (byte) 1);
    public static final hp7 p;
    public static final hp7 q;
    public static final hp7 r;
    public static final hp7 s;
    public static final hp7 t;
    public static final hp7 u;
    public static final hp7 v;
    public static final hp7 w;
    public static final hp7 x;
    public static final hp7 y;

    static {
        z4c.b(new ki5((byte) 5));
        p = new hp7(new ki5((byte) 1), (byte) 1);
        q = new hp7(new ki5((byte) 2), (byte) 1);
        r = new hp7(new ki5((byte) 3), (byte) 1);
        s = new hp7(new ki5((byte) 4), (byte) 1);
        t = new hp7(new mf5((byte) 14), (byte) 1);
        u = new hp7(new mf5((byte) 15), (byte) 1);
        v = new hp7(new mf5((byte) 16), (byte) 1);
        w = new hp7(new mf5((byte) 17), (byte) 1);
        x = new hp7(new be8((byte) 9), (byte) 0);
        y = new hp7(new ki5((byte) 27), (byte) 1);
    }

    public static final void a(v31 v31Var, tb1 tb1Var, ue5 ue5Var, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1925803616);
        int i3 = i2 | (vt9Var.f(v31Var) ? 4 : 2) | (vt9Var.f(tb1Var) ? 32 : 16) | (vt9Var.h(ue5Var) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY);
        if (vt9Var.N(i3 & 1, (i3 & 147) != 146)) {
            k7h k7hVarA = a.a(v31Var.o().k);
            k7h k7hVarA2 = b.a(v31Var.H);
            k7h k7hVarA3 = d.a(v31Var.I);
            k7h k7hVarA4 = c.a(v31Var.y);
            k7h k7hVarA5 = e.a(v31Var.o().m);
            k7h k7hVarA6 = f.a(v31Var.o().n);
            k7h k7hVarA7 = h.a(v31Var.h());
            k7h k7hVarA8 = i.a(v31Var.l);
            k7h k7hVarA9 = j.a(v31Var.o().o);
            k7hVarA9.g = false;
            k7h k7hVarA10 = k.a((mh9) v31Var.h0.getValue());
            k7hVarA10.g = false;
            k7h k7hVarA11 = l.a(v31Var.o().q);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z || objK == zpaVar) {
                objK = new h31(v31Var, (byte) 5);
                vt9Var.g0(objK);
            }
            k7h k7hVarC = m.c((Function1) objK);
            k7h k7hVarA12 = n.a((d2c) v31Var.i0.getValue());
            boolean z2 = i4 == 4;
            Object objK2 = vt9Var.K();
            if (z2 || objK2 == zpaVar) {
                objK2 = new h31(v31Var, (byte) 6);
                vt9Var.g0(objK2);
            }
            k7h k7hVarC2 = p.c((Function1) objK2);
            boolean z3 = i4 == 4;
            Object objK3 = vt9Var.K();
            if (z3 || objK3 == zpaVar) {
                objK3 = new h31(v31Var, (byte) 7);
                vt9Var.g0(objK3);
            }
            k7h k7hVarC3 = q.c((Function1) objK3);
            boolean z4 = i4 == 4;
            Object objK4 = vt9Var.K();
            boolean z5 = z4;
            byte b2 = 8;
            if (z5 || objK4 == zpaVar) {
                objK4 = new h31(v31Var, b2);
                vt9Var.g0(objK4);
            }
            k7h k7hVarC4 = r.c((Function1) objK4);
            k7h k7hVarA13 = s.a(tb1Var);
            k7h k7hVarA14 = t.a(v31Var.o().r);
            k7h k7hVarA15 = u.a(v31Var.o().t);
            boolean z6 = i4 == 4;
            Object objK5 = vt9Var.K();
            if (z6 || objK5 == zpaVar) {
                objK5 = new h31(v31Var, (byte) 9);
                vt9Var.g0(objK5);
            }
            kfo.d(new k7h[]{k7hVarA, k7hVarA2, k7hVarA3, k7hVarA4, k7hVarA5, k7hVarA6, k7hVarA7, k7hVarA8, k7hVarA9, k7hVarA10, k7hVarA11, k7hVarC, k7hVarA12, k7hVarC2, k7hVarC3, k7hVarC4, k7hVarA13, k7hVarA14, k7hVarA15, w.c((Function1) objK5), g.a(v31Var.x), nvc.a.a(v31Var.g), o.a((awc) v31Var.G.getValue())}, ue5Var, vt9Var, 8 | ((i3 >> 3) & 112));
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new g9(v31Var, tb1Var, ue5Var, i2, (byte) 11);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
