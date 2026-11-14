package ads_mobile_sdk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import defpackage.anp;
import defpackage.dkp;
import defpackage.f9p;
import defpackage.fjp;
import defpackage.hlo;
import defpackage.k3p;
import defpackage.tso;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class r implements hlo {
    public final tso a;
    public final tso b;
    public final tso c;
    public final ob1 d;
    public final tso e;
    public final /* synthetic */ byte f;

    public r(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4) {
        this.f = (byte) 4;
        this.d = ob1Var;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.e = tsoVar4;
    }

    public r(tso tsoVar, tso tsoVar2, ob1 ob1Var, tso tsoVar3, tso tsoVar4) {
        this.f = (byte) 7;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = ob1Var;
        this.c = tsoVar3;
        this.e = tsoVar4;
    }

    public /* synthetic */ r(tso tsoVar, tso tsoVar2, tso tsoVar3, ob1 ob1Var, tso tsoVar4, byte b) {
        this.f = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.d = ob1Var;
        this.e = tsoVar4;
    }

    public /* synthetic */ r(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, ob1 ob1Var, byte b) {
        this.f = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.e = tsoVar4;
        this.d = ob1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.f;
        tso tsoVar = this.e;
        tso tsoVar2 = this.c;
        ob1 ob1Var = this.d;
        tso tsoVar3 = this.b;
        tso tsoVar4 = this.a;
        switch (b) {
            case 0:
                return new q((k3p) tsoVar4.get(), (rp1) tsoVar3.get(), (View) tsoVar2.get(), (Activity) ob1Var.a, (th3) tsoVar.get());
            case 1:
                return new ar2((k3p) tsoVar4.get(), (rp1) tsoVar3.get(), (Map) tsoVar2.get(), (Context) ob1Var.a, (th3) tsoVar.get(), (byte) 0);
            case 2:
                return new cb3((mm0) tsoVar4.get(), (mm0) tsoVar3.get(), nj0.a(tsoVar2), (ExecutorService) ob1Var.a, (th3) tsoVar.get());
            case 3:
                return new g43((vn3) tsoVar4.get(), (ab3) tsoVar3.get(), (dkp) tsoVar2.get(), (th3) tsoVar.get(), (ExecutorService) ob1Var.a);
            case 4:
                return new f9p((Context) ob1Var.a, (xq0) tsoVar4.get(), (a80) tsoVar3.get(), (o03) tsoVar2.get(), (aj) tsoVar.get());
            case 5:
                Context context = (Context) tsoVar4.get();
                anp anpVar = (anp) tsoVar3.get();
                ExecutorService executorService = (ExecutorService) tsoVar2.get();
                s11 s11Var = (s11) tsoVar.get();
                l7 l7Var = (l7) ob1Var.a;
                return new qm1(context, anpVar, executorService, s11Var, new Random(), l7Var.G().s(), l7Var.G().p(), l7Var.G().q(), l7Var.G().r(), l7Var.D(), l7Var.C(), sko.b(l7Var.K()));
            case 6:
                return new q((k3p) tsoVar4.get(), (rp1) tsoVar3.get(), (ga3) tsoVar2.get(), (Map) ob1Var.a, (th3) tsoVar.get());
            default:
                k1 k1Var = (k1) tsoVar4.get();
                d6 d6Var = (d6) tsoVar3.get();
                Context context2 = (Context) ob1Var.a;
                return new yc2(k1Var, d6Var, context2, (fjp) tsoVar.get());
        }
    }
}
