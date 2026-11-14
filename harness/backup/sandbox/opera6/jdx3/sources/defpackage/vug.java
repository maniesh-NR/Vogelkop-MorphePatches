package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vug extends l7n {
    public final slk b;
    public final ohg c;
    public final yvg d;
    public final jtg e;
    public final orm f;
    public final nak g;
    public final nak h;
    public final nak i;
    public final nak j;

    public vug(slk slkVar, ohg ohgVar, yvg yvgVar, jtg jtgVar, orm ormVar) {
        this.b = slkVar;
        this.c = ohgVar;
        this.d = yvgVar;
        this.e = jtgVar;
        this.f = ormVar;
        nak nakVarF = z4o.f(new tug(false));
        this.g = nakVarF;
        nak nakVarF2 = z4o.f((Object) null);
        this.h = nakVarF2;
        this.i = nakVarF;
        this.j = nakVarF2;
    }

    public final void f(ky9 ky9Var) {
        boolean zA = Intrinsics.a(ky9Var, ey9.a);
        orm ormVar = this.f;
        if (zA) {
            ((x5f) ormVar).R(27, "already claimed");
            return;
        }
        if (Intrinsics.a(ky9Var, hy9.a)) {
            ((x5f) ormVar).R(27, "not available");
        } else {
            if ((ky9Var instanceof fy9) || Intrinsics.a(ky9Var, gy9.a) || Intrinsics.a(ky9Var, iy9.a) || Intrinsics.a(ky9Var, jy9.a)) {
                return;
            }
            h9o.p();
        }
    }

    public final void g(h4k h4kVar) {
        boolean z = h4kVar instanceof d4k;
        orm ormVar = this.f;
        if (z) {
            ((x5f) ormVar).R(27, "integrity error: ".concat(((d4k) h4kVar).a));
        } else {
            if (Intrinsics.a(h4kVar, a4k.a)) {
                ((x5f) ormVar).R(27, "already claimed");
                return;
            }
            if (Intrinsics.a(h4kVar, b4k.a) || Intrinsics.a(h4kVar, c4k.a) || Intrinsics.a(h4kVar, e4k.a) || Intrinsics.a(h4kVar, f4k.a) || Intrinsics.a(h4kVar, g4k.a)) {
                return;
            }
            h9o.p();
        }
    }
}
