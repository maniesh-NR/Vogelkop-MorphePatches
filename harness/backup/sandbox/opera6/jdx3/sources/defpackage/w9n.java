package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class w9n implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public final View a;
    public final x9n b;
    public int c = a();
    public final Rect d = new Rect();
    public boolean e;

    public w9n(View view, x9n x9nVar) {
        this.a = view;
        this.b = x9nVar;
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            onViewAttachedToWindow(view);
        }
        view.addOnLayoutChangeListener(this);
    }

    public final int a() {
        View view = this.a;
        if (!view.isAttachedToWindow() || !dbh.B(view)) {
            return 0;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        if (width <= 0 || height <= 0) {
            return 0;
        }
        Rect rect = this.d;
        if (!view.getGlobalVisibleRect(rect)) {
            return 0;
        }
        return ((rect.width() * rect.height()) * 100) / (height * width);
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.post(new y1n(this, (byte) 9));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        b();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2 = this.a;
        view2.getViewTreeObserver().addOnGlobalLayoutListener(this);
        view2.getViewTreeObserver().addOnScrollChangedListener(this);
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2 = this.a;
        view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        view2.getViewTreeObserver().removeOnScrollChangedListener(this);
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b.a(0);
    }
}
