package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.tso;
import java.util.Optional;

/* loaded from: classes.dex */
public final class u12 implements hlo {
    public final tso a;
    public final n90 b;
    public final tso c;
    public final /* synthetic */ byte d = 1;

    public u12(n90 n90Var, tso tsoVar, tso tsoVar2) {
        this.b = n90Var;
        this.a = tsoVar;
        this.c = tsoVar2;
    }

    public u12(tso tsoVar, n90 n90Var, tso tsoVar2) {
        this.a = tsoVar;
        this.b = n90Var;
        this.c = tsoVar2;
    }

    @Override // defpackage.tso
    public final Object get() {
        switch (this.d) {
            case 0:
                return new t12((bq1) this.a.get(), (Optional) this.b.get(), (nx5) this.c.get());
            default:
                return new up3((Optional) this.b.get(), (nx5) this.a.get(), (qr0) this.c.get());
        }
    }
}
