package defpackage;

/* loaded from: classes.dex */
public final class yw6 extends hx6 implements Comparable {
    public final int e;
    public final int f;

    public yw6(int i, eyl eylVar, int i2, bx6 bx6Var, int i3) {
        int i4;
        super(i, eylVar, i2);
        this.e = kuh.f(i3, bx6Var.C0) ? 1 : 0;
        oj9 oj9Var = this.d;
        int i5 = oj9Var.u;
        int i6 = -1;
        if (i5 != -1 && (i4 = oj9Var.v) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }

    @Override // defpackage.hx6
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((yw6) obj).f);
    }
}
