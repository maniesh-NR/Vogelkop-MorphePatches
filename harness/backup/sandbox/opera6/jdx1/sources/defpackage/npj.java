package defpackage;

/* loaded from: classes.dex */
public final class npj extends b8e implements e3c {
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        long jT0 = T0(o1dVar);
        if (yo5.e(jT0)) {
            return yo5.g(jT0);
        }
        if (!this.s) {
            i = ap5.g(i, jT0);
        }
        return ap5.f(pfdVar.c(i), jT0);
    }

    @Override // defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        long jT0 = T0(o1dVar);
        if (yo5.f(jT0)) {
            return yo5.h(jT0);
        }
        if (!this.s) {
            i = ap5.f(i, jT0);
        }
        return ap5.g(pfdVar.E(i), jT0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long T0(defpackage.vfd r7) {
        /*
            r6 = this;
            float r0 = r6.q
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.q
            int r0 = r7.M(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.r
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.r
            int r3 = r7.M(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.o
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L40
            float r4 = r6.o
            int r4 = r7.M(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 != r1) goto L41
        L40:
            r4 = r2
        L41:
            float r5 = r6.p
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L58
            float r6 = r6.p
            int r6 = r7.M(r6)
            if (r6 >= 0) goto L52
            r6 = r2
        L52:
            if (r6 <= r3) goto L55
            r6 = r3
        L55:
            if (r6 == r1) goto L58
            r2 = r6
        L58:
            long r6 = defpackage.ap5.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npj.T0(vfd):long");
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jT0 = T0(vfdVar);
        if (this.s) {
            jA = ap5.e(j, jT0);
        } else {
            if (Float.isNaN(this.o)) {
                iJ = yo5.j(j);
                int iH2 = yo5.h(jT0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = yo5.j(jT0);
            }
            if (Float.isNaN(this.q)) {
                iH = yo5.h(j);
                int iJ2 = yo5.j(jT0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = yo5.h(jT0);
            }
            if (Float.isNaN(this.p)) {
                i = yo5.i(j);
                int iG2 = yo5.g(jT0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = yo5.i(jT0);
            }
            if (Float.isNaN(this.r)) {
                iG = yo5.g(j);
                int i2 = yo5.i(jT0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = yo5.g(jT0);
            }
            jA = ap5.a(iJ, iH, i, iG);
        }
        ifg ifgVarN = pfdVar.N(jA);
        return vfdVar.b0(ifgVarN.a, ifgVarN.b, n08.a, new f4(ifgVarN, (byte) 13));
    }

    @Override // defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        long jT0 = T0(o1dVar);
        if (yo5.f(jT0)) {
            return yo5.h(jT0);
        }
        if (!this.s) {
            i = ap5.f(i, jT0);
        }
        return ap5.g(pfdVar.J(i), jT0);
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        long jT0 = T0(o1dVar);
        if (yo5.e(jT0)) {
            return yo5.g(jT0);
        }
        if (!this.s) {
            i = ap5.g(i, jT0);
        }
        return ap5.f(pfdVar.z(i), jT0);
    }
}
