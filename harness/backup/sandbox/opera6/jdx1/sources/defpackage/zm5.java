package defpackage;

/* loaded from: classes.dex */
public class zm5 {
    public final va5 a;
    public final va5 b;
    public final va5 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zm5(defpackage.va5 r10, defpackage.va5 r11, int r12) {
        /*
            r9 = this;
            long r0 = r10.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.a26.E(r0, r2)
            if (r0 == 0) goto L12
            va5 r0 = defpackage.ui6.f(r10)
            goto L13
        L12:
            r0 = r10
        L13:
            long r4 = r11.b
            boolean r1 = defpackage.a26.E(r4, r2)
            if (r1 == 0) goto L20
            va5 r1 = defpackage.ui6.f(r11)
            goto L21
        L20:
            r1 = r11
        L21:
            float[] r4 = defpackage.x1p.i
            r5 = 3
            r6 = 0
            if (r12 != r5) goto L68
            long r7 = r10.b
            boolean r12 = defpackage.a26.E(r7, r2)
            long r7 = r11.b
            boolean r2 = defpackage.a26.E(r7, r2)
            if (r12 == 0) goto L38
            if (r2 == 0) goto L3b
            goto L68
        L38:
            if (r2 == 0) goto L68
            r10 = r11
        L3b:
            e5i r10 = (defpackage.e5i) r10
            r0o r10 = r10.d
            if (r12 == 0) goto L46
            float[] r12 = r10.a()
            goto L47
        L46:
            r12 = r4
        L47:
            if (r2 == 0) goto L4d
            float[] r4 = r10.a()
        L4d:
            r10 = 0
            r2 = r12[r10]
            r3 = r4[r10]
            float r2 = r2 / r3
            r3 = 1
            r6 = r12[r3]
            r7 = r4[r3]
            float r6 = r6 / r7
            r7 = 2
            r12 = r12[r7]
            r4 = r4[r7]
            float r12 = r12 / r4
            float[] r4 = new float[r5]
            r4[r10] = r2
            r4[r3] = r6
            r4[r7] = r12
            r6 = r4
        L68:
            r9.<init>(r11, r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm5.<init>(va5, va5, int):void");
    }

    public zm5(va5 va5Var, va5 va5Var2, va5 va5Var3, float[] fArr) {
        this.a = va5Var;
        this.b = va5Var2;
        this.c = va5Var3;
        this.d = fArr;
    }

    public long a(long j) {
        float fG = u95.g(j);
        float f = u95.f(j);
        float fD = u95.d(j);
        float fC = u95.c(j);
        va5 va5Var = this.b;
        long jD = va5Var.d(fG, f, fD);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = va5Var.e(fG, f, fD);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE, fC, this.a);
    }
}
