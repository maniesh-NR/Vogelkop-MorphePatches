package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.opera.android.vpn.app_widget.VpnProAppWidget;
import com.opera.android.vpn.quick_settings_tile.VpnProQuickSettingsTileService;
import java.util.Arrays;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class yfn implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cgn b;

    public /* synthetic */ yfn(cgn cgnVar, byte b) {
        this.a = b;
        this.b = cgnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        byte b = this.a;
        cgn cgnVar = this.b;
        switch (b) {
            case 0:
                cgnVar.L0();
                break;
            case 1:
                new zhj(new wzg(null, mhf.class, (byte) 4), null, 2, 4099, null, false, Arrays.asList(new n6h[0])).c(cgnVar.getContext());
                break;
            case 2:
                Context contextRequireContext = cgnVar.requireContext();
                int i = VpnProAppWidget.b;
                int i2 = eif.a;
                kfo.c0(contextRequireContext.getApplicationContext(), VpnProAppWidget.class, 2131559103, 2131559304);
                break;
            case 3:
                Context contextRequireContext2 = cgnVar.requireContext();
                int i3 = VpnProQuickSettingsTileService.b;
                t8.R(contextRequireContext2);
                break;
            case 4:
                pfn pfnVar = cgnVar.F;
                pfnVar.n.e++;
                wvg wvgVar = pfnVar.r;
                if (!(wvgVar != null ? wvgVar.b() : false)) {
                    amk amkVar = pfnVar.o;
                    if (amkVar != null) {
                        z77 z77Var = pfnVar.h;
                        tim timVar = new tim(new h8d(pfnVar, pfnVar.f, pfnVar.c, 1, amkVar.a.a));
                        z77Var.getClass();
                        z77Var.b(timVar, ijm.b);
                        break;
                    }
                } else {
                    yug.c((yug) pfnVar.j.invoke(), 12, null, 6);
                    break;
                }
                break;
            case 5:
                pfn pfnVar2 = cgnVar.F;
                pfnVar2.n.f++;
                nv6 nv6VarB = pfnVar2.g.b();
                ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn.vpnpro.upsell_banner_closed", true);
                nv6VarB.w();
                break;
            case 6:
                x5f x5fVar = cgnVar.C;
                kcn[] kcnVarArr = kcn.a;
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    am2.f(zpaVar, x56VarF).b("vpn_pro_still_active_reminder", new zbe((byte) 17));
                    x5fVar.U0(x56VarF);
                }
                nv6 nv6VarB2 = ru9.c(cgnVar.requireContext()).b();
                ((SharedPreferences.Editor) nv6VarB2.a).putBoolean("vpn_pro.kill_switch.on", false);
                nv6VarB2.w();
                cgnVar.L0();
                break;
            case 7:
                ((gjm) cgnVar.I.c).e(new odn(), false);
                break;
            case 8:
                ydn ydnVar = cgnVar.v;
                boolean z = !ydnVar.d.a;
                cgnVar.M = z;
                ydnVar.C(z);
                break;
            default:
                cgnVar.z.a();
                break;
        }
    }
}
