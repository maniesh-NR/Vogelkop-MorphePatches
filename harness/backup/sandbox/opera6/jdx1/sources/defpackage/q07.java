package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class q07 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ u07 v;
    public final /* synthetic */ Map w;
    public final /* synthetic */ sj5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q07(u07 u07Var, mt5 mt5Var, Map map, sj5 sj5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        switch (b) {
            case 1:
                yrm yrmVar = yrm.a;
                this.v = u07Var;
                this.w = map;
                this.x = sj5Var;
                super(2, mt5Var);
                break;
            default:
                yrm yrmVar2 = yrm.a;
                this.v = u07Var;
                this.w = map;
                this.x = sj5Var;
                break;
        }
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        switch (this.t) {
            case 0:
                yrm yrmVar = yrm.a;
                return new q07(this.v, mt5Var, this.w, this.x, (byte) 0);
            default:
                yrm yrmVar2 = yrm.a;
                return new q07(this.v, mt5Var, this.w, this.x, (byte) 1);
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
        sj5 sj5Var = this.x;
        Map map = this.w;
        u07 u07Var = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (z) {
                    if (z) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                ism ismVarN = u07Var.n();
                yrm yrmVar = yrm.a;
                cd5 cd5VarL = ismVarN.l(map, sj5Var);
                this.u = true;
                Object objA = cd5VarL.A(this);
                return objA == px5Var ? px5Var : objA;
            default:
                px5 px5Var2 = px5.a;
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        ybh.y(obj);
                        return obj;
                    }
                    qp2.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ybh.y(obj);
                ism ismVarN2 = u07Var.n();
                yrm yrmVar2 = yrm.a;
                h07 h07VarM = ismVarN2.m(map, sj5Var);
                this.u = true;
                Object objX = h07VarM.X(this);
                return objX == px5Var2 ? px5Var2 : objX;
        }
    }
}
