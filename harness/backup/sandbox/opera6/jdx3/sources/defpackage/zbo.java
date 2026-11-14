package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zbo {
    public final String a;
    public final String b;
    public final long c;

    public zbo(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbo)) {
            return false;
        }
        zbo zboVar = (zbo) obj;
        return Intrinsics.a(this.a, zboVar.a) && Intrinsics.a(this.b, zboVar.b) && this.c == zboVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
