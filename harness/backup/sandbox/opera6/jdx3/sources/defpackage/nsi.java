package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nsi extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ psi v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nsi(psi psiVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = psiVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        psi psiVar = this.v;
        switch (b) {
            case 0:
                nsi nsiVar = new nsi(psiVar, mt5Var, (byte) 0);
                nsiVar.u = obj;
                return nsiVar;
            case 1:
                nsi nsiVar2 = new nsi(psiVar, mt5Var, (byte) 1);
                nsiVar2.u = obj;
                return nsiVar2;
            default:
                nsi nsiVar3 = new nsi(psiVar, mt5Var, (byte) 2);
                nsiVar3.u = obj;
                return nsiVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((f3h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((ut8) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((i0a) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        psi psiVar = this.v;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                psiVar.n = ((f3h) obj2).b();
                break;
            case 1:
                ut8 ut8Var = (ut8) obj2;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                h58 h58Var = nt8.h;
                boolean z = false;
                if (h58Var == null || !h58Var.isEmpty()) {
                    w4 w4VarE = sko.e(h58Var, h58Var);
                    while (true) {
                        if (w4VarE.hasNext()) {
                            if (ipe.t(ut8Var, (nt8) w4VarE.next()) != null) {
                                z = true;
                            }
                        }
                    }
                }
                psiVar.o = z;
                break;
            default:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                psiVar.r = ((i0a) obj2).a;
                break;
        }
        return Unit.a;
    }
}
