package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e6n extends lim implements ViewTreeObserver.OnGlobalFocusChangeListener, ViewTreeObserver.OnWindowFocusChangeListener {
    public final Window a;
    public final View b;
    public final pad c;
    public final y1n d = new y1n(this, (byte) 6);
    public WeakReference e;
    public boolean f;

    public e6n(Window window, View view, pad padVar) {
        this.a = window;
        this.b = view;
        this.c = padVar;
    }

    public final void R() {
        if (this.f) {
            Window window = this.a;
            if (window.getCurrentFocus() == null && window.isActive()) {
                View view = this.b;
                if (view.isAttachedToWindow()) {
                    l24 l24Var = (l24) this.c.c;
                    if (l24Var != null) {
                        l24Var.S();
                        if (window.getCurrentFocus() != null) {
                            return;
                        }
                    }
                    view.requestFocus();
                }
            }
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        View view = this.b;
        view.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        View view = this.b;
        view.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        vml.a(this.d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (view == null || view2 != null || view == this.b) {
            return;
        }
        vml.c(this.d);
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        View currentFocus;
        this.f = z;
        Window window = this.a;
        if (!z) {
            View currentFocus2 = window.getCurrentFocus();
            if (currentFocus2 == null) {
                this.e = null;
                return;
            } else {
                this.e = new WeakReference(currentFocus2);
                return;
            }
        }
        WeakReference weakReference = this.e;
        View view = weakReference != null ? (View) weakReference.get() : null;
        this.e = null;
        if (view != null && view.isAttachedToWindow() && (((currentFocus = window.getCurrentFocus()) != null && (view instanceof ViewGroup) && q9n.w((ViewGroup) view, currentFocus)) || view.requestFocus())) {
            return;
        }
        R();
    }
}
