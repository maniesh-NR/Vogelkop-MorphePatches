package defpackage;

import android.view.ViewTreeObserver;
import android.view.Window;

/* loaded from: classes.dex */
public final class b2o extends ekc implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final vx l;

    public b2o(vx vxVar) {
        this.l = vxVar;
    }

    public final void l() {
        ((Window) this.l.get()).getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(this);
    }

    public final void m() {
        ((Window) this.l.get()).getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        r(Boolean.valueOf(z));
    }
}
