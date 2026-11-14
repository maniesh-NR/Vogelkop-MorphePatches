package defpackage;

import android.content.pm.PackageManager;
import com.opera.ad.interstitial.AdActivity;

/* loaded from: classes.dex */
public final class rjo extends n1 {
    public oji c;
    public final lro d;

    public rjo(AdActivity adActivity, lro lroVar) {
        super(adActivity, (byte) 1);
        this.d = lroVar;
    }

    @Override // defpackage.n1
    public final void R() throws PackageManager.NameNotFoundException {
        int i;
        AdActivity adActivity = (AdActivity) this.b;
        lro lroVar = this.d;
        adActivity.setContentView(lroVar.p);
        uuj uujVar = (uuj) lroVar.a;
        int i2 = vgo.a[((ahb) uujVar.b).ordinal()];
        if (i2 == 1) {
            i = 2131364482;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = 2131364566;
                }
                this.c = uujVar.d(adActivity, new dgo(this, (byte) 0));
                lroVar.t0(adActivity);
            }
            i = 2131364103;
        }
        uujVar.a = i;
        this.c = uujVar.d(adActivity, new dgo(this, (byte) 0));
        lroVar.t0(adActivity);
    }

    @Override // defpackage.n1
    public final void X() {
        noo nooVar = this.d.v;
        if (nooVar != null) {
            nooVar.a();
        }
    }

    @Override // defpackage.n1
    public final void c0() {
        oji ojiVar = this.c;
        if (ojiVar != null) {
            gxo.d.removeCallbacks((ttn) ((bx7) ojiVar.a).b);
        }
    }

    @Override // defpackage.n1
    public final void e0() {
        oji ojiVar = this.c;
        if (ojiVar != null) {
            ((bx7) ojiVar.a).c();
        }
    }
}
