package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh6b;", "Lh8e;", "Lj6b;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class h6b extends h8e {
    public final boolean b;
    public final lde c;
    public final sgl d;
    public final paj e;

    public h6b(boolean z, lde ldeVar, sgl sglVar, paj pajVar) {
        this.b = z;
        this.c = ldeVar;
        this.d = sglVar;
        this.e = pajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6b)) {
            return false;
        }
        h6b h6bVar = (h6b) obj;
        return this.b == h6bVar.b && Intrinsics.a(this.c, h6bVar.c) && this.d.equals(h6bVar.d) && Intrinsics.a(this.e, h6bVar.e) && gh7.b(2.0f, 2.0f) && gh7.b(1.0f, 1.0f);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new j6b(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        boolean z;
        j6b j6bVar = (j6b) b8eVar;
        boolean z2 = j6bVar.q;
        boolean z3 = this.b;
        boolean z4 = true;
        if (z2 != z3) {
            j6bVar.q = z3;
            z = true;
        } else {
            z = false;
        }
        lde ldeVar = j6bVar.r;
        lde ldeVar2 = this.c;
        if (ldeVar != ldeVar2) {
            j6bVar.r = ldeVar2;
            d3k d3kVar = j6bVar.v;
            mt5 mt5Var = null;
            if (d3kVar != null) {
                d3kVar.k((CancellationException) null);
            }
            j6bVar.v = na2.B(j6bVar.H0(), null, null, new i6b(j6bVar, mt5Var, (byte) 3), 3);
        }
        sgl sglVar = j6bVar.w;
        sgl sglVar2 = this.d;
        if (!Intrinsics.a(sglVar, sglVar2)) {
            j6bVar.w = sglVar2;
            z = true;
        }
        paj pajVar = j6bVar.y;
        paj pajVar2 = this.e;
        if (!Intrinsics.a(pajVar, pajVar2)) {
            if (!Intrinsics.a(j6bVar.y, pajVar2)) {
                j6bVar.y = pajVar2;
                j6bVar.A.T0();
            }
            z = true;
        }
        if (!gh7.b(j6bVar.s, 2.0f)) {
            j6bVar.s = 2.0f;
            z = true;
        }
        if (gh7.b(j6bVar.t, 1.0f)) {
            z4 = z;
        } else {
            j6bVar.t = 1.0f;
        }
        if (z4) {
            j6bVar.W0();
        }
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + (((Boolean.hashCode(this.b) * 31) + 1237) * 31)) * 31)) * 31;
        paj pajVar = this.e;
        return ((((iHashCode + (pajVar == null ? 0 : pajVar.hashCode())) * 31) + 1073741824) * 31) + 1065353216;
    }

    public final String toString() {
        return "IndicatorLineElement(enabled=" + this.b + ", isError=false, interactionSource=" + this.c + ", colors=" + this.d + ", textFieldShape=" + this.e + ", focusedIndicatorLineThickness=" + ((Object) gh7.c(2.0f)) + ", unfocusedIndicatorLineThickness=" + ((Object) gh7.c(1.0f)) + ')';
    }
}
