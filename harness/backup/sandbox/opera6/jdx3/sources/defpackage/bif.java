package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bif implements dif {
    public final yg3 a;

    public bif(yg3 yg3Var) {
        this.a = yg3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bif) && Intrinsics.a(this.a, ((bif) obj).a);
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
