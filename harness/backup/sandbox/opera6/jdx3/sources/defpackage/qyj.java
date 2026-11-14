package defpackage;

import com.opera.android.Lazy;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qyj implements czj {
    public final ndc a;
    public final kze b;
    public final g22 c;
    public final k62 d;
    public final Lazy e;
    public final yv3 f;
    public final l62 g;
    public int h;
    public final ode i = new ode((Object) null);
    public final ode j = new ode((Object) null);
    public final kze k = new kze(Boolean.FALSE);
    public abn l;
    public uyj m;
    public rzh n;
    public d22 o;

    public qyj(ndc ndcVar, ekc ekcVar, kze kzeVar, g22 g22Var, k62 k62Var, Lazy lazy, yv3 yv3Var, l62 l62Var) {
        this.a = ndcVar;
        this.b = kzeVar;
        this.c = g22Var;
        this.d = k62Var;
        this.e = lazy;
        this.f = yv3Var;
        this.g = l62Var;
        ekcVar.j(ndcVar, new t7d(new nyj(this, (byte) 1), (byte) 13));
        kzeVar.j(ndcVar, new t7d(new nyj(this, (byte) 2), (byte) 13));
    }

    @Override // defpackage.czj
    public final void b() {
        m();
        ((jbn) this.e.get()).e(new mw0((ru9) this.f.get()), new nyj(this, (byte) 0));
    }

    public final Locale d() {
        return wwc.f((String) ((jbn) this.e.get()).a().g());
    }

    @Override // defpackage.czj
    public final void f() {
        abn abnVar = this.l;
        if (abnVar != null) {
            abnVar.cancel();
        }
        this.l = null;
        xf8.E0(this.i, (Object) null);
    }

    public final void l(String str, String str2, boolean z, Function1 function1) {
        uyj uyjVar = this.m;
        ode odeVar = this.j;
        if (uyjVar == null) {
            uyjVar = (uyj) this.d.invoke();
            this.m = uyjVar;
            xf8.E0(odeVar, (Object) null);
            uyjVar.b.k(new t7d(new vvf(this, uyjVar, (byte) 28), (byte) 13));
        }
        rzh rzhVar = this.n;
        if (rzhVar != null) {
            rzhVar.l(str2);
        } else {
            this.n = new vi2(str2, odeVar, function1, new oyj(this, function1, (byte) 0));
        }
        Locale localeD = d();
        uyjVar.j = 1.0f;
        uyj uyjVar2 = uyjVar;
        d6e d6eVar = new d6e(uyjVar2, str, localeD, str2, z);
        if (Intrinsics.a(uyjVar2.b.g(), wyj.a)) {
            uyjVar2.e = new nx0(d6eVar, (byte) 8);
        } else {
            d6eVar.invoke();
        }
    }

    public final void m() {
        d22 d22Var = this.o;
        if (d22Var != null) {
            d22Var.c.q(this.a);
        }
        d22 d22Var2 = this.o;
        if (d22Var2 != null) {
            d22Var2.d = true;
        }
        this.o = null;
        uyj uyjVar = this.m;
        if (uyjVar != null) {
            dnj dnjVar = new dnj(uyjVar, (byte) 2);
            if (Intrinsics.a(uyjVar.b.g(), wyj.a)) {
                uyjVar.e = new nx0(dnjVar, (byte) 8);
            } else {
                dnjVar.invoke();
            }
        }
        rzh rzhVar = this.n;
        if (rzhVar != null) {
            rzhVar.cancel();
        }
        this.n = null;
    }
}
