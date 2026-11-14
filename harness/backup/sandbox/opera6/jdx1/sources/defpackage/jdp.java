package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class jdp extends k8 implements dfp {
    public final Object c(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 16), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }

    public final Unit d(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 13), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }

    public final Unit h(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 15), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }
}
