package defpackage;

/* loaded from: classes.dex */
public final class tbj implements vq5 {
    public final int a;
    public final ed1 b;
    public final ed1 c;
    public final ed1 d;
    public final boolean e;

    public tbj(String str, int i, ed1 ed1Var, ed1 ed1Var2, ed1 ed1Var3, boolean z) {
        this.a = i;
        this.b = ed1Var;
        this.c = ed1Var2;
        this.d = ed1Var3;
        this.e = z;
    }

    @Override // defpackage.vq5
    public final wp5 a(f3d f3dVar, p2d p2dVar, c73 c73Var) {
        return new h7m(c73Var, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
