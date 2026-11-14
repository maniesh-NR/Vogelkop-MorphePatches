package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j2n implements c3c {
    public final vhl b;
    public final int c;
    public final j2m d;
    public final Function0 e;

    public j2n(vhl vhlVar, int i, j2m j2mVar, Function0 function0) {
        this.b = vhlVar;
        this.c = i;
        this.d = j2mVar;
        this.e = function0;
    }

    @Override // defpackage.c3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        ifg ifgVarN = pfdVar.N(yo5.a(0, 0, 0, Integer.MAX_VALUE, 7, j));
        int iMin = Math.min(ifgVarN.b, yo5.g(j));
        return vfdVar.b0(ifgVarN.a, iMin, n08.a, new bl3(this, ifgVarN, iMin, (byte) 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j2n) {
            j2n j2nVar = (j2n) obj;
            if (this.b == j2nVar.b && this.c == j2nVar.c && this.d.equals(j2nVar.d) && Intrinsics.a(this.e, j2nVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + rfp.c(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ")";
    }
}
