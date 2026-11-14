package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class s0e extends b8e implements hi5, e3c {
    public LinkedHashMap o;

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        int iMax;
        float f = ((gh7) z4o.N(this, xdb.c)).a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        ifg ifgVarN = pfdVar.N(j);
        boolean z = this.n && !Float.isNaN(f) && gh7.a(f, 0.0f) > 0;
        int iM = !Float.isNaN(f) ? vfdVar.M(f) : 0;
        int iMax2 = ifgVarN.a;
        if (z) {
            iMax2 = Math.max(iMax2, iM);
            iMax = Math.max(ifgVarN.b, iM);
        } else {
            iMax = ifgVarN.b;
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.o;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.o = linkedHashMap;
            }
            h2n h2nVar = xdb.b;
            int iRound = Math.round((iM - ifgVarN.a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(h2nVar, Integer.valueOf(iRound));
            mga mgaVar = xdb.a;
            int iRound2 = Math.round((iM - ifgVarN.b) / 2.0f);
            linkedHashMap.put(mgaVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        n08 n08Var = this.o;
        if (n08Var == null) {
            n08Var = n08.a;
        }
        return vfdVar.b0(iMax2, iMax, n08Var, new y9b(iMax2, ifgVarN, iMax));
    }
}
