package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class l8n {
    public final WeakReference a;

    public l8n(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(o8n o8nVar) {
        View view = (View) this.a.get();
        if (view != null) {
            if (o8nVar != null) {
                view.animate().setListener(new al9(o8nVar, view, (byte) 5));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
