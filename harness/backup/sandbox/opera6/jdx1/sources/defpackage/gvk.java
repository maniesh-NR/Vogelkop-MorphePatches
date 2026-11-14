package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class gvk extends haj {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public gvk(long j, ArrayList arrayList, ArrayList arrayList2) {
        this.c = j;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // defpackage.haj
    public final Shader b(long j) {
        long jFloatToRawIntBits;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            jFloatToRawIntBits = mfh.o(j);
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat(i2);
            jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.d;
        f03.o0(arrayList, arrayList2);
        return i2a.a.c(jFloatToRawIntBits, f03.m0(arrayList2), CollectionsKt.h0(arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvk)) {
            return false;
        }
        gvk gvkVar = (gvk) obj;
        return y8f.b(this.c, gvkVar.c) && this.d.equals(gvkVar.d) && this.e.equals(gvkVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z1m.g(this.d, Long.hashCode(this.c) * 31, 31);
    }

    public final String toString() {
        long j = this.c;
        return "SweepGradient(" + ((9223372034707292159L & j) != 9205357640488583168L ? sko.k("center=", y8f.g(j), ", ") : "") + "colors=" + this.d + ", stops=" + this.e + ")";
    }
}
