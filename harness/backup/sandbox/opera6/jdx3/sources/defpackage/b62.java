package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b62 extends z5i {
    public final String x;
    public final String y;

    public b62(String str, String str2) {
        this.x = str;
        this.y = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b62)) {
            return false;
        }
        b62 b62Var = (b62) obj;
        return Intrinsics.a(this.x, b62Var.x) && Intrinsics.a(this.y, b62Var.y);
    }

    public final int hashCode() {
        return this.y.hashCode() + (this.x.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
