package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.tso;
import java.util.Set;

/* loaded from: classes.dex */
public final class d61 implements hlo {
    public final tso a;
    public final b23 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ d61(tso tsoVar, b23 b23Var, byte b) {
        this.c = b;
        this.a = tsoVar;
        this.b = b23Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.c;
        b23 b23Var = this.b;
        tso tsoVar = this.a;
        switch (b) {
            case 0:
                return new m41((g0) tsoVar.get(), (Set) b23Var.get(), (byte) 1);
            default:
                return new ia3((da3) tsoVar.get(), (Set) b23Var.get());
        }
    }
}
