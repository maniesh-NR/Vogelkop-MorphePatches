package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class vsf implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kl0 b;

    public /* synthetic */ vsf(wsf wsfVar, kl0 kl0Var, byte b) {
        this.a = b;
        this.b = kl0Var;
    }

    public final Object invoke(Object obj) {
        if0 if0Var;
        if0 if0Var2;
        byte b = this.a;
        kl0 kl0Var = this.b;
        ak0 ak0Var = (ak0) obj;
        switch (b) {
            case 0:
                sd0 sd0Var = (sd0) ak0Var.h.getValue();
                String strB = wsf.b(kl0Var);
                qs7 qs7Var = sd0Var.a;
                pg0 pg0Var = new pg0(2350, -1, 2);
                pd0 pd0Var = sd0Var.b;
                Map map = (Map) pd0Var.n(1);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    pd0Var.q(1, 1, map2);
                    if0Var = new if0(pd0Var, 1, map2);
                } else {
                    if0Var = new if0(pd0Var, 1, map);
                }
                if0Var.put(strB, pg0Var);
                pg0Var.p(1, 1, 1L);
                break;
            default:
                sd0 sd0Var2 = (sd0) ak0Var.h.getValue();
                String strB2 = wsf.b(kl0Var);
                qs7 qs7Var2 = sd0Var2.a;
                pg0 pg0Var2 = new pg0(2350, -1, 2);
                pd0 pd0Var2 = sd0Var2.b;
                Map map3 = (Map) pd0Var2.n(1);
                if (map3 == null || map3.isEmpty()) {
                    HashMap map4 = new HashMap();
                    pd0Var2.q(1, 1, map4);
                    if0Var2 = new if0(pd0Var2, 1, map4);
                } else {
                    if0Var2 = new if0(pd0Var2, 1, map3);
                }
                if0Var2.put(strB2, pg0Var2);
                pg0Var2.p(0, 1, 1L);
                break;
        }
        return Unit.a;
    }
}
