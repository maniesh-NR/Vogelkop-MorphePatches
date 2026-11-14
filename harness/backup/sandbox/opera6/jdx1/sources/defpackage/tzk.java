package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tzk {
    public final String a;
    public final int b;
    public final int c;

    public tzk(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzk)) {
            return false;
        }
        tzk tzkVar = (tzk) obj;
        return Intrinsics.a(this.a, tzkVar.a) && this.b == tzkVar.b && this.c == tzkVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rfp.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return fki.s(sb, this.c, ')');
    }
}
