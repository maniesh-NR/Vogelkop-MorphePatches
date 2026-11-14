package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ib1 extends TextPaint {
    public zg a;
    public bgl b;
    public byte c;
    public jaj d;
    public u95 e;
    public dz3 f;
    public i37 g;
    public bpj h;
    public nk7 i;

    public final zg a() {
        zg zgVar = this.a;
        if (zgVar != null) {
            return zgVar;
        }
        zg zgVar2 = new zg(this);
        this.a = zgVar2;
        return zgVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().C(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.dz3 r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof defpackage.nvj
            if (r1 == 0) goto L1d
            nvj r6 = (defpackage.nvj) r6
            long r6 = r6.a
            long r6 = defpackage.z7h.u(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof defpackage.haj
            if (r1 == 0) goto L6e
            dz3 r1 = r5.f
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            bpj r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = defpackage.bpj.a(r3, r7)
        L36:
            if (r1 != 0) goto L55
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L55
            r5.f = r6
            bpj r1 = new bpj
            r1.<init>(r7)
            r5.h = r1
            hb1 r1 = new hb1
            r1.<init>(r6, r7, r2)
            i37 r6 = defpackage.luj.b(r1)
            r5.g = r6
        L55:
            zg r6 = r5.a()
            i37 r7 = r5.g
            if (r7 == 0) goto L64
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L65
        L64:
            r7 = r0
        L65:
            r6.G(r7)
            r5.e = r0
            defpackage.ic4.I(r5, r9)
            return
        L6e:
            h9o.p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib1.c(dz3, long, float):void");
    }

    public final void d(long j) {
        u95 u95Var = this.e;
        if ((u95Var == null ? false : jgm.a(u95Var.a, j)) || j == 16) {
            return;
        }
        this.e = new u95(j);
        setColor(cs5.u0(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(nk7 nk7Var) {
        if (nk7Var == null || Intrinsics.a(this.i, nk7Var)) {
            return;
        }
        this.i = nk7Var;
        if (nk7Var.equals(a39.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(nk7Var instanceof qik)) {
            h9o.p();
            return;
        }
        a().K(1);
        qik qikVar = (qik) nk7Var;
        a().J(qikVar.a);
        zg zgVarA = a();
        ((Paint) zgVarA.b).setStrokeMiter(qikVar.b);
        a().I(qikVar.d);
        a().H(qikVar.c);
        ((Paint) a().b).setPathEffect(null);
    }

    public final void f(jaj jajVar) {
        if (jajVar == null || Intrinsics.a(this.d, jajVar)) {
            return;
        }
        this.d = jajVar;
        if (jajVar.equals(jaj.d)) {
            clearShadowLayer();
            return;
        }
        jaj jajVar2 = this.d;
        float f = jajVar2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (jajVar2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), cs5.u0(this.d.a));
    }

    public final void g(bgl bglVar) {
        if (bglVar == null || Intrinsics.a(this.b, bglVar)) {
            return;
        }
        this.b = bglVar;
        int i = bglVar.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
