package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nfj {
    public final mfj a;
    public final String b;

    public nfj(mfj mfjVar, String str) {
        this.a = mfjVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nfj)) {
            return false;
        }
        nfj nfjVar = (nfj) obj;
        return Intrinsics.a(this.a, nfjVar.a) && Intrinsics.a(this.b, nfjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
