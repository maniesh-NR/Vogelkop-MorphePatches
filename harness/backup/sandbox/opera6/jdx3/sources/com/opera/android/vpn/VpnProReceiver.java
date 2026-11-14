package com.opera.android.vpn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.opera.android.OperaApplication;
import defpackage.rdn;
import defpackage.ru9;
import defpackage.vml;
import defpackage.ydn;

/* loaded from: classes.dex */
public class VpnProReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (sfe.g0(context) || intent == null || !"android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            return;
        }
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        ydn ydnVarR = operaApplication.R();
        rdn rdnVar = ydnVarR.k;
        Context context2 = ydnVarR.l;
        vml.a(rdnVar);
        if (ydnVarR.c.isEnabled() && ru9.c(context2).a.getInt("vpn.vpnpro_auto_connect", 0) == 1) {
            nv6 nv6VarB = ru9.c(context2).b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("vpn.auto_enable_on_start", false);
            nv6VarB.w();
            ydnVarR.C(true);
        }
        ydnVarR.f.n(0L);
        operaApplication.S().p();
        operaApplication.T().p();
    }
}
