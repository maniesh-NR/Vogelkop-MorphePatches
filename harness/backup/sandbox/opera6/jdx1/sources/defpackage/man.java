package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class man {
    public final String a;
    public final e3a b;
    public final nx5 c;
    public final int d;
    public final Object e;
    public boolean f;
    public han g;
    public final jdj h;
    public final f99 i;
    public kf4 j;
    public d3k k;
    public qfe l;

    public man(String str, e3a e3aVar, nx5 nx5Var) {
        this.a = str;
        this.b = e3aVar;
        this.c = nx5Var;
        bf2 bf2Var = lan.a;
        bf2Var.getClass();
        this.d = bf2.b.incrementAndGet(bf2Var);
        this.e = new Object();
        jdj jdjVarC = ipe.c(1, 3, (h04) null, 4);
        this.h = jdjVarC;
        this.i = qbe.t(jdjVarC);
        vf4 vf4Var = vf4.a;
        this.j = vf4Var;
        if (jdjVarC.i(vf4Var)) {
            return;
        }
        qp2.n("Check failed.");
        throw null;
    }

    public final void a(yc4 yc4Var) {
        kf4 kf4Var;
        synchronized (this.e) {
            if (!this.f) {
                this.f = true;
                toString();
                han hanVar = this.g;
                if (hanVar != null) {
                    synchronized (hanVar.b) {
                        hanVar.c = true;
                    }
                }
                d3k d3kVar = this.k;
                if (d3kVar != null) {
                    d3kVar.k((CancellationException) null);
                }
                qfe qfeVar = this.l;
                if (qfeVar != null) {
                    qfeVar.b();
                }
                synchronized (this.e) {
                    kf4Var = this.j;
                }
                if (!(kf4Var instanceof nf4)) {
                    if (!(kf4Var instanceof of4)) {
                        b(new of4(null));
                    }
                    b(new nf4(this.a, k65.b, null, null, null, null, null, null, yc4Var));
                }
            }
        }
    }

    public final void b(kf4 kf4Var) {
        this.j = kf4Var;
        if (this.h.i(kf4Var)) {
            return;
        }
        throw new IllegalStateException(("Failed to emit " + kf4Var + " in " + this).toString());
    }

    public final String toString() {
        return "VirtualCamera-" + this.d;
    }
}
