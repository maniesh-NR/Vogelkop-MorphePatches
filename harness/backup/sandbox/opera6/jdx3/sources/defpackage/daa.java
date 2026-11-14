package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class daa {
    public final h58 a;

    public daa(h58 h58Var) {
        this.a = h58Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof daa) && Intrinsics.a(this.a, ((daa) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
