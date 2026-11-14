package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class px0 extends kuk implements Function2 {
    public final /* synthetic */ cy0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ px0(cy0 cy0Var, String str, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = cy0Var;
        this.b = str;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        String str = this.b;
        cy0 cy0Var = this.a;
        switch (b) {
            case 0:
                return new px0(cy0Var, str, mt5Var, (byte) 0);
            case 1:
                return new px0(cy0Var, str, mt5Var, (byte) 1);
            default:
                return new px0(cy0Var, str, mt5Var, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        String str = this.b;
        cy0 cy0Var = this.a;
        switch (b) {
            case 0:
                return new px0(cy0Var, str, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new px0(cy0Var, str, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            default:
                return new px0(cy0Var, str, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        String str = this.b;
        cy0 cy0Var = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                cy0Var.evaluateJavascript(str, null);
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                cy0Var.loadUrl(str);
                break;
            default:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                cy0Var.e.a(str, (Throwable) new Exception(str));
                break;
        }
        return Unit.a;
    }
}
