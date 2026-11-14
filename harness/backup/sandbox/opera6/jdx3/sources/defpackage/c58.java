package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class c58 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f58 b;
    public final /* synthetic */ m7l c;

    public /* synthetic */ c58(f58 f58Var, m7l m7lVar, byte b) {
        this.a = b;
        this.b = f58Var;
        this.c = m7lVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        m7l m7lVar = this.c;
        f58 f58Var = this.b;
        osk oskVar = (osk) obj;
        switch (b) {
            case 0:
                f58Var.c.X(oskVar, m7lVar);
                break;
            default:
                f58Var.b.Q(oskVar, m7lVar);
                break;
        }
        return Unit.a;
    }
}
