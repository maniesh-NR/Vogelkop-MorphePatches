package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class j5f implements Function1 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j5f(int i, wb0 wb0Var, Integer num) {
        this.b = i;
        this.c = wb0Var;
        this.d = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j5f(String str, od0 od0Var, int i) {
        this.c = str;
        this.d = od0Var;
        this.b = i;
    }

    public final Object invoke(Object obj) {
        if0 if0Var;
        if0 if0Var2;
        byte b = this.a;
        byte b2 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                wb0 wb0Var = (wb0) obj3;
                Integer num = (Integer) obj2;
                td0 td0Var = (td0) obj;
                String strValueOf = String.valueOf((int) b2);
                td0Var.a.getClass();
                zb0 zb0Var = new zb0(2443, -1, 2);
                qd0 qd0Var = td0Var.b;
                Map map = (Map) qd0Var.n(67);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    qd0Var.q(67, 1, map2);
                    if0Var = new if0(qd0Var, 67, map2);
                } else {
                    if0Var = new if0(qd0Var, 67, map);
                }
                if0Var.put(strValueOf, zb0Var);
                zb0Var.q(0, wb0Var == null ? 0 : 1, wb0Var);
                if (num != null) {
                    zb0Var.p(1, 1, num.intValue());
                }
                break;
            default:
                String str = (String) obj3;
                od0 od0Var = (od0) obj2;
                mj0 mj0Var = (mj0) ((hi0) obj).c.getValue();
                mj0Var.a.getClass();
                hj0 hj0Var = new hj0(2443, -1, 6);
                lj0 lj0Var = mj0Var.b;
                Map map3 = (Map) lj0Var.n(14);
                if (map3 == null || map3.isEmpty()) {
                    HashMap map4 = new HashMap();
                    lj0Var.q(14, 1, map4);
                    if0Var2 = new if0(lj0Var, 14, map4);
                } else {
                    if0Var2 = new if0(lj0Var, 14, map3);
                }
                if0Var2.put(str, hj0Var);
                hj0Var.q(0, od0Var == null ? 0 : 1, od0Var);
                if (b2 == 1) {
                    hj0Var.p(1, 1, 1L);
                } else if (b2 == 2) {
                    hj0Var.p(2, 1, 1L);
                } else if (b2 == 3) {
                    hj0Var.p(3, 1, 1L);
                } else if (b2 == 4) {
                    hj0Var.p(4, 1, 1L);
                } else if (b2 == 5) {
                    hj0Var.p(5, 1, 1L);
                }
                break;
        }
        return Unit.a;
    }
}
