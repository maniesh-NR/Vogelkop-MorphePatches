package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.opera.android.BrowserAppWidget;
import com.opera.android.OperaApplication;
import com.opera.android.aiassistant.appwidget.AiAssistantAppWidget;
import com.opera.android.vpn.app_widget.VpnProAppWidget;
import java.io.Serializable;
import java.util.Map;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class xr implements h8f {
    public final /* synthetic */ byte a;

    public /* synthetic */ xr(byte b) {
        this.a = b;
    }

    public static boolean d(Context context) {
        Context applicationContext = context.getApplicationContext();
        OperaApplication operaApplication = applicationContext instanceof OperaApplication ? (OperaApplication) applicationContext : null;
        return operaApplication != null && ((Boolean) ((kze) operaApplication.S().d).g()).booleanValue();
    }

    @Override // defpackage.h8f
    public final void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) throws eva {
        switch (this.a) {
            case 0:
                if (!((Boolean) scd.g0(h.a, new s3(this, context, (l1b) map, (mt5) null, (byte) 1))).booleanValue()) {
                    throw new eva("AddAiWidgetOfaLinkCallback not supported.");
                }
                int i2 = AiAssistantAppWidget.b;
                int i3 = eif.a;
                Integer numI = kfo.I(context, AiAssistantAppWidget.class);
                if (numI != null && numI.intValue() > 0) {
                    throw new eva("User has already added the AI widget.");
                }
                if (g8fVar == g8f.a) {
                    kfo.c0(context.getApplicationContext(), AiAssistantAppWidget.class, k1g.t(context), 2131559520);
                    return;
                }
                return;
            case 1:
                int i4 = eif.a;
                if (!kfo.e0(context)) {
                    throw new eva("Adding widget is not supported");
                }
                if (BrowserAppWidget.e(context)) {
                    throw new eva("User already have widget installed");
                }
                if (g8fVar == g8f.a) {
                    kfo.c0(context.getApplicationContext(), BrowserAppWidget.class, BrowserAppWidget.d(context), 2131559326);
                    return;
                }
                return;
            case 2:
                int i5 = eif.a;
                if (!kfo.e0(context)) {
                    throw new eva("Adding widget is not supported");
                }
                if (!d(context)) {
                    throw new eva("Widget is not available");
                }
                int i6 = VpnProAppWidget.b;
                Integer numI2 = kfo.I(context, VpnProAppWidget.class);
                if (numI2 != null && numI2.intValue() > 0) {
                    throw new eva("User already has widget installed");
                }
                if (g8fVar == g8f.a) {
                    kfo.c0(context.getApplicationContext(), VpnProAppWidget.class, 2131559103, 2131559304);
                    return;
                }
                return;
            case 3:
                l1b l1bVar = (l1b) map;
                Serializable serializableA = uup.A(l1bVar);
                ybh.y(serializableA);
                String str = (String) serializableA;
                Serializable serializableB = uup.B(l1bVar);
                ybh.y(serializableB);
                int iIntValue = ((Number) serializableB).intValue();
                if (g8fVar == g8f.a) {
                    zi4.u(context, new cug(str, iIntValue, l1bVar));
                    return;
                }
                return;
            default:
                if (g8fVar == g8f.a) {
                    Intent intentB = mdb.b(context);
                    intentB.setAction("android.intent.action.MAIN");
                    intentB.addCategory("android.intent.category.LAUNCHER");
                    String str2 = (String) map.get("campaign");
                    String str3 = (String) map.get("source");
                    intentB.putExtra("CAMPAIGN_ID", str2).putExtra("SOURCE_ID", str3).putExtra("TARGET_ID", (String) map.get("target"));
                    intentB.setAction("ACTION_PREMIUM_ONBOARDING");
                    context.startActivity(intentB);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    @Override // defpackage.h8f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r8, l1b r9, mt5 r10) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr.b(android.content.Context, l1b, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    @Override // defpackage.h8f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r5, defpackage.kk6 r6) {
        /*
            r4 = this;
            byte r0 = r4.a
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L82;
                case 1: goto L6e;
                case 2: goto L50;
                case 3: goto L40;
                default: goto L8;
            }
        L8:
            java.lang.String[] r4 = com.opera.android.OperaApplication.K
            android.content.Context r4 = r5.getApplicationContext()
            com.opera.android.OperaApplication r4 = (com.opera.android.OperaApplication) r4
            m9c r4 = r4.u()
            b59 r5 = r4.b
            java.lang.Object r5 = r5.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r6 = "premium"
            boolean r5 = r5.getBoolean(r6, r3)
            if (r5 == 0) goto L3a
            b59 r4 = r4.b
            java.lang.Object r4 = r4.get()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.lang.String r5 = "premium_subscription_source"
            java.lang.String r4 = r4.getString(r5, r1)
            java.lang.String r5 = "ofa_free_trial"
            boolean r4 = kotlin.jvm.internal.Intrinsics.a(r4, r5)
            if (r4 == 0) goto L3b
        L3a:
            r2 = r3
        L3b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L40:
            cv6 r4 = bb7.a
            d7a r4 = s6d.a
            d7a r4 = r4.e
            ty7 r0 = new ty7
            r0.<init>(r5, r1, r2)
            java.lang.Object r4 = na2.Z(r4, r0, r6)
            return r4
        L50:
            int r4 = defpackage.eif.a
            boolean r4 = kfo.e0(r5)
            if (r4 == 0) goto L68
            int r4 = com.opera.android.vpn.app_widget.VpnProAppWidget.b
            java.lang.Class<com.opera.android.vpn.app_widget.VpnProAppWidget> r4 = com.opera.android.vpn.app_widget.VpnProAppWidget.class
            java.lang.Integer r4 = kfo.I(r5, r4)
            if (r4 == 0) goto L68
            int r4 = r4.intValue()
            if (r4 > 0) goto L69
        L68:
            r2 = r3
        L69:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L6e:
            int r4 = defpackage.eif.a
            boolean r4 = kfo.e0(r5)
            if (r4 == 0) goto L7c
            boolean r4 = com.opera.android.BrowserAppWidget.e(r5)
            if (r4 != 0) goto L7d
        L7c:
            r2 = r3
        L7d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L82:
            wjh r0 = defpackage.vml.e
            java.lang.Object r0 = r0.d
            jg8 r0 = (jg8) r0
            vr r2 = new vr
            r2.<init>(r4, r5, r1, r3)
            java.lang.Object r4 = na2.Z(r0, r2, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xr.c(android.content.Context, kk6):java.lang.Object");
    }
}
