package defpackage;

import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class wdh extends gph implements Runnable, ile {
    public boolean a;
    public final /* synthetic */ cy b;

    public wdh(cy cyVar) {
        this.b = cyVar;
    }

    public final void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        j();
    }

    public final void b() {
        j();
    }

    public final void c(int i, int i2) {
        j();
    }

    public final void e(int i, int i2, Object obj) {
        j();
    }

    public final void f(int i, int i2) {
        j();
    }

    public final void g(int i, int i2) {
        j();
    }

    public final void h(int i, int i2) {
        j();
    }

    public final void j() {
        if (!this.b.a || this.a) {
            return;
        }
        this.a = true;
        vml.c(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a = false;
        cy cyVar = this.b;
        RecyclerView recyclerView = (RecyclerView) cyVar.g;
        if (recyclerView == null) {
            return;
        }
        ((xdh) cyVar.d).d(recyclerView);
    }
}
