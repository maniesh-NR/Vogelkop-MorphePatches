package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k19 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public k19(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k19)) {
            return false;
        }
        k19 k19Var = (k19) obj;
        return this.a.equals(k19Var.a) && Intrinsics.a(this.b, k19Var.b) && Intrinsics.a(this.c, k19Var.c) && Intrinsics.a(this.d, k19Var.d) && this.e.equals(k19Var.e) && Intrinsics.a(this.f, k19Var.f);
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("FileInfo(id=", this.a, ", shodanId=", this.b, ", name=");
        z1m.t(sbN, this.c, ", mimeType=", this.d, ", fileUrl=");
        return sko.n(sbN, this.e, ", thumbnailUrl=", this.f, ")");
    }
}
