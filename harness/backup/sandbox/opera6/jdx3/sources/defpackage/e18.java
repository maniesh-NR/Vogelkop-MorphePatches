package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Toast;

/* loaded from: classes.dex */
public final class e18 implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final sxh a;
    public View b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public e18(View view, sxh sxhVar) {
        this.a = sxhVar;
        this.c = view.hasWindowFocus();
        this.b = view;
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this);
    }

    public final void a() {
        ViewTreeObserver viewTreeObserver;
        if (!this.d) {
            this.g = true;
            return;
        }
        View view = this.b;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this);
        }
        this.b = null;
    }

    public final void b(boolean z) {
        View view;
        Context context;
        if (this.f || !this.d) {
            return;
        }
        if ((!z && !this.e && this.c) || (view = this.b) == null || (context = view.getContext()) == null) {
            return;
        }
        this.f = true;
        a();
        Toast.makeText(context, this.a.a(context.getResources()), 1).show();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.c = z;
        b(false);
    }
}
