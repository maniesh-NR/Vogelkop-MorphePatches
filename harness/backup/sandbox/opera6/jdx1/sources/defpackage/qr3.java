package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qr3 implements tfd {
    public final td3 a;
    public final boolean b;

    public qr3(td3 td3Var, boolean z) {
        this.a = td3Var;
        this.b = z;
    }

    @Override // defpackage.tfd
    public final ufd b(vfd vfdVar, List list, long j) {
        ifg ifgVarN;
        int iMax;
        int i;
        if (list.isEmpty()) {
            return vfdVar.b0(yo5.j(j), yo5.i(j), n08.a, new mr3((byte) 1));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            pfd pfdVar = (pfd) list.get(0);
            Object objP = pfdVar.p();
            kr3 kr3Var = objP instanceof kr3 ? (kr3) objP : null;
            if (kr3Var != null ? kr3Var.p : false) {
                int iJ = yo5.j(j);
                int i2 = yo5.i(j);
                int iJ2 = yo5.j(j);
                int i3 = yo5.i(j);
                if (!((iJ2 >= 0) & (i3 >= 0))) {
                    c8b.a("width and height must be >= 0");
                }
                ifgVarN = pfdVar.N(ap5.h(iJ2, iJ2, i3, i3));
                iMax = i2;
                i = iJ;
            } else {
                ifg ifgVarN2 = pfdVar.N(j2);
                int iMax2 = Math.max(yo5.j(j), ifgVarN2.a);
                iMax = Math.max(yo5.i(j), ifgVarN2.b);
                i = iMax2;
                ifgVarN = ifgVarN2;
            }
            return vfdVar.b0(i, iMax, n08.a, new or3(ifgVarN, pfdVar, vfdVar, i, iMax, this));
        }
        ifg[] ifgVarArr = new ifg[list.size()];
        nqh nqhVar = new nqh();
        nqhVar.a = yo5.j(j);
        nqh nqhVar2 = new nqh();
        nqhVar2.a = yo5.i(j);
        List list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            pfd pfdVar2 = (pfd) list.get(i4);
            Object objP2 = pfdVar2.p();
            kr3 kr3Var2 = objP2 instanceof kr3 ? (kr3) objP2 : null;
            if (kr3Var2 != null ? kr3Var2.p : false) {
                z = true;
            } else {
                ifg ifgVarN3 = pfdVar2.N(j2);
                ifgVarArr[i4] = ifgVarN3;
                nqhVar.a = Math.max(nqhVar.a, ifgVarN3.a);
                nqhVar2.a = Math.max(nqhVar2.a, ifgVarN3.b);
            }
        }
        if (z) {
            int i5 = nqhVar.a;
            int i6 = i5 != Integer.MAX_VALUE ? i5 : 0;
            int i7 = nqhVar2.a;
            long jA = ap5.a(i6, i5, i7 != Integer.MAX_VALUE ? i7 : 0, i7);
            int size2 = list2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                pfd pfdVar3 = (pfd) list.get(i8);
                Object objP3 = pfdVar3.p();
                kr3 kr3Var3 = objP3 instanceof kr3 ? (kr3) objP3 : null;
                if (kr3Var3 != null ? kr3Var3.p : false) {
                    ifgVarArr[i8] = pfdVar3.N(jA);
                }
            }
        }
        return vfdVar.b0(nqhVar.a, nqhVar2.a, n08.a, new pr3(ifgVarArr, list, vfdVar, nqhVar, nqhVar2, this, (byte) 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr3)) {
            return false;
        }
        qr3 qr3Var = (qr3) obj;
        return Intrinsics.a(this.a, qr3Var.a) && this.b == qr3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
