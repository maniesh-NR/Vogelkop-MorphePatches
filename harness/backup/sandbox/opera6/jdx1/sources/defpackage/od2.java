package defpackage;

import android.os.Trace;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class od2 extends hyf implements dth {
    public static final f32 u = new f32((byte) 8);
    public kh3 h;
    public boolean i;
    public d3k j;
    public nx5 l;
    public rd2 p;
    public id2 q;
    public final nak r;
    public final nak s;
    public final rlh t;
    public final t0g f = hyg.k((Object) null);
    public float g = 1.0f;
    public long k = 9205357640488583168L;
    public f32 m = u;
    public kr5 n = jr5.b;
    public boolean o = true;

    public od2(id2 id2Var) {
        this.q = id2Var;
        this.r = z4o.f(id2Var);
        nak nakVarF = z4o.f(jd2.a);
        this.s = nakVarF;
        this.t = a26.j(nakVarF);
    }

    @Override // defpackage.dth
    public final void a() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objJ = j();
            dth dthVar = objJ instanceof dth ? (dth) objJ : null;
            if (dthVar != null) {
                dthVar.a();
            }
            k();
            this.i = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.dth
    public final void b() {
        d3k d3kVar = this.j;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.j = null;
        Object objJ = j();
        dth dthVar = objJ instanceof dth ? (dth) objJ : null;
        if (dthVar != null) {
            dthVar.b();
        }
        this.i = false;
    }

    @Override // defpackage.dth
    public final void c() {
        d3k d3kVar = this.j;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.j = null;
        Object objJ = j();
        dth dthVar = objJ instanceof dth ? (dth) objJ : null;
        if (dthVar != null) {
            dthVar.c();
        }
        this.i = false;
    }

    @Override // defpackage.hyf
    public final boolean d(float f) {
        this.g = f;
        return true;
    }

    @Override // defpackage.hyf
    public final boolean e(kh3 kh3Var) {
        this.h = kh3Var;
        return true;
    }

    @Override // defpackage.hyf
    public final long h() {
        hyf hyfVarJ = j();
        if (hyfVarJ != null) {
            return hyfVarJ.h();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.hyf
    public final void i(mk7 mk7Var) {
        long jE = mk7Var.e();
        if (!bpj.a(this.k, jE)) {
            this.k = jE;
        }
        hyf hyfVarJ = j();
        if (hyfVarJ != null) {
            hyfVarJ.g(mk7Var, mk7Var.e(), this.g, this.h);
        }
    }

    public final hyf j() {
        return (hyf) this.f.getValue();
    }

    public final void k() {
        id2 id2Var = this.q;
        if (id2Var == null) {
            return;
        }
        nx5 nx5Var = this.l;
        if (nx5Var == null) {
            nx5Var = null;
        }
        hz1 hz1Var = new hz1(this, id2Var, (mt5) null, (byte) 1);
        CoroutineContext coroutineContextL = nx5Var.l();
        int i = kzm.b;
        dx5 dx5Var = coroutineContextL.get(d.Hq);
        dx5 dx5Var2 = dx5Var instanceof dx5 ? dx5Var : null;
        d3k d3kVarA = (dx5Var2 == null || dx5Var2.equals(bb7.b)) ? na2.A(nx5Var, bb7.b, rx5.d, hz1Var) : na2.A(sgb.b(new j07(nx5Var.l())), new k07(dx5Var2), rx5.d, hz1Var);
        d3k d3kVar = this.j;
        if (d3kVar != null) {
            d3kVar.k((CancellationException) null);
        }
        this.j = d3kVarA;
    }

    public final void l(id2 id2Var) {
        if (Intrinsics.a(this.q, id2Var)) {
            return;
        }
        this.q = id2Var;
        if (id2Var == null) {
            d3k d3kVar = this.j;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            this.j = null;
        } else if (this.i) {
            k();
        }
        if (id2Var != null) {
            nak nakVar = this.r;
            nakVar.getClass();
            nakVar.k((Object) null, id2Var);
        }
    }

    public final bza m(bza bzaVar, boolean z) {
        yya yyaVarA = bza.a(bzaVar);
        yyaVarA.d = new yqa(bzaVar, this, (byte) 5);
        aza azaVar = bzaVar.p;
        if (azaVar.d == null) {
            yyaVarA.i = opj.a;
        }
        if (azaVar.e == null) {
            kr5 kr5Var = this.n;
            int i = kzm.b;
            yyaVarA.j = (Intrinsics.a(kr5Var, jr5.b) || Intrinsics.a(kr5Var, jr5.d)) ? lli.b : lli.a;
        }
        if (azaVar.f == null) {
            yyaVarA.k = wog.b;
        }
        if (z) {
            h hVar = h.a;
            yyaVarA.f = hVar;
            yyaVarA.g = hVar;
            yyaVarA.h = hVar;
        }
        return yyaVarA.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.nd2 r12) {
        /*
            r11 = this;
            nak r0 = r11.s
            java.lang.Object r1 = r0.getValue()
            nd2 r1 = (defpackage.nd2) r1
            f32 r2 = r11.m
            r2.getClass()
            r0.j(r12)
            kr5 r6 = r11.n
            boolean r0 = r12 instanceof defpackage.md2
            r2 = 0
            if (r0 == 0) goto L1d
            r0 = r12
            md2 r0 = (defpackage.md2) r0
            xnk r0 = r0.b
            goto L26
        L1d:
            boolean r0 = r12 instanceof defpackage.kd2
            if (r0 == 0) goto L79
            r0 = r12
            kd2 r0 = (defpackage.kd2) r0
            l68 r0 = r0.b
        L26:
            bza r3 = r0.getRequest()
            xm5 r4 = defpackage.eza.a
            java.lang.Object r3 = defpackage.xf8.J(r3, r4)
            r2m r3 = (defpackage.r2m) r3
            z2m r3 = r3.a(r0)
            boolean r4 = r3 instanceof defpackage.w26
            if (r4 == 0) goto L79
            hyf r4 = r1.a()
            boolean r5 = r1 instanceof defpackage.ld2
            if (r5 != 0) goto L43
            r4 = r2
        L43:
            hyf r5 = r12.a()
            on7 r7 = pn7.b
            w26 r3 = (defpackage.w26) r3
            short r3 = r3.b
            un7 r7 = un7.d
            long r7 = defpackage.cs5.x0(r3, r7)
            boolean r3 = r0 instanceof defpackage.xnk
            if (r3 == 0) goto L61
            r3 = r0
            xnk r3 = (defpackage.xnk) r3
            boolean r3 = r3.g
            if (r3 == 0) goto L61
            r3 = 0
        L5f:
            r9 = r3
            goto L63
        L61:
            r3 = 1
            goto L5f
        L63:
            bza r0 = r0.getRequest()
            xm5 r3 = fsp.g
            java.lang.Object r0 = defpackage.xf8.J(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r10 = r0.booleanValue()
            u26 r3 = new u26
            r3.<init>(r4, r5, r6, r7, r9, r10)
            goto L7a
        L79:
            r3 = r2
        L7a:
            if (r3 != 0) goto L80
            hyf r3 = r12.a()
        L80:
            t0g r11 = r11.f
            r11.setValue(r3)
            hyf r11 = r1.a()
            hyf r0 = r12.a()
            if (r11 == r0) goto Lb0
            hyf r11 = r1.a()
            boolean r0 = r11 instanceof defpackage.dth
            if (r0 == 0) goto L9a
            dth r11 = (defpackage.dth) r11
            goto L9b
        L9a:
            r11 = r2
        L9b:
            if (r11 == 0) goto La0
            r11.c()
        La0:
            hyf r11 = r12.a()
            boolean r12 = r11 instanceof defpackage.dth
            if (r12 == 0) goto Lab
            r2 = r11
            dth r2 = (defpackage.dth) r2
        Lab:
            if (r2 == 0) goto Lb0
            r2.a()
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.n(nd2):void");
    }
}
