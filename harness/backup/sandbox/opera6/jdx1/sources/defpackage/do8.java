package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class do8 {
    public final nsj a;
    public final ue5 b;

    public do8(nsj nsjVar, ue5 ue5Var) {
        this.a = nsjVar;
        this.b = ue5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof do8) {
            do8 do8Var = (do8) obj;
            return Intrinsics.a(this.a, do8Var.a) && this.b == do8Var.b;
        }
        return false;
    }

    public final int hashCode() {
        nsj nsjVar = this.a;
        return this.b.hashCode() + ((nsjVar == null ? 0 : nsjVar.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
