package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class rp6 extends kuk implements Function2 {
    public mqh t;
    public xe1 u;
    public boolean v;
    public final /* synthetic */ float w;
    public final /* synthetic */ sp6 x;
    public final /* synthetic */ opi y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp6(float f, sp6 sp6Var, opi opiVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = f;
        this.x = sp6Var;
        this.y = opiVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new rp6(this.w, this.x, this.y, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        xe1 xe1Var;
        mqh mqhVar;
        wi6 wi6Var;
        f9 f9Var;
        px5 px5Var = px5.a;
        boolean z = this.v;
        if (!z) {
            ybh.y(obj);
            f = this.w;
            if (Math.abs(f) > 1.0f) {
                mqh mqhVar2 = new mqh();
                mqhVar2.a = f;
                mqh mqhVar3 = new mqh();
                xe1 xe1VarA = cs5.a(28, 0.0f, f);
                try {
                    sp6 sp6Var = this.x;
                    wi6Var = sp6Var.a;
                    f9Var = new f9(mqhVar3, this.y, mqhVar2, sp6Var);
                    this.t = mqhVar2;
                    this.u = xe1VarA;
                    this.v = true;
                } catch (CancellationException unused) {
                    xe1Var = xe1VarA;
                    mqhVar = mqhVar2;
                    mqhVar.a = ((Number) xe1Var.b()).floatValue();
                    f = mqhVar.a;
                    return new Float(f);
                }
                if (mfh.h(xe1VarA, wi6Var, false, f9Var, this) == px5Var) {
                    return px5Var;
                }
                mqhVar = mqhVar2;
                f = mqhVar.a;
            }
        } else {
            if (!z) {
                qp2.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xe1Var = this.u;
            mqhVar = this.t;
            try {
                ybh.y(obj);
            } catch (CancellationException unused2) {
                mqhVar.a = ((Number) xe1Var.b()).floatValue();
                f = mqhVar.a;
                return new Float(f);
            }
            f = mqhVar.a;
        }
        return new Float(f);
    }
}
