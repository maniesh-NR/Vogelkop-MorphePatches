package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ovg implements lkf {
    public final lw3 a;
    public final wv1 b;
    public final ew3 c;
    public final lw3 d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final lw3 h;
    public final wv1 i;
    public final Lazy j;

    public ovg(lw3 lw3Var, wv1 wv1Var, ew3 ew3Var, lw3 lw3Var2, Lazy lazy, Lazy lazy2, Lazy lazy3, lw3 lw3Var3, tvg tvgVar, wv1 wv1Var2, Lazy lazy4) {
        this.a = lw3Var;
        this.b = wv1Var;
        this.c = ew3Var;
        this.d = lw3Var2;
        this.e = lazy;
        this.f = lazy2;
        this.g = lazy3;
        this.h = lw3Var3;
        this.i = wv1Var2;
        this.j = lazy4;
    }

    public final Fragment b(Class cls) {
        OperaApplication operaApplication = this.a.b;
        boolean zA = Intrinsics.a(cls, htg.class);
        Lazy lazy = this.e;
        if (zA) {
            return new htg((nvg) lazy.get(), operaApplication.b());
        }
        if (Intrinsics.a(cls, itg.class)) {
            return new itg((nvg) lazy.get(), 2132021685, 2132019560);
        }
        if (Intrinsics.a(cls, cvg.class)) {
            return new cvg((nvg) lazy.get(), (z77) this.c.get(), operaApplication.b(), (xb) this.b.b.get(), (fmk) this.f.get(), (af3) this.g.get(), this.h.b.M(), (skm) this.d.get(), (ebh) this.i.b.get());
        }
        if (Intrinsics.a(cls, i8d.class)) {
            return new i8d();
        }
        if (Intrinsics.a(cls, xtg.class)) {
            return new xtg((gjm) this.j.get());
        }
        return null;
    }
}
