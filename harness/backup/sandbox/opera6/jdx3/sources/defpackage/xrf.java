package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xrf {
    public final String a;
    public final o65 b;

    public xrf(String str, o65 o65Var) {
        this.a = str;
        this.b = o65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrf)) {
            return false;
        }
        xrf xrfVar = (xrf) obj;
        return Intrinsics.a(this.a, xrfVar.a) && Intrinsics.a(this.b, xrfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
