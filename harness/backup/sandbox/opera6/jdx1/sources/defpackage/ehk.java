package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ehk implements of1 {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof ehk) {
            return Intrinsics.a(this.a, ((ehk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("StringAnnotation(value=", this.a, ")");
    }
}
