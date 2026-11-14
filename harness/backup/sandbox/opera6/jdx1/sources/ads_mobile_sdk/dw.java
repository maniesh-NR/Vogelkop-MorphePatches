package ads_mobile_sdk;

import defpackage.a26;
import defpackage.bwg;
import defpackage.hlo;
import defpackage.mip;
import defpackage.pr4;
import defpackage.tso;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class dw implements hlo {
    public final tso a;
    public final ah0 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ dw(ah0 ah0Var, tso tsoVar, byte b) {
        this.c = b;
        this.b = ah0Var;
        this.a = tsoVar;
    }

    public /* synthetic */ dw(tso tsoVar, ah0 ah0Var, byte b) {
        this.c = b;
        this.a = tsoVar;
        this.b = ah0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.c;
        tso tsoVar = this.a;
        ah0 ah0Var = this.b;
        switch (b) {
            case 0:
                CoroutineContext coroutineContextPlus = kotlin.coroutines.e.a(new jg8(((qw) tsoVar.get()).c), (uu0) ah0Var.get()).plus(new rh3());
                bwg.o(coroutineContextPlus);
                return coroutineContextPlus;
            case 1:
                return a26.l0(new pr4((or4) tsoVar.get()), (nx5) ah0Var.get(), aej.b, 0);
            case 2:
                return new aq3((yq3) ah0Var.get(), (qr0) tsoVar.get());
            case 3:
                return new m41((bk1) tsoVar.get(), (vz) ah0Var.get(), (byte) 0);
            case 4:
                return new m41((d91) ah0Var.get(), tsoVar.get(), (byte) 2);
            case 5:
                return new en3((ah3) ah0Var.get(), (nx5) tsoVar.get());
            case 6:
                CoroutineContext coroutineContextPlus2 = kotlin.coroutines.e.a(new jg8(((qw) tsoVar.get()).f), (uu0) ah0Var.get()).plus(new rh3());
                bwg.o(coroutineContextPlus2);
                return coroutineContextPlus2;
            case 7:
                return new m41((d91) ah0Var.get(), tsoVar.get(), (byte) 5);
            case 8:
                uu0 uu0Var = (uu0) ah0Var.get();
                cv6 cv6Var = bb7.a;
                d7a d7aVar = s6d.a;
                d7aVar.getClass();
                CoroutineContext coroutineContextPlus3 = kotlin.coroutines.e.a(d7aVar, uu0Var).plus(new rh3());
                bwg.o(coroutineContextPlus3);
                return coroutineContextPlus3;
            case 9:
                return new k71((d91) ah0Var.get(), (mip) tsoVar.get(), (m5a) defpackage.i41.k.get());
            case 10:
                CoroutineContext coroutineContextPlus4 = kotlin.coroutines.e.a(new jg8(((qw) tsoVar.get()).h), (uu0) ah0Var.get()).plus(new rh3());
                bwg.o(coroutineContextPlus4);
                return coroutineContextPlus4;
            case 11:
                return new l0((nx5) ah0Var.get(), (qr0) tsoVar.get());
            case 12:
                return new nn0((vz) ah0Var.get(), (bn0) tsoVar.get());
            case 13:
                return new o71((sb) tsoVar.get(), (ah3) ah0Var.get());
            case 14:
                return new se2((nx5) ah0Var.get(), (qr0) tsoVar.get());
            default:
                return new wp3((yq3) ah0Var.get(), (qr0) tsoVar.get());
        }
    }
}
