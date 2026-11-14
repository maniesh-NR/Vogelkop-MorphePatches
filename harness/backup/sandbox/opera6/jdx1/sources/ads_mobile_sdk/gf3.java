package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.nip;
import defpackage.szo;
import java.util.Map;

/* loaded from: classes.dex */
public final class gf3 implements hlo {
    public final ah0 a;
    public final hlo b;
    public final /* synthetic */ byte c;

    public /* synthetic */ gf3(ah0 ah0Var, hlo hloVar, byte b) {
        this.c = b;
        this.a = ah0Var;
        this.b = hloVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        switch (this.c) {
            case 0:
                return new szo((nx5) this.a.get(), (Map) this.b.get());
            default:
                return new nip((nx5) this.a.get(), (Map) this.b.get());
        }
    }
}
