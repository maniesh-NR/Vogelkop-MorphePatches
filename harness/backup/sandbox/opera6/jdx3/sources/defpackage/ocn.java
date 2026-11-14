package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ocn extends lim {
    public static final k2d j = new k2d(0, 108, 0);
    public static final k2d k = new k2d(64, 108, -1);
    public static final k2d l = new k2d(108, 133, 0);
    public static final k2d m = new k2d(133, 133, 0);
    public final ncn a;
    public final esg b;
    public final ydn c;
    public final i9c e;
    public k2d h;
    public boolean i;
    public final nlk d = new nlk(this, (byte) 1);
    public final mcn f = new mcn(this, (byte) 0);
    public int g = 1;

    public ocn(ViewGroup viewGroup, tcc tccVar, ydn ydnVar) {
        ncn ncnVar = new ncn(viewGroup.getContext(), new mcn(this, (byte) 1));
        this.a = ncnVar;
        this.b = new esg(ncnVar);
        this.c = ydnVar;
        i9c i9cVar = new i9c(viewGroup, ncnVar);
        this.e = i9cVar;
        tccVar.a(this);
        u2d.e(viewGroup.getContext(), 2131951695, (String) null).b(new hg2(this, (byte) 3));
        boolean zIsEnabled = ydnVar.c.isEnabled();
        if (zIsEnabled == i9cVar.b) {
            return;
        }
        i9cVar.b = zIsEnabled;
        i9cVar.a();
    }

    public final void R() {
        if (((f3d) this.a).a != null) {
            int iA = vep.A(this.g);
            if (iA != 0) {
                k2d k2dVar = k;
                k2d k2dVar2 = j;
                if (iA == 1) {
                    k2d k2dVar3 = this.h;
                    if (k2dVar3 == k2dVar) {
                        S(l);
                        return;
                    } else {
                        if (k2dVar3 == k2dVar2 || k2dVar3 == k2dVar) {
                            return;
                        }
                        S(k2dVar2);
                        return;
                    }
                }
                if (iA == 2) {
                    k2d k2dVar4 = this.h;
                    if (k2dVar4 == k2dVar2 || k2dVar4 == k2dVar) {
                        return;
                    }
                    S(k2dVar2);
                    return;
                }
                if (iA != 3) {
                    return;
                }
            }
            this.h = null;
        }
    }

    public final void S(k2d k2dVar) {
        this.h = k2dVar;
        mcn mcnVar = this.f;
        vml.a(mcnVar);
        boolean zIsVisible = this.a.isVisible();
        esg esgVar = this.b;
        if (!zIsVisible) {
            esgVar.getClass();
            int i = -1;
            if (k2dVar.c != -1) {
                i = (int) ((((r3 + 1) * (k2dVar.b - k2dVar.a)) * 1000) / ((f3d) ((ncn) esgVar.b)).a.l);
            }
            long j2 = i;
            if (j2 != -1) {
                vml.d(mcnVar, j2);
                return;
            }
            return;
        }
        mcn mcnVar2 = new mcn(this, (byte) 0);
        esgVar.getClass();
        int i2 = k2dVar.c;
        short s = k2dVar.a;
        short s2 = k2dVar.b;
        esgVar.c = mcnVar2;
        ncn ncnVar = (ncn) esgVar.b;
        ncnVar.j();
        ((f3d) ncnVar).b.setRepeatCount(i2);
        ncnVar.q(s, s2);
        ncnVar.k();
    }

    public final void T() {
        boolean z = this.i;
        ydn ydnVar = this.c;
        if (z) {
            this.g = ydnVar.q();
        } else {
            this.g = ydnVar.r();
        }
        R();
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.c.F(this.d);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.c.H(this.d);
    }
}
