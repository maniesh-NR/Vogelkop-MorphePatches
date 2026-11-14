package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ku4 {
    public final long a;
    public final String b;
    public final String c;

    public ku4(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku4)) {
            return false;
        }
        ku4 ku4Var = (ku4) obj;
        return this.a == ku4Var.a && this.b.equals(ku4Var.b) && Intrinsics.a(this.c, ku4Var.c);
    }

    public final int hashCode() {
        int iF = z1m.f(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return p3p.n(sko.q(this.a, "ChatIdentifier(chatId=", ", title=", this.b), ", userId=", this.c, ")");
    }
}
