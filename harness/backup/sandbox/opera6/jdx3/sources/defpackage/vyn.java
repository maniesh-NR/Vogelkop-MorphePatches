package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vyn {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public vyn(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof vyn)) {
            return false;
        }
        vyn vynVar = (vyn) obj;
        return Intrinsics.a(this.a, vynVar.a) && Intrinsics.a(this.b, vynVar.b) && Intrinsics.a(this.c, vynVar.c) && Intrinsics.a(this.d, vynVar.d) && Intrinsics.a(this.e, vynVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
