package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jmc extends v0g {
    public final String a;
    public final String b;

    public jmc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmc)) {
            return false;
        }
        jmc jmcVar = (jmc) obj;
        return Intrinsics.a(this.a, jmcVar.a) && Intrinsics.a(this.b, jmcVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
