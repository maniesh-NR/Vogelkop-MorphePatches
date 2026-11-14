package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class syi {
    public final nyi a;
    public final nyi b;
    public final boolean c;

    public syi(nyi nyiVar, nyi nyiVar2, boolean z) {
        this.a = nyiVar;
        this.b = nyiVar2;
        this.c = z;
    }

    public static syi a(syi syiVar, nyi nyiVar, nyi nyiVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            nyiVar = syiVar.a;
        }
        if ((i & 2) != 0) {
            nyiVar2 = syiVar.b;
        }
        syiVar.getClass();
        return new syi(nyiVar, nyiVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syi)) {
            return false;
        }
        syi syiVar = (syi) obj;
        return Intrinsics.a(this.a, syiVar.a) && Intrinsics.a(this.b, syiVar.b) && this.c == syiVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return z1m.m(sb, this.c, ")");
    }
}
