package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;

/* loaded from: classes.dex */
public final class li implements hlo {
    public final ob1 a;
    public final ah0 b;
    public final tso c;
    public final /* synthetic */ byte d;

    public /* synthetic */ li(ob1 ob1Var, ah0 ah0Var, tso tsoVar, byte b) {
        this.d = b;
        this.a = ob1Var;
        this.b = ah0Var;
        this.c = tsoVar;
    }

    public li(ob1 ob1Var, tso tsoVar, ah0 ah0Var) {
        this.d = (byte) 1;
        this.a = ob1Var;
        this.c = tsoVar;
        this.b = ah0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        switch (this.d) {
            case 0:
                return new ki((Context) this.a.a, (ah3) this.b.get(), (mip) this.c.get());
            case 1:
                return new zv1((Context) this.a.a, (qr0) this.c.get(), (ah3) this.b.get());
            default:
                return new b90((Context) this.a.a, (nx5) this.b.get(), (ux2) this.c.get());
        }
    }
}
