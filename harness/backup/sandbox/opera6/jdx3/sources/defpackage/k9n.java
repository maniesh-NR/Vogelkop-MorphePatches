package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class k9n implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ View a;

    public k9n(View view) {
        this.a = view;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        View view = this.a;
        view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        if (z) {
            q9n.H(view);
        }
    }
}
