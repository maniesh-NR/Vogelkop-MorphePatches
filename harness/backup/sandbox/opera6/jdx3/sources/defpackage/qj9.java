package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qj9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public qj9(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final String a() {
        return this.a + this.b + this.c + this.d + this.e + this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj9)) {
            return false;
        }
        qj9 qj9Var = (qj9) obj;
        return Intrinsics.a(this.a, qj9Var.a) && Intrinsics.a(this.b, qj9Var.b) && Intrinsics.a(this.c, qj9Var.c) && this.d.equals(qj9Var.d) && Intrinsics.a(this.e, qj9Var.e) && Intrinsics.a(this.f, qj9Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + z1m.f(z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return a();
    }
}
