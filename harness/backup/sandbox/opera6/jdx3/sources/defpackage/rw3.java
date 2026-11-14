package defpackage;

import com.opera.android.Lazy;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class rw3 extends Lazy {
    public final /* synthetic */ byte e;
    public final /* synthetic */ tw3 f;

    public /* synthetic */ rw3(tw3 tw3Var, byte b) {
        this.e = b;
        this.f = tw3Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    @Override // com.opera.android.Lazy
    public final Object d() {
        byte b = this.e;
        byte b2 = 3;
        tw3 tw3Var = this.f;
        switch (b) {
            case 0:
                String[] strArr = OperaApplication.K;
                fp1 fp1Var = tw3Var.b;
                lz6 lz6Var = (lz6) ((OperaApplication) fp1Var.getApplication()).J.get();
                return new pz6(cqp.V(fp1Var.getLifecycle()), new xm5((au6) lz6Var.i.getValue()), lz6Var.b(), new ga6(lz6Var.d(), (byte) 3), lz6Var.a(), new xz6(lz6Var.e));
            case 1:
                String[] strArr2 = OperaApplication.K;
                ?? r4 = tw3Var.b;
                OperaApplication operaApplication = (OperaApplication) r4.getApplication();
                nw3 nw3Var = new nw3(operaApplication, (byte) 17);
                nw3 nw3Var2 = new nw3(operaApplication, (byte) 18);
                kze kzeVar = r4.h0;
                zv3 zv3Var = tw3Var.e;
                sw3 sw3Var = new sw3(tw3Var, (byte) 0);
                sw3 sw3Var2 = new sw3(tw3Var, (byte) 1);
                hx3 hx3Var = tw3Var.a;
                return new xg7(r4, nw3Var, nw3Var2, kzeVar, zv3Var, sw3Var, sw3Var2, hx3Var.q, new sw3(tw3Var, (byte) 2), operaApplication.e(), tw3Var.f0, tw3Var.X, new sw3(tw3Var, b2), tw3Var.c0, hx3Var.p, tw3Var.r0, new nw3(operaApplication, (byte) 19), new nw3(operaApplication, (byte) 20));
            case 2:
                String[] strArr3 = OperaApplication.K;
                return new urn(((OperaApplication) tw3Var.b.getApplication()).e(), tw3Var.e0);
            case 3:
                r02 r02Var = new r02(tw3Var.c);
                tw3Var.b.h0.k(new pb(new bo3(r02Var, (byte) 8), (byte) 27));
                return r02Var;
            default:
                String[] strArr4 = OperaApplication.K;
                ndc ndcVar = tw3Var.b;
                OperaApplication operaApplication2 = (OperaApplication) ndcVar.getApplication();
                ddc ddcVarV = cqp.V(ndcVar.getLifecycle());
                snc sncVar = (snc) operaApplication2.r.W.get();
                return new w6o((l45) sncVar.a.get(), sncVar.g, sncVar.a(), xf8.u(((vs6) sncVar.m.get()).b.t), (rs6) sncVar.z.getValue(), ((rnc) sncVar.l.getValue()).a(ndcVar), ddcVarV, sncVar.c, sncVar.F, (jg8) sncVar.b.d, sncVar.d);
        }
    }
}
