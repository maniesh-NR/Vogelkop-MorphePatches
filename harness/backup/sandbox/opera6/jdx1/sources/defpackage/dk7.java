package defpackage;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class dk7 extends kuk implements cr9 {
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk7(int i, mt5 mt5Var, byte b) {
        super(i, mt5Var);
        this.t = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = 3;
        switch (this.t) {
            case 0:
                long j = ((y8f) obj2).a;
                return new dk7(b, (mt5) obj3, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                ((Number) obj2).floatValue();
                return new dk7(b, (mt5) obj3, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                ((Number) obj).intValue();
                new dk7(b, (mt5) obj3, (byte) 2).invokeSuspend(Unit.a);
                return Boolean.FALSE;
            default:
                long j2 = ((y8f) obj2).a;
                return new dk7(b, (mt5) obj3, b).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                return Unit.a;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                return Boolean.FALSE;
            default:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                return Unit.a;
        }
    }
}
