package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class s5g implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t5g b;

    public /* synthetic */ s5g(t5g t5gVar, byte b) {
        this.a = b;
        this.b = t5gVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        t5g t5gVar = this.b;
        int iIntValue = ((Integer) obj).intValue();
        switch (b) {
            case 0:
                ot2 ot2Var = t5gVar.I0().b;
                x5g x5gVar = (x5g) ot2Var.d.get();
                x5g.b(x5gVar, new lt2(iIntValue, new eme(x5gVar), ot2Var));
                break;
            default:
                ot2 ot2Var2 = t5gVar.I0().b;
                x5g x5gVar2 = (x5g) ot2Var2.d.get();
                x5g.b(x5gVar2, new lt2(iIntValue, new eme(x5gVar2), ot2Var2));
                break;
        }
        return Unit.a;
    }
}
