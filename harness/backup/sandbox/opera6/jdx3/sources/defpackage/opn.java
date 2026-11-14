package defpackage;

import com.opera.android.weather.ui.WeatherWidgetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class opn extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ WeatherWidgetActivity v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ opn(WeatherWidgetActivity weatherWidgetActivity, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = weatherWidgetActivity;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        WeatherWidgetActivity weatherWidgetActivity = this.v;
        switch (b) {
            case 0:
                return new opn(weatherWidgetActivity, mt5Var, (byte) 0);
            case 1:
                return new opn(weatherWidgetActivity, mt5Var, (byte) 1);
            case 2:
                return new opn(weatherWidgetActivity, mt5Var, (byte) 2);
            default:
                return new opn(weatherWidgetActivity, mt5Var, (byte) 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        nx5 nx5Var = (nx5) obj;
        mt5 mt5Var = (mt5) obj2;
        switch (this.t) {
            case 0:
                create(nx5Var, mt5Var).invokeSuspend(Unit.a);
                break;
        }
        return create(nx5Var, mt5Var).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        WeatherWidgetActivity weatherWidgetActivity = this.v;
        mt5 mt5Var = null;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    int i = WeatherWidgetActivity.e0;
                    rlh rlhVar = weatherWidgetActivity.H0().d;
                    hkm hkmVar = new hkm((byte) 4, (mt5) null, weatherWidgetActivity);
                    this.u = true;
                    if (j14.v(rlhVar, hkmVar, this) == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                qp2.n("SharedFlow never completes, this call should never return.");
                return null;
            case 1:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (!z2) {
                    ybh.y(obj);
                    qcc qccVar = qcc.d;
                    opn opnVar = new opn(weatherWidgetActivity, mt5Var, (byte) 0);
                    this.u = true;
                    if (m5h.w(weatherWidgetActivity, qccVar, opnVar, this) == px5Var2) {
                        return px5Var2;
                    }
                } else {
                    if (!z2) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            case 2:
                px5 px5Var3 = px5.a;
                boolean z3 = this.u;
                if (!z3) {
                    ybh.y(obj);
                    oam oamVar = weatherWidgetActivity.T;
                    if (oamVar == null) {
                        oamVar = null;
                    }
                    sz4 sz4Var = weatherWidgetActivity.h;
                    if (sz4Var == null) {
                        qp2.o("Required value was null.");
                        return null;
                    }
                    boolean zY = yi4.y(sz4Var);
                    this.u = true;
                    Object objEmit = ((jdj) oamVar.c).emit(Boolean.valueOf(zY), this);
                    if (objEmit != px5Var3) {
                        objEmit = Unit.a;
                    }
                    if (objEmit == px5Var3) {
                        return px5Var3;
                    }
                } else {
                    if (!z3) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
            default:
                px5 px5Var4 = px5.a;
                boolean z4 = this.u;
                if (!z4) {
                    ybh.y(obj);
                    qcc qccVar2 = qcc.e;
                    opn opnVar2 = new opn(weatherWidgetActivity, mt5Var, (byte) 2);
                    this.u = true;
                    if (m5h.w(weatherWidgetActivity, qccVar2, opnVar2, this) == px5Var4) {
                        return px5Var4;
                    }
                } else {
                    if (!z4) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                return Unit.a;
        }
    }
}
