package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c8 {
    public final String a;
    public final br9 b;

    public c8(String str, br9 br9Var) {
        this.a = str;
        this.b = br9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return Intrinsics.a(this.a, c8Var.a) && Intrinsics.a(this.b, c8Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        br9 br9Var = this.b;
        return iHashCode + (br9Var != null ? br9Var.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
