package com.opera.android.startup;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import defpackage.g7j;
import defpackage.g9k;
import defpackage.mab;

/* loaded from: classes.dex */
public class InstallSplitLocaleActivity extends g9k {
    public static String m;

    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean K(android.content.Context r5) {
        /*
            java.lang.String r0 = wwc.e(r5)
            java.lang.String r1 = com.opera.android.startup.InstallSplitLocaleActivity.m
            r2 = 0
            if (r1 == 0) goto L15
            if (r0 != 0) goto Le
            java.lang.String r3 = ""
            goto Lf
        Le:
            r3 = r0
        Lf:
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L28
        L15:
            java.lang.String r1 = w8h.m(r0)
            r3 = 1
            if (r1 != 0) goto L1e
            r1 = r3
            goto L26
        L1e:
            android.content.res.Resources r4 = r5.getResources()
            boolean r1 = w8h.v(r4, r1)
        L26:
            if (r1 == 0) goto L29
        L28:
            return r2
        L29:
            boolean r1 = w8h.o(r5, r0)
            if (r1 == 0) goto L50
            java.lang.String[] r1 = com.opera.android.OperaApplication.K
            android.content.Context r5 = r5.getApplicationContext()
            com.opera.android.OperaApplication r5 = (com.opera.android.OperaApplication) r5
            d6j r5 = r5.L()
            x5f r5 = r5.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Installed but not active: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 4
            r5.R(r1, r0)
            return r2
        L50:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.opera.android.startup.InstallSplitLocaleActivity.K(android.content.Context):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g9k
    public final void I(int i) {
        kfo.d0(this, vep.A(i) != 2 ? 0 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g9k
    public final void J() {
        String strE = wwc.e(getApplicationContext());
        if (strE == null) {
            strE = "";
        }
        m = strE;
        super.J();
    }

    @Override // defpackage.g9k, defpackage.hjf
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (H()) {
            return;
        }
        setContentView(2131559573);
        if (bundle == null) {
            w supportFragmentManager = getSupportFragmentManager();
            a aVarF = u35.f(supportFragmentManager, supportFragmentManager);
            aVarF.e(2131363025, new mab(), (String) null, 1);
            aVarF.i(true, true);
        }
    }

    @Override // defpackage.hjf
    public final int w() {
        return qbe.A(g7j.h, z(), 12);
    }
}
