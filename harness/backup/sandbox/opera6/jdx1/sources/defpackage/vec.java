package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vec extends haj {
    public final List c;
    public final ArrayList d;
    public final long e;
    public final long f;
    public final int g;

    public vec(List list, ArrayList arrayList, long j, long j2, int i) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override // defpackage.haj
    public final Shader b(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fIntBitsToFloat3) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L);
        ArrayList arrayList = this.d;
        List list = this.c;
        f03.o0(arrayList, list);
        return i2a.a.a(jFloatToRawIntBits, jFloatToRawIntBits2, f03.m0(list), arrayList != null ? CollectionsKt.h0(arrayList) : null, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vec)) {
            return false;
        }
        vec vecVar = (vec) obj;
        return Intrinsics.a(this.c, vecVar.c) && Intrinsics.a(this.d, vecVar.d) && y8f.b(this.e, vecVar.e) && y8f.b(this.f, vecVar.f) && this.g == vecVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        ArrayList arrayList = this.d;
        return Integer.hashCode(this.g) + z1m.e(z1m.e((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        long j = this.e;
        String strK = ((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? sko.k("start=", y8f.g(j), ", ") : "";
        long j2 = this.f;
        String strK2 = ((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 ? sko.k("end=", y8f.g(j2), ", ") : "";
        int i = this.g;
        String str = i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        z1m.t(sb, strK, strK2, "tileMode=", str);
        sb.append(")");
        return sb.toString();
    }
}
