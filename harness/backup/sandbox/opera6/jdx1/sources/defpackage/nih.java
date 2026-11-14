package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class nih extends haj {
    public final ArrayList c;
    public final ArrayList d;
    public final long e;
    public final float f;
    public final int g;

    public nih(ArrayList arrayList, ArrayList arrayList2, long j, float f, int i) {
        this.c = arrayList;
        this.d = arrayList2;
        this.e = j;
        this.f = f;
        this.g = i;
    }

    @Override // defpackage.haj
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.e;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jO = mfh.o(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jO >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jO & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        float fC = this.f;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = bpj.c(j) / 2.0f;
        }
        float f = fC;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.c;
        f03.o0(arrayList, arrayList2);
        return i2a.a.b(jFloatToRawIntBits, f, f03.m0(arrayList2), CollectionsKt.h0(arrayList), this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nih)) {
            return false;
        }
        nih nihVar = (nih) obj;
        return this.c.equals(nihVar.c) && this.d.equals(nihVar.d) && y8f.b(this.e, nihVar.e) && this.f == nihVar.f && this.g == nihVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + sko.d(this.f, z1m.e(z1m.g(this.d, this.c.hashCode() * 31, 31), 31, this.e), 31);
    }

    public final String toString() {
        long j = this.e;
        String str = "";
        String strK = (9223372034707292159L & j) != 9205357640488583168L ? sko.k("center=", y8f.g(j), ", ") : "";
        float f = this.f;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str = "radius=" + f + ", ";
        }
        int i = this.g;
        String str2 = i == 0 ? "Clamp" : i == 1 ? "Repeated" : i == 2 ? "Mirror" : i == 3 ? "Decal" : "Unknown";
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        z1m.t(sb, strK, str, "tileMode=", str2);
        sb.append(")");
        return sb.toString();
    }
}
