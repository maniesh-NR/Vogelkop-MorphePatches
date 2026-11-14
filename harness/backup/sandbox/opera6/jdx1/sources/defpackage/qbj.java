package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qbj implements vq5 {
    public final String a;
    public final ed1 b;
    public final ArrayList c;
    public final dd1 d;
    public final dd1 e;
    public final ed1 f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;

    public qbj(String str, ed1 ed1Var, ArrayList arrayList, dd1 dd1Var, dd1 dd1Var2, ed1 ed1Var2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = ed1Var;
        this.c = arrayList;
        this.d = dd1Var;
        this.e = dd1Var2;
        this.f = ed1Var2;
        this.g = i;
        this.h = i2;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.vq5
    public final wp5 a(f3d f3dVar, p2d p2dVar, c73 c73Var) {
        return new rik(f3dVar, c73Var, this);
    }
}
