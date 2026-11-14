package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class wa0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pad b;

    public /* synthetic */ wa0(pad padVar, byte b) {
        this.a = b;
        this.b = padVar;
    }

    public final Object invoke() {
        byte b = this.a;
        pad padVar = this.b;
        switch (b) {
            case 0:
                zpa zpaVar = (zpa) padVar.b;
                va0 va0Var = (va0) padVar.c;
                if (((k90) va0Var.n(2)) == null) {
                    zpaVar.getClass();
                    va0Var.q(2, 1, new k90(2443, 1, 2));
                }
                return new ujp((byte) 16);
            default:
                zpa zpaVar2 = (zpa) padVar.b;
                va0 va0Var2 = (va0) padVar.c;
                if (((lg0) va0Var2.n(3)) == null) {
                    zpaVar2.getClass();
                    va0Var2.q(3, 1, new lg0(2443, 1, 2));
                }
                return new ydp((byte) 17);
        }
    }
}
