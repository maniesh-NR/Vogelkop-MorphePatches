package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fvn {
    public final String a;
    public final LinkedHashMap b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public fvn(String str, LinkedHashMap linkedHashMap, boolean z, boolean z2, String str2) {
        this.a = str;
        this.b = linkedHashMap;
        this.c = z;
        this.d = z2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvn)) {
            return false;
        }
        fvn fvnVar = (fvn) obj;
        return Intrinsics.a(this.a, fvnVar.a) && this.b.equals(fvnVar.b) && this.c == fvnVar.c && this.d == fvnVar.d && this.e.equals(fvnVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + fki.k(fki.k((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebRequest(url=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", isForMainFrame=");
        z1m.v(sb, this.c, ", isRedirect=", this.d, ", method=");
        return z1m.l(sb, this.e, ")");
    }
}
