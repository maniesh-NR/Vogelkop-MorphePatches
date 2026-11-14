package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class ky0 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ ky0(my0 my0Var, byte b) {
        this.a = b;
        this.b = my0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                my0Var.b.c();
                break;
            default:
                my0Var.b.c();
                break;
        }
        return Unit.a;
    }
}
