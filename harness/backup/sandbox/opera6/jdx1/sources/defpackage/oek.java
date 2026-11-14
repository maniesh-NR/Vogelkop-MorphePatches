package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oek implements sek {
    public final n01 a;
    public final n01 b;
    public final n01 c;
    public final n01 d;
    public final qek e;
    public final boolean f;

    public oek(n01 n01Var, n01 n01Var2, n01 n01Var3, n01 n01Var4, qek qekVar, boolean z, int i) {
        n01Var3 = (i & 4) != 0 ? null : n01Var3;
        n01Var4 = (i & 8) != 0 ? null : n01Var4;
        z = (i & 32) != 0 ? false : z;
        this.a = n01Var;
        this.b = n01Var2;
        this.c = n01Var3;
        this.d = n01Var4;
        this.e = qekVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oek)) {
            return false;
        }
        oek oekVar = (oek) obj;
        return Intrinsics.a(this.a, oekVar.a) && Intrinsics.a(this.b, oekVar.b) && Intrinsics.a(this.c, oekVar.c) && Intrinsics.a(this.d, oekVar.d) && this.e == oekVar.e && this.f == oekVar.f;
    }

    public final int hashCode() {
        n01 n01Var = this.a;
        int iHashCode = (n01Var == null ? 0 : n01Var.hashCode()) * 31;
        n01 n01Var2 = this.b;
        int iHashCode2 = (iHashCode + (n01Var2 == null ? 0 : n01Var2.hashCode())) * 31;
        n01 n01Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (n01Var3 == null ? 0 : n01Var3.hashCode())) * 31;
        n01 n01Var4 = this.d;
        int iHashCode4 = (iHashCode3 + (n01Var4 == null ? 0 : n01Var4.hashCode())) * 31;
        qek qekVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode4 + (qekVar != null ? qekVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Completed(pointsReward=" + this.a + ", walletReward=" + this.b + ", failedWalletReward=" + this.c + ", pendingWalletReward=" + this.d + ", info=" + this.e + ", showRetry=" + this.f + ")";
    }
}
