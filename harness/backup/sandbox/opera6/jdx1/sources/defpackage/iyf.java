package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Liyf;", "Lh8e;", "Ljyf;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class iyf extends h8e {
    public final hyf b;
    public final td3 c;
    public final kr5 d;
    public final float e;
    public final kh3 f;

    public iyf(hyf hyfVar, td3 td3Var, kr5 kr5Var, float f, kh3 kh3Var) {
        this.b = hyfVar;
        this.c = td3Var;
        this.d = kr5Var;
        this.e = f;
        this.f = kh3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyf)) {
            return false;
        }
        iyf iyfVar = (iyf) obj;
        return Intrinsics.a(this.b, iyfVar.b) && Intrinsics.a(this.c, iyfVar.c) && Intrinsics.a(this.d, iyfVar.d) && Float.compare(this.e, iyfVar.e) == 0 && Intrinsics.a(this.f, iyfVar.f);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        jyf jyfVar = new jyf();
        jyfVar.o = this.b;
        jyfVar.p = true;
        jyfVar.q = this.c;
        jyfVar.r = this.d;
        jyfVar.s = this.e;
        jyfVar.t = this.f;
        return jyfVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        jyf jyfVar = (jyf) b8eVar;
        boolean z = jyfVar.p;
        hyf hyfVar = this.b;
        boolean z2 = (z && bpj.a(jyfVar.o.h(), hyfVar.h())) ? false : true;
        jyfVar.o = hyfVar;
        jyfVar.p = true;
        jyfVar.q = this.c;
        jyfVar.r = this.d;
        jyfVar.s = this.e;
        jyfVar.t = this.f;
        if (z2) {
            nb6.F(jyfVar);
        }
        c26.y(jyfVar);
    }

    public final int hashCode() {
        int iD = sko.d(this.e, (this.d.hashCode() + ((this.c.hashCode() + (((this.b.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
        kh3 kh3Var = this.f;
        return iD + (kh3Var == null ? 0 : kh3Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.b + ", sizeToIntrinsics=true, alignment=" + this.c + ", contentScale=" + this.d + ", alpha=" + this.e + ", colorFilter=" + this.f + ")";
    }
}
