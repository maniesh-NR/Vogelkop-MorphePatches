package com.opera.ad.interstitial;

import android.app.Activity;
import android.content.Intent;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import defpackage.ioo;
import defpackage.n1;

/* loaded from: classes.dex */
public final class AdActivity extends Activity {
    public static ox b;
    public static ioo c;
    public n1 a;

    public static void a(AdActivity adActivity, Intent intent) {
        if (b != null) {
            String[] strArr = OperaApplication.K;
            if (rm5.z(adActivity, intent, new hda((Object) null, adActivity, (byte) 18))) {
                adActivity.finish();
            } else if ("android.intent.action.VIEW".equals(intent.getAction())) {
                intent.putExtra("com.android.browser.application_id", adActivity.getPackageName());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(ioo iooVar, BrowserActivity browserActivity) {
        if (c != null) {
            return;
        }
        c = iooVar;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setClass(browserActivity, AdActivity.class);
        browserActivity.startActivity(intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        if (this.a != null) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            ioo r4 = com.opera.ad.interstitial.AdActivity.c
            if (r4 == 0) goto L83
            boolean r0 = r4 instanceof defpackage.koo
            r1 = 1
            if (r0 == 0) goto L17
            qjo r0 = new qjo
            koo r4 = (defpackage.koo) r4
            r2 = 2
            r0.<init>(r3, r4, r2)
        L14:
            r3.a = r0
            goto L3b
        L17:
            boolean r0 = r4 instanceof defpackage.joo
            if (r0 == 0) goto L24
            qjo r0 = new qjo
            joo r4 = (defpackage.joo) r4
            r2 = 0
            r0.<init>(r3, r4, r2)
            goto L14
        L24:
            boolean r0 = r4 instanceof defpackage.lro
            if (r0 == 0) goto L3b
            lro r4 = (defpackage.lro) r4
            boolean r0 = r4.z
            if (r0 == 0) goto L34
            qjo r0 = new qjo
            r0.<init>(r3, r4, r1)
            goto L39
        L34:
            rjo r0 = new rjo
            r0.<init>(r3, r4)
        L39:
            r3.a = r0
        L3b:
            r3.requestWindowFeature(r1)
            android.app.ActionBar r4 = r3.getActionBar()
            if (r4 == 0) goto L47
            r4.hide()
        L47:
            android.view.Window r4 = r3.getWindow()
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            oji r1 = new oji
            r1.<init>(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r0 < r2) goto L64
            j3o r0 = new j3o
            r0.<init>(r4, r1)
            goto L73
        L64:
            r2 = 30
            if (r0 < r2) goto L6e
            i3o r0 = new i3o
            r0.<init>(r4, r1)
            goto L73
        L6e:
            h3o r0 = new h3o
            r0.<init>(r4, r1)
        L73:
            r4 = 519(0x207, float:7.27E-43)
            r0.p(r4)
            r0.x()
            n1 r3 = r3.a
            if (r3 == 0) goto L82
            r3.R()
        L82:
            return
        L83:
            r3.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.ad.interstitial.AdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        n1 n1Var = this.a;
        if (n1Var != null) {
            n1Var.X();
        }
        if (c != null) {
            c = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        n1 n1Var = this.a;
        if (n1Var != null) {
            n1Var.c0();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        n1 n1Var = this.a;
        if (n1Var != null) {
            n1Var.e0();
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        a(this, intent);
        try {
            if (isFinishing()) {
                return;
            }
            super.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
