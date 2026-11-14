package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l0a {
    public final boolean a;
    public final v08 b;
    public final l08 c;

    public l0a(boolean z, v08 v08Var, l08 l08Var) {
        this.a = z;
        this.b = v08Var;
        this.c = l08Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0a)) {
            return false;
        }
        l0a l0aVar = (l0a) obj;
        return this.a == l0aVar.a && Intrinsics.a(this.b, l0aVar.b) && Intrinsics.a(this.c, l0aVar.c);
    }

    public final int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.a) + 1227104) * 31) + 1237;
        this.b.getClass();
        this.c.getClass();
        return ((((1 + (iHashCode * 961)) * 31) + 1237) * 31) + 1237;
    }

    public final String toString() {
        return "";
    }
}
