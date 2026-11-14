package defpackage;

import android.os.Build;
import android.os.SystemClock;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class fa4 {
    public d3k A;
    public d3k B;
    public d3k C;
    public final nx5 a;
    public final hnl b;
    public final fd4 c;
    public final e3a d;
    public final otk e;
    public final oa4 f;
    public final xj4 g;
    public final w6j h;
    public final q8h i;
    public final gg4 j;
    public final hb4 k;
    public final h0l l;
    public final ld4 m;
    public final t94 n;
    public final xfk o;
    public ag4 s;
    public yc4 t;
    public qql u;
    public d3k v;
    public man x;
    public dk4 y;
    public Map z;
    public final Object p = new Object();
    public boolean q = true;
    public z5i r = rc4.C;
    public final cd5 w = new cd5();

    public fa4(nx5 nx5Var, hnl hnlVar, sgk sgkVar, fd4 fd4Var, e3a e3aVar, otk otkVar, oa4 oa4Var, xj4 xj4Var, w6j w6jVar, q8h q8hVar, gg4 gg4Var, hb4 hb4Var, h0l h0lVar, ld4 ld4Var, t94 t94Var, xfk xfkVar, qj5 qj5Var) {
        this.a = nx5Var;
        this.b = hnlVar;
        this.c = fd4Var;
        this.d = e3aVar;
        this.e = otkVar;
        this.f = oa4Var;
        this.g = xj4Var;
        this.h = w6jVar;
        this.i = q8hVar;
        this.j = gg4Var;
        this.k = hb4Var;
        this.l = h0lVar;
        this.m = ld4Var;
        this.n = t94Var;
        this.o = xfkVar;
        this.s = new yf4(fd4Var.a);
        mt5 mt5Var = null;
        this.B = na2.B(nx5Var, null, null, new ca4(this, mt5Var, (byte) 0), 3);
        this.C = na2.B(nx5Var, null, null, new ca4(this, mt5Var, (byte) 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.da4
            if (r0 == 0) goto L13
            r0 = r6
            da4 r0 = (defpackage.da4) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            da4 r0 = new da4
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r6)
            goto L64
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.ybh.y(r6)
            r5.toString()
            java.lang.Object r6 = r5.p
            monitor-enter(r6)
            z5i r2 = r5.r     // Catch: java.lang.Throwable -> L67
            rc4 r4 = defpackage.rc4.x     // Catch: java.lang.Throwable -> L67
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L47
            r5.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L67
            goto L56
        L47:
            z5i r2 = r5.r     // Catch: java.lang.Throwable -> L67
            rc4 r4 = defpackage.rc4.y     // Catch: java.lang.Throwable -> L67
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L58
            r5.toString()     // Catch: java.lang.Throwable -> L67
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L67
        L56:
            monitor-exit(r6)
            return r5
        L58:
            monitor-exit(r6)
            cd5 r5 = r5.w
            r0.v = r3
            java.lang.Object r5 = r5.A(r0)
            if (r5 != r1) goto L64
            return r1
        L64:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L67:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa4.a(nt5):java.lang.Object");
    }

    public final void b(dk4 dk4Var, man manVar) {
        d3k d3kVarB = na2.B(this.a, null, null, new vr(dk4Var, manVar, (mt5) null, (byte) 6), 3);
        if (this.r.equals(rc4.y)) {
            d3kVarB.s(new aa4(this, (byte) 0));
        }
    }

    public final boolean c() {
        return this.r.equals(rc4.y) || this.r.equals(rc4.x);
    }

    public final void d(ag4 ag4Var) {
        toString();
        sd4.b(this.c.a);
        Objects.toString(ag4Var);
        synchronized (this.p) {
            if (!c()) {
                if ((ag4Var instanceof wf4) || (ag4Var instanceof yf4)) {
                    this.s = ag4Var;
                } else if (ag4Var instanceof xf4) {
                    this.l.getClass();
                    this.u = new qql(SystemClock.elapsedRealtimeNanos());
                }
                g();
            }
        }
    }

    public final void e() {
        if (c()) {
            toString();
            return;
        }
        z5i z5iVar = this.r;
        rc4 rc4Var = rc4.B;
        if (z5iVar.equals(rc4Var)) {
            toString();
            return;
        }
        mt5 mt5Var = null;
        this.t = null;
        fd4 fd4Var = this.c;
        String str = fd4Var.a;
        List listK0 = CollectionsKt.k0(b5j.c(Collections.singleton(new sd4(str)), new sd4(str)));
        aa4 aa4Var = new aa4(this, (byte) 1);
        q8h q8hVar = this.i;
        nx5 nx5Var = q8hVar.d;
        e3a e3aVar = this.d;
        man manVar = new man(str, e3aVar, nx5Var);
        if (((p04) q8hVar.e.d).b(new qwh(manVar, listK0, e3aVar, aa4Var)) instanceof ns4) {
            sd4.b(str);
            e3aVar.a(new i3a(12, false));
            manVar = null;
        }
        if (manVar == null) {
            toString();
            return;
        }
        if (this.x != null) {
            qp2.n("Check failed.");
            return;
        }
        if (this.y != null) {
            qp2.n("Check failed.");
            return;
        }
        this.x = manVar;
        dk4 dk4Var = new dk4(this.d, this.g, this.h, this.j, this.l, fd4Var.n, null, this.o, this.b, this.a);
        this.y = dk4Var;
        Map map = this.z;
        if (map != null) {
            dk4Var.d(map);
        }
        this.r = rc4Var;
        toString();
        d3k d3kVar = this.A;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.A = na2.B(this.a, null, null, new ca4(this, mt5Var, (byte) 2), 3);
    }

    public final void f() {
        if (c()) {
            toString();
            return;
        }
        z5i z5iVar = this.r;
        rc4 rc4Var = rc4.D;
        if (z5iVar.equals(rc4Var) || this.r.equals(rc4.C)) {
            toString();
            return;
        }
        man manVar = this.x;
        dk4 dk4Var = this.y;
        this.x = null;
        this.y = null;
        this.r = rc4Var;
        toString();
        b(dk4Var, manVar);
    }

    public final void g() {
        this.l.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        z5i z5iVar = this.r;
        yc4 yc4Var = this.t;
        ag4 ag4Var = this.s;
        qql qqlVar = this.u;
        boolean z = false;
        boolean z2 = (ag4Var instanceof wf4) && (yc4Var == null || yc4Var.a != 3);
        if (qqlVar != null && sn7.a(jElapsedRealtimeNanos - qqlVar.a, 200000000L) <= 0) {
            z = true;
        }
        if (!z5iVar.equals(rc4.z) ? !(z5iVar.equals(rc4.A) && z2 && ((yc4Var == null || yc4Var.a != 9) && (yc4Var == null || yc4Var.a != 8))) : !(z2 || z || Build.VERSION.SDK_INT < 33)) {
            long j = this.c.n.f ? 700L : 0L;
            d3k d3kVar = this.v;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            this.v = na2.B(this.a, null, null, new ea4(j, this, (mt5) null), 3);
            return;
        }
        toString();
        Objects.toString(this.r);
        Objects.toString(this.t);
        Objects.toString(this.s);
        Objects.toString(this.u);
        qql.a(jElapsedRealtimeNanos);
    }

    public final String toString() {
        return "Camera2CameraController(" + this.m + ')';
    }
}
