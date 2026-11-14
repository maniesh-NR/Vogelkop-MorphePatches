package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class osi extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ boolean u;
    public final /* synthetic */ psi v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ osi(psi psiVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = psiVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        psi psiVar = this.v;
        switch (b) {
            case 0:
                osi osiVar = new osi(psiVar, mt5Var, (byte) 0);
                osiVar.u = ((Boolean) obj).booleanValue();
                return osiVar;
            default:
                osi osiVar2 = new osi(psiVar, mt5Var, (byte) 1);
                osiVar2.u = ((Boolean) obj).booleanValue();
                return osiVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        psi psiVar = this.v;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        mt5 mt5Var = (mt5) obj2;
        switch (b) {
            case 0:
                osi osiVar = new osi(psiVar, mt5Var, (byte) 0);
                osiVar.u = zBooleanValue;
                return osiVar.invokeSuspend(Unit.a);
            default:
                osi osiVar2 = new osi(psiVar, mt5Var, (byte) 1);
                osiVar2.u = zBooleanValue;
                return osiVar2.invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        psi psiVar = this.v;
        boolean z = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                psiVar.p = z;
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                psiVar.q = z;
                break;
        }
        return Unit.a;
    }
}
