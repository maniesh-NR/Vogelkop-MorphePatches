package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;

/* loaded from: classes.dex */
public final class u93 extends gph {
    public final ViewGroup a;
    public final RecyclerView b;
    public final Object c;
    public final LinearLayoutManager d;
    public d e;
    public final /* synthetic */ y93 f;

    public u93(y93 y93Var, ViewGroup viewGroup, RecyclerView recyclerView, Object obj, LinearLayoutManager linearLayoutManager) {
        this.f = y93Var;
        this.a = viewGroup;
        this.b = recyclerView;
        this.c = obj;
        this.d = linearLayoutManager;
    }

    public final void b() {
        r8a r8aVar = (r8a) this.b.X(0);
        r8aVar.b = this.f.I0(this.c);
        r8aVar.e = null;
        r8aVar.a.a0();
    }

    public final void c(int i, int i2) {
        b();
    }

    public final void f(int i, int i2) {
        b();
    }

    public final void g(int i, int i2) {
        b();
    }

    public final void h(int i, int i2) {
        b();
    }
}
