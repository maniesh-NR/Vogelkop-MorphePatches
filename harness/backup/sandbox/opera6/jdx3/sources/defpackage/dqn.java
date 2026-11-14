package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class dqn implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lqn b;

    public /* synthetic */ dqn(lqn lqnVar, byte b) {
        this.a = b;
        this.b = lqnVar;
    }

    public final Object invoke() {
        byte b = this.a;
        lqn lqnVar = this.b;
        switch (b) {
            case 0:
                lqnVar.w.g();
                break;
            default:
                vsn vsnVar = lqnVar.w;
                s62 s62Var = vsnVar.c;
                qyj qyjVarF = s62Var.f();
                qyjVarF.f();
                qyjVarF.m();
                s62Var.c().a(t52.k, null);
                vsnVar.k.c(l60.c);
                break;
        }
        return Unit.a;
    }
}
