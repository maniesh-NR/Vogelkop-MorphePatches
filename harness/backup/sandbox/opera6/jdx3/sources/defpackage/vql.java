package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vql {
    public final pxh a;
    public final boolean b;

    public vql(pxh pxhVar, boolean z) {
        this.a = pxhVar;
        this.b = z;
    }

    public vql(rxh rxhVar, int i) {
        this((i & 1) != 0 ? new qxh("") : rxhVar, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vql)) {
            return false;
        }
        vql vqlVar = (vql) obj;
        return Intrinsics.a(this.a, vqlVar.a) && this.b == vqlVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
