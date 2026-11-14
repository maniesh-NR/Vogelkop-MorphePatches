package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sa8 implements fb8 {
    public final String a;

    public sa8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sa8) && Intrinsics.a(this.a, ((sa8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("BannerClick(id=", this.a, ")");
    }
}
