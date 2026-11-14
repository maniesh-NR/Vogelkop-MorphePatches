package ads_mobile_sdk;

import defpackage.avo;
import defpackage.coh;
import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;
import defpackage.z7p;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class hk implements hlo {
    public final ah0 a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final /* synthetic */ byte e;

    public /* synthetic */ hk(ah0 ah0Var, tso tsoVar, tso tsoVar2, tso tsoVar3, byte b) {
        this.e = b;
        this.a = ah0Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
    }

    public /* synthetic */ hk(tso tsoVar, tso tsoVar2, ah0 ah0Var, tso tsoVar3, byte b) {
        this.e = b;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.a = ah0Var;
        this.d = tsoVar3;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.e;
        tso tsoVar = this.d;
        tso tsoVar2 = this.c;
        tso tsoVar3 = this.b;
        ah0 ah0Var = this.a;
        switch (b) {
            case 0:
                return new dk((CoroutineContext) ah0Var.get(), (aj) tsoVar3.get(), (mip) tsoVar2.get(), (qr0) tsoVar.get());
            case 1:
                return new avo((ux2) tsoVar3.get(), coh.e(), (ax0) tsoVar2.get(), (nx5) ah0Var.get(), (qr0) tsoVar.get());
            case 2:
                return new z7p((ux2) tsoVar3.get(), coh.e(), (ax0) tsoVar2.get(), (nx5) ah0Var.get(), (qr0) tsoVar.get());
            case 3:
                return new ph0((nx5) ah0Var.get(), (qr0) tsoVar3.get(), (kh3) tsoVar2.get(), (ux2) tsoVar.get());
            default:
                return new x80((nx5) ah0Var.get(), (mip) tsoVar3.get(), (qr0) tsoVar2.get(), (x33) tsoVar.get());
        }
    }
}
