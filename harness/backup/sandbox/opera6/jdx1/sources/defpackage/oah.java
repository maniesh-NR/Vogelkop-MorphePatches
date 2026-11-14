package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class oah extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ rah v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oah(rah rahVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = rahVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        rah rahVar = this.v;
        switch (b) {
            case 0:
                return new oah(rahVar, mt5Var, (byte) 0);
            default:
                return new oah(rahVar, mt5Var, (byte) 1);
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
        rah rahVar = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    sah sahVar = rahVar.t;
                    float f = rahVar.q ? 1.0f : 0.0f;
                    this.u = true;
                    Object objE = sahVar.a.e(this, new Float(f));
                    if (objE != px5Var) {
                        objE = Unit.a;
                    }
                    if (objE == px5Var) {
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
                    if (!((Boolean) rahVar.t.a.d.getValue()).booleanValue()) {
                        sah sahVar2 = rahVar.t;
                        float fH = rahVar.w.h() / rahVar.Z0();
                        this.u = true;
                        Object objE2 = sahVar2.a.e(this, new Float(fH));
                        if (objE2 != px5Var2) {
                            objE2 = Unit.a;
                        }
                        if (objE2 == px5Var2) {
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
        }
        return Unit.a;
    }
}
