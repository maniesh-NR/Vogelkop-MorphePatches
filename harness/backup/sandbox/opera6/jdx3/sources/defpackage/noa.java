package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class noa extends RuntimeException {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public noa(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i + " " + str + ((str3 == null || StringsKt.N(str3)) ? "" : sko.j(": ", str3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noa)) {
            return false;
        }
        noa noaVar = (noa) obj;
        return this.a == noaVar.a && Intrinsics.a(this.b, noaVar.b) && Intrinsics.a(this.c, noaVar.c) && Intrinsics.a(this.d, noaVar.d);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.e;
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return sko.n(p3p.p(this.a, "HttpException(statusCode=", ", statusMessage=", this.b, ", host="), this.c, ", errorMessage=", this.d, ")");
    }
}
