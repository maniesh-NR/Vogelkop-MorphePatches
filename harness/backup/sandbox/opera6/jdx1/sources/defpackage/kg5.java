package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class kg5 extends kuk implements Function2 {
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public /* synthetic */ float v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg5(lg5 lg5Var, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = lg5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg5(pej pejVar, float f, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = pejVar;
        this.v = f;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                kg5 kg5Var = new kg5((lg5) obj2, mt5Var);
                kg5Var.v = ((Number) obj).floatValue();
                return kg5Var;
            default:
                return new kg5((pej) obj2, this.v, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create(Float.valueOf(((Number) obj).floatValue()), (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    public final Object invokeSuspend(Object obj) throws pxb {
        Object objB;
        byte b = this.t;
        Object obj2 = this.w;
        switch (b) {
            case 0:
                lg5 lg5Var = (lg5) obj2;
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    float f = this.v;
                    Object objG = lg5Var.a.d.a.g(e0j.e);
                    Function2 function2 = (Function2) (objG != null ? objG : null);
                    if (function2 == null) {
                        throw vep.q("Required value was null.");
                    }
                    y8f y8fVar = new y8f(Float.floatToRawIntBits(f) & 4294967295L);
                    this.u = true;
                    obj = function2.invoke(y8fVar, this);
                    if (obj == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((y8f) obj).a & 4294967295L)));
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    float f2 = this.v;
                    this.u = true;
                    a21 a21Var = ((pej) obj2).d;
                    Object value = ((t0g) a21Var.g).getValue();
                    Object objC = a21Var.c(a21Var.l(), f2, value);
                    if (((Boolean) ((Function1) a21Var.d).invoke(objC)).booleanValue()) {
                        objB = a21Var.b(objC, gfe.a, new o11(a21Var, f2, null), this);
                        if (objB != px5Var2) {
                            objB = Unit.a;
                        }
                        if (objB != px5Var2) {
                            objB = Unit.a;
                        }
                    } else {
                        objB = a21Var.b(value, gfe.a, new o11(a21Var, f2, null), this);
                        if (objB != px5Var2) {
                            objB = Unit.a;
                        }
                        if (objB != px5Var2) {
                            objB = Unit.a;
                        }
                    }
                    if (objB != px5Var2) {
                        objB = Unit.a;
                    }
                    if (objB == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
        }
    }
}
