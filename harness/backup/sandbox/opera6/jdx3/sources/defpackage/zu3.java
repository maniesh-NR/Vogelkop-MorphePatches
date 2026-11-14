package defpackage;

import android.view.View;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class zu3 implements tvb {
    public final /* synthetic */ BrowserActivity a;

    public /* synthetic */ zu3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    @Override // defpackage.tvb
    public final boolean a() {
        return !((kwf) this.a.A0.get()).k();
    }

    @Override // defpackage.tvb
    public final void run() {
        View viewP;
        int i = BrowserActivity.E1;
        BrowserActivity browserActivity = this.a;
        if (browserActivity.w0() != null) {
            gbf gbfVar = browserActivity.M;
            if (gbfVar == null) {
                gbfVar = null;
            }
            tbf tbfVar = gbfVar.j.t;
            if ((!(tbfVar.b(32L) && tbfVar.b(16L)) && tbfVar.b(64L)) || (viewP = gbfVar.p()) == null) {
                return;
            }
            gbfVar.m.b(viewP);
        }
    }
}
