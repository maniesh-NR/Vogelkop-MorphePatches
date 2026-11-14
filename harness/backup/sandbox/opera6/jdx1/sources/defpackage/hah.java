package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhah;", "Lh8e;", "Lrah;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class hah extends h8e {
    public final boolean b;
    public final Function0 c;
    public final sah d;
    public final float e;

    public hah(boolean z, Function0 function0, sah sahVar, float f) {
        this.b = z;
        this.c = function0;
        this.d = sahVar;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hah)) {
            return false;
        }
        hah hahVar = (hah) obj;
        return this.b == hahVar.b && this.c == hahVar.c && Intrinsics.a(this.d, hahVar.d) && gh7.b(this.e, hahVar.e);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        return new rah(this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        rah rahVar = (rah) b8eVar;
        rahVar.r = this.c;
        rahVar.s = true;
        rahVar.t = this.d;
        rahVar.u = this.e;
        boolean z = rahVar.q;
        boolean z2 = this.b;
        if (z != z2) {
            rahVar.q = z2;
            na2.B(rahVar.H0(), null, null, new rf4((byte) 15, null, rahVar), 3);
        }
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + (((Boolean.hashCode(this.b) * 31) + 1231) * 31)) * 31)) * 31);
    }
}
