package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bh0 extends kuk implements Function2 {
    public final /* synthetic */ ph0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bh0(mt5 mt5Var, ph0 ph0Var, String str, String str2, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = ph0Var;
        this.b = str;
        this.c = str2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new bh0(mt5Var, this.a, this.b, this.c, (byte) 0);
            default:
                return new bh0(mt5Var, this.a, this.b, this.c, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.t) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                synchronized (this.a) {
                }
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                synchronized (this.a) {
                }
                break;
        }
        return Unit.a;
    }
}
