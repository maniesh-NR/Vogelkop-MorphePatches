package ads_mobile_sdk;

import defpackage.akp;
import defpackage.aqo;
import defpackage.bro;
import defpackage.bwg;
import defpackage.hlo;
import defpackage.mip;
import defpackage.skp;
import defpackage.tso;
import defpackage.wzo;
import java.util.Random;

/* loaded from: classes.dex */
public final class b implements hlo {
    public final tso a;
    public final /* synthetic */ byte b;

    public /* synthetic */ b(tso tsoVar, byte b) {
        this.b = b;
        this.a = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.b;
        byte b2 = 7;
        byte b3 = 6;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                return new a((th3) tsoVar.get());
            case 1:
                su1 su1Var = (su1) tsoVar.get();
                bwg.o(su1Var);
                return su1Var;
            case 2:
                return new ez1((in3) tsoVar.get(), b3);
            case 3:
                return new akp(tsoVar, false);
            case 4:
                return new l61(tsoVar, true);
            case 5:
                return new zf3((mip) tsoVar.get());
            case 6:
                og0 og0Var = (og0) tsoVar.get();
                bwg.o(og0Var);
                return og0Var;
            case 7:
                return new zh3((w12) tsoVar.get());
            case 8:
                return new ez1((lg) tsoVar.get(), b2);
            case 9:
                return new ez1((xr2) tsoVar.get(), b3);
            case 10:
                oz1 oz1Var = (oz1) tsoVar.get();
                bwg.o(oz1Var);
                return oz1Var;
            case 11:
                return new a1((bro) tsoVar.get());
            case 12:
                return new ez1((wzo) tsoVar.get(), b3);
            case 13:
                return new a33(nj0.a(tsoVar));
            case 14:
                return new a41((ek) tsoVar.get());
            case 15:
                return new akp(tsoVar, false);
            case 16:
                return new a80(nj0.a(tsoVar));
            case 17:
                return new ab2((dr2) tsoVar.get());
            case 18:
                ((skp) tsoVar.get()).getClass();
                String strValueOf = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
                bwg.o(strValueOf);
                return strValueOf;
            case 19:
                return new ez1((dt) tsoVar.get(), b2);
            case 20:
                ph0 ph0Var = (ph0) tsoVar.get();
                bwg.o(ph0Var);
                return ph0Var;
            case 21:
                j12 j12Var = (j12) tsoVar.get();
                bwg.o(j12Var);
                return j12Var;
            case 22:
                return new ez1((sq1) tsoVar.get(), b3);
            case 23:
                return new l61(tsoVar, true);
            case 24:
                n12 n12Var = (n12) tsoVar.get();
                bwg.o(n12Var);
                return n12Var;
            case 25:
                return new bi((g0) tsoVar.get());
            case 26:
                lx lxVar = (lx) tsoVar.get();
                bwg.o(lxVar);
                return lxVar;
            case 27:
                return new ez1((aqo) tsoVar.get(), b2);
            case 28:
                ((skp) tsoVar.get()).getClass();
                String strValueOf2 = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
                bwg.o(strValueOf2);
                return strValueOf2;
            default:
                li3 li3Var = (li3) tsoVar.get();
                bwg.o(li3Var);
                return li3Var;
        }
    }
}
