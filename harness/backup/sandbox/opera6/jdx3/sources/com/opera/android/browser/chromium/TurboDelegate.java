package com.opera.android.browser.chromium;

import J.N;
import android.content.Context;
import com.opera.android.browser.obml.Platform;
import com.opera.android.utilities.DisplayUtil;
import defpackage.agg;
import defpackage.cbl;
import defpackage.cj9;
import defpackage.dj9;
import defpackage.i0l;
import defpackage.mo7;
import defpackage.pyn;
import defpackage.sle;
import defpackage.xi5;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class TurboDelegate implements NetworkChangeNotifier.ConnectionTypeObserver, agg, mo7 {
    public final Context a;
    public final xi5 b;
    public final dj9 c;

    public TurboDelegate(Context context, xi5 xi5Var) {
        String strD;
        String strE;
        this.a = context;
        this.b = xi5Var;
        N.MnCRwinB(this);
        NetworkChangeNotifier.addConnectionTypeObserver(this);
        NetworkChangeNotifier.setAutoDetectConnectivityState(true);
        int iC = sle.c();
        String str = "";
        if (iC == 3 || iC == 4 || iC == 5 || iC == 8) {
            strD = i0l.d(context);
            strE = i0l.e(context);
        } else {
            strD = "";
            strE = strD;
        }
        if (strD == null || strE == null) {
            strE = "";
        } else {
            str = strD;
        }
        N.M_7qVdm3(str, strE);
        b();
        dj9 dj9VarT = dj9.t(context);
        this.c = dj9VarT;
        String strC = i0l.c(context);
        String strB = i0l.b(context);
        if ("ru".equals(strC) || "ru".equals(strB)) {
            N.M4ZjTA3h(true);
        } else {
            dj9VarT.F(this);
        }
        cbl cblVar = new cbl(this, (byte) 21);
        avj avjVar = cak.d;
        avj.g(2, cblVar);
        Platform.e.add(this);
    }

    @Override // defpackage.agg
    public final void a(String str, String str2) {
        b();
        N.MdrkO_AS();
    }

    public final void b() {
        Context context = this.a;
        N.M4C08WKl("phone_ua", pyn.a(context));
        N.M4C08WKl("form_factor", DisplayUtil.e(context) ? "t" : "m");
        N.M4C08WKl("language", Platform.getLanguage());
        String str = (String) N.MQ$xB7I2("General", "Campaign");
        if (str != null) {
            N.M4C08WKl("campaign", str);
        }
        N.M4C08WKl("release_channel", "b");
        N.M4C08WKl("distribution_source", "u");
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        cj9 cj9Var = (cj9) this.c.i();
        N.M4ZjTA3h("ru".equals(cj9Var.a) || "ru".equals(cj9Var.b));
    }

    public final void onConnectionTypeChanged(int i) {
        String strD;
        String strE;
        int iC = sle.c();
        String str = "";
        if (iC == 3 || iC == 4 || iC == 5 || iC == 8) {
            Context context = this.a;
            strD = i0l.d(context);
            strE = i0l.e(context);
        } else {
            strE = "";
            strD = strE;
        }
        if (strD == null || strE == null) {
            strE = "";
        } else {
            str = strD;
        }
        N.M_7qVdm3(str, strE);
    }

    public final void onTurboStatistics(long j, long j2) {
        this.b.i(j, j2);
    }
}
