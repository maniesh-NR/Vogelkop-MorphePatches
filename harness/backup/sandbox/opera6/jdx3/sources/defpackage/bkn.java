package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bkn {
    public final aln a;
    public final int b;

    public bkn(aln alnVar, int i) {
        this.a = alnVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkn)) {
            return false;
        }
        bkn bknVar = (bkn) obj;
        return Intrinsics.a(this.a, bknVar.a) && this.b == bknVar.b;
    }

    public final int hashCode() {
        return vep.A(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
