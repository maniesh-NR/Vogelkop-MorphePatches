package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class glc {
    public final pmc a;
    public final boolean b;

    public glc(pmc pmcVar, boolean z) {
        this.a = pmcVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glc)) {
            return false;
        }
        glc glcVar = (glc) obj;
        return Intrinsics.a(this.a, glcVar.a) && this.b == glcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
