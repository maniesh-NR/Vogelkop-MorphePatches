package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbk7;", "Lh8e;", "Lfk7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class bk7 extends h8e {
    public static final m57 g = new m57((byte) 14);
    public final gk7 b;
    public final boolean c;
    public final boolean d;
    public final dk7 e;
    public final cr9 f;

    public bk7(gk7 gk7Var, boolean z, boolean z2, dk7 dk7Var, cr9 cr9Var) {
        fsf fsfVar = fsf.a;
        this.b = gk7Var;
        this.c = z;
        this.d = z2;
        this.e = dk7Var;
        this.f = cr9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bk7.class != obj.getClass()) {
            return false;
        }
        bk7 bk7Var = (bk7) obj;
        if (!Intrinsics.a(this.b, bk7Var.b)) {
            return false;
        }
        fsf fsfVar = fsf.a;
        return this.c == bk7Var.c && this.d == bk7Var.d && Intrinsics.a(this.e, bk7Var.e) && Intrinsics.a(this.f, bk7Var.f);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        fk7 fk7Var = new fk7(g, this.c, null, fsf.a);
        fk7Var.J = this.b;
        fk7Var.K = this.d;
        fk7Var.L = this.e;
        fk7Var.M = this.f;
        return fk7Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        boolean z;
        fk7 fk7Var = (fk7) b8eVar;
        fsf fsfVar = fsf.a;
        gk7 gk7Var = fk7Var.J;
        gk7 gk7Var2 = this.b;
        if (Intrinsics.a(gk7Var, gk7Var2)) {
            z = false;
        } else {
            fk7Var.J = gk7Var2;
            z = true;
        }
        boolean z2 = z;
        fk7Var.L = this.e;
        fk7Var.M = this.f;
        fk7Var.K = this.d;
        fk7Var.n1(g, this.c, null, fsfVar, z2);
    }

    public final int hashCode() {
        return ((this.f.hashCode() + ((this.e.hashCode() + fki.k(fki.k((fsf.a.hashCode() + (this.b.hashCode() * 31)) * 31, 961, this.c), 31, this.d)) * 31)) * 31) + 1237;
    }
}
