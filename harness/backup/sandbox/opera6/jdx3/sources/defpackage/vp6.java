package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vp6 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ cq6 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp6(cq6 cq6Var, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = cq6Var;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        cq6 cq6Var = this.v;
        switch (b) {
            case 0:
                vp6 vp6Var = new vp6(cq6Var, mt5Var, (byte) 0);
                vp6Var.u = obj;
                return vp6Var;
            case 1:
                vp6 vp6Var2 = new vp6(cq6Var, mt5Var, (byte) 1);
                vp6Var2.u = obj;
                return vp6Var2;
            default:
                vp6 vp6Var3 = new vp6(cq6Var, mt5Var, (byte) 2);
                vp6Var3.u = obj;
                return vp6Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((Set) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((jmc) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((List) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        jnc jncVar;
        byte b = this.t;
        cq6 cq6Var = this.v;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                Set set = (Set) obj2;
                px5 px5Var = px5.a;
                ybh.y(obj);
                qs6 qs6Var = cq6Var.e;
                qs6Var.g = set;
                qs6Var.d.Z(qs6Var.a, ((Boolean) qs6Var.e.g()).booleanValue(), set);
                break;
            case 1:
                jmc jmcVar = (jmc) obj2;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                fs6 fs6Var = cq6Var.b;
                boolean z = jmcVar != null;
                if (fs6Var.i != z) {
                    fs6Var.i = z;
                    xf8.G0(fs6Var.e, Boolean.valueOf(fs6Var.a()));
                    fs6Var.c();
                }
                break;
            default:
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                xh7 xh7Var = cq6Var.d.k;
                List<zmc> list = (List) obj2;
                ArrayList arrayList = new ArrayList(k95.o(list, 10));
                for (zmc zmcVar : list) {
                    long j = zmcVar.a().a;
                    if (zmcVar instanceof wmc) {
                        jncVar = jnc.b;
                    } else if (zmcVar instanceof qmc) {
                        jncVar = jnc.c;
                    } else if (zmcVar instanceof nmc) {
                        jncVar = jnc.d;
                    } else if (zmcVar instanceof kmc) {
                        jncVar = jnc.e;
                    } else if (!(zmcVar instanceof pmc)) {
                        h9o.p();
                        break;
                    } else {
                        jncVar = jnc.f;
                    }
                    arrayList.add(new poc(j, jncVar, zmcVar.a().e.a));
                }
                nak nakVar = (nak) xh7Var.c;
                nakVar.getClass();
                nakVar.k((Object) null, arrayList);
                break;
        }
        return Unit.a;
    }
}
