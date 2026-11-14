package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class amd extends gph implements Runnable {
    public final View a;
    public final /* synthetic */ i4d b;

    public amd(i4d i4dVar, View view) {
        this.b = i4dVar;
        this.a = view;
        ((zld) i4dVar.b).registerAdapterDataObserver(this);
        run();
    }

    public final void b() {
        this.a.post(this);
    }

    public final void f(int i, int i2) {
        this.a.post(this);
    }

    public final void h(int i, int i2) {
        this.a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setVisibility(((zld) this.b.b).h.size() > 1 ? 4 : 0);
    }
}
