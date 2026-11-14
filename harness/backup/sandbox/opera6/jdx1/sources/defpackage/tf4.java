package defpackage;

import ads_mobile_sdk.f72;
import ads_mobile_sdk.gj1;
import ads_mobile_sdk.q6;
import ads_mobile_sdk.r62;
import ads_mobile_sdk.s52;
import android.view.View;
import android.widget.RelativeLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tf4 extends kuk implements Function1 {
    public final /* synthetic */ byte t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tf4(Object obj, Object obj2, Object obj3, mt5 mt5Var, byte b) {
        super(1, mt5Var);
        this.t = b;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
    }

    public final mt5 create(mt5 mt5Var) {
        byte b = this.t;
        Object obj = this.w;
        Object obj2 = this.v;
        Object obj3 = this.u;
        switch (b) {
            case 0:
                return new tf4((pqh) obj3, (pqh) obj2, (z21) obj, mt5Var, (byte) 0);
            case 1:
                return new tf4((j3g) obj3, (String) obj2, (Function1) obj, mt5Var, (byte) 1);
            case 2:
                return new tf4((r62) obj3, (q6) obj2, (View) obj, mt5Var, (byte) 2);
            case 3:
                return new tf4((r62) obj3, (q6) obj2, (RelativeLayout) obj, mt5Var, (byte) 3);
            default:
                return new tf4((f72) obj3, (gj1) obj2, (j7p) obj, mt5Var, (byte) 4);
        }
    }

    public final Object invoke(Object obj) {
        switch (this.t) {
        }
        return create((mt5) obj).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Object obj2 = this.w;
        Object obj3 = this.v;
        Object obj4 = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                ((pqh) obj4).a = null;
                if (((pqh) obj3).a == null) {
                    return null;
                }
                ((z21) obj2).a();
                return new agf(null, new yc4(13), 1);
            case 1:
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                wsk wskVarH = ((j3g) obj4).b.h((String) obj3);
                try {
                    Object objInvoke = ((Function1) obj2).invoke(wskVarH);
                    fr3.t(wskVarH, null);
                    return objInvoke;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        fr3.t(wskVarH, th);
                        throw th2;
                    }
                }
            case 2:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                ((r62) obj4).e.a((q6) obj3, (View) obj2);
                return Unit.a;
            case 3:
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                return ((r62) obj4).e.a((q6) obj3, (RelativeLayout) obj2);
            default:
                px5 px5Var5 = px5.a;
                ybh.y(obj);
                s52 s52Var = ((f72) obj4).c;
                s52Var.getClass();
                return (Unit) s52Var.f.d("FinishJavaScriptSessionService", new m53((gj1) obj3, (j7p) obj2, (byte) 21));
        }
    }
}
