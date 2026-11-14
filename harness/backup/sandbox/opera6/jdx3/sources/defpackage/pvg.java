package defpackage;

import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pvg implements mkf {
    public final Lazy a;
    public final wv1 b;
    public final lw3 c;
    public final Lazy d;
    public final j4c e;
    public final Lazy f;
    public final lw3 g;
    public final wv1 h;
    public final lw3 i;
    public final ew3 j;
    public final ew3 k;
    public final ew3 l;
    public final nu3 m;

    public pvg(Lazy lazy, wv1 wv1Var, lw3 lw3Var, Lazy lazy2, j4c j4cVar, Lazy lazy3, lw3 lw3Var2, wv1 wv1Var2, lw3 lw3Var3, ew3 ew3Var, ew3 ew3Var2, ew3 ew3Var3, nu3 nu3Var) {
        this.a = lazy;
        this.b = wv1Var;
        this.c = lw3Var;
        this.d = lazy2;
        this.e = j4cVar;
        this.f = lazy3;
        this.g = lw3Var2;
        this.h = wv1Var2;
        this.i = lw3Var3;
        this.j = ew3Var;
        this.k = ew3Var2;
        this.l = ew3Var3;
        this.m = nu3Var;
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        b6h b6hVar = this.h.b;
        OperaApplication operaApplication = this.g.b;
        OperaApplication operaApplication2 = this.c.b;
        if (Intrinsics.a(cls, vug.class)) {
            return new vug(operaApplication2.M(), (ohg) this.e.get(), (yvg) this.f.get(), operaApplication.D(), (orm) b6hVar.get());
        }
        if (!Intrinsics.a(cls, a9d.class)) {
            return null;
        }
        Lazy lazy = this.a;
        return new a9d((af3) lazy.get(), (xb) this.b.b.get(), operaApplication2.M(), operaApplication.D(), (fmk) this.d.get(), (ru9) this.j.get(), (orm) b6hVar.get(), (z77) this.k.get(), (ysj) this.l.get(), (yug) this.m.get(), new qb7((af3) lazy.get(), (skm) this.i.get()));
    }
}
