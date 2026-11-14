package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i26 extends wxe {
    public final rd3 m;

    public i26(rd3 rd3Var) {
        this.m = rd3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i26) && Intrinsics.a(this.m, ((i26) obj).m);
        }
        return true;
    }

    @Override // defpackage.wxe
    public final int g(int i, int i2, d2c d2cVar, ifg ifgVar, int i3) {
        return this.m.a(i2, i, d2cVar);
    }

    public final int hashCode() {
        return Float.hashCode(this.m.a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.m + ")";
    }
}
