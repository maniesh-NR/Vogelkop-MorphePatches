package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jz1 {
    public final String a;
    public final String b;
    public final String c;
    public final ebb d;

    public jz1(String str, String str2, String str3, ebb ebbVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ebbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz1)) {
            return false;
        }
        jz1 jz1Var = (jz1) obj;
        return this.a.equals(jz1Var.a) && this.b.equals(jz1Var.b) && this.c.equals(jz1Var.c) && Intrinsics.a(this.d, jz1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
