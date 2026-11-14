package ads_mobile_sdk;

import defpackage.akp;
import defpackage.bwg;
import defpackage.hlo;
import defpackage.sgb;
import defpackage.zch;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class da implements hlo {
    public final ah0 a;
    public final /* synthetic */ byte b;

    public /* synthetic */ da(ah0 ah0Var, byte b) {
        this.b = b;
        this.a = ah0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.b;
        byte b2 = 1;
        ah0 ah0Var = this.a;
        switch (b) {
            case 0:
                return new ca((z2) ah0Var.get());
            case 1:
                return new akp(ah0Var, false);
            case 2:
                z2 z2Var = (z2) ah0Var.get();
                bwg.o(z2Var);
                return z2Var;
            case 3:
                return new cn3((CoroutineContext) ah0Var.get());
            case 4:
                return new ez1((f92) ah0Var.get(), (byte) 6);
            case 5:
                return new da1((d91) ah0Var.get(), (byte) 0);
            case 6:
                return new e80((vz) ah0Var.get());
            case 7:
                return sgb.b(((CoroutineContext) ah0Var.get()).plus(zch.a()));
            case 8:
                return new e23((vz) ah0Var.get(), b2);
            case 9:
                return new ez1((f92) ah0Var.get(), (byte) 7);
            case 10:
                return new l61(ah0Var, true);
            case 11:
                return new j80((z2) ah0Var.get());
            case 12:
                return new a10((z2) ah0Var.get(), (byte) 0);
            case 13:
                return new l3((vz) ah0Var.get());
            case 14:
                return new lg((z2) ah0Var.get());
            case 15:
                k01 k01Var = (k01) ah0Var.get();
                bwg.o(k01Var);
                return k01Var;
            case 16:
                return new nb2((vz) ah0Var.get());
            case 17:
                return new oe((vz) ah0Var.get());
            case 18:
                return new oi((vz) ah0Var.get());
            case 19:
                return new ox1((z2) ah0Var.get());
            case 20:
                return new r23((vz) ah0Var.get());
            case 21:
                return new e7((d91) ah0Var.get(), (byte) 25);
            case 22:
                return new sb2((vz) ah0Var.get());
            case 23:
                return new da1((d91) ah0Var.get(), (byte) 1);
            case 24:
                return new ta1((d91) ah0Var.get());
            case 25:
                return new da1((d91) ah0Var.get(), (byte) 2);
            case 26:
                return new uu0((ah3) ah0Var.get());
            case 27:
                return new xx1((z2) ah0Var.get());
            case 28:
                return new y13((vz) ah0Var.get());
            default:
                return new l61(ah0Var, false);
        }
    }
}
