package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class tw8 extends gph {
    public final ow8 a;
    public final RecyclerView b;
    public boolean c;
    public bn7 d;

    public tw8(ow8 ow8Var, RecyclerView recyclerView) {
        this.a = ow8Var;
        this.b = recyclerView;
    }

    public final void b() {
        j();
    }

    public final void c(int i, int i2) {
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
        if (this.c || this.d != null) {
            return;
        }
        bn7 bn7Var = new bn7(this, (byte) 24);
        this.d = bn7Var;
        this.b.post(bn7Var);
    }
}
