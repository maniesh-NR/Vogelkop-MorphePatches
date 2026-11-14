package ads_mobile_sdk;

import defpackage.bwg;
import defpackage.xep;

/* loaded from: classes.dex */
public final class vc0 implements xep {
    public final sb0 a;
    public av2 b;
    public defpackage.hp c;
    public eq2 d;
    public ih1 e;
    public j71 f;
    public Boolean g;
    public dr2 h;
    public Boolean i;
    public Boolean j;
    public i8 k;

    public vc0(sb0 sb0Var) {
        this.a = sb0Var;
    }

    public final wc0 a() {
        bwg.f(this.b, av2.class);
        bwg.f(this.c, defpackage.r83.class);
        bwg.f(this.d, eq2.class);
        bwg.f(this.e, ih1.class);
        bwg.f(this.f, j71.class);
        bwg.f(this.g, Boolean.class);
        bwg.f(this.h, dr2.class);
        bwg.f(this.i, Boolean.class);
        bwg.f(this.j, Boolean.class);
        bwg.f(this.k, i8.class);
        return new wc0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override // defpackage.xep
    public final Object a(av2 av2Var) {
        av2Var.getClass();
        this.b = av2Var;
        return this;
    }

    @Override // defpackage.xep
    public final Object a(dr2 dr2Var) {
        this.h = dr2Var;
        return this;
    }

    @Override // defpackage.xep
    public final Object a(eq2 eq2Var) {
        eq2Var.getClass();
        this.d = eq2Var;
        return this;
    }

    @Override // defpackage.xep
    public final Object a(i8 i8Var) {
        this.k = i8Var;
        return this;
    }

    @Override // defpackage.xep
    public final Object a(ih1 ih1Var) {
        ih1Var.getClass();
        this.e = ih1Var;
        return this;
    }

    @Override // defpackage.xep
    public final Object a(j71 j71Var) {
        j71Var.getClass();
        this.f = j71Var;
        return this;
    }

    @Override // defpackage.xep
    public final Object a(defpackage.hp hpVar) {
        hpVar.getClass();
        this.c = hpVar;
        return this;
    }

    @Override // defpackage.xep
    public final Object a(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    @Override // defpackage.xep
    public final Object b() {
        this.i = Boolean.FALSE;
        return this;
    }

    @Override // defpackage.xep
    public final Object c(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }
}
