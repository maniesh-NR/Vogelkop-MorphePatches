package defpackage;

/* loaded from: classes.dex */
public final class y38 implements ble {
    public final /* synthetic */ z38 a;

    public y38(z38 z38Var) {
        this.a = z38Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
    
        if (r15 == r2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // defpackage.ble
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B0(long r11, long r13, mt5 r15) {
        /*
            r10 = this;
            z38 r0 = r10.a
            tul r1 = r0.a
            boolean r2 = r15 instanceof defpackage.x38
            if (r2 == 0) goto L18
            r2 = r15
            x38 r2 = (defpackage.x38) r2
            int r3 = r2.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.w = r3
        L16:
            r8 = r2
            goto L20
        L18:
            x38 r2 = new x38
            nt5 r15 = (nt5) r15
            r2.<init>(r10, r15)
            goto L16
        L20:
            java.lang.Object r15 = r8.u
            px5 r2 = px5.a
            int r3 = r8.w
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 == r4) goto L3b
            if (r3 != r9) goto L34
            long r10 = r8.t
            defpackage.ybh.y(r15)
            goto L8d
        L34:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L3b:
            long r13 = r8.t
            defpackage.ybh.y(r15)
            goto L76
        L41:
            defpackage.ybh.y(r15)
            float r15 = defpackage.i1n.c(r13)
            r3 = 0
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 <= 0) goto L68
            p0g r15 = r1.c
            float r15 = r15.h()
            int r15 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r15 == 0) goto L63
            p0g r15 = r1.c
            float r15 = r15.h()
            float r5 = r1.a
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 != 0) goto L68
        L63:
            p0g r15 = r1.b
            r15.i(r3)
        L68:
            r8.t = r13
            r8.w = r4
            r3 = r10
            r4 = r11
            r6 = r13
            java.lang.Object r15 = super.B0(r4, r6, r8)
            if (r15 == r2) goto L8c
            r13 = r6
        L76:
            i1n r15 = (defpackage.i1n) r15
            long r10 = r15.a
            float r12 = defpackage.i1n.c(r13)
            wi6 r13 = r0.c
            a2k r14 = r0.b
            r8.t = r10
            r8.w = r9
            java.lang.Object r15 = defpackage.so1.i(r1, r12, r13, r14, r8)
            if (r15 != r2) goto L8d
        L8c:
            return r2
        L8d:
            i1n r15 = (defpackage.i1n) r15
            long r12 = r15.a
            long r10 = defpackage.i1n.e(r10, r12)
            i1n r12 = new i1n
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y38.B0(long, long, mt5):java.lang.Object");
    }

    @Override // defpackage.ble
    public final long K(int i, long j, long j2) {
        z38 z38Var = this.a;
        tul tulVar = z38Var.a;
        if (!((Boolean) z38Var.d.invoke()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        tulVar.b.i(Float.intBitsToFloat(i2) + tulVar.b.h());
        tulVar.b(Float.intBitsToFloat(i2) + tulVar.c.h());
        return 0L;
    }

    @Override // defpackage.ble
    public final long v(int i, long j) {
        z38 z38Var = this.a;
        tul tulVar = z38Var.a;
        if (!((Boolean) z38Var.d.invoke()).booleanValue()) {
            return 0L;
        }
        float fH = tulVar.c.h();
        tulVar.b(Float.intBitsToFloat((int) (4294967295L & j)) + tulVar.c.h());
        if (fH == tulVar.c.h()) {
            return 0L;
        }
        return y8f.a(j, 2, 0.0f);
    }
}
