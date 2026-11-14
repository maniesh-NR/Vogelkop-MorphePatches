package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xsd {
    public final jva a;
    public final Map b;

    public xsd(jva jvaVar, Map map) {
        this.a = jvaVar;
        this.b = zi4.d0(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsd)) {
            return false;
        }
        xsd xsdVar = (xsd) obj;
        return this.a.equals(xsdVar.a) && Intrinsics.a(this.b, xsdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(image=" + this.a + ", extras=" + this.b + ")";
    }
}
