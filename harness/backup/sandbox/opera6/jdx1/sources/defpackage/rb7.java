package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lrb7;", "Lh8e;", "Lsb7;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class rb7 extends h8e {
    public final p12 b;

    public rb7(p12 p12Var) {
        this.b = p12Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rb7) && Intrinsics.a(this.b, ((rb7) obj).b);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        sb7 sb7Var = new sb7();
        sb7Var.o = this.b;
        return sb7Var;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        sb7 sb7Var = (sb7) b8eVar;
        p12 p12Var = sb7Var.o;
        p12 p12Var2 = this.b;
        if (Intrinsics.a(p12Var, p12Var2) || !sb7Var.a.n) {
            return;
        }
        p12 p12Var3 = sb7Var.o;
        p12Var3.t();
        p12Var3.b = null;
        p12Var2.getClass();
        sb7Var.o = p12Var2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.b + ")";
    }
}
