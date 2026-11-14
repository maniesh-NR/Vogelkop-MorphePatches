package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uxj {
    public final ixh a;
    public final boolean b;
    public final int c;
    public final dxh d;
    public final dxh e;
    public final ixh f;
    public final y7h g;

    public uxj(ixh ixhVar, int i) {
        ixh ixhVar2 = new ixh(48.0f);
        boolean z = (i & 2) != 0;
        int i2 = (i & 4) != 0 ? 2 : 1;
        dxh dxhVar = new dxh(2130969325);
        dxh dxhVar2 = new dxh(2130969115);
        ixh ixhVar3 = new ixh(1.0f);
        ixhVar = (i & 64) != 0 ? new ixh(4.0f) : ixhVar;
        this.a = ixhVar2;
        this.b = z;
        this.c = i2;
        this.d = dxhVar;
        this.e = dxhVar2;
        this.f = ixhVar3;
        this.g = ixhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxj)) {
            return false;
        }
        uxj uxjVar = (uxj) obj;
        return this.a.equals(uxjVar.a) && this.b == uxjVar.b && this.c == uxjVar.c && this.d.equals(uxjVar.d) && this.e.equals(uxjVar.e) && this.f.equals(uxjVar.f) && Intrinsics.a(this.g, uxjVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + sko.d(this.f.d, rfp.c(this.e.a, rfp.c(this.d.a, rfp.c(this.c, fki.k(Float.hashCode(this.a.d) * 31, 31, this.b), 31), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
