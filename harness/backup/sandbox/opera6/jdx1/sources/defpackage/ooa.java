package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ooa extends RuntimeException {
    public final int a;
    public final String b;
    public final ji1 c;
    public final String d;

    public ooa(int i, String str, ji1 ji1Var) {
        this.a = i;
        this.b = str;
        this.c = ji1Var;
        str = str == null ? "<No message>" : str;
        String string = ji1Var != null ? ji1Var.toString() : "<No body>";
        StringBuilder sbP = p3p.p(i, "HTTP ", " ", str, ": ");
        sbP.append(string);
        this.d = sbP.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ooa)) {
            return false;
        }
        ooa ooaVar = (ooa) obj;
        return this.a == ooaVar.a && Intrinsics.a(this.b, ooaVar.b) && Intrinsics.a(this.c, ooaVar.c);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ji1 ji1Var = this.c;
        return iHashCode2 + (ji1Var != null ? ji1Var.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbP = p3p.p(this.a, "HttpException(statusCode=", ", statusMessage=", this.b, ", apiError=");
        sbP.append(this.c);
        sbP.append(")");
        return sbP.toString();
    }
}
