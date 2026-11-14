package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class gyf implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public final vdf b;
    public boolean c;

    public gyf(View view, long j) {
        vdf vdfVar = new vdf(this, (byte) 11);
        this.b = vdfVar;
        this.a = view;
        view.getViewTreeObserver().addOnPreDrawListener(this);
        view.addOnAttachStateChangeListener(this);
        view.postDelayed(vdfVar, j);
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        view.removeCallbacks(this.b);
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
}
