package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pz1 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ tz1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz1(tz1 tz1Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = tz1Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        tz1 tz1Var = this.v;
        switch (b) {
            case 0:
                return new pz1(tz1Var, mt5Var, (byte) 0);
            default:
                return new pz1(tz1Var, mt5Var, (byte) 1);
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
        tz1 tz1Var = this.v;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                boolean z = this.u;
                if (!z) {
                    ybh.y(obj);
                    qca qcaVar = tz1Var.g;
                    this.u = true;
                    obj = kfo.a0(this, qcaVar.a, true, false, new q9a((byte) 4));
                    if (obj == px5Var) {
                        return px5Var;
                    }
                } else {
                    if (!z) {
                        qp2.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ybh.y(obj);
                }
                Iterable<yca> iterable = (Iterable) obj;
                int iA = qbd.a(k95.o(iterable, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (yca ycaVar : iterable) {
                    linkedHashMap.put(ycaVar.a, ycaVar.b);
                }
                return linkedHashMap;
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
                this.u = true;
                bhi bhiVar = new bhi(hib.b(this));
                l32 l32Var = tz1Var.a;
                new rml(Unit.a, l32Var.a).a(new b32(l32Var, (byte) 0)).t(new t02(new lx1(bhiVar, (byte) 3), (byte) 5)).l();
                Object objA = bhiVar.a();
                return objA == px5Var2 ? px5Var2 : objA;
        }
    }
}
