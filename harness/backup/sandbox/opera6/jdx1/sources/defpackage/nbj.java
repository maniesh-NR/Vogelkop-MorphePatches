package defpackage;

/* loaded from: classes.dex */
public final class nbj implements vq5 {
    public final String a;
    public final int b;
    public final dd1 c;
    public final boolean d;

    public nbj(String str, int i, dd1 dd1Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = dd1Var;
        this.d = z;
    }

    @Override // defpackage.vq5
    public final wp5 a(f3d f3dVar, p2d p2dVar, c73 c73Var) {
        return new uaj(f3dVar, c73Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return fki.s(sb, this.b, '}');
    }
}
