package defpackage;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class eyj {
    public static final cyj H;
    public static final eyj I;
    public final float A;
    public final float B;
    public final long C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final n6h a;
    public final boolean b;
    public final int c;
    public final byte d;
    public final Size e;
    public final Size f;
    public final Size g;
    public final Size h;
    public final j7h i;
    public final oxj j;
    public final cyj k;
    public final txj l;
    public final b8h m;
    public final b8h n;
    public final b8h o;
    public final b8h p;
    public final b8h q;
    public final boolean r;
    public final int s;
    public final int t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final float x;
    public final float y;
    public final float z;

    static {
        cyj cyjVar = new cyj(jsc.e, null, null, new rxj(0, 0), null, null, null, null, 246);
        H = cyjVar;
        I = new eyj(mxj.a, 0, 2, new Size(0, 0), new Size(0, 0), new Size(0, 0), new Size(0, 0), yxj.b, new oxj(new sxj(0, 0, 0, 7, 0), new sxj(0, 0, 0, 7, 0), new sxj(0, 0, 0, 7, 0), new sxj(0, 0, 0, 7, 0), new Size(0, 0), new Size(0, 0), new Size(0, 0)), cyjVar, null, null, null, null, null, null, 0, 0, 0, false, false, 0.0f, 0.0f, 0, 0, 0, 0, 528742402);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eyj(n6h n6hVar, int i, int i2, Size size, Size size2, Size size3, Size size4, j7h j7hVar, oxj oxjVar, cyj cyjVar, txj txjVar, lxh lxhVar, lxh lxhVar2, lxh lxhVar3, lxh lxhVar4, lxh lxhVar5, int i3, int i4, int i5, boolean z, boolean z2, float f, float f2, int i6, int i7, int i8, int i9, int i10) {
        boolean z3 = (i10 & 2) == 0;
        txj txjVar2 = (i10 & 2048) != 0 ? null : txjVar;
        lxh lxhVar6 = (i10 & 4096) != 0 ? new lxh(2131233243) : lxhVar;
        lxh lxhVar7 = (i10 & 8192) != 0 ? new lxh(2131233245) : lxhVar2;
        lxh lxhVar8 = (i10 & 16384) != 0 ? new lxh(2131233245) : lxhVar3;
        lxh lxhVar9 = (32768 & i10) != 0 ? new lxh(2131231872) : lxhVar4;
        lxh lxhVar10 = (65536 & i10) == 0 ? lxhVar5 : null;
        boolean z4 = (131072 & i10) == 0;
        float f3 = (16777216 & i10) != 0 ? 0.0f : 1.0f;
        float f4 = (33554432 & i10) != 0 ? 0.85f : f;
        float f5 = (i10 & 134217728) == 0 ? f2 : 0.85f;
        on7 on7Var = pn7.b;
        long jX0 = cs5.x0(200, un7.d);
        this.a = n6hVar;
        this.b = z3;
        this.c = i;
        this.d = i2;
        this.e = size;
        this.f = size2;
        this.g = size3;
        this.h = size4;
        this.i = j7hVar;
        this.j = oxjVar;
        this.k = cyjVar;
        this.l = txjVar2;
        this.m = lxhVar6;
        this.n = lxhVar7;
        this.o = lxhVar8;
        this.p = lxhVar9;
        this.q = lxhVar10;
        this.r = z4;
        this.s = i3;
        this.t = i4;
        this.u = i5;
        this.v = z;
        this.w = z2;
        this.x = 0.2f;
        this.y = f3;
        this.z = f4;
        this.A = 0.9f;
        this.B = f5;
        this.C = jX0;
        this.D = i6;
        this.E = i7;
        this.F = i8;
        this.G = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyj)) {
            return false;
        }
        eyj eyjVar = (eyj) obj;
        return Intrinsics.a(this.a, eyjVar.a) && this.b == eyjVar.b && this.c == eyjVar.c && this.d == eyjVar.d && Intrinsics.a(this.e, eyjVar.e) && Intrinsics.a(this.f, eyjVar.f) && Intrinsics.a(this.g, eyjVar.g) && Intrinsics.a(this.h, eyjVar.h) && Intrinsics.a(this.i, eyjVar.i) && Intrinsics.a(this.j, eyjVar.j) && Intrinsics.a(this.k, eyjVar.k) && Intrinsics.a(this.l, eyjVar.l) && Intrinsics.a(this.m, eyjVar.m) && Intrinsics.a(this.n, eyjVar.n) && Intrinsics.a(this.o, eyjVar.o) && Intrinsics.a(this.p, eyjVar.p) && Intrinsics.a(this.q, eyjVar.q) && this.r == eyjVar.r && this.s == eyjVar.s && this.t == eyjVar.t && this.u == eyjVar.u && this.v == eyjVar.v && this.w == eyjVar.w && Float.compare(this.x, eyjVar.x) == 0 && Float.compare(this.y, eyjVar.y) == 0 && Float.compare(this.z, eyjVar.z) == 0 && Float.compare(this.A, eyjVar.A) == 0 && Float.compare(this.B, eyjVar.B) == 0 && pn7.e(this.C, eyjVar.C) && this.D == eyjVar.D && this.E == eyjVar.E && this.F == eyjVar.F && this.G == eyjVar.G;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + rfp.c(this.d, rfp.c(this.c, fki.k(this.a.hashCode() * 31, 31, this.b), 31), 31)) * 31;
        Size size = this.f;
        int iHashCode2 = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((iHashCode + (size == null ? 0 : size.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        txj txjVar = this.l;
        int iHashCode3 = (this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((iHashCode2 + (txjVar == null ? 0 : txjVar.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        b8h b8hVar = this.q;
        int iD = sko.d(this.B, sko.d(this.A, sko.d(this.z, sko.d(this.y, sko.d(this.x, fki.k(fki.k(rfp.c(this.u, rfp.c(this.t, rfp.c(this.s, fki.k((iHashCode3 + (b8hVar != null ? b8hVar.hashCode() : 0)) * 31, 31, this.r), 31), 31), 31), 31, this.v), 31, this.w), 31), 31), 31), 31), 31);
        on7 on7Var = pn7.b;
        return Integer.hashCode(this.G) + rfp.c(this.F, rfp.c(this.E, rfp.c(this.D, z1m.e(iD, 31, this.C), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
