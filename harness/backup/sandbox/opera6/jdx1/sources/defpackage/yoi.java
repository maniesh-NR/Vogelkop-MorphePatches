package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyoi;", "Lh8e;", "Lzoi;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class yoi extends h8e {
    public final kpi b;
    public final fsf c;
    public final boolean d;
    public final h89 e;
    public final lde f;
    public final xs3 g;
    public final boolean h;
    public final v51 i;

    public yoi(v51 v51Var, xs3 xs3Var, h89 h89Var, lde ldeVar, fsf fsfVar, kpi kpiVar, boolean z, boolean z2) {
        this.b = kpiVar;
        this.c = fsfVar;
        this.d = z;
        this.e = h89Var;
        this.f = ldeVar;
        this.g = xs3Var;
        this.h = z2;
        this.i = v51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yoi.class != obj.getClass()) {
            return false;
        }
        yoi yoiVar = (yoi) obj;
        return this.b.equals(yoiVar.b) && this.c == yoiVar.c && this.d == yoiVar.d && Intrinsics.a(this.e, yoiVar.e) && Intrinsics.a(this.f, yoiVar.f) && Intrinsics.a(this.g, yoiVar.g) && this.h == yoiVar.h && Intrinsics.a(this.i, yoiVar.i);
    }

    @Override // defpackage.h8e
    public final b8e f() {
        zoi zoiVar = new zoi();
        zoiVar.q = this.b;
        zoiVar.r = this.c;
        zoiVar.s = this.d;
        zoiVar.t = this.e;
        zoiVar.u = this.f;
        zoiVar.v = this.g;
        zoiVar.w = this.h;
        zoiVar.x = this.i;
        return zoiVar;
    }

    @Override // defpackage.h8e
    public final void h(b8e b8eVar) throws pxb {
        lde ldeVar = this.f;
        ((zoi) b8eVar).Y0(this.i, this.g, this.e, ldeVar, this.c, this.b, this.h, this.d);
    }

    public final int hashCode() {
        int iHashCode = (((Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31) + 1237) * 31;
        h89 h89Var = this.e;
        int iHashCode2 = (iHashCode + (h89Var != null ? h89Var.hashCode() : 0)) * 31;
        lde ldeVar = this.f;
        int iHashCode3 = (iHashCode2 + (ldeVar != null ? ldeVar.hashCode() : 0)) * 31;
        xs3 xs3Var = this.g;
        int iK = fki.k((iHashCode3 + (xs3Var != null ? xs3Var.hashCode() : 0)) * 31, 31, this.h);
        v51 v51Var = this.i;
        return iK + (v51Var != null ? v51Var.hashCode() : 0);
    }
}
