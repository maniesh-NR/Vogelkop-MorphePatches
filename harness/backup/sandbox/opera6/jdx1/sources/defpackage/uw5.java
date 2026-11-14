package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luw5;", "Lh8e;", "Lxw5;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class uw5 extends h8e {
    public final j2m b;
    public final mil c;
    public final gbc d;
    public final boolean e;
    public final boolean f;
    public final i9f g;
    public final dil h;
    public final k0b i;
    public final kg9 j;

    public uw5(j2m j2mVar, mil milVar, gbc gbcVar, boolean z, boolean z2, i9f i9fVar, dil dilVar, k0b k0bVar, kg9 kg9Var) {
        this.b = j2mVar;
        this.c = milVar;
        this.d = gbcVar;
        this.e = z;
        this.f = z2;
        this.g = i9fVar;
        this.h = dilVar;
        this.i = k0bVar;
        this.j = kg9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uw5) {
            uw5 uw5Var = (uw5) obj;
            if (this.b.equals(uw5Var.b) && this.c.equals(uw5Var.c) && this.d == uw5Var.d && this.e == uw5Var.e && this.f == uw5Var.f && this.g.equals(uw5Var.g) && this.h == uw5Var.h && Intrinsics.a(this.i, uw5Var.i) && Intrinsics.a(this.j, uw5Var.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        xw5 xw5Var = new xw5();
        xw5Var.q = this.b;
        xw5Var.r = this.c;
        xw5Var.s = this.d;
        xw5Var.t = this.e;
        xw5Var.u = this.f;
        xw5Var.v = this.g;
        dil dilVar = this.h;
        xw5Var.w = dilVar;
        xw5Var.x = this.i;
        xw5Var.y = this.j;
        dilVar.f = new vw5(xw5Var, (byte) 4);
        return xw5Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        xw5 xw5Var = (xw5) b8eVar;
        boolean z = xw5Var.u;
        byte b = 0;
        boolean z2 = z && !xw5Var.t;
        k0b k0bVar = xw5Var.x;
        dil dilVar = xw5Var.w;
        boolean z3 = this.e;
        boolean z4 = this.f;
        boolean z5 = z4 && !z3;
        xw5Var.q = this.b;
        mil milVar = this.c;
        xw5Var.r = milVar;
        xw5Var.s = this.d;
        xw5Var.t = z3;
        xw5Var.u = z4;
        xw5Var.v = this.g;
        dil dilVar2 = this.h;
        xw5Var.w = dilVar2;
        k0b k0bVar2 = this.i;
        xw5Var.x = k0bVar2;
        xw5Var.y = this.j;
        if (z4 != z || z5 != z2 || !Intrinsics.a(k0bVar2, k0bVar) || !xjl.c(milVar.b)) {
            aoh.j(xw5Var);
        }
        if (dilVar2 != dilVar) {
            dilVar2.f = new vw5(xw5Var, b);
        }
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((((Boolean.hashCode(this.f) + fki.k((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e)) * 31) + 1237) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.b + ", value=" + this.c + ", state=" + this.d + ", readOnly=" + this.e + ", enabled=" + this.f + ", isPassword=false, offsetMapping=" + this.g + ", manager=" + this.h + ", imeOptions=" + this.i + ", focusRequester=" + this.j + ")";
    }
}
