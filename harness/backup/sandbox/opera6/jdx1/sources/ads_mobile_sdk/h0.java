package ads_mobile_sdk;

import android.app.Application;
import android.content.Context;
import defpackage.hlo;
import defpackage.mip;
import defpackage.tso;
import defpackage.uie;
import defpackage.yko;
import java.lang.ref.WeakReference;
import java.util.Optional;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class h0 implements hlo {
    public final hlo a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final /* synthetic */ byte g = 2;

    public h0(ob1 ob1Var, ob1 ob1Var2, ob1 ob1Var3, tso tsoVar, tso tsoVar2, tso tsoVar3) {
        this.a = ob1Var;
        this.c = ob1Var2;
        this.d = ob1Var3;
        this.b = tsoVar;
        this.e = tsoVar2;
        this.f = tsoVar3;
    }

    public h0(ob1 ob1Var, tso tsoVar, ob1 ob1Var2, ah0 ah0Var, tso tsoVar2, tso tsoVar3) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = ob1Var2;
        this.d = ah0Var;
        this.e = tsoVar2;
        this.f = tsoVar3;
    }

    public h0(ob1 ob1Var, tso tsoVar, tso tsoVar2, m mVar, tso tsoVar3, ob1 ob1Var2) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.e = tsoVar2;
        this.d = mVar;
        this.f = tsoVar3;
        this.c = ob1Var2;
    }

    public h0(tso tsoVar, tso tsoVar2, hlo hloVar, tso tsoVar3, tso tsoVar4, tso tsoVar5) {
        this.b = tsoVar;
        this.e = tsoVar2;
        this.a = hloVar;
        this.f = tsoVar3;
        this.c = tsoVar4;
        this.d = tsoVar5;
    }

    public h0(tso tsoVar, tso tsoVar2, tso tsoVar3, xh xhVar, hlo hloVar, ob1 ob1Var) {
        this.b = tsoVar;
        this.e = tsoVar2;
        this.f = tsoVar3;
        this.c = xhVar;
        this.d = hloVar;
        this.a = ob1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.g;
        tso tsoVar = this.c;
        tso tsoVar2 = this.f;
        tso tsoVar3 = this.d;
        tso tsoVar4 = this.e;
        tso tsoVar5 = this.b;
        hlo hloVar = this.a;
        switch (b) {
            case 0:
                return new g0((Context) ((ob1) hloVar).a, (Application) tsoVar5.get(), (WeakReference) ((ob1) tsoVar).a, (nx5) ((ah0) tsoVar3).get(), (qr0) tsoVar4.get(), (mip) tsoVar2.get());
            case 1:
                return new ee0((qr0) tsoVar5.get(), (Optional) tsoVar4.get(), (Optional) tsoVar2.get(), (sy2) ((xh) tsoVar).get(), (av2) ((hlo) tsoVar3).get(), (defpackage.r83) ((ob1) hloVar).a);
            case 2:
                return new el2((Context) ((ob1) hloVar).a, (ExecutorService) ((ob1) tsoVar).a, (l7) ((ob1) tsoVar3).a, (s11) tsoVar5.get(), (th3) tsoVar4.get(), (ql2) tsoVar2.get());
            case 3:
                return new j42((Context) tsoVar5.get(), (nx5) tsoVar4.get(), ((Integer) hloVar.get()).intValue(), (mip) tsoVar2.get(), (t42) tsoVar.get(), (am3) tsoVar3.get());
            default:
                return new xy1((Context) ((ob1) hloVar).a, (nx5) tsoVar5.get(), (oo3) tsoVar4.get(), (yko) ((m) tsoVar3).get(), (qr0) tsoVar2.get(), (uie) ((ob1) tsoVar).a);
        }
    }
}
