package defpackage;

import androidx.fragment.app.Fragment;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.AutofillManager;
import com.opera.android.autofill.PasswordManager;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class it2 implements lkf, mkf {
    public final ks3 A;
    public final umi a;
    public final gjm b;
    public final yv3 c;
    public final yv3 d;
    public final dw3 e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final dw3 i;
    public final dw3 j;
    public final Lazy k;
    public final ji l;
    public final Lazy m;
    public final ji n;
    public final wv1 o;
    public final ji p;
    public final yv3 q;
    public final yv3 r;
    public final yv3 s;
    public final Lazy t;
    public final ji u;
    public final yv3 v;
    public final dw3 w;
    public final Lazy x;
    public final Lazy y;
    public final Lazy z;

    public it2(umi umiVar, gjm gjmVar, yv3 yv3Var, yv3 yv3Var2, dw3 dw3Var, Lazy lazy, Lazy lazy2, Lazy lazy3, dw3 dw3Var2, dw3 dw3Var3, Lazy lazy4, ji jiVar, Lazy lazy5, ji jiVar2, wv1 wv1Var, ji jiVar3, yv3 yv3Var3, yv3 yv3Var4, yv3 yv3Var5, yv3 yv3Var6, Lazy lazy6, ji jiVar4, yv3 yv3Var7, dw3 dw3Var4, Lazy lazy7, Lazy lazy8, Lazy lazy9) {
        this.a = umiVar;
        this.b = gjmVar;
        this.c = yv3Var;
        this.d = yv3Var2;
        this.e = dw3Var;
        this.f = lazy;
        this.g = lazy2;
        this.h = lazy3;
        this.i = dw3Var2;
        this.j = dw3Var3;
        this.k = lazy4;
        this.l = jiVar;
        this.m = lazy5;
        this.n = jiVar2;
        this.o = wv1Var;
        this.p = jiVar3;
        this.q = yv3Var3;
        this.r = yv3Var4;
        this.s = yv3Var5;
        this.t = lazy6;
        this.u = jiVar4;
        this.v = yv3Var7;
        this.w = dw3Var4;
        this.x = lazy7;
        this.y = lazy8;
        this.z = lazy9;
        this.A = new ks3(dw3Var, lazy, lazy5, jiVar3, jiVar2, yv3Var6, jiVar4, dw3Var4, lazy7);
    }

    @Override // defpackage.mkf
    public final l7n a(Class cls) {
        OperaApplication operaApplication = this.e.b;
        boolean zA = Intrinsics.a(cls, t6g.class);
        yv3 yv3Var = this.q;
        yv3 yv3Var2 = this.v;
        dw3 dw3Var = this.i;
        Lazy lazy = this.m;
        Lazy lazy2 = this.x;
        yv3 yv3Var3 = this.c;
        if (zA) {
            return new t6g((ot2) yv3Var3.get(), (yu2) lazy.get(), (x5g) lazy2.get(), new zg7(new ghf((x5g) lazy2.get()), (orm) dw3Var.get()), (ru9) yv3Var2.get(), (cq5) this.w.get(), (xb) this.o.b.get(), this.n.b.b(), this.p.b.N(), (hxk) yv3Var.get(), (orm) dw3Var.get(), this.a);
        }
        boolean zA2 = Intrinsics.a(cls, m6g.class);
        yv3 yv3Var4 = this.r;
        yv3 yv3Var5 = this.d;
        if (zA2) {
            return new m6g(this.b, (ot2) yv3Var3.get(), (d8j) yv3Var5.get(), (hxk) yv3Var.get(), operaApplication.J(), this.A.w(), (PasswordManager) this.f.get(), (x5g) lazy2.get(), (yu2) lazy.get(), (ysj) yv3Var4.get(), (n6g) this.u.get(), (ru9) yv3Var2.get());
        }
        if (Intrinsics.a(cls, xu.class)) {
            return new xu((uab) this.t.get(), (x5g) lazy2.get(), (d8j) yv3Var5.get());
        }
        boolean zA3 = Intrinsics.a(cls, br2.class);
        Lazy lazy3 = this.g;
        Lazy lazy4 = this.y;
        if (zA3) {
            return new br2(this.b, (wk4) lazy4.get(), (ot2) yv3Var3.get(), (AutofillManager) lazy3.get());
        }
        if (Intrinsics.a(cls, h3b.class)) {
            return new h3b((ot2) yv3Var3.get(), (z77) this.s.get(), (ysj) yv3Var4.get(), (orm) dw3Var.get(), (skm) this.j.get());
        }
        boolean zA4 = Intrinsics.a(cls, dl4.class);
        Lazy lazy5 = this.k;
        if (!zA4) {
            if (Intrinsics.a(cls, cx.class)) {
                return new cx((ot2) yv3Var3.get(), (d8j) yv3Var5.get(), operaApplication.J(), new sw((AutofillManager) lazy3.get()), (AutofillManager) lazy3.get(), (nkm) lazy5.get());
            }
            return null;
        }
        return new dl4((ot2) yv3Var3.get(), (d8j) yv3Var5.get(), operaApplication.J(), (gv2) lazy4.get(), (nkm) lazy5.get(), this.b, (wh2) this.z.get());
    }

    public final Fragment b(Class cls) {
        boolean zA = Intrinsics.a(cls, t5g.class);
        Lazy lazy = this.m;
        gjm gjmVar = this.b;
        if (zA) {
            return new t5g(gjmVar, (yu2) lazy.get());
        }
        boolean zA2 = Intrinsics.a(cls, f6g.class);
        yv3 yv3Var = this.s;
        dw3 dw3Var = this.i;
        if (zA2) {
            return new f6g(gjmVar, (z77) yv3Var.get(), (ysj) this.r.get(), (orm) dw3Var.get());
        }
        if (Intrinsics.a(cls, ru.class)) {
            return new ru(gjmVar, (orm) dw3Var.get());
        }
        if (Intrinsics.a(cls, g3b.class)) {
            return new g3b(gjmVar);
        }
        boolean zA3 = Intrinsics.a(cls, zk4.class);
        Lazy lazy2 = this.z;
        if (zA3) {
            return new zk4(gjmVar, (wh2) lazy2.get());
        }
        boolean zA4 = Intrinsics.a(cls, mp2.class);
        Lazy lazy3 = this.h;
        Lazy lazy4 = this.g;
        if (zA4) {
            return new mp2((orm) dw3Var.get(), (AutofillManager) lazy4.get(), (gw) lazy3.get(), 2132017659);
        }
        if (Intrinsics.a(cls, uw.class)) {
            return new uw(gjmVar);
        }
        if (Intrinsics.a(cls, kp2.class)) {
            return new kp2((orm) dw3Var.get(), (AutofillManager) lazy4.get(), (gw) lazy3.get(), yi4.n((String) null));
        }
        if (Intrinsics.a(cls, xq2.class)) {
            return new xq2(gjmVar, (wh2) lazy2.get());
        }
        boolean zA5 = Intrinsics.a(cls, wr2.class);
        yv3 yv3Var2 = this.d;
        if (zA5) {
            return new wr2((AutofillManager) lazy4.get(), (orm) dw3Var.get(), (d8j) yv3Var2.get());
        }
        if (!Intrinsics.a(cls, jh3.class)) {
            if (Intrinsics.a(cls, nmm.class)) {
                return new nmm(gjmVar);
            }
            return null;
        }
        d8j d8jVar = (d8j) yv3Var2.get();
        PasswordManager passwordManager = (PasswordManager) this.f.get();
        yu2 yu2Var = (yu2) lazy.get();
        w4g w4gVar = new w4g((vnj) this.l.get());
        z77 z77Var = (z77) yv3Var.get();
        psp pspVar = new psp();
        Objects.requireNonNull(passwordManager);
        return new jh3(pspVar, new qp2(passwordManager, (byte) 13), d8jVar, yu2Var, w4gVar, z77Var);
    }
}
