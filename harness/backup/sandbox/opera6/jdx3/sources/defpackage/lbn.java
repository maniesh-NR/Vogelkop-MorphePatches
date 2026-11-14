package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lbn extends nbn {
    public final String a;
    public final String b;
    public final String c;

    public lbn(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbn)) {
            return false;
        }
        lbn lbnVar = (lbn) obj;
        return this.a.equals(lbnVar.a) && Intrinsics.a(this.b, lbnVar.b) && this.c.equals(lbnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
