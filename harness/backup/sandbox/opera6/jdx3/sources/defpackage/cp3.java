package defpackage;

/* loaded from: classes.dex */
public final class cp3 implements pvk {
    public final pvk a;
    public final /* synthetic */ dp3 b;

    public cp3(dp3 dp3Var, pvk pvkVar) {
        this.b = dp3Var;
        this.a = pvkVar;
    }

    @Override // defpackage.pvk
    public final boolean a(int i) {
        if (this.b.b()) {
            return this.a.a(i);
        }
        return false;
    }

    @Override // defpackage.pvk
    public final void b(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a.b(i, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.pvk
    public final void c(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a.c(i, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.pvk
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.pvk
    public final void e(int i, int i2, int i3) {
        this.a.e(i, i2, i3);
    }
}
