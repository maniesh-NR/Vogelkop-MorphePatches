package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0f extends j14 {
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final m0f E;
    public final m0f F;
    public final boolean G;
    public final String y;
    public final String z;

    public n0f(String str, String str2, String str3, String str4, String str5, String str6, m0f m0fVar, m0f m0fVar2, boolean z) {
        this.y = str;
        this.z = str2;
        this.A = str3;
        this.B = str4;
        this.C = str5;
        this.D = str6;
        this.E = m0fVar;
        this.F = m0fVar2;
        this.G = z;
    }

    public final String Q() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0f)) {
            return false;
        }
        n0f n0fVar = (n0f) obj;
        return this.y.equals(n0fVar.y) && this.z.equals(n0fVar.z) && this.A.equals(n0fVar.A) && Intrinsics.a(this.B, n0fVar.B) && Intrinsics.a(this.C, n0fVar.C) && Intrinsics.a(this.D, n0fVar.D) && this.E.equals(n0fVar.E) && Intrinsics.a(this.F, n0fVar.F) && this.G == n0fVar.G;
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(this.y.hashCode() * 31, 31, this.z), 31, this.A);
        String str = this.B;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.C;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.D;
        int iHashCode3 = (this.E.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        m0f m0fVar = this.F;
        return Boolean.hashCode(this.G) + ((iHashCode3 + (m0fVar != null ? m0fVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("InApp(id=", this.y, ", title=", this.z, ", message=");
        z1m.t(sbN, this.A, ", image=", this.B, ", bigImage=");
        z1m.t(sbN, this.C, ", rewardMessage=", this.D, ", primaryButton=");
        sbN.append(this.E);
        sbN.append(", secondaryButton=");
        sbN.append(this.F);
        sbN.append(", fallbackToSystemNotification=");
        return z1m.m(sbN, this.G, ")");
    }
}
