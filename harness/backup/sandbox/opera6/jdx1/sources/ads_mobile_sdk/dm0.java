package ads_mobile_sdk;

import android.content.Context;
import defpackage.cqp;
import defpackage.fjp;
import defpackage.hlo;
import defpackage.tso;
import defpackage.uie;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class dm0 implements hlo {
    public final hlo a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final hlo g;
    public final /* synthetic */ byte h = 6;

    public dm0(ah0 ah0Var, ah0 ah0Var2, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, ab0 ab0Var, ab0 ab0Var2, ab0 ab0Var3, ab0 ab0Var4, ab0 ab0Var5, ob0 ob0Var, tso tsoVar5) {
        this.a = ah0Var;
        this.g = ah0Var2;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = tsoVar5;
    }

    public dm0(ob1 ob1Var, ah0 ah0Var, tso tsoVar, vh vhVar, ob1 ob1Var2, tso tsoVar2, ah0 ah0Var2) {
        this.a = ob1Var;
        this.d = ah0Var;
        this.b = tsoVar;
        this.e = vhVar;
        this.g = ob1Var2;
        this.c = tsoVar2;
        this.f = ah0Var2;
    }

    public dm0(ob1 ob1Var, ah0 ah0Var, tso tsoVar, tso tsoVar2, ob1 ob1Var2, ob1 ob1Var3, tso tsoVar3) {
        this.a = ob1Var;
        this.e = ah0Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.g = ob1Var2;
        this.f = ob1Var3;
        this.d = tsoVar3;
    }

    public dm0(ob1 ob1Var, ob1 ob1Var2, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, ob1 ob1Var3) {
        this.a = ob1Var;
        this.g = ob1Var2;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = ob1Var3;
    }

    public dm0(ob1 ob1Var, tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, n90 n90Var, ob1 ob1Var2) {
        this.a = ob1Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.f = n90Var;
        this.g = ob1Var2;
    }

    public dm0(v3 v3Var, tso tsoVar, tso tsoVar2, cg cgVar, ej ejVar, tso tsoVar3, tso tsoVar4) {
        this.a = v3Var;
        this.b = tsoVar;
        this.c = tsoVar2;
        this.g = cgVar;
        this.f = ejVar;
        this.d = tsoVar3;
        this.e = tsoVar4;
    }

    public dm0(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, hlo hloVar, ah0 ah0Var, tso tsoVar5) {
        this.b = tsoVar;
        this.c = tsoVar2;
        this.d = tsoVar3;
        this.e = tsoVar4;
        this.a = hloVar;
        this.g = ah0Var;
        this.f = tsoVar5;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.h;
        tso tsoVar = this.f;
        tso tsoVar2 = this.e;
        tso tsoVar3 = this.d;
        tso tsoVar4 = this.c;
        tso tsoVar5 = this.b;
        hlo hloVar = this.g;
        hlo hloVar2 = this.a;
        switch (b) {
            case 0:
                return new bm0((ExecutorService) ((ob1) hloVar2).a, nj0.a(tsoVar5), nj0.a(tsoVar4), (ia3) tsoVar3.get(), nj0.a(tsoVar2), (n90) tsoVar, (l7) ((ob1) hloVar).a);
            case 1:
                return new gc2((sc2) tsoVar5.get(), (ae2) tsoVar4.get(), (defpackage.r83) tsoVar3.get(), (av2) tsoVar2.get(), ((Integer) hloVar2.get()).intValue(), (ah3) ((ah0) hloVar).get(), (fjp) tsoVar.get());
            case 2:
                Context context = (Context) ((ob1) hloVar2).a;
                nx5 nx5Var = (nx5) ((ah0) tsoVar2).get();
                cg0 cg0Var = (cg0) tsoVar5.get();
                qr0 qr0Var = (qr0) tsoVar4.get();
                defpackage.r83 r83Var = (defpackage.r83) ((ob1) hloVar).a;
                a2 a2Var = (a2) ((ob1) tsoVar).a;
                return new hg0(context, nx5Var, cg0Var, qr0Var, r83Var.m(), a2Var.z, a2Var.A, (kh3) tsoVar3.get());
            case 3:
                Context context2 = (Context) ((ob1) hloVar2).a;
                ExecutorService executorService = (ExecutorService) ((ob1) hloVar).a;
                a aVar = (a) tsoVar5.get();
                n83 n83Var = (n83) tsoVar4.get();
                File file = (File) tsoVar3.get();
                th3 th3Var = (th3) tsoVar2.get();
                l7 l7Var = (l7) ((ob1) tsoVar).a;
                return new rp1(context2, executorService, aVar, n83Var, file, th3Var, l7Var.H(), (Set) cqp.l.get());
            case 4:
                return new sq1(nj0.a((v3) hloVar2), nj0.a(tsoVar5), nj0.a(tsoVar4), nj0.a((cg) hloVar), nj0.a((ej) tsoVar), (g0) tsoVar3.get(), (jz2) tsoVar2.get());
            case 5:
                return new wt1((Context) ((ob1) hloVar2).a, (CoroutineContext) ((ah0) tsoVar3).get(), (jx1) tsoVar5.get(), (w8) ((vh) tsoVar2).get(), (uie) ((ob1) hloVar).a, (qr0) tsoVar4.get(), (ah3) ((ah0) tsoVar).get());
            default:
                nx5 nx5Var2 = (nx5) ((ah0) hloVar2).get();
                ux2 ux2Var = (ux2) tsoVar5.get();
                qr0 qr0Var2 = (qr0) tsoVar3.get();
                return new xj2(nx5Var2, ux2Var, qr0Var2, (a33) tsoVar.get());
        }
    }
}
