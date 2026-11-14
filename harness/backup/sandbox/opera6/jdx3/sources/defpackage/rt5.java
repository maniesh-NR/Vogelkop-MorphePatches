package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class rt5 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tt5 b;

    public /* synthetic */ rt5(tt5 tt5Var, byte b) {
        this.a = b;
        this.b = tt5Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tt5 tt5Var = this.b;
        switch (b) {
            case 0:
                return ((cu5) tt5Var.n.q()).b0(((Integer) obj).intValue());
            default:
                tt5Var.i.N((j8f) obj, false);
                return Unit.a;
        }
    }
}
