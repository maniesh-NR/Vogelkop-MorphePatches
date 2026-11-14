package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qga implements c3c {
    public final vhl b;
    public final int c;
    public final j2m d;
    public final Function0 e;

    public qga(vhl vhlVar, int i, j2m j2mVar, Function0 function0) {
        this.b = vhlVar;
        this.c = i;
        this.d = j2mVar;
        this.e = function0;
    }

    @Override // defpackage.c3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        long j2;
        if (pfdVar.J(yo5.g(j)) < yo5.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = yo5.a(0, Integer.MAX_VALUE, 0, 0, 13, j2);
        }
        ifg ifgVarN = pfdVar.N(j);
        int iMin = Math.min(ifgVarN.a, yo5.h(j2));
        return vfdVar.b0(iMin, ifgVarN.b, n08.a, new tw0(this, vfdVar, ifgVarN, iMin, (byte) 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qga) {
            qga qgaVar = (qga) obj;
            if (this.b == qgaVar.b && this.c == qgaVar.c && this.d.equals(qgaVar.d) && Intrinsics.a(this.e, qgaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + rfp.c(this.c, this.b.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ")";
    }
}
