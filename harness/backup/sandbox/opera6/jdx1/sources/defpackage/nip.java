package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class nip extends k8 implements fkp {
    public final Unit a(d2i d2iVar, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            d2i d2iVar2 = d2iVar;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new cek(str, value, mt5Var2, (Object) d2iVar2, (byte) 28), mt5Var2, (byte) 3), 2);
            d2iVar = d2iVar2;
        }
        return Unit.a;
    }

    public final Object f(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 23), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }

    public final Object k(mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, mt5Var2, (byte) 25), mt5Var2, (byte) 3), 2);
        }
        return Unit.a;
    }
}
