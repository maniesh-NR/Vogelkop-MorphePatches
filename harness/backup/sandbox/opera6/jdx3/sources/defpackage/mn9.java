package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class mn9 extends zm9 {
    public View f;
    public View g;
    public boolean h;
    public final /* synthetic */ s65 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ x65 k;

    public mn9(s65 s65Var, boolean z, x65 x65Var) {
        this.i = s65Var;
        this.j = z;
        this.k = x65Var;
    }

    @Override // defpackage.zm9
    public final void c() {
        this.h = true;
        View view = this.f;
        if (view != null) {
            fsp.j(view);
            fsp.j(this.g);
        }
    }

    @Override // defpackage.zm9
    public final void d() {
        s65 s65Var = this.i;
        if (s65Var != null) {
            s65Var.run(new ld9(this, (byte) 7));
        } else {
            f();
        }
    }

    public final void f() {
        if (this.h) {
            return;
        }
        this.f = ((Fragment) this.b).getView();
        View view = ((Fragment) this.c).getView();
        this.g = view;
        View view2 = this.f;
        if (view2 == null || view == null) {
            b(false);
            return;
        }
        boolean z = this.j;
        ye1.b(view2, view2, null, false, z);
        ye1.b(this.f, this.g, this.k, true, z).withEndAction(new vl9(this, (byte) 1));
    }
}
