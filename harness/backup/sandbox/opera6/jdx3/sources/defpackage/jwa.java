package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class jwa {
    public final long a;
    public int d;
    public final pde b = new pde(null);
    public List c = l08.a;
    public final ld9 e = new ld9(this, (byte) 23);

    public jwa(kze kzeVar, long j) {
        this.a = j;
        kzeVar.k(new iwa(new nna(this, (byte) 5), (byte) 0));
    }

    public final void a() {
        hwa hwaVar;
        if (this.c.isEmpty()) {
            hwaVar = null;
        } else {
            List list = this.c;
            hwaVar = (hwa) list.get(this.d % list.size());
        }
        xf8.F0(this.b, hwaVar);
    }

    public final void b() {
        ld9 ld9Var = this.e;
        vml.a(ld9Var);
        if (this.c.size() > 1) {
            vml.d(ld9Var, pn7.f(this.a));
        }
    }
}
