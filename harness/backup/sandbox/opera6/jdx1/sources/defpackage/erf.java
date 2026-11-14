package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class erf extends p37 {
    public int j;
    public int l;
    public int n;
    public p10[] i = new p10[16];
    public int[] k = new int[16];
    public Object[] m = new Object[16];

    public final void G0() {
        this.j = 0;
        this.l = 0;
        Arrays.fill(this.m, 0, this.n, (Object) null);
        this.n = 0;
    }

    public final void H0(kw1 kw1Var, lqj lqjVar, j1c j1cVar, drf drfVar) {
        if (this.j != 0) {
            r05 r05Var = new r05(this, (byte) 7);
            erf erfVar = (erf) r05Var.e;
            while (true) {
                p10 p10Var = erfVar.i[r05Var.b];
                qt9 qt9VarB = p10Var.b(r05Var);
                kw1 kw1Var2 = kw1Var;
                lqj lqjVar2 = lqjVar;
                j1c j1cVar2 = j1cVar;
                drf drfVar2 = drfVar;
                try {
                    p10Var.a(r05Var, kw1Var2, lqjVar2, j1cVar2, drfVar2);
                    int i = r05Var.b;
                    int i2 = erfVar.j;
                    if (i >= i2) {
                        break;
                    }
                    p10 p10Var2 = erfVar.i[i];
                    r05Var.c += p10Var2.b;
                    r05Var.d += p10Var2.c;
                    int i3 = i + 1;
                    r05Var.b = i3;
                    if (i3 >= i2) {
                        break;
                    }
                    kw1Var = kw1Var2;
                    lqjVar = lqjVar2;
                    j1cVar = j1cVar2;
                    drfVar = drfVar2;
                } finally {
                }
            }
        }
        G0();
    }

    public final boolean I0() {
        return this.j == 0;
    }

    public final void J0(p10 p10Var) {
        int i = this.j;
        p10[] p10VarArr = this.i;
        if (i == p10VarArr.length) {
            p10[] p10VarArr2 = new p10[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(p10VarArr, 0, p10VarArr2, 0, i);
            this.i = p10VarArr2;
        }
        int i2 = this.l;
        int i3 = p10Var.b;
        int i4 = p10Var.c;
        int i5 = i2 + i3;
        int[] iArr = this.k;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.k = iArr2;
        }
        int i7 = this.n + i4;
        Object[] objArr = this.m;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.m = objArr2;
        }
        p10[] p10VarArr3 = this.i;
        int i9 = this.j;
        this.j = i9 + 1;
        p10VarArr3[i9] = p10Var;
        this.l += p10Var.b;
        this.n += i4;
    }
}
