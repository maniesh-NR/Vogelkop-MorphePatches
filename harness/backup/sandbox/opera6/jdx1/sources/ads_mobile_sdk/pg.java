package ads_mobile_sdk;

import android.content.Context;
import defpackage.dkp;
import defpackage.hlo;
import defpackage.k3p;
import defpackage.tso;
import defpackage.yjp;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class pg implements hlo {
    public final tso a;
    public final tso b;
    public final tso c;
    public final ob1 d;
    public final tso e;
    public final ob1 f;
    public final tso g;
    public final /* synthetic */ byte h = 1;

    public pg(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, ob1 ob1Var2, tso tsoVar4, tso tsoVar5) {
        this.d = ob1Var;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.f = ob1Var2;
        this.e = tsoVar4;
        this.g = tsoVar5;
    }

    public pg(tso tsoVar, tso tsoVar2, ob1 ob1Var, tso tsoVar3, ob1 ob1Var2, tso tsoVar4, tso tsoVar5) {
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = ob1Var;
        this.c = tsoVar3;
        this.f = ob1Var2;
        this.e = tsoVar4;
        this.g = tsoVar5;
    }

    public pg(tso tsoVar, tso tsoVar2, tso tsoVar3, ob1 ob1Var, tso tsoVar4, ob1 ob1Var2, tso tsoVar5) {
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.d = ob1Var;
        this.e = tsoVar4;
        this.f = ob1Var2;
        this.g = tsoVar5;
    }

    public pg(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, ob1 ob1Var, ob1 ob1Var2) {
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.e = tsoVar4;
        this.g = tsoVar5;
        this.d = ob1Var;
        this.f = ob1Var2;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.h;
        tso tsoVar = this.g;
        tso tsoVar2 = this.e;
        ob1 ob1Var = this.f;
        tso tsoVar3 = this.c;
        ob1 ob1Var2 = this.d;
        tso tsoVar4 = this.b;
        tso tsoVar5 = this.a;
        switch (b) {
            case 0:
                return new og((k3p) tsoVar5.get(), (rp1) tsoVar4.get(), (Map) tsoVar3.get(), (Context) ob1Var2.a, (ga3) tsoVar2.get(), (l7) ob1Var.a, (th3) tsoVar.get());
            case 1:
                return new cl2((Context) ob1Var2.a, nj0.a(tsoVar5), (yjp) tsoVar4.get(), (th3) tsoVar3.get(), (ExecutorService) ob1Var.a, (pl2) tsoVar2.get(), (z6) tsoVar.get());
            case 2:
                return new k43((qm1) tsoVar5.get(), (dkp) tsoVar4.get(), (cb3) tsoVar3.get(), (ia3) tsoVar2.get(), (th3) tsoVar.get(), (l7) ob1Var2.a, (ExecutorService) ob1Var.a);
            default:
                return new r62((CoroutineContext) tsoVar5.get(), (nx5) tsoVar4.get(), (a2) ob1Var2.a, (s52) tsoVar3.get(), (sy0) ob1Var.a, (f72) tsoVar2.get(), (qr0) tsoVar.get());
        }
    }
}
