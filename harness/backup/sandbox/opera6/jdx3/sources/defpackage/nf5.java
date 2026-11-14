package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class nf5 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pf5 b;
    public final /* synthetic */ wf5 c;

    public /* synthetic */ nf5(pf5 pf5Var, wf5 wf5Var, byte b) {
        this.a = b;
        this.b = pf5Var;
        this.c = wf5Var;
    }

    public final Object invoke() {
        byte b = this.a;
        hjm hjmVar = hjm.b;
        wf5 wf5Var = this.c;
        pf5 pf5Var = this.b;
        switch (b) {
            case 0:
                pf5Var.c.invoke();
                ((xf5) wf5Var).a.finish(hjmVar);
                break;
            case 1:
                pf5Var.a.invoke();
                ((xf5) wf5Var).a();
                break;
            default:
                pf5Var.b.invoke();
                ((xf5) wf5Var).a.finish(hjmVar);
                break;
        }
        return Unit.a;
    }
}
