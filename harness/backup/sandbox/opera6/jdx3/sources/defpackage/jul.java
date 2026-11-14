package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class jul extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public Iterator u;
    public boolean v;
    public final /* synthetic */ kul w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jul(kul kulVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.w = kulVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        kul kulVar = this.w;
        switch (b) {
            case 0:
                return new jul(kulVar, mt5Var, (byte) 0);
            default:
                return new jul(kulVar, mt5Var, (byte) 1);
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
        Iterator g7fVar;
        Iterator g7fVar2;
        byte b = this.t;
        kul kulVar = this.w;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.v;
                if (!z) {
                    ybh.y(obj);
                    g7fVar = new g7f(kulVar.e);
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    g7fVar = this.u;
                    ybh.y(obj);
                }
                while (g7fVar.hasNext()) {
                    dul dulVar = (dul) g7fVar.next();
                    this.u = g7fVar;
                    this.v = true;
                    if (dulVar.a(this) == px5Var) {
                        break;
                    }
                }
                break;
            default:
                Unit unit = px5.a;
                boolean z2 = this.v;
                if (!z2) {
                    ybh.y(obj);
                    g7fVar2 = new g7f(kulVar.e);
                } else if (!z2) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    g7fVar2 = this.u;
                    ybh.y(obj);
                }
                while (g7fVar2.hasNext()) {
                    dul dulVar2 = (dul) g7fVar2.next();
                    this.u = g7fVar2;
                    this.v = true;
                    if (dulVar2.b() == unit) {
                        break;
                    }
                }
                break;
        }
        return Unit.a;
    }
}
