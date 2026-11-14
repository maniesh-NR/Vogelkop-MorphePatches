package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wka {
    public final String a;
    public final String b;

    public wka(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wka)) {
            return false;
        }
        wka wkaVar = (wka) obj;
        return Intrinsics.a(this.a, wkaVar.a) && Intrinsics.a(this.b, wkaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sko.l("ViewsV1GetCrashIdHostData(version=", this.a, ", name=", this.b, ")");
    }
}
