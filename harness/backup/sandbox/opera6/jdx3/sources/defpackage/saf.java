package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class saf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public saf(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saf)) {
            return false;
        }
        saf safVar = (saf) obj;
        return Intrinsics.a(this.a, safVar.a) && this.b.equals(safVar.b) && Intrinsics.a(this.c, safVar.c) && Intrinsics.a(this.d, safVar.d) && this.e.equals(safVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("OmitFileInfo(name=", this.a, ", id=", this.b, ", shodanId=");
        z1m.t(sbN, this.c, ", mimeType=", this.d, ", fileUrl=");
        return z1m.l(sbN, this.e, ")");
    }
}
