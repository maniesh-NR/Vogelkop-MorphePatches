package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class fx6 extends hx6 implements Comparable {
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;

    public fx6(int i, eyl eylVar, int i2, bx6 bx6Var, int i3, String str, String str2) {
        int iC;
        super(i, eylVar, i2);
        boolean z = false;
        this.f = kuh.f(i3, false);
        int i4 = this.d.e;
        int i5 = bx6Var.C;
        csh cshVar = bx6Var.y;
        int i6 = i4 & (~i5);
        this.g = (i6 & 1) != 0;
        this.h = (i6 & 2) != 0;
        csh cshVarV = str2 != null ? h1b.v(str2) : cshVar.isEmpty() ? h1b.v("") : cshVar;
        int i7 = 0;
        while (true) {
            if (i7 >= cshVarV.d) {
                iC = 0;
                i7 = Integer.MAX_VALUE;
                break;
            } else {
                iC = jx6.c(this.d, (String) cshVarV.get(i7), bx6Var.D);
                if (iC > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.i = i7;
        this.j = iC;
        int i8 = str2 != null ? 1088 : bx6Var.A;
        int i9 = this.d.f;
        esf esfVar = jx6.l;
        int iBitCount = (i9 == 0 || i9 != i8) ? Integer.bitCount(i9 & i8) : Integer.MAX_VALUE;
        this.k = iBitCount;
        oj9 oj9Var = this.d;
        this.n = (oj9Var.f & 1088) != 0;
        int iB = jx6.b(oj9Var, bx6Var.z);
        this.l = iB;
        int iC2 = jx6.c(this.d, str, jx6.f(str) == null);
        this.m = iC2;
        boolean z2 = iC > 0 || (cshVar.isEmpty() && iBitCount > 0) || ((cshVar.isEmpty() && iB != Integer.MAX_VALUE) || this.g || ((this.h && iC2 > 0) || bx6Var.x));
        if (kuh.f(i3, bx6Var.C0) && z2) {
            z = true;
        }
        this.e = z;
    }

    @Override // defpackage.hx6
    public final int a() {
        return this.e ? 1 : 0;
    }

    @Override // defpackage.hx6
    public final boolean b(hx6 hx6Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fx6 fx6Var) {
        xc5 xc5VarC = xc5.a.c(this.f, fx6Var.f);
        Integer numValueOf = Integer.valueOf(this.i);
        Integer numValueOf2 = Integer.valueOf(fx6Var.i);
        Comparator comparator = ije.b;
        Comparator comparator2 = ije.c;
        xc5 xc5VarB = xc5VarC.b(numValueOf, numValueOf2, comparator2);
        int i = fx6Var.j;
        int i2 = this.j;
        xc5 xc5VarA = xc5VarB.a(i2, i);
        int i3 = fx6Var.k;
        int i4 = this.k;
        xc5 xc5VarC2 = xc5VarA.a(i4, i3).b(Integer.valueOf(this.l), Integer.valueOf(fx6Var.l), comparator2).c(this.g, fx6Var.g);
        Boolean boolValueOf = Boolean.valueOf(this.h);
        Boolean boolValueOf2 = Boolean.valueOf(fx6Var.h);
        if (i2 != 0) {
            comparator = comparator2;
        }
        xc5 xc5VarA2 = xc5VarC2.b(boolValueOf, boolValueOf2, comparator).a(this.m, fx6Var.m);
        if (i4 == 0) {
            xc5VarA2 = xc5VarA2.d(this.n, fx6Var.n);
        }
        return xc5VarA2.e();
    }
}
