package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class ga7 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener {
    public final View a;

    public ga7(View view) {
        this.a = view;
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        View view3 = this.a;
        if (view2 == view3) {
            q9n.u(view3);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
