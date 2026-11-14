package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yca {
    public final String a;
    public final String b;

    public yca(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yca)) {
            return false;
        }
        yca ycaVar = (yca) obj;
        return Intrinsics.a(this.a, ycaVar.a) && Intrinsics.a(this.b, ycaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
