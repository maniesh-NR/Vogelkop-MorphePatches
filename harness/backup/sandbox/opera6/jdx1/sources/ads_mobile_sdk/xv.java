package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.prb;
import defpackage.z1m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xv {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final prb e;
    public final prb f;
    public final bq g;
    public final String h;
    public final prb i;
    public final boolean j;
    public final long k;
    public final int l;
    public final ArrayList m;
    public final long n;
    public final long o;
    public final int p;
    public final prb q;
    public final String r;
    public final boolean s;
    public final prb t;
    public final boolean u;

    public xv(String str, String str2, String str3, String str4, prb prbVar, prb prbVar2, bq bqVar, String str5, prb prbVar3, boolean z, long j, int i, ArrayList arrayList, long j2, long j3, int i2, prb prbVar4, String str6, boolean z2, prb prbVar5, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = prbVar;
        this.f = prbVar2;
        this.g = bqVar;
        this.h = str5;
        this.i = prbVar3;
        this.j = z;
        this.k = j;
        this.l = i;
        this.m = arrayList;
        this.n = j2;
        this.o = j3;
        this.p = i2;
        this.q = prbVar4;
        this.r = str6;
        this.s = z2;
        this.t = prbVar5;
        this.u = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return Intrinsics.a(this.a, xvVar.a) && Intrinsics.a(this.b, xvVar.b) && Intrinsics.a(this.c, xvVar.c) && Intrinsics.a(this.d, xvVar.d) && Intrinsics.a(this.e, xvVar.e) && Intrinsics.a(this.f, xvVar.f) && Intrinsics.a(this.g, xvVar.g) && Intrinsics.a(this.h, xvVar.h) && Intrinsics.a(this.i, xvVar.i) && this.j == xvVar.j && this.k == xvVar.k && this.l == xvVar.l && this.m.equals(xvVar.m) && pn7.e(this.n, xvVar.n) && pn7.e(this.o, xvVar.o) && this.p == xvVar.p && this.q.equals(xvVar.q) && Intrinsics.a(this.r, xvVar.r) && this.s == xvVar.s && Intrinsics.a(this.t, xvVar.t) && this.u == xvVar.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f.a.hashCode() + ((this.e.a.hashCode() + dgh.a(this.d, dgh.a(this.c, dgh.a(this.b, this.a.hashCode() * 31)))) * 31)) * 31;
        bq bqVar = this.g;
        int iHashCode2 = (this.i.a.hashCode() + dgh.a(this.h, (iHashCode + (bqVar == null ? 0 : bqVar.hashCode())) * 31)) * 31;
        boolean z = this.j;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iG = z1m.g(this.m, n6h.a(this.l, z1m.e((iHashCode2 + i) * 31, 31, this.k)), 31);
        on7 on7Var = pn7.b;
        int iA = dgh.a(this.r, (this.q.a.hashCode() + n6h.a(this.p, z1m.e(z1m.e(iG, 31, this.n), 31, this.o))) * 31);
        boolean z2 = this.s;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (iA + i2) * 31;
        prb prbVar = this.t;
        int iHashCode3 = (i3 + (prbVar != null ? prbVar.a.hashCode() : 0)) * 31;
        boolean z3 = this.u;
        return iHashCode3 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public final String toString() {
        String strQ = pn7.q(this.n);
        String strQ2 = pn7.q(this.o);
        StringBuilder sbN = z1m.n("CommonConfiguration(adapterResponseReplacementKey=", this.a, ", adRequestPostBody=", this.b, ", adRequestUrl=");
        z1m.t(sbN, this.c, ", adResponseBody=", this.d, ", adResponseHeaders=");
        sbN.append(this.e);
        sbN.append(", biddingData=");
        sbN.append(this.f);
        sbN.append(", bowResponseError=");
        sbN.append(this.g);
        sbN.append(", gwsQueryId=");
        sbN.append(this.h);
        sbN.append(", inspectorExtras=");
        sbN.append(this.i);
        sbN.append(", isIdless=");
        sbN.append(this.j);
        sbN.append(", latency=");
        sbN.append(this.k);
        sbN.append(", maxParallelRenderers=");
        sbN.append(this.l);
        sbN.append(", noFillUrls=");
        sbN.append(this.m);
        sbN.append(", refreshInterval=");
        sbN.append(strQ);
        sbN.append(", proactiveRefreshLoadDelayInterval=");
        sbN.append(strQ2);
        sbN.append(", responseCode=");
        sbN.append(this.p);
        sbN.append(", responseInfoExtras=");
        sbN.append(this.q);
        sbN.append(", scionQueryEventId=");
        sbN.append(this.r);
        sbN.append(", isPersistentAdEnabled=");
        sbN.append(this.s);
        sbN.append(", throttleConfiguration=");
        sbN.append(this.t);
        sbN.append(", isCrossProcessAdEnabled=");
        sbN.append(this.u);
        sbN.append(")");
        return sbN.toString();
    }
}
