package defpackage;

/* loaded from: classes.dex */
public final class u4n extends h5a {
    public static final t4n c = t4n.c;
    public final t4n a = t4n.e;
    public final vt8 b = vt8.c;

    @Override // defpackage.h5a
    public final vt8 a() {
        return this.b;
    }

    @Override // defpackage.h5a
    public final boolean b(bp3 bp3Var, xd4 xd4Var) {
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return xd4Var.w();
        }
        if (iOrdinal == 3) {
            return xd4Var.N();
        }
        h9o.p();
        return false;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.a.name() + ')';
    }
}
