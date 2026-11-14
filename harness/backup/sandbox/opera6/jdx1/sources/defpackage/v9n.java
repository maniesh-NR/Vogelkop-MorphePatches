package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class v9n implements View.OnAttachStateChangeListener {
    public ViewTreeObserver a;
    public final /* synthetic */ View b;
    public final /* synthetic */ vt3 c;

    public v9n(View view, vt3 vt3Var) {
        this.b = view;
        this.c = vt3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        this.a = viewTreeObserver;
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalFocusChangeListener(this.c);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.c);
            }
            this.a = null;
        }
    }
}
