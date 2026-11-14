package defpackage;

import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class mtk extends g07 {
    public final o94 m;
    public final l94 n;
    public g07 o;
    public vtk p;

    public mtk(int i, Size size) {
        super(i, size);
        l94 l94Var = new l94();
        l94Var.c = new byh();
        o94 o94Var = new o94(l94Var);
        l94Var.b = o94Var;
        l94Var.a = vep.class;
        try {
            this.n = l94Var;
            l94Var.a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            o94Var.a(e);
        }
        this.m = o94Var;
    }

    @Override // defpackage.g07
    public final void a() {
        super.a();
        xug.q(new jtk(this, (byte) 2));
    }

    @Override // defpackage.g07
    public final ListenableFuture e() {
        return this.m;
    }

    public final boolean f(g07 g07Var, Runnable runnable) {
        boolean z;
        Size size = this.h;
        xug.i();
        g07Var.getClass();
        int i = g07Var.i;
        Size size2 = g07Var.h;
        g07 g07Var2 = this.o;
        if (g07Var2 == g07Var) {
            return false;
        }
        jpo.n("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", g07Var2 == null);
        jpo.i("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i2 = this.i;
        jpo.i(fki.o(i2, i, "The provider's format(", ") must match the parent(", ")"), i2 == i);
        synchronized (this.a) {
            z = this.c;
        }
        jpo.n("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.o = g07Var;
        k1g.Y(g07Var.c(), this.n);
        g07Var.d();
        k1g.O(this.e).addListener(new e07(g07Var), n97.a());
        k1g.O(g07Var.g).addListener(runnable, x7d.l());
        return true;
    }
}
