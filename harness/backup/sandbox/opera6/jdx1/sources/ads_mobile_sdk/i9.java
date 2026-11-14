package ads_mobile_sdk;

import android.content.Context;
import defpackage.eyo;
import defpackage.hlo;
import defpackage.k3p;
import defpackage.mip;
import defpackage.tso;
import defpackage.vkp;
import java.util.Map;

/* loaded from: classes.dex */
public final class i9 implements hlo {
    public final tso a;
    public final tso b;
    public final tso c;
    public final tso d;
    public final /* synthetic */ byte e;

    public /* synthetic */ i9(tso tsoVar, tso tsoVar2, tso tsoVar3, tso tsoVar4, byte b) {
        this.e = b;
        this.a = tsoVar;
        this.b = tsoVar2;
        this.c = tsoVar3;
        this.d = tsoVar4;
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
                return new h9((String) tsoVar4.get(), (defpackage.r83) tsoVar3.get(), (g9) tsoVar2.get(), (mip) tsoVar.get());
            case 1:
                return new c21((qr0) tsoVar4.get(), tsoVar3, tsoVar2, (i41) tsoVar.get());
            case 2:
                return new q11((qr0) tsoVar4.get(), (qw) tsoVar3.get(), (eyo) tsoVar2.get(), (nx5) tsoVar.get());
            case 3:
                return new l82((s52) tsoVar4.get(), (String) tsoVar3.get(), (qr0) tsoVar2.get(), (ax0) tsoVar.get());
            case 4:
                return new og0((qr0) tsoVar4.get(), (ek) tsoVar3.get(), (vkp) tsoVar2.get(), (cg0) tsoVar.get());
            case 5:
                return new qg((Context) tsoVar4.get(), (th3) tsoVar3.get(), (l7) tsoVar2.get(), (jjc) tsoVar.get());
            default:
                return new y12((k3p) tsoVar4.get(), (rp1) tsoVar3.get(), (Map) tsoVar2.get(), (th3) tsoVar.get(), (byte) 0);
        }
    }
}
