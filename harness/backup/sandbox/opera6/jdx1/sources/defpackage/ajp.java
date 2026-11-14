package defpackage;

import ads_mobile_sdk.m6;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class ajp implements ViewTreeObserver.OnWindowFocusChangeListener {
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        w5p.a();
        m6 m6Var = m6.d;
        boolean zA = m6Var.a();
        if (m6Var.c != zA) {
            m6Var.c = zA;
            if (m6Var.b) {
                m6Var.a(zA);
                vzo vzoVar = (vzo) m6Var.e;
                if (vzoVar != null) {
                    vzoVar.a(zA);
                }
            }
        }
    }
}
