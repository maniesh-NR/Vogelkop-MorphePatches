package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pam {
    public final lh9 a;
    public final ki9 b;
    public final int c;
    public final int d;

    public pam(lh9 lh9Var, ki9 ki9Var, int i, int i2) {
        this.a = lh9Var;
        this.b = ki9Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pam)) {
            return false;
        }
        pam pamVar = (pam) obj;
        return Intrinsics.a(this.a, pamVar.a) && Intrinsics.a(this.b, pamVar.b) && this.c == pamVar.c && this.d == pamVar.d;
    }

    public final int hashCode() {
        lh9 lh9Var = this.a;
        return rfp.c(this.d, rfp.c(this.c, (((lh9Var == null ? 0 : lh9Var.hashCode()) * 31) + this.b.a) * 31, 31), 31);
    }

    public final String toString() {
        String str = "Invalid";
        int i = this.c;
        String str2 = i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        return sko.n(sb, str2, ", fontSynthesis=", str, ", resourceLoaderCacheKey=null)");
    }
}
