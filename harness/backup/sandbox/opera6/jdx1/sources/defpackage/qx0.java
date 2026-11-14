package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class qx0 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ afe v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qx0(boolean z, afe afeVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = z;
        this.v = afeVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new qx0(this.u, this.v, mt5Var, (byte) 0);
            default:
                return new qx0(this.u, this.v, mt5Var, (byte) 1);
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
        afe afeVar = this.v;
        boolean z = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                if (!z) {
                    afeVar.setValue(Boolean.FALSE);
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                if (z) {
                    Regex regex = b9k.b;
                    afeVar.setValue(Boolean.FALSE);
                }
                break;
        }
        return Unit.a;
    }
}
