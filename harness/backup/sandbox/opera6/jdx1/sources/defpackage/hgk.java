package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hgk {
    public final Map a;
    public final int b;

    public hgk(int i, Map map) {
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgk)) {
            return false;
        }
        hgk hgkVar = (hgk) obj;
        return Intrinsics.a(this.a, hgkVar.a) && this.b == hgkVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpecQueryResult(streamSpecs=");
        sb.append(this.a);
        sb.append(", maxSupportedFrameRate=");
        return fki.s(sb, this.b, ')');
    }
}
