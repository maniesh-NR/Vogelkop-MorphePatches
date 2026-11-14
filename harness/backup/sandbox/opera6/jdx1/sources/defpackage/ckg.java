package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class ckg {
    public final bkg a;
    public final zi8 b;
    public short c;
    public Object d;
    public final Looper e;
    public boolean f;

    public ckg(zi8 zi8Var, bkg bkgVar, gql gqlVar, int i, Looper looper) {
        this.b = zi8Var;
        this.a = bkgVar;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        z4o.H(!this.f);
        this.f = true;
        zi8 zi8Var = this.b;
        if (!zi8Var.G && zi8Var.j.getThread().isAlive()) {
            zi8Var.h.a(14, this).b();
        } else {
            w7d.K("Ignoring messages sent after release.");
            a(false);
        }
    }
}
