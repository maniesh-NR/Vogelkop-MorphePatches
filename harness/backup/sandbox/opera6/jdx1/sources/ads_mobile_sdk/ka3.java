package ads_mobile_sdk;

import android.os.Build;
import defpackage.dgh;
import defpackage.nxg;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ka3 implements zcp {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final ehc h;
    public final String i;
    public final String j;
    public final long m;
    public final boolean n;
    public final String o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final boolean s;

    public ka3(boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, String str3, ehc ehcVar, String str4, String str5, long j, boolean z5, String str6, boolean z6, int i, boolean z7, boolean z8) {
        String str7 = Build.MODEL;
        String str8 = Build.FINGERPRINT;
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = z4;
        this.g = str3;
        this.h = ehcVar;
        this.i = str4;
        this.j = str5;
        this.m = j;
        this.n = z5;
        this.o = str6;
        this.p = z6;
        this.q = i;
        this.r = z7;
        this.s = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120 A[PHI: r7
      0x0120: PHI (r7v2 java.lang.String) = 
      (r7v0 java.lang.String)
      (r7v0 java.lang.String)
      (r7v1 java.lang.String)
      (r7v0 java.lang.String)
      (r7v0 java.lang.String)
     binds: [B:24:0x008a, B:26:0x0092, B:38:0x00c4, B:14:0x0064, B:16:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.jjj r13) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ka3.a(jjj):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka3)) {
            return false;
        }
        ka3 ka3Var = (ka3) obj;
        if (this.a != ka3Var.a || this.b != ka3Var.b || !Intrinsics.a(this.c, ka3Var.c) || !Intrinsics.a(this.d, ka3Var.d) || this.e != ka3Var.e || this.f != ka3Var.f || !Intrinsics.a(this.g, ka3Var.g) || !Intrinsics.a(this.h, ka3Var.h) || !Intrinsics.a(this.i, ka3Var.i) || !Intrinsics.a(this.j, ka3Var.j)) {
            return false;
        }
        String str = Build.MODEL;
        if (!Intrinsics.a(str, str)) {
            return false;
        }
        String str2 = Build.FINGERPRINT;
        return Intrinsics.a(str2, str2) && this.m == ka3Var.m && this.n == ka3Var.n && Intrinsics.a(this.o, ka3Var.o) && this.p == ka3Var.p && this.q == ka3Var.q && this.r == ka3Var.r && this.s == ka3Var.s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean] */
    public final int hashCode() {
        boolean z = this.a;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = r1 * 31;
        ?? r3 = this.b;
        int i2 = r3;
        if (r3 != 0) {
            i2 = 1;
        }
        int iA = dgh.a(this.c, (i + i2) * 31);
        String str = this.d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        ?? r4 = this.e;
        int i3 = r4;
        if (r4 != 0) {
            i3 = 1;
        }
        int i4 = (iHashCode + i3) * 31;
        ?? r42 = this.f;
        int i5 = r42;
        if (r42 != 0) {
            i5 = 1;
        }
        int iC = nxg.c(dgh.a(this.g, (i4 + i5) * 31), this.h);
        String str2 = this.i;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iE = z1m.e(dgh.a(Build.FINGERPRINT, dgh.a(Build.MODEL, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)), 31, this.m);
        ?? r43 = this.n;
        int i6 = r43;
        if (r43 != 0) {
            i6 = 1;
        }
        int i7 = (iE + i6) * 31;
        String str4 = this.o;
        int iHashCode3 = (i7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ?? r32 = this.p;
        int i8 = r32;
        if (r32 != 0) {
            i8 = 1;
        }
        int iA2 = n6h.a(this.q, (iHashCode3 + i8) * 31);
        ?? r33 = this.r;
        int i9 = r33;
        if (r33 != 0) {
            i9 = 1;
        }
        int i10 = (iA2 + i9) * 31;
        boolean z2 = this.s;
        return i10 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        String str = Build.MODEL;
        String str2 = Build.FINGERPRINT;
        StringBuilder sb = new StringBuilder("StaticDeviceSignal(canOpenGeo=");
        sb.append(this.a);
        sb.append(", canOpenHttp=");
        sb.append(this.b);
        sb.append(", countryCode=");
        z1m.t(sb, this.c, ", deviceCountryCode=", this.d, ", isEmulator=");
        z1m.v(sb, this.e, ", isLatchskyDevice=", this.f, ", languageCode=");
        sb.append(this.g);
        sb.append(", languageCodeList=");
        sb.append(this.h);
        sb.append(", deviceLanguageCode=");
        z1m.t(sb, this.i, ", marketVersion=", this.j, ", submodel=");
        z1m.t(sb, str, ", buildName=", str2, ", remainingDataPartitionSpaceKilobytes=");
        sb.append(this.m);
        sb.append(", isDefaultBrowserCustomTabsCapable=");
        sb.append(this.n);
        sb.append(", playStoreVersion=");
        sb.append(this.o);
        sb.append(", isBattlestarDevice=");
        sb.append(this.p);
        sb.append(", buildApiLevel=");
        sb.append(this.q);
        sb.append(", isTransparentBackgroundSupported=");
        sb.append(this.r);
        sb.append(", isHsdpSupported=");
        sb.append(this.s);
        sb.append(")");
        return sb.toString();
    }
}
