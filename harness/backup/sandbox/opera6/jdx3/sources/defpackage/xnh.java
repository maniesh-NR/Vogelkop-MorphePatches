package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public final class xnh extends no7 {
    public static final a36 k = new a36();

    public static xnh t(Context context) {
        return (xnh) no7.n(context, io7.h, k);
    }

    @Override // defpackage.no7
    public final Object h() {
        return new wnh();
    }

    @Override // defpackage.no7
    public final Object k(izd izdVar) {
        return new wnh(izdVar);
    }

    @Override // defpackage.no7
    public final void m(Object obj) {
        u((wnh) obj);
    }

    @Override // defpackage.no7
    public final Object q(byte[] bArr) {
        izd izdVar = new izd(new ByteArrayInputStream(bArr));
        try {
            return new wnh(izdVar);
        } finally {
            xvg.l(izdVar);
        }
    }

    @Override // defpackage.no7
    public final void r(Object obj) {
        u((wnh) obj);
    }

    public final void u(wnh wnhVar) {
        String[] strArr = OperaApplication.K;
        Context context = this.a;
        SettingsManager settingsManagerJ = ((OperaApplication) context.getApplicationContext()).J();
        if (settingsManagerJ.J()) {
            settingsManagerJ.R(wnhVar.b(67108864) ? 1 : 0, "ad_blocking");
        }
        ru9 ru9VarC = ru9.c(context);
        if (ru9.c(context).a.getBoolean("dcc.rs.mock.disable", false) != wnhVar.a(4096)) {
            nv6 nv6VarB = ru9VarC.b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("dcc.rs.mock.disable", wnhVar.a(4096));
            nv6VarB.w();
        }
        settingsManagerJ.R(!wnhVar.a(1048576) ? 1 : 0, "enable_trending_searches");
        settingsManagerJ.R(!wnhVar.a(2097152) ? 1 : 0, "enable_recent_searches");
        settingsManagerJ.R(wnhVar.b(4096) ? 1 : 0, "tracker_blocker");
        settingsManagerJ.R(wnhVar.b(16384) ? 1 : 0, "live_scores_enabled");
        boolean zB = wnhVar.b(16);
        int cookiesInt = settingsManagerJ.getCookiesInt();
        settingsManagerJ.i = zB;
        if (cookiesInt != settingsManagerJ.getCookiesInt()) {
            settingsManagerJ.Q("accept_cookies");
        }
    }
}
