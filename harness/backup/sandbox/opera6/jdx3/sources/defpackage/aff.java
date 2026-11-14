package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class aff extends kuk implements Function2 {
    public final /* synthetic */ xkn t;
    public final /* synthetic */ Map u;
    public final /* synthetic */ agm v;
    public final /* synthetic */ o2c w;
    public final /* synthetic */ afe x;
    public final /* synthetic */ long y;
    public final /* synthetic */ Integer z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aff(xkn xknVar, Map map, agm agmVar, o2c o2cVar, afe afeVar, long j, Integer num, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = xknVar;
        this.u = map;
        this.v = agmVar;
        this.w = o2cVar;
        this.x = afeVar;
        this.y = j;
        this.z = num;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new aff(this.t, this.u, this.v, this.w, this.x, this.y, this.z, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        px5 px5Var = px5.a;
        ybh.y(obj);
        xkn xknVar = this.t;
        if (xknVar.c == null || this.u.get(xknVar) != null) {
            return Unit.a;
        }
        afe afeVar = this.x;
        Map map = this.u;
        xkn xknVar2 = this.t;
        new qjn(this.v, xknVar2, new za(afeVar, map, xknVar2, this.y, this.z, (byte) 1), this.w);
        return Unit.a;
    }
}
