package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sw1 {
    public final tw1 a;
    public final String b;

    public sw1(tw1 tw1Var, String str) {
        this.a = tw1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw1)) {
            return false;
        }
        sw1 sw1Var = (sw1) obj;
        return this.a == sw1Var.a && Intrinsics.a(this.b, sw1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
