package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class elc {
    public final nmc a;
    public final boolean b;

    public elc(nmc nmcVar, boolean z) {
        this.a = nmcVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elc)) {
            return false;
        }
        elc elcVar = (elc) obj;
        return Intrinsics.a(this.a, elcVar.a) && this.b == elcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
