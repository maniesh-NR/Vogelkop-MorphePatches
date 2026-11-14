package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class sx7 {
    public volatile g77 a;
    public volatile cyd b;
    public final xx7 c;
    public final boolean d;

    public sx7(xx7 xx7Var) {
        this.c = xx7Var;
        this.d = Build.VERSION.SDK_INT >= 35;
    }

    public final void a() {
        boolean z = this.d;
        xx7 xx7Var = this.c;
        if (z) {
            xx7Var.i();
            return;
        }
        try {
            xx7Var.e.a(new rx7(this));
        } catch (Throwable th) {
            xx7Var.h(th);
        }
    }
}
