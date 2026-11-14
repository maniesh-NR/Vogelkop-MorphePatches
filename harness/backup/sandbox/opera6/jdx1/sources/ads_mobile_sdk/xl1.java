package ads_mobile_sdk;

import android.view.WindowManager;
import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class xl1 extends kuk implements Function2 {
    public final /* synthetic */ WindowManager a;
    public final /* synthetic */ cy0 b;
    public final /* synthetic */ WindowManager.LayoutParams c;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xl1(WindowManager windowManager, cy0 cy0Var, WindowManager.LayoutParams layoutParams, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = windowManager;
        this.b = cy0Var;
        this.c = layoutParams;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                return new xl1(this.a, this.b, this.c, mt5Var, (byte) 0);
            default:
                return new xl1(this.a, this.b, this.c, mt5Var, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        WindowManager.LayoutParams layoutParams = this.c;
        cy0 cy0Var = this.b;
        WindowManager windowManager = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                windowManager.updateViewLayout(cy0Var, layoutParams);
                break;
            default:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                windowManager.updateViewLayout(cy0Var, layoutParams);
                break;
        }
        return Unit.a;
    }
}
