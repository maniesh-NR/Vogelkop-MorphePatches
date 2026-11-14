package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ac5 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dil b;
    public final /* synthetic */ ue5 c;

    public /* synthetic */ ac5(dil dilVar, ue5 ue5Var, int i, byte b) {
        this.a = b;
        this.b = dilVar;
        this.c = ue5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ue5 ue5Var = this.c;
        dil dilVar = this.b;
        ih5 ih5Var = (ih5) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sgb.a(dilVar, ue5Var, ih5Var, aoh.m(49));
                break;
            default:
                ic4.a(dilVar, ue5Var, ih5Var, aoh.m(49));
                break;
        }
        return Unit.a;
    }
}
