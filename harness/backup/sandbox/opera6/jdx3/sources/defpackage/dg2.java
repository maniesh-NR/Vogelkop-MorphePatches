package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class dg2 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gg2 b;

    public /* synthetic */ dg2(gg2 gg2Var, byte b) {
        this.a = b;
        this.b = gg2Var;
    }

    public final Object invoke() {
        byte b = this.a;
        gg2 gg2Var = this.b;
        switch (b) {
            case 0:
                gg2Var.h(new vk1((byte) 20));
                break;
            default:
                gg2Var.h(new x2((Object) gg2Var, (Object) ei7.a, (byte) 24));
                break;
        }
        return Unit.a;
    }
}
