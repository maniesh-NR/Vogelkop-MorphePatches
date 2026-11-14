package defpackage;

/* loaded from: classes.dex */
public final class wvj extends qw4 {
    public final qw4 a;
    public final dc3 b;

    public wvj(qw4 qw4Var) {
        this.a = qw4Var;
        this.b = new dc3(qw4Var);
    }

    @Override // defpackage.qw4
    public final void I(int i, int i2, Object obj) {
        this.b.I(i, i2, obj);
    }

    public final void S(int i, int i2) {
        this.b.S(i, i2);
    }

    @Override // defpackage.qw4
    public final boolean a(Object obj, Object obj2) {
        return this.a.a(obj, obj2);
    }

    @Override // defpackage.qw4
    public final boolean b(Object obj, Object obj2) {
        return this.a.b(obj, obj2);
    }

    @Override // defpackage.qw4, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // defpackage.qw4
    public final Object d(Object obj, Object obj2) {
        return this.a.d(obj, obj2);
    }

    public final void f(int i, int i2) {
        this.b.f(i, i2);
    }

    public final void t(int i, int i2) {
        this.b.t(i, i2);
    }
}
