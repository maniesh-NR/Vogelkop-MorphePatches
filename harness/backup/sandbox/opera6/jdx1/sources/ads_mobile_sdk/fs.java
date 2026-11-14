package ads_mobile_sdk;

import android.content.Context;
import defpackage.hlo;

/* loaded from: classes.dex */
public final class fs implements hlo {
    public final ob1 a;
    public final ah0 b;
    public final /* synthetic */ byte c;

    public fs(ah0 ah0Var, ob1 ob1Var) {
        this.c = (byte) 5;
        this.b = ah0Var;
        this.a = ob1Var;
    }

    public /* synthetic */ fs(ob1 ob1Var, ah0 ah0Var, byte b) {
        this.c = b;
        this.a = ob1Var;
        this.b = ah0Var;
    }

    @Override // defpackage.tso
    public final Object get() {
        byte b = this.c;
        ah0 ah0Var = this.b;
        ob1 ob1Var = this.a;
        switch (b) {
            case 0:
                return new es((Context) ob1Var.a, (ah3) ah0Var.get());
            case 1:
                Context context = (Context) ob1Var.a;
                return new yi(context);
            case 2:
                return new ki0((Context) ob1Var.a, (ah3) ah0Var.get());
            case 3:
                Context context2 = (Context) ob1Var.a;
                return y55.t(o1.a, (nx5) ah0Var.get(), new p5d(context2, (byte) 10));
            case 4:
                return new ez1((k01) ah0Var.get(), (byte) 4);
            case 5:
                return new zl((z2) ah0Var.get(), (a2) ob1Var.a);
            default:
                return new xk((Context) ob1Var.a, (nx5) ah0Var.get());
        }
    }
}
