package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.tso;
import defpackage.xf8;
import java.util.Optional;

/* loaded from: classes.dex */
public final class zv implements hlo {
    public final tso a;
    public final n90 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ zv(tso tsoVar, n90 n90Var, byte b) {
        this.c = b;
        this.a = tsoVar;
        this.b = n90Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.c;
        n90 n90Var = this.b;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                return new kh3((eq2) xf8.N((Optional) tsoVar.get(), new eq2()), (ih1) xf8.N((Optional) n90Var.get(), new ih1()), new dt2(), new s8());
            default:
                return new lr3((nx5) tsoVar.get(), (Optional) n90Var.get());
        }
    }
}
