package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lcb {
    public final bqo a;
    public final String b;
    public final String c;

    public lcb(bqo bqoVar, String str, String str2) {
        this.a = bqoVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcb)) {
            return false;
        }
        lcb lcbVar = (lcb) obj;
        return Intrinsics.a(this.a, lcbVar.a) && Intrinsics.a(this.b, lcbVar.b) && Intrinsics.a(this.c, lcbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
