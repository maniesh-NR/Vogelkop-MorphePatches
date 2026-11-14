package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class zl3 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ am3 b;

    public /* synthetic */ zl3(am3 am3Var, byte b) {
        this.a = b;
        this.b = am3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        am3 am3Var = this.b;
        switch (b) {
            case 0:
                am3Var.n.X(z80.b);
                ((pm3) am3Var.k).a(new int[0]);
                break;
            default:
                am3Var.n.X(z80.c);
                xih.t(((kxk) am3Var.l).f, false, null);
                break;
        }
        return Unit.a;
    }
}
