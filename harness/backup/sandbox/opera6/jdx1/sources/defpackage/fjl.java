package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class fjl extends ua7 {
    public final /* synthetic */ g3d e;
    public final /* synthetic */ ua7 f;
    public final /* synthetic */ bd7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjl(g3d g3dVar, ua7 ua7Var, bd7 bd7Var) {
        super((byte) 21);
        this.e = g3dVar;
        this.f = ua7Var;
        this.g = bd7Var;
    }

    public final Object y(g3d g3dVar) {
        float f = g3dVar.a;
        float f2 = g3dVar.b;
        String str = ((bd7) g3dVar.c).a;
        String str2 = ((bd7) g3dVar.d).a;
        float f3 = g3dVar.e;
        float f4 = g3dVar.f;
        float f5 = g3dVar.g;
        g3d g3dVar2 = this.e;
        g3dVar2.a = f;
        g3dVar2.b = f2;
        g3dVar2.c = str;
        g3dVar2.d = str2;
        g3dVar2.e = f3;
        g3dVar2.f = f4;
        g3dVar2.g = f5;
        String str3 = (String) this.f.y(g3dVar2);
        bd7 bd7Var = (bd7) (g3dVar.f == 1.0f ? g3dVar.d : g3dVar.c);
        String str4 = bd7Var.b;
        float f6 = bd7Var.c;
        int i = bd7Var.d;
        int i2 = bd7Var.e;
        float f7 = bd7Var.f;
        float f8 = bd7Var.g;
        int i3 = bd7Var.h;
        int i4 = bd7Var.i;
        float f9 = bd7Var.j;
        boolean z = bd7Var.k;
        PointF pointF = bd7Var.l;
        PointF pointF2 = bd7Var.m;
        bd7 bd7Var2 = this.g;
        bd7Var2.a = str3;
        bd7Var2.b = str4;
        bd7Var2.c = f6;
        bd7Var2.d = i;
        bd7Var2.e = i2;
        bd7Var2.f = f7;
        bd7Var2.g = f8;
        bd7Var2.h = i3;
        bd7Var2.i = i4;
        bd7Var2.j = f9;
        bd7Var2.k = z;
        bd7Var2.l = pointF;
        bd7Var2.m = pointF2;
        return bd7Var2;
    }
}
