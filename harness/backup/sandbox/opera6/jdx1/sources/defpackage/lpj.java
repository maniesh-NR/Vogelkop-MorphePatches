package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llpj;", "Lh8e;", "Lnpj;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class lpj extends h8e {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;
    public final Function1 g;

    public lpj(float f, float f2, float f3, float f4, Function1 function1, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true, function1);
    }

    public lpj(float f, float f2, float f3, float f4, boolean z, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpj)) {
            return false;
        }
        lpj lpjVar = (lpj) obj;
        return gh7.b(this.b, lpjVar.b) && gh7.b(this.c, lpjVar.c) && gh7.b(this.d, lpjVar.d) && gh7.b(this.e, lpjVar.e) && this.f == lpjVar.f;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        npj npjVar = new npj();
        npjVar.o = this.b;
        npjVar.p = this.c;
        npjVar.q = this.d;
        npjVar.r = this.e;
        npjVar.s = this.f;
        return npjVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        npj npjVar = (npj) b8eVar;
        npjVar.o = this.b;
        npjVar.p = this.c;
        npjVar.q = this.d;
        npjVar.r = this.e;
        npjVar.s = this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + sko.d(this.e, sko.d(this.d, sko.d(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }
}
