package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bsi {
    public final eri a;
    public final String b;
    public final int c;
    public final List d;
    public final x92 e;
    public final qt3 f;
    public final boolean g;
    public final boolean h;

    public bsi(eri eriVar, String str, int i, List list, x92 x92Var, qt3 qt3Var, boolean z, boolean z2) {
        this.a = eriVar;
        this.b = str;
        this.c = i;
        this.d = list;
        this.e = x92Var;
        this.f = qt3Var;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsi)) {
            return false;
        }
        bsi bsiVar = (bsi) obj;
        return Intrinsics.a(this.a, bsiVar.a) && Intrinsics.a(this.b, bsiVar.b) && this.c == bsiVar.c && Intrinsics.a(this.d, bsiVar.d) && this.e == bsiVar.e && Intrinsics.a(this.f, bsiVar.f) && this.g == bsiVar.g && this.h == bsiVar.h;
    }

    public final int hashCode() {
        eri eriVar = this.a;
        int iHashCode = (eriVar == null ? 0 : eriVar.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.c;
        int iF = rfp.f((iHashCode2 + (i == 0 ? 0 : vep.A(i))) * 31, 31, this.d);
        x92 x92Var = this.e;
        int iHashCode3 = (((iF + (x92Var == null ? 0 : x92Var.hashCode())) * 31) + 1237) * 31;
        qt3 qt3Var = this.f;
        return Boolean.hashCode(this.h) + fki.k((iHashCode3 + (qt3Var != null ? qt3Var.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        return "";
    }
}
