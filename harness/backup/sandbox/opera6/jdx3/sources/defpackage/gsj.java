package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gsj {
    public final pxh a;
    public final short b;
    public final bsj c;

    /* JADX WARN: Multi-variable type inference failed */
    public gsj(pxh pxhVar, int i, bsj bsjVar) {
        this.a = pxhVar;
        this.b = i;
        this.c = bsjVar;
    }

    public /* synthetic */ gsj(pxh pxhVar, int i, bsj bsjVar, int i2) {
        this(pxhVar, i, (i2 & 4) != 0 ? null : bsjVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsj)) {
            return false;
        }
        gsj gsjVar = (gsj) obj;
        return Intrinsics.a(this.a, gsjVar.a) && this.b == gsjVar.b && Intrinsics.a(this.c, gsjVar.c);
    }

    public final int hashCode() {
        int iC = rfp.c(this.b, this.a.hashCode() * 31, 31);
        bsj bsjVar = this.c;
        return ((iC + (bsjVar == null ? 0 : bsjVar.hashCode())) * 961) + 1237;
    }

    public final String toString() {
        return "";
    }
}
