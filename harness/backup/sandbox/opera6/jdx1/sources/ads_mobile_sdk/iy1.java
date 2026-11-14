package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.tso;
import defpackage.yko;
import defpackage.z7p;

/* loaded from: classes.dex */
public final class iy1 implements hlo {
    public final tso a;
    public final ah0 b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final m g;
    public final /* synthetic */ byte h = 1;

    public iy1(tso tsoVar, ah0 ah0Var, tso tsoVar2, tso tsoVar3, tso tsoVar4, m mVar, tso tsoVar5) {
        this.a = tsoVar;
        this.b = ah0Var;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.g = mVar;
        this.f = tsoVar5;
    }

    public iy1(tso tsoVar, ah0 ah0Var, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, m mVar) {
        this.a = tsoVar;
        this.b = ah0Var;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
        this.g = mVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.h;
        m mVar = this.g;
        tso tsoVar = this.e;
        tso tsoVar2 = this.d;
        tso tsoVar3 = this.c;
        ah0 ah0Var = this.b;
        tso tsoVar4 = this.a;
        switch (b) {
            case 0:
                return new o6((nx5) tsoVar4.get(), (nx5) ah0Var.get(), (qr0) tsoVar3.get(), (oo3) tsoVar2.get(), (ux2) tsoVar.get(), this.f, (yko) mVar.get());
            default:
                return new k93((nx5) tsoVar4.get(), (nx5) ah0Var.get(), (qr0) tsoVar3.get(), (oo3) tsoVar2.get(), (z7p) tsoVar.get(), (yko) mVar.get(), (ux2) this.f.get());
        }
    }
}
