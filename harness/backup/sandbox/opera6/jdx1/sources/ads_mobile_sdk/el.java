package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.mip;
import defpackage.skp;
import defpackage.tso;
import defpackage.y8p;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class el implements hlo {
    public final tso a;
    public final tso b;
    public final ah0 c;
    public final tso d;
    public final tso e;
    public final ah0 f;
    public final /* synthetic */ byte g;

    public /* synthetic */ el(ah0 ah0Var, ah0 ah0Var2, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, byte b) {
        this.g = b;
        this.c = ah0Var;
        this.f = ah0Var2;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
    }

    public /* synthetic */ el(tso tsoVar, tso tsoVar2, ah0 ah0Var, tso tsoVar3, tso tsoVar4, ah0 ah0Var2, byte b) {
        this.g = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = ah0Var;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = ah0Var2;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.g;
        tso tsoVar = this.e;
        tso tsoVar2 = this.d;
        tso tsoVar3 = this.b;
        tso tsoVar4 = this.a;
        ah0 ah0Var = this.f;
        ah0 ah0Var2 = this.c;
        switch (b) {
            case 0:
                return new dl((uv2) tsoVar4.get(), (gp3) tsoVar3.get(), (vz) ah0Var2.get(), (skp) tsoVar2.get(), (qr0) tsoVar.get(), (ah3) ah0Var.get());
            case 1:
                qr0 qr0Var = (qr0) tsoVar4.get();
                mip mipVar = (mip) tsoVar3.get();
                nx5 nx5Var = (nx5) ah0Var2.get();
                ux2 ux2Var = (ux2) tsoVar2.get();
                return new bj3((vz) ah0Var.get(), qr0Var, (g0) tsoVar.get(), ux2Var, mipVar, nx5Var);
            case 2:
                nx5 nx5Var2 = (nx5) ah0Var2.get();
                vz vzVar = (vz) ah0Var.get();
                mip mipVar2 = (mip) tsoVar4.get();
                return new e3(vzVar, (qr0) tsoVar3.get(), (g0) tsoVar.get(), (ux2) tsoVar2.get(), mipVar2, nx5Var2);
            default:
                return new xa2((nx5) ah0Var2.get(), (CoroutineContext) ah0Var.get(), (lu2) tsoVar4.get(), (mip) tsoVar3.get(), (mt2) tsoVar2.get(), (y8p) tsoVar.get());
        }
    }
}
