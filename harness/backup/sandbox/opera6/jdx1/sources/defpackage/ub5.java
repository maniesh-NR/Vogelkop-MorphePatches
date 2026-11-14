package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class ub5 implements zw4 {
    public final int a;
    public boolean b;
    public Object c;
    public int d;
    public int e;
    public Object f;
    public Comparable g;
    public Object h;
    public Object i;
    public Object j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ub5() {
        this(0, 0);
        String str = vb5.k;
    }

    public ub5(int i, int i2) {
        this.a = i;
        this.e = i2;
        this.h = "";
        this.i = Bundle.EMPTY;
        this.d = -1;
        this.b = true;
    }

    public ub5(f1p f1pVar, Intent intent, int i, ro9 ro9Var, String str) {
        this.c = new Object();
        this.f = f1pVar;
        this.i = intent;
        this.a = i;
        this.h = ro9Var;
        this.g = str;
    }

    public final void a() {
        this.b = true;
        n(0);
        ((bx4) this.j).b((Runnable) null);
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        int iB;
        if (this.b || i == (iB = b()) || iB == 0) {
            return;
        }
        boolean z = i > iB;
        if (!z) {
            n(i);
        }
        bx4 bx4Var = (bx4) this.j;
        x8.d(bx4Var.a, bx4Var, l(i));
        if (z) {
            n(i);
        }
    }

    public final g21 d() {
        boolean z;
        boolean z2;
        int iB = b();
        boolean z3 = false;
        boolean z4 = true;
        if (iB != 1) {
            if (iB == 2) {
                z = false;
                z2 = false;
            } else if (iB == 3) {
                z2 = false;
                z = true;
            } else if (iB != 4) {
                z = false;
                z4 = false;
                z2 = false;
            } else {
                z = false;
                z2 = true;
                z4 = false;
            }
            return new g21(z3, z4, z, z2);
        }
        z = false;
        z2 = false;
        z3 = true;
        z4 = z2;
        return new g21(z3, z4, z, z2);
    }

    public final int e() {
        int i;
        synchronized (this.c) {
            i = this.e;
        }
        return i;
    }

    public final void f(Intent intent) {
        this.i = intent;
        bx4 bx4Var = (bx4) this.j;
        bx4Var.f = null;
        bx4Var.b((Runnable) null);
        int iB = b();
        if (iB != 0) {
            bx4 bx4VarQ = ((f1p) this.f).q((Intent) this.i, l(iB), (ro9) this.h, (String) this.g);
            this.j = bx4VarQ;
            if (bx4VarQ.a()) {
                n(iB);
            }
        }
    }

    public final boolean g(int i, int i2) {
        return ((bx4) this.j).c(i, i2);
    }

    public final boolean h(int i) {
        if (i == 0) {
            return false;
        }
        bx4 bx4VarQ = ((f1p) this.f).q((Intent) this.i, l(i), (ro9) this.h, (String) this.g);
        this.j = bx4VarQ;
        boolean zA = bx4VarQ.a();
        if (zA) {
            n(i);
        }
        return zA;
    }

    public final void i() {
        int iB = b();
        if (iB == 0) {
            return;
        }
        bx4 bx4Var = (bx4) this.j;
        x8.d(bx4Var.a, bx4Var, l(iB));
    }

    public final boolean j() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.vb5 k() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f
            n3j r0 = (defpackage.n3j) r0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            int r3 = r13.d
            r4 = -1
            if (r3 != r4) goto L12
            r3 = r2
            goto L13
        L12:
            r3 = r1
        L13:
            if (r0 == r3) goto L16
            r1 = r2
        L16:
            java.lang.String r0 = "Exactly one of sessionCommand and playerCommand should be set"
            defpackage.z4o.G(r0, r1)
            java.lang.Object r0 = r13.j
            y0b r0 = (defpackage.y0b) r0
            if (r0 != 0) goto L9d
            int r0 = r13.d
            java.lang.String r1 = defpackage.vb5.k
            if (r0 == r2) goto L92
            r1 = 57399(0xe037, float:8.0433E-41)
            int r3 = r13.a
            if (r3 == r1) goto L92
            r1 = 57396(0xe034, float:8.0429E-41)
            if (r3 == r1) goto L92
            r1 = 11
            if (r0 == r1) goto L91
            r1 = 7
            if (r0 == r1) goto L91
            r2 = 6
            if (r0 == r2) goto L91
            r1 = 57413(0xe045, float:8.0453E-41)
            if (r3 == r1) goto L91
            r1 = 57376(0xe020, float:8.0401E-41)
            if (r3 == r1) goto L91
            r1 = 57410(0xe042, float:8.0449E-41)
            if (r3 == r1) goto L91
            r1 = 57435(0xe05b, float:8.0484E-41)
            if (r3 == r1) goto L91
            r1 = 57433(0xe059, float:8.0481E-41)
            if (r3 == r1) goto L91
            r1 = 1040473(0xfe059, float:1.458013E-39)
            if (r3 == r1) goto L91
            r1 = 57434(0xe05a, float:8.0482E-41)
            if (r3 == r1) goto L91
            r1 = 12
            if (r0 == r1) goto L8f
            r1 = 9
            if (r0 == r1) goto L8f
            r1 = 8
            if (r0 == r1) goto L8f
            r0 = 57412(0xe044, float:8.0451E-41)
            if (r3 == r0) goto L8f
            r0 = 57375(0xe01f, float:8.04E-41)
            if (r3 == r0) goto L8f
            r0 = 63220(0xf6f4, float:8.859E-41)
            if (r3 == r0) goto L8f
            r0 = 57432(0xe058, float:8.048E-41)
            if (r3 == r0) goto L8f
            r0 = 57430(0xe056, float:8.0477E-41)
            if (r3 == r0) goto L8f
            r0 = 1040470(0xfe056, float:1.458009E-39)
            if (r3 == r0) goto L8f
            r0 = 57431(0xe057, float:8.0478E-41)
            if (r3 != r0) goto L92
        L8f:
            r2 = 3
            goto L92
        L91:
            r2 = 2
        L92:
            y0b r0 = new y0b
            int[] r1 = new int[]{r2}
            r0.<init>(r1)
            r13.j = r0
        L9d:
            vb5 r2 = new vb5
            java.lang.Object r0 = r13.f
            r3 = r0
            n3j r3 = (defpackage.n3j) r3
            int r4 = r13.d
            int r6 = r13.e
            java.lang.Comparable r0 = r13.g
            r7 = r0
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r0 = r13.h
            r8 = r0
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            java.lang.Object r0 = r13.i
            r9 = r0
            android.os.Bundle r9 = (android.os.Bundle) r9
            boolean r10 = r13.b
            java.lang.Object r0 = r13.j
            r11 = r0
            y0b r11 = (defpackage.y0b) r11
            java.lang.Object r12 = r13.c
            int r5 = r13.a
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub5.k():vb5");
    }

    public final int l(int i) {
        int i2 = this.a;
        if (i == 1) {
            return i2 | 32;
        }
        if (i == 2) {
            return p63.a.a() ? i2 | 260 : i2 | NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (i == 3) {
            return i2;
        }
        if (i != 4) {
            return 0;
        }
        return i2 | 64;
    }

    public final void m(n3j n3jVar, Object obj) {
        z4o.v("playerCommands is already set. Only one of sessionCommand and playerCommand should be set.", this.d == -1);
        this.f = n3jVar;
        int i = n3jVar.a;
        String str = vb5.k;
        this.c = vb5.m(i == 40010 ? 5 : 0, obj);
    }

    public final void n(int i) {
        synchronized (this.c) {
            this.d = i;
            if (!this.b) {
                this.e = i;
            }
        }
    }
}
