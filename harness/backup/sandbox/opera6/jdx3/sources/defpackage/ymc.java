package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ymc {
    public final String a;
    public final String b;

    public ymc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymc)) {
            return false;
        }
        ymc ymcVar = (ymc) obj;
        return Intrinsics.a(this.a, ymcVar.a) && Intrinsics.a(this.b, ymcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
