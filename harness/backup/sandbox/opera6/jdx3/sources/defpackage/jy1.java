package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class jy1 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ky1 b;

    public /* synthetic */ jy1(ky1 ky1Var, byte b) {
        this.a = b;
        this.b = ky1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ky1 ky1Var = this.b;
        switch (b) {
            case 0:
                o52 o52Var = (o52) ((q52) ky1Var.j.get()).c.g();
                return Boolean.valueOf((o52Var instanceof l52) || (o52Var instanceof j52));
            default:
                xih.u(ky1Var.a.getSupportFragmentManager());
                return Unit.a;
        }
    }
}
