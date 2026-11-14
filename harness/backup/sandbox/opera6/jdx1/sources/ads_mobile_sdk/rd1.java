package ads_mobile_sdk;

import defpackage.z1m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rd1 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final defpackage.zk g;
    public final boolean h;

    public rd1(String str, List list, int i, int i2, int i3, long j, defpackage.zk zkVar, boolean z) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j;
        this.g = zkVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd1)) {
            return false;
        }
        rd1 rd1Var = (rd1) obj;
        return Intrinsics.a(this.a, rd1Var.a) && this.b.equals(rd1Var.b) && this.c == rd1Var.c && this.d == rd1Var.d && this.e == rd1Var.e && pn7.e(this.f, rd1Var.f) && this.g == rd1Var.g && this.h == rd1Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = n6h.a(this.e, n6h.a(this.d, n6h.a(this.c, rfp.f(this.a.hashCode() * 31, 31, this.b))));
        on7 on7Var = pn7.b;
        int iHashCode = (this.g.hashCode() + z1m.e(iA, 31, this.f)) * 31;
        boolean z = this.h;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        String strQ = pn7.q(this.f);
        StringBuilder sb = new StringBuilder("InternalAttributionInfo(text=");
        sb.append(this.a);
        sb.append(", icons=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sko.r(this.c, this.d, ", textColor=", ", textSize=", sb);
        sb.append(this.e);
        sb.append(", animationInterval=");
        sb.append(strQ);
        sb.append(", attributionInfoPlacement=");
        sb.append(this.g);
        sb.append(", allowPubRendering=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
