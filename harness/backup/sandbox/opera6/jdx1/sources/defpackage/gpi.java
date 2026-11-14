package defpackage;

/* loaded from: classes.dex */
public final class gpi implements ble {
    public final spi a;
    public boolean b;

    public gpi(spi spiVar, boolean z) {
        this.a = spiVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ble
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B0(long r5, long r7, mt5 r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof defpackage.fpi
            if (r5 == 0) goto L13
            r5 = r9
            fpi r5 = (defpackage.fpi) r5
            int r6 = r5.w
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.w = r6
            goto L1a
        L13:
            fpi r5 = new fpi
            nt5 r9 = (nt5) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.u
            px5 r9 = px5.a
            int r0 = r5.w
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            long r7 = r5.t
            defpackage.ybh.y(r6)
            goto L4c
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L32:
            defpackage.ybh.y(r6)
            boolean r6 = r4.b
            r2 = 0
            if (r6 == 0) goto L54
            spi r4 = r4.a
            boolean r6 = r4.i
            if (r6 != 0) goto L50
            r5.t = r7
            r5.w = r1
            java.lang.Object r6 = r4.a(r7, r5)
            if (r6 != r9) goto L4c
            return r9
        L4c:
            i1n r6 = (defpackage.i1n) r6
            long r2 = r6.a
        L50:
            long r2 = defpackage.i1n.d(r7, r2)
        L54:
            i1n r4 = new i1n
            r4.<init>(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpi.B0(long, long, mt5):java.lang.Object");
    }

    @Override // defpackage.ble
    public final long K(int i, long j, long j2) {
        if (!this.b) {
            return 0L;
        }
        spi spiVar = this.a;
        if (spiVar.a.a()) {
            return 0L;
        }
        return spiVar.i(spiVar.e(spiVar.a.e(spiVar.e(spiVar.h(j2)))));
    }
}
