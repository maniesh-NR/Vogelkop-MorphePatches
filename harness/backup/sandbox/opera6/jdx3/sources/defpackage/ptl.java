package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ptl {
    public final pxh a;
    public final xsl b;

    public ptl(pxh pxhVar, xsl xslVar) {
        this.a = pxhVar;
        this.b = xslVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptl)) {
            return false;
        }
        ptl ptlVar = (ptl) obj;
        return this.a.equals(ptlVar.a) && Intrinsics.a(this.b, ptlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
