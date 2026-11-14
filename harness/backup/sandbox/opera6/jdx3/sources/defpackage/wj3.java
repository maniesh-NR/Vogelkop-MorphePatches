package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wj3 {
    public final sj3 a;
    public final String b;

    public wj3(sj3 sj3Var, String str) {
        this.a = sj3Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj3)) {
            return false;
        }
        wj3 wj3Var = (wj3) obj;
        return this.a == wj3Var.a && Intrinsics.a(this.b, wj3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
