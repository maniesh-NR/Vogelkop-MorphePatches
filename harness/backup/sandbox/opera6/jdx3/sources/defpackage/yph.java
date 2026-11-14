package defpackage;

import com.opera.android.widget.RecyclerViewEmptyViewSwitcher;

/* loaded from: classes.dex */
public abstract class yph extends gph {
    public final RecyclerViewEmptyViewSwitcher a;

    public yph(RecyclerViewEmptyViewSwitcher recyclerViewEmptyViewSwitcher) {
        this.a = recyclerViewEmptyViewSwitcher;
    }

    public final void b() {
        j();
    }

    public final void f(int i, int i2) {
        if (i > 0) {
            return;
        }
        j();
    }

    public final void h(int i, int i2) {
        if (i > 0) {
            return;
        }
        j();
    }

    public void j() {
        this.a.b();
    }
}
