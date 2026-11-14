package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ir4 extends e3m {
    public boolean a = false;
    public final ViewGroup b;

    public ir4(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void a() {
        this.b.suppressLayout(false);
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void c() {
        this.b.suppressLayout(true);
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void d(y2m y2mVar) {
        this.b.suppressLayout(false);
        this.a = true;
    }

    @Override // defpackage.e3m, defpackage.x2m
    public final void e(y2m y2mVar) {
        if (!this.a) {
            this.b.suppressLayout(false);
        }
        y2mVar.C(this);
    }
}
