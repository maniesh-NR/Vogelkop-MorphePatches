package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.service.quicksettings.TileService;
import com.opera.android.BrowserActivity;
import com.opera.android.vpn.quick_settings_tile.VpnProQuickSettingsTileService;

/* loaded from: classes.dex */
public final class yen extends yi2 {
    public final Context g;
    public final x5f h;
    public final ode i;
    public final kze j;
    public final x53 k;
    public BrowserActivity l;

    public yen(Context context, x5f x5fVar, slk slkVar, ydn ydnVar) {
        super(context, slkVar, ydnVar);
        this.g = context;
        this.h = x5fVar;
        this.i = new ode();
        this.j = new kze(Boolean.valueOf(e(context)));
        this.k = new x53(this);
    }

    @Override // defpackage.yi2
    public final boolean e(Context context) {
        return ru9.c(context).a.getBoolean("vpn.vpnpro.quick_settings_tile_added", false);
    }

    @Override // defpackage.yi2
    public final void l(Context context, boolean z) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) VpnProQuickSettingsTileService.class), z ? 1 : 2, 1);
        if (z) {
            return;
        }
        q(false);
    }

    @Override // defpackage.yi2
    public final void o() {
        int iA;
        ydn ydnVar = (ydn) this.c;
        if (!((Boolean) ((kze) this.d).g()).booleanValue()) {
            xen xenVar = xen.d;
        }
        xen xenVar2 = (ydnVar.c.isEnabled() && (iA = vep.A(ydnVar.q())) != 0) ? (iA == 1 || iA == 2) ? xen.e : xen.f : xen.f;
        if (xf8.E0(this.i, xenVar2)) {
            Context context = this.g;
            try {
                TileService.requestListeningState(context, new ComponentName(context, (Class<?>) VpnProQuickSettingsTileService.class));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void q(boolean z) {
        nv6 nv6VarB = ru9.c(this.g).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn.vpnpro.quick_settings_tile_added", z);
        nv6VarB.w();
        x5f x5fVar = this.h;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.J(zpaVar).r(10, 1, z);
            x5fVar.U0(x56VarF);
        }
    }
}
