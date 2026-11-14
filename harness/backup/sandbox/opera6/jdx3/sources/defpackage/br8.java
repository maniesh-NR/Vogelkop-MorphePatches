package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class br8 implements gq8, xr8 {
    public final hq8 a;
    public final yr8 b;
    public int c;
    public final /* synthetic */ cr8 d;

    public br8(cr8 cr8Var, hq8 hq8Var) {
        this.d = cr8Var;
        this.a = hq8Var;
        yr8 yr8Var = new yr8(cr8Var.getContext(), this, cr8Var.a, cr8Var.b, cr8Var.w);
        this.b = yr8Var;
        yr8Var.f = hq8Var;
        yr8Var.j = 0;
        yr8Var.e();
        yr8Var.k = null;
        yr8Var.l = null;
        int i = cr8Var.f;
        this.c = i == 0 ? f03.t(2130969727, cr8Var.getContext(), 2131101243) : i;
        hq8Var.b(this);
    }

    @Override // defpackage.gq8
    public final void Q(hq8 hq8Var) {
    }

    @Override // defpackage.xr8
    public final boolean c() {
        return true;
    }

    @Override // defpackage.xr8
    public final void h() {
    }

    @Override // defpackage.xr8
    public final int i() {
        return this.c;
    }

    @Override // defpackage.xr8
    public final void invalidate() {
        this.d.invalidate();
    }

    @Override // defpackage.xr8
    public final vmj k(String str) {
        cr8 cr8Var = this.d;
        int i = cr8Var.c;
        Context context = cr8Var.getContext();
        na5 na5Var = na5.b;
        int i2 = vmj.g;
        return tmj.l(context, str, umj.b, i, i, na5Var, true);
    }

    @Override // defpackage.xr8
    public final void l() {
    }

    @Override // defpackage.xr8
    public final String p() {
        return this.a.i(p6l.a);
    }

    @Override // defpackage.gq8
    public final void r(int i, hq8 hq8Var) {
        if (i == 7 || i == 5) {
            this.b.f(true);
        }
    }

    @Override // defpackage.xr8
    public final int s() {
        return this.d.c;
    }

    @Override // defpackage.xr8
    public final int v() {
        return this.d.c;
    }
}
