package ads_mobile_sdk;

import defpackage.bto;
import defpackage.fjp;
import defpackage.glp;
import defpackage.hlo;
import defpackage.oip;
import defpackage.pep;
import defpackage.tso;
import defpackage.w7p;
import defpackage.xdp;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ed1 implements hlo {
    public final tso a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final tso f;
    public final /* synthetic */ byte g;

    public /* synthetic */ ed1(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, tso tsoVar6, byte b) {
        this.g = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.d = tsoVar4;
        this.e = tsoVar5;
        this.f = tsoVar6;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.g;
        tso tsoVar = this.f;
        tso tsoVar2 = this.e;
        tso tsoVar3 = this.d;
        tso tsoVar4 = this.c;
        tso tsoVar5 = this.b;
        tso tsoVar6 = this.a;
        switch (b) {
            case 0:
                return new dd1((String) tsoVar6.get(), ((Integer) tsoVar5.get()).intValue(), (kh3) tsoVar4.get(), (glp) tsoVar3.get(), (o32) tsoVar2.get(), (qr0) tsoVar.get());
            case 1:
                return new qr0((oip) tsoVar6.get(), (pep) tsoVar5.get(), (bto) tsoVar4.get(), (xdp) tsoVar3.get(), (fjp) tsoVar2.get(), (w7p) tsoVar.get());
            default:
                return new r83(nj0.a(tsoVar6), nj0.a(tsoVar5), nj0.a(tsoVar4), (l7) tsoVar3.get(), (ExecutorService) tsoVar2.get(), (th3) tsoVar.get());
        }
    }
}
