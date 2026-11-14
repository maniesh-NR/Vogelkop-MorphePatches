package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l0o extends kuk implements Function1 {
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0o(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final mt5 create(mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new l0o(1, mt5Var, (byte) 0);
            case 1:
                return new l0o(1, mt5Var, (byte) 1);
            default:
                return new l0o(1, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj) {
        byte b = 1;
        switch (this.t) {
            case 0:
                return create((mt5) obj).invokeSuspend(Unit.a);
            case 1:
                new l0o(b, (mt5) obj, b);
                Unit unit = Unit.a;
                px5 px5Var = px5.a;
                ybh.y(unit);
                return unit;
            default:
                new l0o(b, (mt5) obj, (byte) 2);
                Unit unit2 = Unit.a;
                px5 px5Var2 = px5.a;
                ybh.y(unit2);
                return unit2;
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                break;
            default:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                break;
        }
        return Unit.a;
    }
}
