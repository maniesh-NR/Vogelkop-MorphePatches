package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lu7 {
    public final String a;
    public final nw0 b;

    public lu7(String str, nw0 nw0Var) {
        this.a = str;
        this.b = nw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu7)) {
            return false;
        }
        lu7 lu7Var = (lu7) obj;
        return Intrinsics.a(this.a, lu7Var.a) && this.b.equals(lu7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
