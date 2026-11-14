package defpackage;

import ads_mobile_sdk.n13;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class glp extends k8 implements aop {
    @Override // defpackage.aop
    public final Object a(n13 n13Var, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            n13 n13Var2 = n13Var;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new sto(str, value, mt5Var2, (Object) n13Var2, (byte) 2), mt5Var2, (byte) 3), 2);
            n13Var = n13Var2;
        }
        return Unit.a;
    }

    @Override // defpackage.aop
    public final Object a(Map map, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            Map map2 = map;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new sto(str, value, mt5Var2, (Object) map2, (byte) 3), mt5Var2, (byte) 3), 2);
            map = map2;
        }
        return Unit.a;
    }

    @Override // defpackage.aop
    public final Object a(r83 r83Var, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            r83 r83Var2 = r83Var;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new sto(str, value, mt5Var2, (Object) r83Var2, (byte) 5), mt5Var2, (byte) 3), 2);
            r83Var = r83Var2;
        }
        return Unit.a;
    }

    @Override // defpackage.aop
    public final Object b(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 28), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }

    @Override // defpackage.aop
    public final Unit f() {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var = null;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var, (byte) 29), mt5Var, (byte) 3), 2);
        }
        return Unit.a;
    }
}
