package ads_mobile_sdk;

import defpackage.ia6;
import defpackage.tso;
import java.util.Optional;

/* loaded from: classes.dex */
public final class n90 implements tso {
    public final Object a;
    public final /* synthetic */ byte b = 0;

    public n90(n3 n3Var) {
        this.a = n3Var;
    }

    public n90(tso tsoVar) {
        tsoVar.getClass();
        this.a = tsoVar;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                n3 n3Var = (n3) obj;
                return new ca1((ia6) n3Var.a, (n3) n3Var.b);
            default:
                return Optional.of(((tso) obj).get());
        }
    }
}
