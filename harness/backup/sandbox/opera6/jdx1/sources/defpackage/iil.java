package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class iil implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dil b;

    public /* synthetic */ iil(dil dilVar, byte b) {
        this.a = b;
        this.b = dilVar;
    }

    public final Object invoke() {
        byte b = this.a;
        dil dilVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                mil milVarB = dil.b(dilVar.l().a, upj.c(0, dilVar.l().a.b.length()));
                dilVar.c.invoke(milVarB);
                long j = milVarB.b;
                dilVar.v = new xjl(j);
                dilVar.t = mil.a(dilVar.t, null, j, 5);
                dilVar.e(true);
                break;
            default:
                Function0 function0 = dilVar.f;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
