package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzfl;", "Lh8e;", "Lagl;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class zfl extends h8e {
    public final jvg b;
    public final t78 c;
    public final xhl d;
    public final qw5 e;

    public zfl(jvg jvgVar, t78 t78Var, xhl xhlVar, qw5 qw5Var) {
        this.b = jvgVar;
        this.c = t78Var;
        this.d = xhlVar;
        this.e = qw5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfl)) {
            return false;
        }
        zfl zflVar = (zfl) obj;
        return this.b == zflVar.b && this.c == zflVar.c && this.d == zflVar.d && this.e == zflVar.e;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new agl(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        agl aglVar = (agl) b8eVar;
        aglVar.q.b = null;
        jvg jvgVar = this.b;
        aglVar.q = jvgVar;
        jvgVar.b = aglVar;
        jvgVar.c = aglVar.n ? mtl.c : mtl.b;
        aglVar.r = this.c;
        aglVar.s = this.d;
        aglVar.t = this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
    }
}
