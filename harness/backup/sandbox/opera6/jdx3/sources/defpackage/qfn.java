package defpackage;

import android.content.SharedPreferences;
import org.chromium.content_public.browser.NavigationHandle;

/* loaded from: classes.dex */
public final class qfn extends y08 implements tdn, j6l {
    public ri8 a;
    public f6l b;
    public boolean c;
    public final /* synthetic */ rfn d;

    public qfn(rfn rfnVar) {
        this.d = rfnVar;
        boolean z = rfnVar.g.d.a;
        this.c = z;
        if (z) {
            this.b = rfnVar.f.a(this);
        }
    }

    @Override // defpackage.tdn
    public final void C() {
        rfn rfnVar = this.d;
        if (rfnVar.g.c.isEnabled()) {
            rfnVar.g();
        }
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Runnable, ri8] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, com.opera.android.BrowserActivity] */
    @Override // defpackage.y08, defpackage.a2l
    public final void E(b2l b2lVar, NavigationHandle navigationHandle) {
        int i;
        d7l d7lVar = (d7l) b2lVar;
        final boolean zM = d7lVar.j.m();
        rfn rfnVar = this.d;
        rfnVar.getClass();
        ?? r2 = rfnVar.a;
        if (rfn.h(r2)) {
            final byte b = 1;
            if (zM) {
                if (rfnVar.k.contains(Integer.valueOf(d7lVar.j.getId()))) {
                    return;
                }
                int i2 = ru9.c(r2).a.getInt("vpn.tooltip_premium.shown_incognito_promo", 0);
                if (i2 == 0) {
                    i = 2;
                } else if (i2 != 1) {
                    return;
                } else {
                    i = 10;
                }
                if (ru9.c(r2).a.getInt("vpn.tooltip_premium.incognito_tabs_created", 0) < i) {
                    return;
                }
            } else if (rfnVar.l || System.currentTimeMillis() < ru9.c(r2).a.getLong("vpn.tooltip_premium.vpn_enabled_timestamp", 0L) + 172800000) {
                return;
            }
            if (rfnVar.i(b2lVar)) {
                ri8 ri8Var = this.a;
                if (ri8Var != null) {
                    vml.a(ri8Var);
                }
                final int id = d7lVar.j.getId();
                ?? r12 = new Runnable() { // from class: ri8
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        boolean z = zM;
                        int i3 = id;
                        Object obj = this;
                        switch (b2) {
                            case 0:
                                zi8 zi8Var = (zi8) obj;
                                el6 el6Var = zi8Var.u;
                                byte b3 = zi8Var.a[i3].a.b;
                                d11 d11VarU = el6Var.U();
                                el6Var.V(d11VarU, 1033, new zk6(d11VarU, i3, b3, z));
                                break;
                            default:
                                qfn qfnVar = (qfn) obj;
                                qfnVar.a = null;
                                rfn rfnVar2 = qfnVar.d;
                                rfnVar2.b(new tcn(rfnVar2, i3, z));
                                break;
                        }
                    }
                };
                this.a = r12;
                vml.d(r12, 1000L);
            }
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void Q(b2l b2lVar, NavigationHandle navigationHandle) {
        ri8 ri8Var = this.a;
        if (ri8Var != null) {
            vml.a(ri8Var);
            this.a = null;
        }
    }

    @Override // defpackage.y08, defpackage.a2l
    public final void S(d7l d7lVar) {
        ri8 ri8Var = this.a;
        if (ri8Var != null) {
            vml.a(ri8Var);
            this.a = null;
        }
    }

    @Override // defpackage.j6l
    public final void o(b2l b2lVar, int i, boolean z) {
        if (((d7l) b2lVar).j.m()) {
            fp1 fp1Var = this.d.a;
            nv6 nv6VarB = ru9.c(fp1Var).b();
            ((SharedPreferences.Editor) nv6VarB.a).putInt("vpn.tooltip_premium.incognito_tabs_created", ru9.c(fp1Var).a.getInt("vpn.tooltip_premium.incognito_tabs_created", 0) + 1);
            nv6VarB.w();
        }
    }

    @Override // defpackage.tdn
    public final void s() {
        rfn rfnVar = this.d;
        ydn ydnVar = rfnVar.g;
        fp1 fp1Var = rfnVar.a;
        boolean z = ydnVar.d.a;
        if (this.c == z) {
            return;
        }
        this.c = z;
        if (z) {
            nv6 nv6VarB = ru9.c(fp1Var).b();
            ((SharedPreferences.Editor) nv6VarB.a).putLong("vpn.tooltip_premium.vpn_enabled_timestamp", System.currentTimeMillis());
            nv6VarB.w();
            this.b = rfnVar.f.a(rfnVar.m);
            return;
        }
        f6l f6lVar = this.b;
        if (f6lVar != null) {
            rfnVar.f.H(f6lVar);
            this.b = null;
        }
        nv6 nv6VarB2 = ru9.c(fp1Var).b();
        ((SharedPreferences.Editor) nv6VarB2.a).remove("vpn.tooltip_premium.vpn_enabled_timestamp");
        nv6VarB2.w();
    }

    @Override // defpackage.tdn
    public final void t() {
    }
}
