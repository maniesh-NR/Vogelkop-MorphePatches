package ads_mobile_sdk;

import android.os.SystemClock;
import defpackage.akp;
import defpackage.bwg;
import defpackage.fjp;
import defpackage.hlo;
import defpackage.hlp;
import defpackage.mip;
import defpackage.skp;
import defpackage.tso;
import defpackage.w7p;
import java.util.Random;

/* loaded from: classes.dex */
public final class vh implements hlo {
    public final tso a;
    public final /* synthetic */ byte b;

    public /* synthetic */ vh(tso tsoVar, byte b) {
        this.b = b;
        this.a = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        defpackage.bu1 bu1Var;
        byte b = 5;
        byte b2 = 6;
        switch (this.b) {
            case 0:
                cd3 cd3Var = (cd3) this.a.get();
                bwg.o(cd3Var);
                return cd3Var;
            case 1:
                return new ez1((dt) this.a.get(), b2);
            case 2:
                return new l61(this.a, false);
            case 3:
                return new ez1((kv2) this.a.get(), b);
            case 4:
                return new fjp((w7p) this.a.get());
            case 5:
                h9 h9Var = (h9) this.a.get();
                bwg.o(h9Var);
                return h9Var;
            case 6:
                by2 by2Var = (by2) this.a.get();
                bwg.o(by2Var);
                return by2Var;
            case 7:
                ph0 ph0Var = (ph0) this.a.get();
                bwg.o(ph0Var);
                return ph0Var;
            case 8:
                return new w8((jx1) this.a.get());
            case 9:
                return new ez1((hlp) this.a.get(), b2);
            case 10:
                return new akp(this.a, false);
            case 11:
                return new ez1((c23) this.a.get(), b);
            case 12:
                return new ve2((defpackage.r83) this.a.get());
            case 13:
                pa3 pa3Var = (pa3) this.a.get();
                bwg.o(pa3Var);
                return pa3Var;
            case 14:
                cd3 cd3Var2 = (cd3) this.a.get();
                bwg.o(cd3Var2);
                return cd3Var2;
            case 15:
                return new oo3((uo3) this.a.get());
            case 16:
                return new su2((mip) this.a.get());
            case 17:
                ((mip) this.a.get()).getClass();
                return Long.valueOf(SystemClock.elapsedRealtime());
            case 18:
                return new ez1((yr0) this.a.get(), b2);
            case 19:
                return new l61(this.a, false);
            case 20:
                return new l61(this.a, false);
            case 21:
                return new we1((it1) this.a.get());
            case 22:
                jk jkVar = (jk) this.a.get();
                synchronized (jkVar.c) {
                    Long lValueOf = jkVar.f;
                    if (lValueOf == null) {
                        jkVar.a.getClass();
                        lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
                        jkVar.f = lValueOf;
                    }
                    jkVar.d++;
                    jkVar.e++;
                    long jLongValue = lValueOf.longValue();
                    jkVar.a.getClass();
                    bu1Var = new defpackage.bu1(String.valueOf(jkVar.d), jkVar.d, jkVar.e, SystemClock.elapsedRealtime() - jLongValue);
                }
                return bu1Var;
            case 23:
                return new wp((qr0) this.a.get());
            case 24:
                return new akp(this.a, false);
            case 25:
                return new l61(this.a, false);
            case 26:
                d90 d90Var = (d90) this.a.get();
                bwg.o(d90Var);
                return d90Var;
            case 27:
                ((skp) this.a.get()).getClass();
                String strValueOf = String.valueOf(new Random().nextInt(Integer.MAX_VALUE));
                bwg.o(strValueOf);
                return strValueOf;
            case 28:
                return new ez1((m21) this.a.get(), b2);
            default:
                return new akp(this.a, false);
        }
    }
}
