package defpackage;

import android.os.Trace;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class nd4 implements AutoCloseable, sc4 {
    public final e3a a;
    public final e3a b;
    public final xfk c;
    public final otk d;
    public final fa4 e;
    public final eo9 f;
    public final do9 g;
    public final hh2 h;
    public final ld4 i;
    public final od4 j;
    public final pd4 k;
    public final h3a l;
    public final nx5 m;
    public final qu5 n;
    public final af2 o = c26.i(false);

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nd4(defpackage.fd4 r20, defpackage.ge4 r21, defpackage.e3a r22, defpackage.e3a r23, defpackage.xfk r24, defpackage.otk r25, defpackage.fa4 r26, defpackage.eo9 r27, defpackage.do9 r28, defpackage.hh2 r29, ld4 r30, defpackage.od4 r31, defpackage.pd4 r32, defpackage.h3a r33, nx5 r34, defpackage.qu5 r35) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd4.<init>(fd4, ge4, e3a, e3a, xfk, otk, fa4, eo9, do9, hh2, ld4, od4, pd4, h3a, nx5, qu5):void");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        mt5 mt5Var;
        if (this.o.a()) {
            Trace.beginSection(this + "#close");
            this.a.c.close();
            fa4 fa4Var = this.e;
            synchronized (fa4Var.p) {
                mt5Var = null;
                if (!fa4Var.c()) {
                    fa4Var.r = rc4.y;
                    fa4Var.toString();
                    man manVar = fa4Var.x;
                    dk4 dk4Var = fa4Var.y;
                    fa4Var.x = null;
                    fa4Var.y = null;
                    d3k d3kVar = fa4Var.v;
                    if (d3kVar != null) {
                        d3kVar.k((CancellationException) null);
                    }
                    d3k d3kVar2 = fa4Var.A;
                    if (d3kVar2 != null) {
                        d3kVar2.k((CancellationException) null);
                    }
                    fa4Var.A = null;
                    d3k d3kVar3 = fa4Var.B;
                    if (d3kVar3 != null) {
                        d3kVar3.k((CancellationException) null);
                    }
                    fa4Var.B = null;
                    d3k d3kVar4 = fa4Var.C;
                    if (d3kVar4 != null) {
                        d3kVar4.k((CancellationException) null);
                    }
                    fa4Var.C = null;
                    am2.y(fa4Var.f);
                    fa4Var.b(dk4Var, manVar);
                    fd4 fd4Var = fa4Var.c;
                    if (fd4Var.n.e || fa4Var.k.a(fd4Var.a)) {
                        sd4.b(fa4Var.c.a);
                        fa4Var.toString();
                        q8h q8hVar = fa4Var.i;
                        String str = fa4Var.c.a;
                        q8hVar.getClass();
                        xvh xvhVar = new xvh(str);
                        cd5 cd5Var = xvhVar.b;
                        if (((p04) q8hVar.e.d).b(xvhVar) instanceof ns4) {
                            sd4.b(str);
                            cd5Var.j0(Unit.a);
                        }
                    }
                }
            }
            this.f.close();
            this.g.close();
            this.d.close();
            this.c.close();
            hh2 hh2Var = this.h;
            synchronized (hh2Var.c) {
                ih2 ih2VarA = hh2Var.a();
                hh2Var.d.remove(this);
                ih2 ih2VarA2 = hh2Var.a();
                if (ih2VarA2 != null && !ih2VarA2.equals(ih2VarA)) {
                    na2.B(hh2Var.a, null, rx5.d, new jj4((Object) hh2Var.b, (Object) new vr(hh2Var, ih2VarA2, (mt5) null, (byte) 4), mt5Var, (byte) 11), 1);
                }
            }
            sgb.k(this.m, null);
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(mt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.md4
            if (r0 == 0) goto L13
            r0 = r7
            md4 r0 = (defpackage.md4) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            md4 r0 = new md4
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r7)
            goto L3c
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.ybh.y(r7)
            r0.v = r3
            h3a r7 = r6.l
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L3c
            return r1
        L3c:
            r1 = r7
            qfe r1 = (defpackage.qfe) r1
            qd4 r0 = new qd4
            od4 r4 = r6.j
            pd4 r5 = r6.k
            e3a r2 = r6.a
            qu5 r3 = r6.n
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd4.k(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r6, android.view.Surface r7) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd4.l(int, android.view.Surface):void");
    }

    public final String toString() {
        return this.i.a;
    }
}
