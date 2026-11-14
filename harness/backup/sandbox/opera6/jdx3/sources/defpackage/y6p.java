package defpackage;

import android.content.Context;
import android.util.Size;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y6p extends kuk implements Function2 {
    public final /* synthetic */ byte t = 1;
    public boolean u;
    public final /* synthetic */ o7p v;
    public final /* synthetic */ sro w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6p(o7p o7pVar, sro sroVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = o7pVar;
        this.w = sroVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6p(sro sroVar, o7p o7pVar, mt5 mt5Var) {
        super(2, mt5Var);
        this.w = sroVar;
        this.v = o7pVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        sro sroVar = this.w;
        o7p o7pVar = this.v;
        switch (b) {
            case 0:
                return new y6p(sroVar, o7pVar, mt5Var);
            default:
                return new y6p(o7pVar, sroVar, mt5Var);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        sro sroVar = this.w;
        o7p o7pVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    cv6 cv6Var = bb7.a;
                    mr6 mr6Var = mr6.b;
                    x6p x6pVar = new x6p(sroVar, null, (byte) 0);
                    this.u = true;
                    obj = na2.Z(mr6Var, x6pVar, this);
                    if (obj == px5Var) {
                        break;
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                Object obj2 = ((t0i) obj).a;
                p0i p0iVar = t0i.b;
                Context context = o7pVar.a;
                if (obj2 instanceof q0i) {
                    obj2 = null;
                }
                sroVar.b(context, (Size) obj2, null);
                break;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    cv6 cv6Var2 = bb7.a;
                    mr6 mr6Var2 = mr6.b;
                    x6p x6pVar2 = new x6p(sroVar, null, (byte) 1);
                    this.u = true;
                    obj = na2.Z(mr6Var2, x6pVar2, this);
                    if (obj == px5Var2) {
                        break;
                    }
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                Object obj3 = ((t0i) obj).a;
                p0i p0iVar2 = t0i.b;
                sroVar.b(o7pVar.a, (Size) (obj3 instanceof q0i ? null : obj3), new u6p(o7pVar, (byte) 2));
                uuj uujVar = o7pVar.c;
                if (uujVar != null) {
                    uujVar.a();
                }
                break;
        }
        return Unit.a;
    }
}
