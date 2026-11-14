package ads_mobile_sdk;

import android.content.Context;
import defpackage.eyo;
import defpackage.hlo;
import defpackage.skp;
import defpackage.tso;
import defpackage.xf8;
import java.util.Optional;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class bt implements hlo {
    public final tso a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final /* synthetic */ byte e;

    public bt(ab0 ab0Var, dw dwVar, tso tsoVar, tso tsoVar2) {
        this.e = (byte) 1;
        this.a = ab0Var;
        this.c = dwVar;
        this.b = tsoVar;
        this.d = tsoVar2;
    }

    public bt(b23 b23Var, b23 b23Var2, ob1 ob1Var, tso tsoVar) {
        this.e = (byte) 3;
        this.a = b23Var;
        this.d = b23Var2;
        this.c = ob1Var;
        this.b = tsoVar;
    }

    public /* synthetic */ bt(hlo hloVar, tso tsoVar, hlo hloVar2, tso tsoVar2, byte b) {
        this.e = b;
        this.a = hloVar;
        this.b = tsoVar;
        this.c = hloVar2;
        this.d = tsoVar2;
    }

    public bt(tso tsoVar, hlo hloVar, hlo hloVar2, tso tsoVar2) {
        this.e = (byte) 6;
        this.b = tsoVar;
        this.a = hloVar;
        this.c = hloVar2;
        this.d = tsoVar2;
    }

    public /* synthetic */ bt(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, byte b) {
        this.e = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.d = tsoVar3;
        this.c = tsoVar4;
    }

    public /* synthetic */ bt(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, byte b, boolean z) {
        this.e = b;
        this.b = tsoVar;
        this.d = tsoVar2;
        this.a = tsoVar3;
        this.c = tsoVar4;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.e;
        tso tsoVar = this.d;
        tso tsoVar2 = this.c;
        tso tsoVar3 = this.b;
        tso tsoVar4 = this.a;
        switch (b) {
            case 0:
                return new at((av2) ((hlo) tsoVar4).get(), (dk) tsoVar3.get(), (defpackage.r83) ((ob1) tsoVar2).a, (lx) tsoVar.get());
            case 1:
                return new cy1((ab0) tsoVar4, (k71) ((dw) tsoVar2).get(), (skp) tsoVar3.get(), (qr0) tsoVar.get(), (byte) 0);
            case 2:
                return new ih();
            case 3:
                return new n61(nj0.a((b23) tsoVar4), nj0.a((b23) tsoVar), (ExecutorService) ((ob1) tsoVar2).a, nj0.a(tsoVar3));
            case 4:
                g9 g9Var = (g9) tsoVar3.get();
                return new pa3(g9Var, (String) tsoVar4.get(), ((Long) ((ej) tsoVar2).get()).longValue());
            case 5:
                return new cy1((ab0) tsoVar4, (k71) tsoVar3.get(), (skp) tsoVar.get(), (qr0) tsoVar2.get(), (byte) 1);
            case 6:
                return new t42((Context) tsoVar3.get(), ((Integer) ((hlo) tsoVar4).get()).intValue(), ((Long) ((hlo) tsoVar2).get()).longValue(), (eyo) tsoVar.get());
            case 7:
                return new kh3((eq2) xf8.N((Optional) tsoVar3.get(), new eq2()), (ih1) xf8.N((Optional) tsoVar.get(), new ih1()), (dt2) xf8.N((Optional) tsoVar4.get(), new dt2()), (s8) xf8.N((Optional) ((n90) tsoVar2).get(), new s8()));
            default:
                return new u30((nx5) ((ah0) tsoVar4).get(), (ux2) tsoVar3.get(), (ah3) ((ah0) tsoVar2).get(), (qr0) tsoVar.get());
        }
    }
}
