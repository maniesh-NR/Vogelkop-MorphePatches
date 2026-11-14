package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class y8i implements x63, wp5 {
    public final f3d a;
    public final a73 b;
    public vaj c;

    public y8i(f3d f3dVar, c73 c73Var, x8i x8iVar) {
        this.a = f3dVar;
        a73 a73VarD = x8iVar.a.D();
        this.b = a73VarD;
        c73Var.g(a73VarD);
        a73VarD.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // defpackage.x63
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // defpackage.wp5
    public final void b(List list, List list2) {
    }
}
