package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jqc extends tc2 {
    public final long b;
    public final String c;

    public jqc(long j, String str) {
        super(true);
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqc)) {
            return false;
        }
        jqc jqcVar = (jqc) obj;
        return this.b == jqcVar.b && Intrinsics.a(this.c, jqcVar.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.b) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "";
    }
}
