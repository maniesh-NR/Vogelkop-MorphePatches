package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class h51 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g87 b;

    public /* synthetic */ h51(g87 g87Var, byte b) {
        this.a = b;
        this.b = g87Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        g87 g87Var = this.b;
        switch (b) {
            case 0:
                g87Var.show();
                return new ci(g87Var, (byte) 1);
            default:
                if (g87Var.f.a) {
                    g87Var.e.invoke();
                }
                return Unit.a;
        }
    }
}
