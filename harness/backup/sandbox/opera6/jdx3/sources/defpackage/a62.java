package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a62 extends z5i {
    public final String x;

    public a62(String str) {
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a62) && Intrinsics.a(this.x, ((a62) obj).x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "";
    }
}
