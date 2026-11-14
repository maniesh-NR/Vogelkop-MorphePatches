package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e52 extends c52 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public e52(String str, String str2, String str3, String str4, String str5, String str6) {
        super(b52.c);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // defpackage.c52
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e52)) {
            return false;
        }
        e52 e52Var = (e52) obj;
        return Intrinsics.a(this.b, e52Var.b) && Intrinsics.a(this.c, e52Var.c) && Intrinsics.a(this.d, e52Var.d) && Intrinsics.a(this.e, e52Var.e) && Intrinsics.a(this.f, e52Var.f) && Intrinsics.a(this.g, e52Var.g);
    }

    public final int hashCode() {
        int iF = z1m.f(z1m.f(z1m.f(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
