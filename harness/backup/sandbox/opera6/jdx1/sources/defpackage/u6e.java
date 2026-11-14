package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class u6e extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ v6e v;
    public final /* synthetic */ jz2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6e(v6e v6eVar, jz2 jz2Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = v6eVar;
        this.w = jz2Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        jz2 jz2Var = this.w;
        v6e v6eVar = this.v;
        switch (b) {
            case 0:
                return new u6e(v6eVar, jz2Var, mt5Var, (byte) 0);
            default:
                return new u6e(v6eVar, jz2Var, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        jz2 jz2Var = this.w;
        v6e v6eVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    cd1 cd1Var = v6eVar.Z;
                    Float f = new Float(sz2.a.c(jz2Var.c));
                    this.u = true;
                    if (cd1Var.e(this, f) == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    cd1 cd1Var2 = v6eVar.Z;
                    Float f2 = new Float(sz2.a.c(jz2Var.c));
                    this.u = true;
                    if (cd1Var2.e(this, f2) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
        }
        return Unit.a;
    }
}
