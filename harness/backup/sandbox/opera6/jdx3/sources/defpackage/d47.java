package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class d47 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tt2 b;

    public /* synthetic */ d47(tt2 tt2Var, byte b) {
        this.a = b;
        this.b = tt2Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tt2 tt2Var = this.b;
        z37 z37Var = (z37) obj;
        switch (b) {
            case 0:
                tt2Var.run(z37Var);
                break;
            case 1:
                tt2Var.run(Boolean.valueOf(z37Var == z37.b));
                break;
            case 2:
                tt2Var.run(z37Var);
                break;
            case 3:
                tt2Var.run(z37Var);
                break;
            default:
                tt2Var.run(z37Var);
                break;
        }
        return Unit.a;
    }
}
