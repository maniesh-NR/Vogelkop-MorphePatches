package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class dqa extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ nh4 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dqa(nh4 nh4Var, byte b) {
        super(1);
        this.i = b;
        this.j = nh4Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        nh4 nh4Var = this.j;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                if (nh4Var.r() instanceof c0f) {
                    p0i p0iVar = t0i.b;
                    nh4Var.resumeWith(new q0i(th));
                }
                break;
            default:
                gqa gqaVar = (gqa) obj;
                if (nh4Var.r() instanceof c0f) {
                    p0i p0iVar2 = t0i.b;
                    nh4Var.resumeWith(gqaVar);
                }
                break;
        }
        return Unit.a;
    }
}
