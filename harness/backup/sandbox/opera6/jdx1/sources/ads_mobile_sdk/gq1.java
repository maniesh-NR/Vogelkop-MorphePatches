package ads_mobile_sdk;

import android.util.DisplayMetrics;
import android.view.View;
import defpackage.eyo;
import defpackage.hlo;
import defpackage.k3p;
import defpackage.tso;
import defpackage.vkp;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class gq1 implements hlo {
    public final tso a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final tso e;
    public final /* synthetic */ byte f;

    public /* synthetic */ gq1(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, tso tsoVar5, byte b) {
        this.f = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.d = tsoVar4;
        this.e = tsoVar5;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.f;
        tso tsoVar = this.a;
        tso tsoVar2 = this.e;
        tso tsoVar3 = this.d;
        tso tsoVar4 = this.c;
        tso tsoVar5 = this.b;
        switch (b) {
            case 0:
                return new fq1((ki0) tsoVar.get(), (bq1) tsoVar5.get(), (ax0) tsoVar4.get(), (nx5) tsoVar3.get(), (g0) tsoVar2.get());
            case 1:
                return new kl0(this.a, (vkp) tsoVar5.get(), (qr0) tsoVar4.get(), (eyo) tsoVar3.get(), (i41) tsoVar2.get());
            case 2:
                return new q((k3p) tsoVar.get(), (rp1) tsoVar5.get(), (DisplayMetrics) tsoVar4.get(), (View) tsoVar3.get(), (th3) tsoVar2.get());
            case 3:
                return new mh3(this.a, (vkp) tsoVar5.get(), (qr0) tsoVar4.get(), (eyo) tsoVar3.get(), (i41) tsoVar2.get());
            case 4:
                return new d03((k3p) tsoVar.get(), (rp1) tsoVar5.get(), (Map) tsoVar4.get(), (DisplayMetrics) tsoVar3.get(), (th3) tsoVar2.get());
            default:
                return new u83((l7) tsoVar.get(), (r83) tsoVar5.get(), (qm1) tsoVar4.get(), (ExecutorService) tsoVar3.get(), (th3) tsoVar2.get());
        }
    }
}
