package ads_mobile_sdk;

import defpackage.sko;

/* loaded from: classes.dex */
public final class yu {
    public final int a;
    public final int b;
    public final int c;

    public yu(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu)) {
            return false;
        }
        yu yuVar = (yu) obj;
        return this.a == yuVar.a && this.b == yuVar.b && this.c == yuVar.c;
    }

    public final int hashCode() {
        return n6h.a(this.c, n6h.a(0, n6h.a(this.b, Integer.hashCode(this.a) * 31))) + 50;
    }

    public final String toString() {
        return p3p.k(this.c, ", size=50)", sko.o(this.a, this.b, "CloseButtonConfig(paddingLeft=", ", paddingRight=", ", paddingTop=0, paddingBottom="));
    }
}
