package defpackage;

import android.content.SharedPreferences;
import android.view.View;

/* loaded from: classes.dex */
public final class scn implements kz3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;
    public final /* synthetic */ lgn c;

    public /* synthetic */ scn(lgn lgnVar, View view, byte b) {
        this.a = b;
        this.b = view;
        this.c = lgnVar;
    }

    @Override // defpackage.kz3
    public final void b(hjm hjmVar) {
        byte b = this.a;
        View view = this.b;
        hjm hjmVar2 = hjm.a;
        switch (b) {
            case 0:
                if (hjmVar == hjmVar2) {
                    nv6 nv6VarB = ru9.c(view.getContext()).b();
                    ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn.tooltip_free_closed", true);
                    nv6VarB.w();
                    break;
                }
                break;
            default:
                if (hjmVar == hjmVar2) {
                    nv6 nv6VarB2 = ru9.c(view.getContext()).b();
                    ((SharedPreferences.Editor) nv6VarB2.a).putBoolean("vpn.tooltip_premium.closed", true);
                    nv6VarB2.w();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.kz3
    public final void g(lz3 lz3Var) {
        byte b = this.a;
        lgn lgnVar = this.c;
        switch (b) {
            case 0:
                ((ucn) ((tcn) lgnVar).g).g();
                break;
            default:
                tcn tcnVar = (tcn) lgnVar;
                rfn rfnVar = (rfn) tcnVar.g;
                rfnVar.getClass();
                int i = tcnVar.e;
                boolean z = tcnVar.f;
                fp1 fp1Var = rfnVar.a;
                if (z) {
                    rfnVar.k.add(Integer.valueOf(i));
                    nv6 nv6VarB = ru9.c(fp1Var).b();
                    ((SharedPreferences.Editor) nv6VarB.a).putInt("vpn.tooltip_premium.shown_incognito_promo", ru9.c(fp1Var).a.getInt("vpn.tooltip_premium.shown_incognito_promo", 0) + 1);
                    nv6VarB.w();
                } else {
                    rfnVar.l = true;
                }
                if (rfnVar.l && ru9.c(fp1Var).a.getInt("vpn.tooltip_premium.shown_incognito_promo", 0) >= 2) {
                    rfnVar.g();
                    break;
                }
                break;
        }
    }
}
