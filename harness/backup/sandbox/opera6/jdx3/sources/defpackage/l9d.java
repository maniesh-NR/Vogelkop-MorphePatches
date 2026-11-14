package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l9d {
    public final vj3 a;
    public final String b;

    public l9d(vj3 vj3Var, String str) {
        this.a = vj3Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9d)) {
            return false;
        }
        l9d l9dVar = (l9d) obj;
        return this.a.equals(l9dVar.a) && Intrinsics.a(this.b, l9dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
