package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public final class nn9 extends zm9 {
    public View f;
    public View g;

    @Override // defpackage.zm9
    public final void c() {
        View view = this.f;
        if (view != null) {
            fsp.j(view);
            fsp.j(this.g);
        }
    }

    @Override // defpackage.zm9
    public final void d() {
        this.f = ((Fragment) this.b).getView();
        this.g = ((Fragment) this.c).getView();
        ye1.a(this.f, false);
        ye1.a(this.g, true).withEndAction(new vl9(this, (byte) 1));
    }
}
