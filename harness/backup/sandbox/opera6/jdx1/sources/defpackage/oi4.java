package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class oi4 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pe4 b;

    public /* synthetic */ oi4(pe4 pe4Var, byte b) {
        this.a = b;
        this.b = pe4Var;
    }

    public final Object invoke() {
        boolean zH0;
        byte b = this.a;
        pe4 pe4Var = this.b;
        switch (b) {
            case 0:
                zH0 = oup.h0(pe4Var);
                break;
            default:
                fe4 fe4Var = ge4.Oo;
                ge4 ge4Var = pe4Var.b;
                fe4Var.getClass();
                zH0 = fe4.c(ge4Var);
                break;
        }
        return Boolean.valueOf(zH0);
    }
}
