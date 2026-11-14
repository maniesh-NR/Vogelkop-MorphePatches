package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class rw8 {
    public final u82 a;
    public final ow8 b;
    public final i82 c;
    public final eq6 d;
    public boolean e;

    public rw8(u82 u82Var, ow8 ow8Var, i82 i82Var, eq6 eq6Var) {
        this.a = u82Var;
        this.b = ow8Var;
        this.c = i82Var;
        this.d = eq6Var;
    }

    public final void a(List list) {
        xw8 xw8Var = (xw8) this.d.a;
        this.e = true;
        if (list.isEmpty()) {
            xw8Var.j.e(xw8Var.l, null, xw8Var.k);
        }
        g95 g95VarB = b(list);
        ww8 ww8Var = xw8Var.x;
        ww8Var.b.c = g95VarB;
        ww8Var.a(true);
    }

    public final g95 b(List list) {
        return new g95(nb6.W(new qw8(this.c, (byte) 0), list), bsg.b);
    }
}
