package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class s72 {
    public final j72 d;
    public pvj a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public s72(l45 l45Var) {
        this.d = new j72(this, l45Var);
    }

    public final void a(jfc jfcVar, int i) {
        pvj pvjVarJ = jfcVar.j(i);
        j72 j72Var = this.d;
        j72Var.g(pvjVarJ, 1.0f);
        j72Var.g(jfcVar.j(i), -1.0f);
    }

    public final void b(pvj pvjVar, pvj pvjVar2, pvj pvjVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        j72 j72Var = this.d;
        if (z) {
            j72Var.g(pvjVar, 1.0f);
            j72Var.g(pvjVar2, -1.0f);
            j72Var.g(pvjVar3, -1.0f);
        } else {
            j72Var.g(pvjVar, -1.0f);
            j72Var.g(pvjVar2, 1.0f);
            j72Var.g(pvjVar3, 1.0f);
        }
    }

    public final void c(pvj pvjVar, pvj pvjVar2, pvj pvjVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        j72 j72Var = this.d;
        if (z) {
            j72Var.g(pvjVar, 1.0f);
            j72Var.g(pvjVar2, -1.0f);
            j72Var.g(pvjVar3, 1.0f);
        } else {
            j72Var.g(pvjVar, -1.0f);
            j72Var.g(pvjVar2, 1.0f);
            j72Var.g(pvjVar3, -1.0f);
        }
    }

    public pvj d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final pvj f(boolean[] zArr, pvj pvjVar) {
        int i;
        j72 j72Var = this.d;
        int iD = j72Var.d();
        pvj pvjVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = j72Var.f(i2);
            if (f2 < 0.0f) {
                pvj pvjVarE = j72Var.e(i2);
                if ((zArr == null || !zArr[pvjVarE.b]) && pvjVarE != pvjVar && (((i = pvjVarE.l) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    pvjVar2 = pvjVarE;
                }
            }
        }
        return pvjVar2;
    }

    public final void g(pvj pvjVar) {
        pvj pvjVar2 = this.a;
        j72 j72Var = this.d;
        if (pvjVar2 != null) {
            j72Var.g(pvjVar2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fH = j72Var.h(pvjVar, true) * (-1.0f);
        this.a = pvjVar;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        int i = j72Var.h;
        for (int i2 = 0; i != -1 && i2 < j72Var.a; i2++) {
            float[] fArr = j72Var.g;
            fArr[i] = fArr[i] / fH;
            i = j72Var.f[i];
        }
    }

    public final void h(jfc jfcVar, pvj pvjVar, boolean z) {
        if (pvjVar.f) {
            j72 j72Var = this.d;
            float fC = j72Var.c(pvjVar);
            this.b = (pvjVar.e * fC) + this.b;
            j72Var.h(pvjVar, z);
            if (z) {
                pvjVar.b(this);
            }
            if (j72Var.d() == 0) {
                this.e = true;
                jfcVar.b = true;
            }
        }
    }

    public void i(jfc jfcVar, s72 s72Var, boolean z) {
        j72 j72Var = this.d;
        j72Var.getClass();
        float fC = j72Var.c(s72Var.a);
        j72Var.h(s72Var.a, z);
        j72 j72Var2 = s72Var.d;
        int iD = j72Var2.d();
        for (int i = 0; i < iD; i++) {
            pvj pvjVarE = j72Var2.e(i);
            j72Var.a(pvjVarE, j72Var2.c(pvjVarE) * fC, z);
        }
        this.b = (s72Var.b * fC) + this.b;
        if (z) {
            s72Var.a.b(this);
        }
        if (this.a == null || j72Var.d() != 0) {
            return;
        }
        this.e = true;
        jfcVar.b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            pvj r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto Lb
        L7:
            java.lang.String r0 = java.lang.String.valueOf(r0)
        Lb:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            float r0 = r10.b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L2b
        L2a:
            r1 = r3
        L2b:
            j72 r10 = r10.d
            int r5 = r10.d()
        L31:
            if (r3 >= r5) goto L8a
            pvj r6 = r10.e(r3)
            if (r6 == 0) goto L87
            float r7 = r10.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 == 0) goto L87
            int r6 = r6.b
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L57
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L67
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
        L55:
            float r7 = r7 * r9
            goto L67
        L57:
            if (r8 <= 0) goto L60
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L67
        L60:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
            goto L55
        L67:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L72
            java.lang.String r0 = r0.concat(r6)
            goto L86
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L86:
            r1 = r4
        L87:
            int r3 = r3 + 1
            goto L31
        L8a:
            if (r1 != 0) goto L93
            java.lang.String r10 = "0.0"
            java.lang.String r10 = r0.concat(r10)
            return r10
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s72.toString():java.lang.String");
    }
}
