package defpackage;

import android.text.TextUtils;
import com.opera.android.settings.SettingsManager;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class z2g implements pke, p5j {
    public final qke a;
    public final SettingsManager b;
    public final ox3 c;
    public boolean d;

    public z2g(qke qkeVar, SettingsManager settingsManager, ox3 ox3Var) {
        this.a = qkeVar;
        this.b = settingsManager;
        this.c = ox3Var;
        this.d = settingsManager.i("collect_partner_visits");
        qkeVar.W(this);
        settingsManager.F(this);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("collect_partner_visits".equals(str)) {
            this.d = this.b.i("collect_partner_visits");
        }
    }

    @Override // defpackage.pke
    public final void w(b2l b2lVar, oke okeVar, long j, boolean z) {
        nd7 nd7Var;
        if (!z || okeVar.d || okeVar.c || !this.d) {
            return;
        }
        String url = ((d7l) b2lVar).j.getUrl();
        AtomicReference atomicReference = y2g.c;
        String strI = wqm.i(url);
        int iA = (TextUtils.isEmpty(strI) || (nd7Var = (nd7) y2g.c.get()) == null) ? -1 : nd7Var.a(strI.toLowerCase(Locale.US));
        if (iA != -1) {
            osf osfVar = (osf) this.c.get();
            osfVar.getClass();
            osfVar.a(new r95((byte) 6, iA));
        }
    }
}
