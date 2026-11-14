package com.opera.android.vpn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.opera.android.OperaApplication;
import defpackage.ot0;
import defpackage.qq8;
import defpackage.x5f;
import defpackage.ydn;

/* loaded from: classes.dex */
public class VpnReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    public static Intent a(Context context) {
        return new Intent("com.opera.android.VPN_RESUME").setClass(context, VpnReceiver.class).setPackage(context.getPackageName()).putExtra("com.opera.android.EXTRA_VPN_EVENT_ORIGIN", 0);
    }

    public static Intent b(Context context, boolean z) {
        return new Intent(z ? "com.opera.android.VPN_PRO_ENABLE" : "com.opera.android.VPN_PRO_DISABLE").setClass(context, VpnReceiver.class).setPackage(context.getPackageName()).putExtra("com.opera.android.EXTRA_VPN_EVENT_ORIGIN", 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(defpackage.x5f r7, defpackage.ot0 r8, java.lang.String r9) {
        /*
            r9.getClass()
            int r0 = r9.hashCode()
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r0) {
                case -1825023516: goto L41;
                case -1625487346: goto L37;
                case -1347024737: goto L2d;
                case -1013282858: goto L23;
                case 1312569933: goto L19;
                case 1636408039: goto Lf;
                default: goto Le;
            }
        Le:
            goto L49
        Lf:
            java.lang.String r0 = "com.opera.android.VPN_PRO_ENABLE"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L49
            r9 = 5
            goto L4c
        L19:
            java.lang.String r0 = "com.opera.android.VPN_PAUSE_5_MIN"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L49
            r9 = 4
            goto L4c
        L23:
            java.lang.String r0 = "com.opera.android.VPN_RETRY"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L49
            r9 = 3
            goto L4c
        L2d:
            java.lang.String r0 = "com.opera.android.VPN_RESUME"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L49
            r9 = r1
            goto L4c
        L37:
            java.lang.String r0 = "com.opera.android.VPN_DISCONNECT"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L49
            r9 = r2
            goto L4c
        L41:
            java.lang.String r0 = "com.opera.android.VPN_PRO_DISABLE"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L4b
        L49:
            r9 = r4
            goto L4c
        L4b:
            r9 = r3
        L4c:
            switch(r9) {
                case 0: goto L5f;
                case 1: goto L5c;
                case 2: goto L59;
                case 3: goto L56;
                case 4: goto L53;
                case 5: goto L50;
                default: goto L4f;
            }
        L4f:
            goto L65
        L50:
            nt0 r9 = defpackage.nt0.b
            goto L61
        L53:
            nt0 r9 = defpackage.nt0.e
            goto L61
        L56:
            nt0 r9 = defpackage.nt0.g
            goto L61
        L59:
            nt0 r9 = defpackage.nt0.d
            goto L61
        L5c:
            nt0 r9 = defpackage.nt0.f
            goto L61
        L5f:
            nt0 r9 = defpackage.nt0.c
        L61:
            boolean r0 = r7.h
            if (r0 != 0) goto L66
        L65:
            return
        L66:
            zpa r0 = r7.d
            mt0 r5 = new mt0
            r6 = 2443(0x98b, float:3.423E-42)
            r5.<init>(r6, r4, r1)
            r5.q(r3, r2, r8)
            r5.q(r2, r2, r9)
            x56 r8 = defpackage.zpa.F()
            qd0 r9 = r8.B(r0)
            r0 = 46
            java.lang.Object r1 = r9.n(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L93
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L93
            hf0 r2 = new hf0
            r2.<init>(r9, r0, r1)
            goto L9c
        L93:
            java.util.ArrayList r1 = vep.t(r9, r0, r2)
            hf0 r2 = new hf0
            r2.<init>(r9, r0, r1)
        L9c:
            r2.add(r5)
            r7.U0(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.vpn.VpnReceiver.c(x5f, ot0, java.lang.String):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ot0 ot0Var;
        if (sfe.g0(context)) {
            return;
        }
        String[] strArr = OperaApplication.K;
        ydn ydnVarR = ((OperaApplication) context.getApplicationContext()).R();
        VpnFailedToConnectService.c.c0(context);
        if ("com.opera.android.VPN_PRO_ENABLE".equals(intent.getAction()) || "com.opera.android.VPN_PRO_DISABLE".equals(intent.getAction())) {
            if (!ydnVarR.c.isEnabled()) {
                return;
            } else {
                ydnVarR.C("com.opera.android.VPN_PRO_ENABLE".equals(intent.getAction()));
            }
        } else if ("com.opera.android.VPN_PAUSE_5_MIN".equals(intent.getAction())) {
            if (!ydnVarR.f.g()) {
                qq8 qq8Var = ydnVarR.f;
                qq8Var.getClass();
                qq8Var.n(SystemClock.elapsedRealtime() + 300000);
                ((ydn) qq8Var.c).D(false);
            }
        } else if ("com.opera.android.VPN_DISCONNECT".equals(intent.getAction())) {
            ydnVarR.C(false);
        } else if ("com.opera.android.VPN_RETRY".equals(intent.getAction())) {
            ydnVarR.B();
        } else {
            qq8 qq8Var2 = ydnVarR.f;
            qq8Var2.n(0L);
            ((ydn) qq8Var2.c).D(true);
        }
        try {
            x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().c;
            int intExtra = intent.getIntExtra("com.opera.android.EXTRA_VPN_EVENT_ORIGIN", -1);
            if (intExtra == 0) {
                ot0Var = ot0.b;
            } else {
                if (intExtra != 1) {
                    throw new IllegalArgumentException();
                }
                ot0Var = ot0.c;
            }
            c(x5fVar, ot0Var, intent.getAction());
        } catch (IllegalArgumentException unused) {
        }
    }
}
