package defpackage;

import android.util.Size;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class zo2 {
    public final Size a;
    public final LinkedHashMap b;
    public final Size c;
    public final LinkedHashMap d;
    public final Size e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public zo2(Size size, LinkedHashMap linkedHashMap, Size size2, LinkedHashMap linkedHashMap2, Size size3, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
        if (size == null) {
            t3p.q("Null analysisSize");
            throw null;
        }
        this.a = size;
        this.b = linkedHashMap;
        if (size2 == null) {
            t3p.q("Null previewSize");
            throw null;
        }
        this.c = size2;
        this.d = linkedHashMap2;
        if (size3 == null) {
            t3p.q("Null recordSize");
            throw null;
        }
        this.e = size3;
        this.f = linkedHashMap3;
        this.g = linkedHashMap4;
        this.h = linkedHashMap5;
        this.i = linkedHashMap6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zo2)) {
            return false;
        }
        zo2 zo2Var = (zo2) obj;
        return this.a.equals(zo2Var.a) && this.b.equals(zo2Var.b) && this.c.equals(zo2Var.c) && this.d.equals(zo2Var.d) && this.e.equals(zo2Var.e) && this.f.equals(zo2Var.f) && this.g.equals(zo2Var.g) && this.h.equals(zo2Var.h) && this.i.equals(zo2Var.i);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", maximum4x3SizeMap=" + this.g + ", maximum16x9SizeMap=" + this.h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}
