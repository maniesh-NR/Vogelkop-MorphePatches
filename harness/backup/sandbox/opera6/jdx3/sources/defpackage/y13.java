package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class y13 extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ z13 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y13(z13 z13Var, byte b) {
        super(0);
        this.i = b;
        this.j = z13Var;
    }

    public final Object invoke() {
        switch (this.i) {
            case 0:
                this.j.e();
                break;
            default:
                if (!this.j.o) {
                    z13 z13Var = this.j;
                    z13Var.i = false;
                    guo guoVar = z13Var.d;
                    if (guoVar != null) {
                        guoVar.a();
                    }
                    z13 z13Var2 = this.j;
                    z13Var2.d = z13Var2.h;
                    z13Var2.h = null;
                }
                break;
        }
        return Unit.a;
    }
}
