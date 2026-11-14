package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class aen implements lkf {
    public final tah a;
    public final gjm b;
    public final nw3 c;
    public final mw3 d;
    public final nw3 e;
    public final nw3 f;
    public final Lazy g;
    public final Lazy h;
    public final hw3 i;
    public final mw3 j;
    public final nw3 k;
    public final mw3 l;
    public final nw3 m;
    public final nw3 n;
    public final mw3 o;
    public final x5f p;

    public aen(tah tahVar, gjm gjmVar, nw3 nw3Var, mw3 mw3Var, nw3 nw3Var2, nw3 nw3Var3, Lazy lazy, Lazy lazy2, hw3 hw3Var, mw3 mw3Var2, nw3 nw3Var4, mw3 mw3Var3, nw3 nw3Var5, nw3 nw3Var6, mw3 mw3Var4, x5f x5fVar) {
        this.a = tahVar;
        this.b = gjmVar;
        this.c = nw3Var;
        this.d = mw3Var;
        this.e = nw3Var2;
        this.f = nw3Var3;
        this.g = lazy;
        this.h = lazy2;
        this.i = hw3Var;
        this.j = mw3Var2;
        this.k = nw3Var4;
        this.l = mw3Var3;
        this.m = nw3Var5;
        this.n = nw3Var6;
        this.o = mw3Var4;
        this.p = x5fVar;
    }

    public final Fragment b(Class cls) {
        OperaApplication operaApplication = this.n.b;
        boolean zA = Intrinsics.a(cls, ldn.class);
        Lazy lazy = this.h;
        if (zA) {
            return new ldn(this.b, operaApplication.R(), (tni) this.l.get(), this.g, (yug) lazy.get(), this.k.b.E());
        }
        if (!Intrinsics.a(cls, cgn.class)) {
            if (Intrinsics.a(cls, mhf.class)) {
                return new mhf();
            }
            return null;
        }
        ydn ydnVarR = operaApplication.R();
        OperaApplication operaApplication2 = this.c.b;
        return new cgn(this.b, ydnVarR, operaApplication2.c(), this.m.b.M(), (z77) this.d.get(), this.e.b.p(), (ktg) this.g.get(), (tvg) this.j.get(), (yug) lazy.get(), new ghf(ru9.c(this.f.b), operaApplication2.c(), operaApplication.R(), (byte) 0), (hxk) this.o.get(), (pfn) this.i.get(), this.a.R(), this.p);
    }
}
