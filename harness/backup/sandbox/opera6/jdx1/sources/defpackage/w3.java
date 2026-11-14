package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w3 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ y3 v;
    public final /* synthetic */ nwg w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(y3 y3Var, nwg nwgVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = y3Var;
        this.w = nwgVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        nwg nwgVar = this.w;
        y3 y3Var = this.v;
        switch (b) {
            case 0:
                return new w3(y3Var, nwgVar, mt5Var, (byte) 0);
            case 1:
                return new w3(y3Var, nwgVar, mt5Var, (byte) 1);
            case 2:
                return new w3(y3Var, nwgVar, mt5Var, (byte) 2);
            default:
                return new w3(y3Var, nwgVar, mt5Var, (byte) 3);
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
        nwg nwgVar = this.w;
        y3 y3Var = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    lde ldeVar = y3Var.q;
                    if (ldeVar != null) {
                        mwg mwgVar = new mwg(nwgVar);
                        this.u = true;
                        if (ldeVar.a(mwgVar, this) == px5Var) {
                            break;
                        }
                    }
                } else if (!z) {
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ybh.y(obj);
                }
                break;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    lde ldeVar2 = y3Var.q;
                    if (ldeVar2 != null) {
                        mwg mwgVar2 = new mwg(nwgVar);
                        this.u = true;
                        if (ldeVar2.a(mwgVar2, this) == px5Var2) {
                            break;
                        }
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
                    lde ldeVar3 = y3Var.q;
                    if (ldeVar3 != null) {
                        this.u = true;
                        if (ldeVar3.a(nwgVar, this) == px5Var3) {
                            break;
                        }
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
                    lde ldeVar4 = y3Var.q;
                    if (ldeVar4 != null) {
                        owg owgVar = new owg(nwgVar);
                        this.u = true;
                        if (ldeVar4.a(owgVar, this) == px5Var4) {
                            break;
                        }
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
