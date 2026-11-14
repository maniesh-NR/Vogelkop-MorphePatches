package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fy1 {
    public final String a;
    public final d3k b;

    public fy1(String str, d3k d3kVar) {
        this.a = str;
        this.b = d3kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy1)) {
            return false;
        }
        fy1 fy1Var = (fy1) obj;
        return Intrinsics.a(this.a, fy1Var.a) && this.b.equals(fy1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
