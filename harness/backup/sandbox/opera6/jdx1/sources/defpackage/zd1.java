package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Lzd1;", "S", "Lh8e;", "Lce1;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class zd1<S> extends h8e {
    public final q2m b;
    public final afe c;
    public final de1 d;

    public zd1(q2m q2mVar, afe afeVar, de1 de1Var) {
        this.b = q2mVar;
        this.c = afeVar;
        this.d = de1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zd1)) {
            return false;
        }
        zd1 zd1Var = (zd1) obj;
        return Intrinsics.a(zd1Var.b, this.b) && zd1Var.c.equals(this.c);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new ce1(this.b, this.c, this.d);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        ce1 ce1Var = (ce1) b8eVar;
        ce1Var.p = this.b;
        ce1Var.q = this.c;
        ce1Var.r = this.d;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        q2m q2mVar = this.b;
        return this.c.hashCode() + ((iHashCode + (q2mVar != null ? q2mVar.hashCode() : 0)) * 31);
    }
}
