package ads_mobile_sdk;

import defpackage.glp;
import defpackage.hlo;
import defpackage.j3p;
import defpackage.jdp;
import defpackage.ufp;
import java.util.Map;

/* loaded from: classes.dex */
public final class s3 implements hlo {
    public final ah0 a;
    public final fn1 b;
    public final /* synthetic */ byte c;

    public /* synthetic */ s3(ah0 ah0Var, fn1 fn1Var, byte b) {
        this.c = b;
        this.a = ah0Var;
        this.b = fn1Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.c;
        fn1 fn1Var = this.b;
        ah0 ah0Var = this.a;
        switch (b) {
            case 0:
                return new ufp((nx5) ah0Var.get(), (Map) fn1Var.get());
            case 1:
                return new j3p((nx5) ah0Var.get(), (Map) fn1Var.get());
            case 2:
                return new jdp((nx5) ah0Var.get(), (Map) fn1Var.get());
            default:
                return new glp((nx5) ah0Var.get(), (Map) fn1Var.get());
        }
    }
}
