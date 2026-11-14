package defpackage;

/* loaded from: classes.dex */
public final class zw6 implements Comparable {
    public final boolean a;
    public final boolean b;

    public zw6(oj9 oj9Var, int i) {
        this.a = (oj9Var.e & 1) != 0;
        this.b = kuh.f(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zw6 zw6Var = (zw6) obj;
        return xc5.a.c(this.b, zw6Var.b).c(this.a, zw6Var.a).e();
    }
}
