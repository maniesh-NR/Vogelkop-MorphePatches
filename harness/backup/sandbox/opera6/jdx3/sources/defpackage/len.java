package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class len implements qe7, tdn {
    public final rf7 a;
    public final ydn b;
    public final umi c;
    public final HashSet d = new HashSet();
    public boolean e;
    public boolean f;

    public len(umi umiVar, ydn ydnVar, rf7 rf7Var) {
        this.c = umiVar;
        this.b = ydnVar;
        this.a = rf7Var;
        ydnVar.F(this);
        boolean z = false;
        if (ydnVar.c.isEnabled() && ydnVar.d.a && ydnVar.m() == 2) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.tdn
    public final void C() {
        f();
    }

    @Override // defpackage.qe7
    public final void a(re7 re7Var) {
        int i;
        int iA = vep.A(re7Var.f);
        if (iA != 0) {
            if (iA == 2 && ((i = re7Var.g) == 17 || i == 15)) {
                this.d.add(Long.valueOf(re7Var.o));
                g();
            }
            re7Var.t(this);
        }
    }

    @Override // defpackage.qe7
    public final void b(re7 re7Var) {
        re7Var.t(this);
    }

    @Override // defpackage.qe7
    public final void c(re7 re7Var) {
    }

    @Override // defpackage.qe7
    public final void e(re7 re7Var) {
        re7Var.t(this);
    }

    public final void f() {
        boolean zM;
        boolean z = this.f;
        ydn ydnVar = this.b;
        if (!ydnVar.c.isEnabled() || !ydnVar.d.a) {
            z = false;
        } else if (ydnVar.m() == 2) {
            z = true;
        }
        if (z != this.f) {
            this.f = z;
            if (z) {
                for (re7 re7Var : Collections.unmodifiableList(this.a.c)) {
                    boolean z2 = re7Var.n;
                    long j = re7Var.o;
                    if (z2) {
                        Long lValueOf = Long.valueOf(j);
                        HashSet hashSet = this.d;
                        if (!hashSet.contains(lValueOf) && ((zM = re7Var.m()) || re7Var.f == 2)) {
                            re7Var.t.cancel();
                            if (zM) {
                                hashSet.add(Long.valueOf(j));
                            }
                        }
                    }
                }
                g();
            }
        }
    }

    public final void g() {
        if (this.e || this.d.isEmpty()) {
            return;
        }
        this.e = true;
        new oml(this.c.d(new y1n(this, (byte) 15))).b(null, 100L, TimeUnit.MILLISECONDS, null);
    }

    @Override // defpackage.tdn
    public final void s() {
        f();
    }

    @Override // defpackage.tdn
    public final void t() {
        f();
    }
}
