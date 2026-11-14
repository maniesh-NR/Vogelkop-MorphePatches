package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class bdd implements OnBackAnimationCallback {
    public final /* synthetic */ zcd a;
    public final /* synthetic */ cdd b;

    public bdd(cdd cddVar, zcd zcdVar) {
        this.b = cddVar;
        this.a = zcdVar;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.b();
        }
    }

    public final void onBackInvoked() {
        this.a.c();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.d(new jz2(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.a(new jz2(backEvent));
        }
    }
}
