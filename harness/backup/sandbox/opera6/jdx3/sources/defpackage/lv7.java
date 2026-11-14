package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class lv7 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rv7 b;

    public /* synthetic */ lv7(rv7 rv7Var, byte b) {
        this.a = b;
        this.b = rv7Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rv7 rv7Var = this.b;
        switch (b) {
            case 0:
                rv7Var.c(false);
                break;
            case 1:
                break;
            case 2:
                if (((Boolean) rv7Var.l.invoke()).booleanValue()) {
                    rv7Var.k.v0();
                }
                break;
            case 3:
                rv7Var.c(true);
                break;
            case 4:
                rv7Var.a();
                break;
            case 5:
                rv7Var.c(false);
                break;
            case 6:
                rv7Var.a();
                break;
            default:
                rv7Var.c(false);
                break;
        }
        return Unit.a;
    }
}
