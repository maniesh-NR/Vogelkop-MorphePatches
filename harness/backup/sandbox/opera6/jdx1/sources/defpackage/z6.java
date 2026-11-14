package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class z6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ jpi v;
    public /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6(jpi jpiVar, long j, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = jpiVar;
        this.w = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(jpi jpiVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = (byte) 0;
        this.v = jpiVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                z6 z6Var = new z6(this.v, mt5Var);
                z6Var.w = ((y8f) obj).a;
                return z6Var;
            case 1:
                return new z6(this.v, this.w, mt5Var, (byte) 1);
            case 2:
                return new z6(this.v, this.w, mt5Var, (byte) 2);
            default:
                return new z6(this.v, this.w, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                long j = ((y8f) obj).a;
                z6 z6Var = new z6(this.v, (mt5) obj2);
                z6Var.w = j;
                break;
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        jpi jpiVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    long j = this.w;
                    this.u = true;
                    Object objB = epi.b(jpiVar.R, j, this);
                    if (objB == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                    break;
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    spi spiVar = jpiVar.R;
                    gfe gfeVar = gfe.b;
                    ipi ipiVar = new ipi(this.w, null);
                    this.u = true;
                    if (spiVar.g(gfeVar, ipiVar, this) == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    spi spiVar2 = jpiVar.R;
                    long j2 = this.w;
                    this.u = true;
                    if (spiVar2.c(j2, true, this) == px5Var3) {
                        break;
                    }
                } else if (!z3) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            default:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    spi spiVar3 = jpiVar.R;
                    long j3 = this.w;
                    this.u = true;
                    if (spiVar3.c(j3, false, this) == px5Var4) {
                        break;
                    }
                } else if (!z4) {
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
