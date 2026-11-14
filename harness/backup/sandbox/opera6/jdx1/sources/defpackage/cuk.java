package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class cuk {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final int c;

    public cuk(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, int i) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuk)) {
            return false;
        }
        cuk cukVar = (cuk) obj;
        return this.a.equals(cukVar.a) && this.b.equals(cukVar.b) && this.c == cukVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb.append(this.a);
        sb.append(", attachedSurfaceStreamSpecs=");
        sb.append(this.b);
        sb.append(", maxSupportedFrameRate=");
        return fki.s(sb, this.c, ')');
    }
}
