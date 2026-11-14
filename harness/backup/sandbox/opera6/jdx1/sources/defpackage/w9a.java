package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw9a;", "Lh8e;", "Ly9a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class w9a extends h8e {
    public final ikl b;
    public final boolean c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public w9a(ikl iklVar, int i, int i2) {
        this.b = iklVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9a)) {
            return false;
        }
        w9a w9aVar = (w9a) obj;
        return Intrinsics.a(this.b, w9aVar.b) && this.c == w9aVar.c && this.d == w9aVar.d;
    }

    @Override // defpackage.h8e
    public final b8e f() {
        y9a y9aVar = new y9a();
        y9aVar.o = this.b;
        y9aVar.p = this.c;
        y9aVar.q = this.d;
        y9aVar.s = -1;
        y9aVar.t = -1;
        return y9aVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) {
        y9a y9aVar = (y9a) b8eVar;
        ikl iklVar = y9aVar.o;
        ikl iklVar2 = this.b;
        boolean zA = Intrinsics.a(iklVar, iklVar2);
        boolean z = this.c;
        int i = this.d;
        if (zA && y9aVar.p == z && y9aVar.q == i) {
            return;
        }
        y9aVar.o = iklVar2;
        y9aVar.p = z;
        y9aVar.q = i;
        y9aVar.u = xgh.v(iklVar2, ui6.e0(y9aVar).z);
        y9aVar.r = true;
        nb6.F(y9aVar);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + this.d;
    }
}
