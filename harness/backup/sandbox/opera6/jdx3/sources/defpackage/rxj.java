package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rxj {
    public final int a;
    public final int b;
    public final dxh c;
    public final dxh d;
    public final ixh e;

    public rxj(int i, int i2) {
        this(i, i2, new dxh(2130969325), new dxh(2130969115), new ixh(1.0f));
    }

    public rxj(int i, int i2, dxh dxhVar, dxh dxhVar2, ixh ixhVar) {
        this.a = i;
        this.b = i2;
        this.c = dxhVar;
        this.d = dxhVar2;
        this.e = ixhVar;
    }

    public static rxj a(rxj rxjVar, int i, int i2) {
        dxh dxhVar = rxjVar.c;
        dxh dxhVar2 = rxjVar.d;
        ixh ixhVar = rxjVar.e;
        rxjVar.getClass();
        return new rxj(i, i2, dxhVar, dxhVar2, ixhVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxj)) {
            return false;
        }
        rxj rxjVar = (rxj) obj;
        return this.a == rxjVar.a && this.b == rxjVar.b && Intrinsics.a(this.c, rxjVar.c) && Intrinsics.a(this.d, rxjVar.d) && Intrinsics.a(this.e, rxjVar.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e.d) + rfp.c(this.d.a, rfp.c(this.c.a, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
