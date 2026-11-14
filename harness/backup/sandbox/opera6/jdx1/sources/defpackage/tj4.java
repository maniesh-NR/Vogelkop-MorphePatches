package defpackage;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;

/* loaded from: classes.dex */
public final class tj4 implements ni4 {
    public static final boolean f;
    public final n7h a;
    public final ctm b;
    public final kwl c;
    public final zyk d;
    public final zyk e = z4c.b(new r94(this, 4));

    static {
        f = d77.a(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public tj4(pe4 pe4Var, n7h n7hVar, ctm ctmVar, kwl kwlVar) {
        this.a = n7hVar;
        this.b = ctmVar;
        this.c = kwlVar;
        this.d = z4c.b(new oi4(pe4Var, (byte) 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // defpackage.ni4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.ArrayList r17, int r18, defpackage.eb4 r19, int r20, int r21, int r22, nt5 r23) {
        /*
            r16 = this;
            r0 = r16
            r2 = r17
            r1 = r23
            boolean r3 = r1 instanceof defpackage.sj4
            if (r3 == 0) goto L1a
            r3 = r1
            sj4 r3 = (defpackage.sj4) r3
            int r4 = r3.w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.w = r4
        L18:
            r8 = r3
            goto L20
        L1a:
            sj4 r3 = new sj4
            r3.<init>(r0, r1)
            goto L18
        L20:
            java.lang.Object r1 = r8.u
            px5 r9 = px5.a
            int r3 = r8.w
            r10 = 3
            r11 = 0
            r4 = 1
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L34
            boolean r2 = r8.t
            defpackage.ybh.y(r1)
            goto Laf
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r0)
            return r11
        L3a:
            defpackage.ybh.y(r1)
            r1 = 0
            if (r2 == 0) goto L46
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L8f
        L46:
            int r3 = r2.size()
            r5 = r1
        L4b:
            if (r5 >= r3) goto L8f
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            ai4 r6 = (defpackage.ai4) r6
            zyk r7 = r0.d
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r12 = 2
            r13 = -1
            r14 = r18
            if (r14 != r10) goto L6b
            if (r7 != 0) goto L6b
            r7 = 4
            goto L75
        L6b:
            int r7 = r6.c
            if (r7 == r13) goto L74
            r15 = 5
            if (r7 == r15) goto L74
            r7 = r13
            goto L75
        L74:
            r7 = r12
        L75:
            if (r7 != r13) goto L79
            int r7 = r6.c
        L79:
            if (r7 != r12) goto L4b
            kwl r3 = r0.c
            ode r3 = r3.e
            java.lang.Object r3 = r3.g()
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L91
            int r3 = r3.intValue()
            if (r3 != r4) goto L91
            r12 = r4
            goto L92
        L8f:
            r14 = r18
        L91:
            r12 = r1
        L92:
            zyk r1 = r0.e
            java.lang.Object r1 = r1.getValue()
            rj4 r1 = (defpackage.rj4) r1
            r8.t = r12
            r8.w = r4
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r3 = r14
            java.lang.Object r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            if (r1 != r9) goto Lae
            return r9
        Lae:
            r2 = r12
        Laf:
            java.util.List r1 = (java.util.List) r1
            if (r2 == 0) goto Lbf
            ctm r2 = r0.b
            a64 r2 = r2.f
            p71 r3 = new p71
            r3.<init>(r1, r0, r11, r10)
            defpackage.na2.B(r2, r11, r11, r3, r10)
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj4.a(java.util.ArrayList, int, eb4, int, int, int, nt5):java.lang.Object");
    }

    @Override // defpackage.ni4
    public final aj4 b(int i, int i2) {
        rj4 rj4Var = (rj4) this.e.getValue();
        rj4Var.getClass();
        return new aj4(rj4Var, i, i2);
    }

    @Override // defpackage.ni4
    public final void c(int i) {
        ((rj4) this.e.getValue()).l = i;
    }
}
