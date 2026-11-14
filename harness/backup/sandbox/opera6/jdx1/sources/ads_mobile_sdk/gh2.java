package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class gh2 implements hlo {
    public final tso a;
    public final ah0 b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final /* synthetic */ byte f;

    public /* synthetic */ gh2(tso tsoVar, ah0 ah0Var, tso tsoVar2, tso tsoVar3, tso tsoVar4, byte b) {
        this.f = b;
        this.a = tsoVar;
        this.b = ah0Var;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
    }

    @Override // defpackage.tso
    public final Object get() {
        switch (this.f) {
            case 0:
                xj2 xj2Var = (xj2) this.a.get();
                nx5 nx5Var = (nx5) this.b.get();
                av2 av2Var = (av2) this.c.get();
                qr0 qr0Var = (qr0) this.d.get();
                return new fh2(xj2Var, nx5Var, av2Var, qr0Var);
            default:
                return new r41((im3) this.a.get(), (nx5) this.b.get(), (nx5) this.c.get(), (ux2) this.d.get(), (qr0) this.e.get());
        }
    }
}
