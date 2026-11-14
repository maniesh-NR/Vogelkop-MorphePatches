package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class rx0 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ afe v;
    public final /* synthetic */ afe w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx0(boolean z, afe afeVar, afe afeVar2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = z;
        this.v = afeVar;
        this.w = afeVar2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new rx0(this.u, this.v, this.w, mt5Var, (byte) 0);
            default:
                return new rx0(this.u, this.v, this.w, mt5Var, (byte) 1);
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
        afe afeVar = this.w;
        boolean z = this.u;
        afe afeVar2 = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                if (z) {
                    afeVar2.setValue(Boolean.TRUE);
                } else if (((Boolean) afeVar2.getValue()).booleanValue()) {
                    afeVar.setValue(Boolean.FALSE);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                Regex regex = b9k.b;
                if (((Boolean) afeVar2.getValue()).booleanValue() && z) {
                    afeVar.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.a;
    }
}
