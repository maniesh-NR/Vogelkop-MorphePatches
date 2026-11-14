package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class g02 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l02 b;

    public /* synthetic */ g02(l02 l02Var, byte b) {
        this.a = b;
        this.b = l02Var;
    }

    public final Object invoke() {
        byte b = this.a;
        l02 l02Var = this.b;
        switch (b) {
            case 0:
                return (ghj) ioh.k(new g02(l02Var, (byte) 1));
            default:
                return new ghj(l02Var.a.b.b(), l02Var.b, l02Var.c);
        }
    }
}
