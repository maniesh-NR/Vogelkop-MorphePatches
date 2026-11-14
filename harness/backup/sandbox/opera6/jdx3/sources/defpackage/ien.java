package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.opera.android.vpn.app_widget.VpnProAppWidget;

/* loaded from: classes.dex */
public final class ien extends yi2 {
    public final Context g;
    public final x5f h;
    public final slk i;
    public final nzk j;

    public ien(Context context, x5f x5fVar, slk slkVar, nzk nzkVar, ydn ydnVar) {
        super(context, slkVar, ydnVar);
        this.g = context;
        this.h = x5fVar;
        this.i = slkVar;
        this.j = nzkVar;
    }

    @Override // defpackage.yi2
    public final void l(Context context, boolean z) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) VpnProAppWidget.class), z ? 1 : 2, 1);
        if (!z) {
            r(0);
            return;
        }
        int i = VpnProAppWidget.b;
        int i2 = eif.a;
        Integer numI = kfo.I(context, VpnProAppWidget.class);
        if (numI != null) {
            r(numI.intValue());
        }
    }

    @Override // defpackage.yi2
    public final void o() {
        int i = eif.a;
        kfo.k0(this.g, VpnProAppWidget.class);
    }

    public final g1o q() {
        ydn ydnVar = (ydn) this.c;
        if (!ydnVar.c.isEnabled()) {
            return new k1o(0, null, ((wvg) this.i.i.g()).e == 5 ? 3 : 4);
        }
        int iJ = ydnVar.j();
        if (iJ == 0) {
            iJ = ydnVar.i().i;
        }
        int i = iJ;
        int iQ = ydnVar.q();
        if (iQ == 3) {
            return new h1o(i, ydnVar.k(), ydnVar.e.d);
        }
        if (iQ == 2) {
            return new j1o(i, ydnVar.k(), ydnVar.l());
        }
        if (iQ == 1 && ydnVar.f.g()) {
            return new i1o(ydnVar.k(), 2131232398, 2132019232, 2131102904, i, 0);
        }
        if (Build.VERSION.SDK_INT < 33 || na2.o(this.g, "android.permission.POST_NOTIFICATIONS") == 0) {
            return new k1o(i, ydnVar.k(), iQ != 4 ? 1 : 2);
        }
        return new k1o(0, null, 0);
    }

    public final void r(int i) {
        x5f x5fVar = this.h;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.J(zpaVar).p(9, 1, i);
            x5fVar.U0(x56VarF);
        }
    }
}
