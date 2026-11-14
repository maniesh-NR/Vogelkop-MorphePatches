package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xka {
    public final String a;
    public final String b;
    public final String c;

    public xka(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xka)) {
            return false;
        }
        xka xkaVar = (xka) obj;
        return this.a.equals(xkaVar.a) && Intrinsics.a(this.b, xkaVar.b) && Intrinsics.a(this.c, xkaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return z1m.l(z1m.n("ViewsV1GetIntegrityTokenData(token=", this.a, ", deviceId=", this.b, ", homeCountryIso2="), this.c, ")");
    }
}
