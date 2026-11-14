package ads_mobile_sdk;

import defpackage.ybh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gy1 extends kuk implements Function2 {
    public final /* synthetic */ cy0 a;
    public final /* synthetic */ byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy1(cy0 cy0Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.a = cy0Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        cy0 cy0Var = this.a;
        switch (b) {
            case 0:
                return new gy1(cy0Var, mt5Var, (byte) 0);
            case 1:
                return new gy1(cy0Var, mt5Var, (byte) 1);
            case 2:
                return new gy1(cy0Var, mt5Var, (byte) 2);
            case 3:
                return new gy1(cy0Var, mt5Var, (byte) 3);
            case 4:
                return new gy1(cy0Var, mt5Var, (byte) 4);
            case 5:
                return new gy1(cy0Var, mt5Var, (byte) 5);
            case 6:
                return new gy1(cy0Var, mt5Var, (byte) 6);
            case 7:
                return new gy1(cy0Var, mt5Var, (byte) 7);
            case 8:
                return new gy1(cy0Var, mt5Var, (byte) 8);
            case 9:
                return new gy1(cy0Var, mt5Var, (byte) 9);
            default:
                return new gy1(cy0Var, mt5Var, (byte) 10);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        cy0 cy0Var = this.a;
        switch (b) {
            case 0:
                return new gy1(cy0Var, (mt5) obj2, (byte) 0).invokeSuspend(Unit.a);
            case 1:
                return new gy1(cy0Var, (mt5) obj2, (byte) 1).invokeSuspend(Unit.a);
            case 2:
                return new gy1(cy0Var, (mt5) obj2, (byte) 2).invokeSuspend(Unit.a);
            case 3:
                return new gy1(cy0Var, (mt5) obj2, (byte) 3).invokeSuspend(Unit.a);
            case 4:
                return new gy1(cy0Var, (mt5) obj2, (byte) 4).invokeSuspend(Unit.a);
            case 5:
                return new gy1(cy0Var, (mt5) obj2, (byte) 5).invokeSuspend(Unit.a);
            case 6:
                return new gy1(cy0Var, (mt5) obj2, (byte) 6).invokeSuspend(Unit.a);
            case 7:
                return new gy1(cy0Var, (mt5) obj2, (byte) 7).invokeSuspend(Unit.a);
            case 8:
                return new gy1(cy0Var, (mt5) obj2, (byte) 8).invokeSuspend(Unit.a);
            case 9:
                return new gy1(cy0Var, (mt5) obj2, (byte) 9).invokeSuspend(Unit.a);
            default:
                return new gy1(cy0Var, (mt5) obj2, (byte) 10).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        cy0 cy0Var = this.a;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                cy0Var.destroy();
                break;
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                cy0Var.setVisibility(0);
                break;
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                cy0Var.destroy();
                break;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                cy0Var.loadUrl("about:blank");
                break;
            case 4:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                cy0Var.destroy();
                break;
            case 5:
                px5 px5Var6 = px5.a;
                ybh.y(obj);
                cy0Var.destroy();
                break;
            case 6:
                px5 px5Var7 = px5.a;
                ybh.y(obj);
                cy0Var.onResume();
                break;
            case 7:
                px5 px5Var8 = px5.a;
                ybh.y(obj);
                break;
            case 8:
                px5 px5Var9 = px5.a;
                ybh.y(obj);
                cy0Var.onPause();
                break;
            case 9:
                px5 px5Var10 = px5.a;
                ybh.y(obj);
                cy0Var.destroy();
                break;
            default:
                px5 px5Var11 = px5.a;
                ybh.y(obj);
                cy0Var.requestLayout();
                break;
        }
        return Unit.a;
    }
}
