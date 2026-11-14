package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hqg {
    public final boolean a;
    public final String b;
    public final String c;

    public hqg(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqg)) {
            return false;
        }
        hqg hqgVar = (hqg) obj;
        return this.a == hqgVar.a && Intrinsics.a(this.b, hqgVar.b) && Intrinsics.a(this.c, hqgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PredefinedUIHistoryEntry(status=");
        sb.append(this.a);
        sb.append(", decisionText=");
        sb.append(this.b);
        sb.append(", formattedDate=");
        return z1m.l(sb, this.c, ")");
    }
}
