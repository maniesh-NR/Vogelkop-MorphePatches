package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class clc {
    public final kmc a;
    public final boolean b;

    public clc(kmc kmcVar, boolean z) {
        this.a = kmcVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clc)) {
            return false;
        }
        clc clcVar = (clc) obj;
        return Intrinsics.a(this.a, clcVar.a) && this.b == clcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
