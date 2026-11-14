package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class ban implements View.OnLayoutChangeListener, View.OnAttachStateChangeListener {
    public final View a;
    public final y9n b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;

    public ban(View view, boolean z, y9n y9nVar) {
        this.a = view;
        this.e = z;
        this.b = y9nVar;
        view.addOnLayoutChangeListener(this);
        view.addOnAttachStateChangeListener(this);
        boolean zIsLaidOut = view.isLaidOut();
        if (this.c != zIsLaidOut) {
            this.c = zIsLaidOut;
            a();
        }
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        if (this.d == zIsAttachedToWindow) {
            return;
        }
        this.d = zIsAttachedToWindow;
        a();
    }

    public final void a() {
        boolean z = this.e;
        View view = this.a;
        int iWidth = 0;
        if (z && ((this.c || view.getWidth() > 0 || view.getHeight() > 0) && this.d)) {
            int height = view.getHeight();
            int width = view.getWidth();
            if (height == 0 || width == 0) {
                Rect rect = can.c;
                rect.set(0, 0, Math.max(1, width), Math.max(1, height));
                ViewParent parent = view.getParent();
                if (parent != null && parent.getChildVisibleRect(view, rect, null) && !rect.isEmpty()) {
                    iWidth = 100;
                }
            } else {
                Rect rect2 = can.c;
                if (view.getGlobalVisibleRect(rect2)) {
                    iWidth = ((rect2.width() * rect2.height()) * 100) / (height * width);
                }
            }
        }
        int i = this.f;
        if (i == iWidth) {
            return;
        }
        this.f = iWidth;
        this.b.T(view, iWidth, i);
        Rect rect3 = can.c;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.c) {
            return;
        }
        this.c = true;
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.d) {
            return;
        }
        this.d = true;
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.d) {
            this.d = false;
            a();
        }
    }
}
