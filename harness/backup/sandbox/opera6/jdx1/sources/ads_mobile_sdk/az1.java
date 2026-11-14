package ads_mobile_sdk;

import android.content.Context;
import defpackage.anp;
import defpackage.blo;
import defpackage.bwg;
import defpackage.hlo;
import defpackage.k3p;
import defpackage.mip;
import defpackage.oap;
import defpackage.obp;
import defpackage.tso;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class az1 implements hlo {
    public final tso a;
    public final tso b;
    public final ob1 c;
    public final /* synthetic */ byte d;

    public /* synthetic */ az1(ob1 ob1Var, tso tsoVar, tso tsoVar2, byte b) {
        this.d = b;
        this.c = ob1Var;
        this.a = tsoVar;
        this.b = tsoVar2;
    }

    public /* synthetic */ az1(tso tsoVar, ob1 ob1Var, tso tsoVar2, byte b) {
        this.d = b;
        this.a = tsoVar;
        this.c = ob1Var;
        this.b = tsoVar2;
    }

    public /* synthetic */ az1(tso tsoVar, tso tsoVar2, ob1 ob1Var, byte b) {
        this.d = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = ob1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.d;
        ob1 ob1Var = this.c;
        tso tsoVar = this.b;
        tso tsoVar2 = this.a;
        switch (b) {
            case 0:
                return new zy1((qr0) tsoVar2.get(), (zt1) tsoVar.get(), (av2) ob1Var.a);
            case 1:
                return new ab3((yk2) tsoVar2.get(), (ExecutorService) ob1Var.a, (th3) tsoVar.get());
            case 2:
                return new blo("xI+soVUvakjZ7fBH82y4smAFVcUDbK3tMXs6IrzHdvqpYWb+C188JnsH2eTWKUUg", "sS5raJ4cUkGRGNJs53IfqKxpEnkn9WioahZ/i1GLQj0=", (k3p) ob1Var.a, (rp1) tsoVar2.get(), ((th3) tsoVar.get()).a(fl0.EVENT_ID_DEVICE_INFO_SIGNALS_TASK));
            case 3:
                return new ba2((Context) ob1Var.a, ((Integer) tsoVar2.get()).intValue(), (i41) tsoVar.get());
            case 4:
                return new im3((Context) ob1Var.a, (String) tsoVar2.get(), (xq0) tsoVar.get());
            case 5:
                return new kj0((Context) ob1Var.a, (g0) tsoVar2.get(), (qr0) tsoVar.get());
            case 6:
                return new ko3((Context) ob1Var.a, (yq3) tsoVar2.get(), (qr0) tsoVar.get());
            case 7:
                Context context = (Context) ob1Var.a;
                return new yk2(context, context.getSharedPreferences("pcvmspf2", 0), nj0.a(tsoVar2), (th3) tsoVar.get());
            case 8:
                oap oapVar = ((xv) ob1Var.a).u ? (oap) tsoVar.get() : (oap) tsoVar2.get();
                bwg.o(oapVar);
                return oapVar;
            case 9:
                obp obpVar = ((xv) ob1Var.a).u ? (obp) tsoVar.get() : (obp) tsoVar2.get();
                bwg.o(obpVar);
                return obpVar;
            case 10:
                return new uu2((su2) tsoVar2.get(), (defpackage.r83) ob1Var.a, (av2) tsoVar.get());
            case 11:
                return new l92((mip) tsoVar2.get(), (th3) tsoVar.get(), ((l7) ob1Var.a).J().s());
            case 12:
                return new yn3((Context) tsoVar2.get(), (mip) tsoVar.get(), (ExecutorService) ob1Var.a);
            default:
                anp anpVar = ((l7) ob1Var.a).v() ? (anp) nj0.a(tsoVar2).get() : (anp) nj0.a(tsoVar).get();
                bwg.o(anpVar);
                return anpVar;
        }
    }
}
