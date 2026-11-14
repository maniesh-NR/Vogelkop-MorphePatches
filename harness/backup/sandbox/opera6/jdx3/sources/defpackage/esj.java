package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class esj implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener, Runnable {
    public final View a;

    public esj(View view) {
        this.a = view;
        view.getViewTreeObserver().addOnPreDrawListener(this);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        view.addOnAttachStateChangeListener(this);
        view.postDelayed(this, 30L);
    }

    public final void a() {
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view.removeOnAttachStateChangeListener(this);
        view.removeCallbacks(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        a();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
    }
}
