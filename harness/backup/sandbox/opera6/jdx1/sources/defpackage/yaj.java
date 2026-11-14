package defpackage;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class yaj implements vq5 {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final dd1 d;
    public final dd1 e;
    public final boolean f;

    public yaj(String str, boolean z, Path.FillType fillType, dd1 dd1Var, dd1 dd1Var2, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = dd1Var;
        this.e = dd1Var2;
        this.f = z2;
    }

    @Override // defpackage.vq5
    public final wp5 a(f3d f3dVar, p2d p2dVar, c73 c73Var) {
        return new b39(f3dVar, c73Var, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
