package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class txj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final Size e;
    public final ixh f;
    public final cyj g;
    public final dxh h;
    public final dxh i;
    public final ixh j;
    public final ixh k;
    public final ixh l;

    public txj(int i, int i2, int i3, int i4, Size size, cyj cyjVar) {
        ixh ixhVar = new ixh(8.0f);
        dxh dxhVar = new dxh(2130969355);
        dxh dxhVar2 = new dxh(2130969347);
        ixh ixhVar2 = new ixh(1.0f);
        ixh ixhVar3 = new ixh(12.0f);
        ixh ixhVar4 = new ixh(8.0f);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = size;
        this.f = ixhVar;
        this.g = cyjVar;
        this.h = dxhVar;
        this.i = dxhVar2;
        this.j = ixhVar2;
        this.k = ixhVar3;
        this.l = ixhVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txj)) {
            return false;
        }
        txj txjVar = (txj) obj;
        return this.a == txjVar.a && this.b == txjVar.b && this.c == txjVar.c && this.d == txjVar.d && this.e.equals(txjVar.e) && this.f.equals(txjVar.f) && this.g.equals(txjVar.g) && this.h.equals(txjVar.h) && this.i.equals(txjVar.i) && this.j.equals(txjVar.j) && this.k.equals(txjVar.k) && this.l.equals(txjVar.l);
    }

    public final int hashCode() {
        return Float.hashCode(this.l.d) + sko.d(this.k.d, sko.d(this.j.d, rfp.c(this.i.a, rfp.c(this.h.a, (this.g.hashCode() + sko.d(this.f.d, (this.e.hashCode() + rfp.c(this.d, rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
