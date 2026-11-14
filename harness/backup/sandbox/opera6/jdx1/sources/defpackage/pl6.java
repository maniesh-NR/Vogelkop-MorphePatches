package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pl6 {
    public static final csh p = h1b.x(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final csh q = h1b.x(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final csh r = h1b.x(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final csh s = h1b.x(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final csh t = h1b.x(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final csh u = h1b.x(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static pl6 v;
    public final Context a;
    public final l1b b;
    public final zy9 c;
    public final kzk d;
    public final boolean e;
    public final dqj f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public String o;

    /* JADX WARN: Type inference failed for: r6v6, types: [ol6] */
    public pl6(Context context, HashMap map) {
        boolean z;
        kzk kzkVar = kzk.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = l1b.h(map);
        this.c = new zy9((byte) 15);
        this.f = new dqj();
        this.d = kzkVar;
        this.e = true;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        gpe gpeVarB = gpe.b(context);
        int iC = gpeVarB.c();
        this.n = iC;
        this.l = a(iC);
        ?? r6 = new Object() { // from class: ol6
        };
        Executor executorP = f03.p();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) gpeVarB.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            fpe fpeVar = (fpe) it.next();
            if (fpeVar.a.get() == null) {
                copyOnWriteArrayList.remove(fpeVar);
            }
        }
        fpe fpeVar2 = new fpe(gpeVarB, r6, executorP);
        synchronized (gpeVarB.e) {
            ((CopyOnWriteArrayList) gpeVarB.d).add(fpeVar2);
            z = gpeVarB.b;
        }
        if (z) {
            fpeVar2.b.execute(new yqd(fpeVar2, (byte) 11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:910:0x103e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(int r15) {
        /*
            Method dump skipped, instructions count: 8284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl6.a(int):long");
    }

    public final void b(int i, long j, long j2) {
        final int i2;
        final long j3;
        final long j4;
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        Iterator it = ((CopyOnWriteArrayList) this.c.a).iterator();
        while (it.hasNext()) {
            final m13 m13Var = (m13) it.next();
            if (m13Var.c) {
                i2 = i;
                j3 = j;
                j4 = j2;
            } else {
                i2 = i;
                j3 = j;
                j4 = j2;
                m13Var.a.post(new Runnable() { // from class: l13
                    @Override // java.lang.Runnable
                    public final void run() {
                        el6 el6Var = m13Var.b;
                        igi igiVar = el6Var.d;
                        d11 d11VarR = el6Var.R(((h1b) igiVar.c).isEmpty() ? null : (jrd) sfe.c0((h1b) igiVar.c));
                        el6Var.V(d11VarR, 1006, new oo4(d11VarR, i2, j3, j4));
                    }
                });
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }
}
