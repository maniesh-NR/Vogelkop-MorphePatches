package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nmg {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final byte g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    /* JADX WARN: Multi-variable type inference failed */
    public nmg(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmg)) {
            return false;
        }
        nmg nmgVar = (nmg) obj;
        return k1g.s(this.a, nmgVar.a) && this.b == nmgVar.b && y8f.b(this.c, nmgVar.c) && y8f.b(this.d, nmgVar.d) && this.e == nmgVar.e && Float.compare(this.f, nmgVar.f) == 0 && this.g == nmgVar.g && this.h == nmgVar.h && this.i.equals(nmgVar.i) && y8f.b(this.j, nmgVar.j) && Float.compare(this.k, nmgVar.k) == 0 && y8f.b(this.l, nmgVar.l) && y8f.b(this.m, nmgVar.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + z1m.e(sko.d(this.k, z1m.e(z1m.g(this.i, fki.k(rfp.c(this.g, sko.d(this.f, fki.k(z1m.e(z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31), 31, this.j), 31), 31, this.l);
    }

    public final String toString() {
        String strH0 = k1g.h0(this.a);
        String strG = y8f.g(this.c);
        String strG2 = y8f.g(this.d);
        String strA = vmg.a(this.g);
        String strG3 = y8f.g(this.j);
        String strG4 = y8f.g(this.l);
        String strG5 = y8f.g(this.m);
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append(strH0);
        sb.append(", uptime=");
        sb.append(this.b);
        z1m.t(sb, ", positionOnScreen=", strG, ", position=", strG2);
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(strA);
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append(strG3);
        sb.append(", scaleGestureFactor=");
        sb.append(this.k);
        sb.append(", panGestureOffset=");
        sb.append(strG4);
        return p3p.n(sb, ", originalEventPosition=", strG5, ")");
    }
}
