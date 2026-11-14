package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pu4 {
    public final long a;
    public final String b;
    public final String c;
    public final v42 d;
    public final w42 e;
    public final boolean f;
    public final Boolean g;
    public final qu4 h;

    public pu4(long j, String str, String str2, v42 v42Var, w42 w42Var, boolean z, Boolean bool, qu4 qu4Var) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = v42Var;
        this.e = w42Var;
        this.f = z;
        this.g = bool;
        this.h = qu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu4)) {
            return false;
        }
        pu4 pu4Var = (pu4) obj;
        return this.a == pu4Var.a && this.b.equals(pu4Var.b) && Intrinsics.a(this.c, pu4Var.c) && this.d == pu4Var.d && this.e == pu4Var.e && this.f == pu4Var.f && Intrinsics.a(this.g, pu4Var.g) && Intrinsics.a(this.h, pu4Var.h);
    }

    public final int hashCode() {
        int iF = z1m.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iK = fki.k((this.e.hashCode() + ((this.d.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f);
        Boolean bool = this.g;
        int iHashCode = (iK + (bool == null ? 0 : bool.hashCode())) * 31;
        qu4 qu4Var = this.h;
        return iHashCode + (qu4Var != null ? qu4Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = sko.q(this.a, "ChatMetaData(chatId=", ", title=", this.b);
        sbQ.append(", userId=");
        sbQ.append(this.c);
        sbQ.append(", position=");
        sbQ.append(this.d);
        sbQ.append(", state=");
        sbQ.append(this.e);
        sbQ.append(", hasContent=");
        sbQ.append(this.f);
        sbQ.append(", isPrivate=");
        sbQ.append(this.g);
        sbQ.append(", modifiers=");
        sbQ.append(this.h);
        sbQ.append(")");
        return sbQ.toString();
    }
}
