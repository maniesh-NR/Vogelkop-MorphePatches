package defpackage;

import android.content.SharedPreferences;
import com.opera.android.ui.catalog.widget.OperaListItem;

/* loaded from: classes.dex */
public final /* synthetic */ class xfn implements vlf {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cgn b;

    public /* synthetic */ xfn(cgn cgnVar, byte b) {
        this.a = b;
        this.b = cgnVar;
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        byte b = this.a;
        cgn cgnVar = this.b;
        switch (b) {
            case 0:
                nv6 nv6VarB = ru9.c(cgnVar.v.l).b();
                ((SharedPreferences.Editor) nv6VarB.a).putInt("vpn.vpnpro_auto_connect", z ? 1 : 0);
                nv6VarB.w();
                break;
            case 1:
                ydn ydnVar = cgnVar.v;
                vdn vdnVar = ydnVar.d;
                boolean z2 = vdnVar.a;
                efn efnVar = vdnVar.b;
                hfn hfnVar = vdnVar.c;
                boolean z3 = ydnVar.p().a && z2;
                if (ydnVar.c.isEnabled()) {
                    z = false;
                }
                ydnVar.I(new vdn(z3, z, efnVar, hfnVar));
                break;
            default:
                ydn ydnVar2 = cgnVar.v;
                ydnVar2.B = z;
                nv6 nv6VarB2 = ru9.c(ydnVar2.l).b();
                ((SharedPreferences.Editor) nv6VarB2.a).putBoolean("vpn.bypass_for_search", z);
                nv6VarB2.w();
                ydnVar2.N();
                ydnVar2.v();
                break;
        }
    }
}
