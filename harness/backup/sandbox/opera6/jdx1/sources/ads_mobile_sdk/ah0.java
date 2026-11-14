package ads_mobile_sdk;

import defpackage.hlo;
import defpackage.tso;

/* loaded from: classes.dex */
public final class ah0 implements hlo {
    public tso a;

    public static void a(tso tsoVar, tso tsoVar2) {
        ah0 ah0Var = (ah0) tsoVar;
        if (ah0Var.a == null) {
            ah0Var.a = tsoVar2;
        } else {
            h9o.e();
        }
    }

    @Override // defpackage.tso
    public final Object get() {
        tso tsoVar = this.a;
        if (tsoVar != null) {
            return tsoVar.get();
        }
        h9o.e();
        return null;
    }
}
