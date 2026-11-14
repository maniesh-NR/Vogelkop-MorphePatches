package com.opera.android.startup;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import defpackage.g7j;
import defpackage.g9k;
import defpackage.hch;
import defpackage.qch;

/* loaded from: classes.dex */
public class PreviousCrashActivity extends g9k implements qch {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g9k
    public final void I(int i) {
        kfo.d0(this, vep.A(i) != 2 ? 0 : 1);
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
            aVarF.e(2131363025, new hch(), (String) null, 1);
            aVarF.i(true, true);
        }
    }

    @Override // defpackage.hjf
    public final int w() {
        return qbe.A(g7j.h, z(), 12);
    }
}
