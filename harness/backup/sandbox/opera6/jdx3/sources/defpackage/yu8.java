package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class yu8 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cv8 b;

    public /* synthetic */ yu8(cv8 cv8Var, byte b) {
        this.a = b;
        this.b = cv8Var;
    }

    public final Object invoke() {
        byte b = this.a;
        cv8 cv8Var = this.b;
        switch (b) {
            case 0:
                return cv8Var.a;
            case 1:
                return Integer.valueOf(cv8Var.e.getWidth());
            case 2:
                return Integer.valueOf(cv8Var.e.getHeight());
            case 3:
                cv8Var.e.a0();
                return Unit.a;
            case 4:
                cv8Var.b();
                return Unit.a;
            default:
                return cv8Var.a;
        }
    }
}
