package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class q8n extends k8 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public final View o;
    public final vz5 p;
    public ViewTreeObserver q;

    public q8n(View view) {
        super((byte) 13);
        this.o = view;
        this.p = new vz5(view, (Rect) this.a, new y1n(this, (byte) 8));
    }

    @Override // defpackage.k8
    public final void n0(i21 i21Var) {
        View view = this.o;
        view.addOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.q = viewTreeObserver;
        viewTreeObserver.addOnGlobalLayoutListener(this);
        this.q.addOnPreDrawListener(this);
        this.p.d(false);
        super.n0(i21Var);
    }

    @Override // defpackage.k8
    public final void o0() {
        this.o.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.q.removeOnGlobalLayoutListener(this);
            this.q.removeOnPreDrawListener(this);
        }
        this.q = null;
        super.o0();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.o.isShown()) {
            return;
        }
        c0();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.o.isShown()) {
            this.p.d(false);
            return true;
        }
        c0();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
