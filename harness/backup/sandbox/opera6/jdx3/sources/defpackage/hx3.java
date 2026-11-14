package defpackage;

import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class hx3 implements ex3, ijf {
    public final /* synthetic */ xbf a;
    public final dx3 b;
    public final umi c;
    public final fx3 d = new fx3(this, 0);
    public final fx3 e = new fx3(this, 1);
    public final fx3 f = new fx3(this, 2);
    public final fx3 g = new fx3(this, 4);
    public final fx3 h = new fx3(this, 5);
    public final fx3 i = new fx3(this, 6);
    public final fx3 j = new fx3(this, 13);
    public final fx3 k = new fx3(this, 8);
    public final fx3 l = new fx3(this, 9);
    public final fx3 m = new fx3(this, 10);
    public final fx3 n = new fx3(this, 11);
    public final fx3 o = new fx3(this, 12);
    public final fx3 p = new fx3(this, 15);
    public final fx3 q = new fx3(this, 16);
    public final fx3 r = new fx3(this, 17);
    public final fx3 s = new fx3(this, 14);
    public final fx3 t = new fx3(this, 7);
    public final fx3 u = new fx3(this, 3);

    public hx3(dx3 dx3Var, umi umiVar, xbf xbfVar) {
        this.a = xbfVar;
        this.b = dx3Var;
        this.c = umiVar;
    }

    public final Lazy A() {
        return ((mi) this.a.b).E;
    }

    public final Lazy B() {
        return ((mi) this.a.b).A;
    }

    public final xb a() {
        mi miVar = (mi) this.a.b;
        String[] strArr = OperaApplication.K;
        return ((OperaApplication) miVar.a.getApplication()).c();
    }

    @Override // defpackage.ijf
    public final Lazy b() {
        return this.p;
    }

    public final Lazy c() {
        return ((mi) this.a.b).c;
    }

    public final Lazy d() {
        return ((mi) this.a.b).d;
    }

    public final Lazy e() {
        return ((mi) this.a.b).e;
    }

    @Override // defpackage.ex3
    public final Lazy f() {
        return this.e;
    }

    public final Lazy g() {
        return ((mi) this.a.b).f;
    }

    public final xm5 h() {
        return ((mi) this.a.b).D;
    }

    public final Lazy i() {
        return ((mi) this.a.b).h;
    }

    public final Lazy j() {
        return ((mi) this.a.b).g;
    }

    @Override // defpackage.ex3
    public final Lazy k() {
        return this.s;
    }

    public final Lazy l() {
        return ((mi) this.a.b).i;
    }

    public final Lazy m() {
        return ((mi) this.a.b).j;
    }

    public final Lazy n() {
        return ((mi) this.a.b).k;
    }

    public final Lazy o() {
        return ((mi) this.a.b).C;
    }

    public final Lazy p() {
        return ((mi) this.a.b).m;
    }

    public final Lazy q() {
        return this.u;
    }

    public final Lazy r() {
        return ((mi) this.a.b).v;
    }

    public final Lazy s() {
        return ((mi) this.a.b).n;
    }

    public final Lazy t() {
        return ((mi) this.a.b).p;
    }

    public final Lazy u() {
        return ((mi) this.a.b).q;
    }

    public final Lazy v() {
        return ((mi) this.a.b).r;
    }

    public final SettingsManager w() {
        return ((mi) this.a.b).a();
    }

    public final Lazy x() {
        return ((mi) this.a.b).u;
    }

    public final Lazy y() {
        return ((mi) this.a.b).w;
    }

    public final Lazy z() {
        return ((mi) this.a.b).y;
    }
}
