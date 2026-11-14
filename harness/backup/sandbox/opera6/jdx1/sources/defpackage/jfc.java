package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class jfc {
    public static boolean q = false;
    public final qyg d;
    public final l45 m;
    public s72 p;
    public int a = 1000;
    public boolean b = false;
    public int c = 0;
    public int e = 32;
    public int f = 32;
    public boolean h = false;
    public boolean[] i = new boolean[32];
    public int j = 1;
    public int k = 0;
    public int l = 32;
    public pvj[] n = new pvj[1000];
    public int o = 0;
    public s72[] g = new s72[32];

    public jfc() {
        s();
        l45 l45Var = new l45();
        l45Var.a = new vng();
        l45Var.b = new vng();
        l45Var.c = new pvj[32];
        this.m = l45Var;
        qyg qygVar = new qyg(l45Var);
        qygVar.f = new pvj[NotificationCompat.FLAG_HIGH_PRIORITY];
        qygVar.g = new pvj[NotificationCompat.FLAG_HIGH_PRIORITY];
        qygVar.h = 0;
        qygVar.i = new pad((Object) qygVar, (byte) 29);
        this.d = qygVar;
        this.p = new s72(l45Var);
    }

    public static int n(Object obj) {
        pvj pvjVar = ((eo5) obj).i;
        if (pvjVar != null) {
            return (int) (pvjVar.e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final pvj a(int i) {
        vng vngVar = (vng) this.m.b;
        int i2 = vngVar.b;
        pvj pvjVar = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            ?? r3 = vngVar.a;
            ?? r4 = r3[i3];
            r3[i3] = 0;
            vngVar.b = i3;
            pvjVar = r4;
        }
        pvj pvjVar2 = pvjVar;
        if (pvjVar2 == null) {
            pvjVar2 = new pvj(i);
            pvjVar2.l = i;
        } else {
            pvjVar2.c();
            pvjVar2.l = i;
        }
        int i4 = this.o;
        int i5 = this.a;
        if (i4 >= i5) {
            int i6 = i5 << 1;
            this.a = i6;
            this.n = (pvj[]) Arrays.copyOf(this.n, i6);
        }
        pvj[] pvjVarArr = this.n;
        int i7 = this.o;
        this.o = i7 + 1;
        pvjVarArr[i7] = pvjVar2;
        return pvjVar2;
    }

    public final void b(pvj pvjVar, pvj pvjVar2, int i, float f, pvj pvjVar3, pvj pvjVar4, int i2, int i3) {
        s72 s72VarL = l();
        if (pvjVar2 == pvjVar3) {
            s72VarL.d.g(pvjVar, 1.0f);
            s72VarL.d.g(pvjVar4, 1.0f);
            s72VarL.d.g(pvjVar2, -2.0f);
        } else {
            j72 j72Var = s72VarL.d;
            if (f == 0.5f) {
                j72Var.g(pvjVar, 1.0f);
                s72VarL.d.g(pvjVar2, -1.0f);
                s72VarL.d.g(pvjVar3, -1.0f);
                s72VarL.d.g(pvjVar4, 1.0f);
                if (i > 0 || i2 > 0) {
                    s72VarL.b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                j72Var.g(pvjVar, -1.0f);
                s72VarL.d.g(pvjVar2, 1.0f);
                s72VarL.b = i;
            } else if (f >= 1.0f) {
                j72Var.g(pvjVar4, -1.0f);
                s72VarL.d.g(pvjVar3, 1.0f);
                s72VarL.b = -i2;
            } else {
                float f2 = 1.0f - f;
                j72Var.g(pvjVar, f2 * 1.0f);
                s72VarL.d.g(pvjVar2, f2 * (-1.0f));
                s72VarL.d.g(pvjVar3, (-1.0f) * f);
                s72VarL.d.g(pvjVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    s72VarL.b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            s72VarL.a(this, i3);
        }
        c(s72VarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.s72 r18) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfc.c(s72):void");
    }

    public final void d(pvj pvjVar, int i) {
        int i2 = pvjVar.c;
        if (i2 == -1) {
            pvjVar.d(this, i);
            for (int i3 = 0; i3 < this.c + 1; i3++) {
                pvj pvjVar2 = ((pvj[]) this.m.c)[i3];
            }
            return;
        }
        if (i2 == -1) {
            s72 s72VarL = l();
            s72VarL.a = pvjVar;
            float f = i;
            pvjVar.e = f;
            s72VarL.b = f;
            s72VarL.e = true;
            c(s72VarL);
            return;
        }
        s72 s72Var = this.g[i2];
        if (s72Var.e) {
            s72Var.b = i;
            return;
        }
        if (s72Var.d.d() == 0) {
            s72Var.e = true;
            s72Var.b = i;
            return;
        }
        s72 s72VarL2 = l();
        if (i < 0) {
            s72VarL2.b = i * (-1);
            s72VarL2.d.g(pvjVar, 1.0f);
        } else {
            s72VarL2.b = i;
            s72VarL2.d.g(pvjVar, -1.0f);
        }
        c(s72VarL2);
    }

    public final void e(pvj pvjVar, pvj pvjVar2, int i, int i2) {
        if (i2 == 8 && pvjVar2.f && pvjVar.c == -1) {
            pvjVar.d(this, pvjVar2.e + i);
            return;
        }
        s72 s72VarL = l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            s72VarL.b = i;
        }
        j72 j72Var = s72VarL.d;
        if (z) {
            j72Var.g(pvjVar, 1.0f);
            s72VarL.d.g(pvjVar2, -1.0f);
        } else {
            j72Var.g(pvjVar, -1.0f);
            s72VarL.d.g(pvjVar2, 1.0f);
        }
        if (i2 != 8) {
            s72VarL.a(this, i2);
        }
        c(s72VarL);
    }

    public final void f(pvj pvjVar, pvj pvjVar2, int i, int i2) {
        s72 s72VarL = l();
        pvj pvjVarM = m();
        pvjVarM.d = 0;
        s72VarL.b(pvjVar, pvjVar2, pvjVarM, i);
        if (i2 != 8) {
            s72VarL.d.g(j(i2), (int) (s72VarL.d.c(pvjVarM) * (-1.0f)));
        }
        c(s72VarL);
    }

    public final void g(pvj pvjVar, pvj pvjVar2, int i, int i2) {
        s72 s72VarL = l();
        pvj pvjVarM = m();
        pvjVarM.d = 0;
        s72VarL.c(pvjVar, pvjVar2, pvjVarM, i);
        if (i2 != 8) {
            s72VarL.d.g(j(i2), (int) (s72VarL.d.c(pvjVarM) * (-1.0f)));
        }
        c(s72VarL);
    }

    public final void h(s72 s72Var) {
        int i;
        if (s72Var.e) {
            s72Var.a.d(this, s72Var.b);
        } else {
            s72[] s72VarArr = this.g;
            int i2 = this.k;
            s72VarArr[i2] = s72Var;
            pvj pvjVar = s72Var.a;
            pvjVar.c = i2;
            this.k = i2 + 1;
            pvjVar.e(this, s72Var);
        }
        if (this.b) {
            int i3 = 0;
            while (i3 < this.k) {
                if (this.g[i3] == null) {
                    System.out.println("WTF");
                }
                s72 s72Var2 = this.g[i3];
                if (s72Var2 != null && s72Var2.e) {
                    s72Var2.a.d(this, s72Var2.b);
                    ((vng) this.m.a).b(s72Var2);
                    this.g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.k;
                        if (i4 >= i) {
                            break;
                        }
                        s72[] s72VarArr2 = this.g;
                        int i6 = i4 - 1;
                        s72 s72Var3 = s72VarArr2[i4];
                        s72VarArr2[i6] = s72Var3;
                        pvj pvjVar2 = s72Var3.a;
                        if (pvjVar2.c == i4) {
                            pvjVar2.c = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.g[i5] = null;
                    }
                    this.k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.b = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.k; i++) {
            s72 s72Var = this.g[i];
            s72Var.a.e = s72Var.b;
        }
    }

    public final pvj j(int i) {
        if (this.j + 1 >= this.f) {
            o();
        }
        pvj pvjVarA = a(4);
        float[] fArr = pvjVarA.h;
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        pvjVarA.b = i2;
        pvjVarA.d = i;
        ((pvj[]) this.m.c)[i2] = pvjVarA;
        qyg qygVar = this.d;
        qygVar.i.b = pvjVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[pvjVarA.d] = 1.0f;
        qygVar.j(pvjVarA);
        return pvjVarA;
    }

    public final pvj k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.j + 1 >= this.f) {
            o();
        }
        if (!(obj instanceof eo5)) {
            return null;
        }
        eo5 eo5Var = (eo5) obj;
        pvj pvjVar = eo5Var.i;
        if (pvjVar == null) {
            eo5Var.k();
            pvjVar = eo5Var.i;
        }
        int i = pvjVar.b;
        l45 l45Var = this.m;
        if (i != -1 && i <= this.c && ((pvj[]) l45Var.c)[i] != null) {
            return pvjVar;
        }
        if (i != -1) {
            pvjVar.c();
        }
        int i2 = this.c + 1;
        this.c = i2;
        this.j++;
        pvjVar.b = i2;
        pvjVar.l = 1;
        ((pvj[]) l45Var.c)[i2] = pvjVar;
        return pvjVar;
    }

    public final s72 l() {
        Object obj;
        l45 l45Var = this.m;
        vng vngVar = (vng) l45Var.a;
        int i = vngVar.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = vngVar.a;
            obj = objArr[i2];
            objArr[i2] = null;
            vngVar.b = i2;
        } else {
            obj = null;
        }
        s72 s72Var = (s72) obj;
        if (s72Var == null) {
            return new s72(l45Var);
        }
        s72Var.a = null;
        s72Var.d.b();
        s72Var.b = 0.0f;
        s72Var.e = false;
        return s72Var;
    }

    public final pvj m() {
        if (this.j + 1 >= this.f) {
            o();
        }
        pvj pvjVarA = a(3);
        int i = this.c + 1;
        this.c = i;
        this.j++;
        pvjVarA.b = i;
        ((pvj[]) this.m.c)[i] = pvjVarA;
        return pvjVarA;
    }

    public final void o() {
        int i = this.e << 1;
        this.e = i;
        this.g = (s72[]) Arrays.copyOf(this.g, i);
        l45 l45Var = this.m;
        l45Var.c = (pvj[]) Arrays.copyOf((pvj[]) l45Var.c, this.e);
        int i2 = this.e;
        this.i = new boolean[i2];
        this.f = i2;
        this.l = i2;
    }

    public final void p() {
        qyg qygVar = this.d;
        if (qygVar.e()) {
            i();
            return;
        }
        if (!this.h) {
            q(qygVar);
            return;
        }
        for (int i = 0; i < this.k; i++) {
            if (!this.g[i].e) {
                q(qygVar);
                return;
            }
        }
        i();
    }

    public final void q(qyg qygVar) {
        int i = 0;
        while (true) {
            if (i >= this.k) {
                break;
            }
            s72 s72Var = this.g[i];
            int i2 = 1;
            if (s72Var.a.l != 1) {
                float f = 0.0f;
                if (s72Var.b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.k) {
                            s72 s72Var2 = this.g[i6];
                            if (s72Var2.a.l != i2 && !s72Var2.e && s72Var2.b < f) {
                                int iD = s72Var2.d.d();
                                int i8 = 0;
                                while (i8 < iD) {
                                    pvj pvjVarE = s72Var2.d.e(i8);
                                    float fC = s72Var2.d.c(pvjVarE);
                                    if (fC > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = pvjVarE.g[i9] / fC;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = pvjVarE.b;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            s72 s72Var3 = this.g[i4];
                            s72Var3.a.c = -1;
                            s72Var3.g(((pvj[]) this.m.c)[i5]);
                            pvj pvjVar = s72Var3.a;
                            pvjVar.c = i4;
                            pvjVar.e(this, s72Var3);
                        } else {
                            z = true;
                        }
                        if (i3 > this.j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        r(qygVar);
        i();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.s72 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.j
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.i
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto La3
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.j
            int r6 = r6 << r5
            if (r4 >= r6) goto La3
            pvj r6 = r1.a
            if (r6 == 0) goto L26
            boolean[] r7 = r0.i
            int r6 = r6.b
            r7[r6] = r5
        L26:
            boolean[] r6 = r0.i
            pvj r6 = r1.d(r6)
            if (r6 == 0) goto L9f
            boolean[] r7 = r0.i
            int r8 = r6.b
            boolean r9 = r7[r8]
            if (r9 != 0) goto La3
            r7[r8] = r5
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r2
            r10 = r7
        L3e:
            int r11 = r0.k
            if (r9 >= r11) goto L8a
            s72[] r11 = r0.g
            r11 = r11[r9]
            pvj r12 = r11.a
            int r12 = r12.l
            if (r12 == r5) goto L86
            boolean r12 = r11.e
            if (r12 != 0) goto L86
            j72 r12 = r11.d
            int r13 = r12.h
            if (r13 == r7) goto L6e
            r14 = r2
        L57:
            if (r13 == r7) goto L6e
            int r15 = r12.a
            if (r14 >= r15) goto L6e
            int[] r15 = r12.e
            r15 = r15[r13]
            int r2 = r6.b
            if (r15 != r2) goto L67
            r2 = r5
            goto L6f
        L67:
            int[] r2 = r12.f
            r13 = r2[r13]
            int r14 = r14 + 1
            goto L57
        L6e:
            r2 = 0
        L6f:
            if (r2 == 0) goto L86
            j72 r2 = r11.d
            float r2 = r2.c(r6)
            r12 = 0
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 >= 0) goto L86
            float r11 = r11.b
            float r11 = -r11
            float r11 = r11 / r2
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 >= 0) goto L86
            r10 = r9
            r8 = r11
        L86:
            int r9 = r9 + 1
            r2 = 0
            goto L3e
        L8a:
            if (r10 <= r7) goto La0
            s72[] r2 = r0.g
            r2 = r2[r10]
            pvj r5 = r2.a
            r5.c = r7
            r2.g(r6)
            pvj r5 = r2.a
            r5.c = r10
            r5.e(r0, r2)
            goto La0
        L9f:
            r3 = r5
        La0:
            r2 = 0
            goto L13
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jfc.r(s72):void");
    }

    public final void s() {
        for (int i = 0; i < this.k; i++) {
            s72 s72Var = this.g[i];
            if (s72Var != null) {
                ((vng) this.m.a).b(s72Var);
            }
            this.g[i] = null;
        }
    }

    public final void t() {
        l45 l45Var;
        int i = 0;
        while (true) {
            l45Var = this.m;
            pvj[] pvjVarArr = (pvj[]) l45Var.c;
            if (i >= pvjVarArr.length) {
                break;
            }
            pvj pvjVar = pvjVarArr[i];
            if (pvjVar != null) {
                pvjVar.c();
            }
            i++;
        }
        vng vngVar = (vng) l45Var.b;
        pvj[] pvjVarArr2 = this.n;
        int length = this.o;
        vngVar.getClass();
        if (length > pvjVarArr2.length) {
            length = pvjVarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            pvj pvjVar2 = pvjVarArr2[i2];
            int i3 = vngVar.b;
            Object[] objArr = vngVar.a;
            if (i3 < objArr.length) {
                objArr[i3] = pvjVar2;
                vngVar.b = i3 + 1;
            }
        }
        this.o = 0;
        Arrays.fill((pvj[]) l45Var.c, (Object) null);
        this.c = 0;
        qyg qygVar = this.d;
        qygVar.h = 0;
        qygVar.b = 0.0f;
        this.j = 1;
        for (int i4 = 0; i4 < this.k; i4++) {
            s72 s72Var = this.g[i4];
        }
        s();
        this.k = 0;
        this.p = new s72(l45Var);
    }
}
