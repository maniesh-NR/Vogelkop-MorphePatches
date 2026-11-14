package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfo3;", "Lh8e;", "Leo3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class fo3 extends h8e {
    public final float b;
    public final nvj c;
    public final paj d;

    public fo3(float f, nvj nvjVar, paj pajVar) {
        this.b = f;
        this.c = nvjVar;
        this.d = pajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo3)) {
            return false;
        }
        fo3 fo3Var = (fo3) obj;
        return gh7.b(this.b, fo3Var.b) && this.c.equals(fo3Var.c) && Intrinsics.a(this.d, fo3Var.d);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new eo3(this.b, this.c, this.d);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        eo3 eo3Var = (eo3) b8eVar;
        float f = eo3Var.r;
        f74 f74Var = eo3Var.u;
        float f2 = this.b;
        if (!gh7.b(f, f2)) {
            eo3Var.r = f2;
            f74Var.T0();
        }
        nvj nvjVar = eo3Var.s;
        nvj nvjVar2 = this.c;
        if (!Intrinsics.a(nvjVar, nvjVar2)) {
            eo3Var.s = nvjVar2;
            f74Var.T0();
        }
        paj pajVar = eo3Var.t;
        paj pajVar2 = this.d;
        if (Intrinsics.a(pajVar, pajVar2)) {
            return;
        }
        eo3Var.t = pajVar2;
        f74Var.T0();
        aoh.j(eo3Var);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + gh7.c(this.b) + ", brush=" + this.c + ", shape=" + this.d + ")";
    }
}
