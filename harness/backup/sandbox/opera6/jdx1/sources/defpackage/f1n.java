package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf1n;", "Lh8e;", "Lh1n;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class f1n extends h8e {
    public final b3m b;
    public final q2m c;
    public final x48 d;
    public final vh8 e;
    public final ndj f;

    public f1n(b3m b3mVar, q2m q2mVar, x48 x48Var, vh8 vh8Var, ndj ndjVar) {
        this.b = b3mVar;
        this.c = q2mVar;
        this.d = x48Var;
        this.e = vh8Var;
        this.f = ndjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1n) {
            f1n f1nVar = (f1n) obj;
            return this.b == f1nVar.b && Intrinsics.a(this.c, f1nVar.c) && this.d.equals(f1nVar.d) && Intrinsics.a(this.e, f1nVar.e) && this.f == f1nVar.f;
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        h1n h1nVar = new h1n();
        h1nVar.o = this.c;
        h1nVar.p = this.d;
        h1nVar.q = this.e;
        h1nVar.r = this.f;
        return h1nVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        h1n h1nVar = (h1n) b8eVar;
        h1nVar.getClass();
        h1nVar.o = this.c;
        h1nVar.p = this.d;
        h1nVar.q = this.e;
        h1nVar.r = this.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.a.hashCode() + ((this.d.a.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.b + ", veilAnimation=" + this.c + ", enter=" + this.d + ", exit=" + this.e + ", mutableTransformState=" + this.f + ")";
    }
}
