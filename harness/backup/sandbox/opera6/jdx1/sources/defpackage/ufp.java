package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class ufp extends k8 implements eip {
    public final Object a(Bundle bundle, mt5 mt5Var) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            mt5 mt5Var2 = null;
            Bundle bundle2 = bundle;
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new cek(str, value, mt5Var2, (Object) bundle2, (byte) 25), mt5Var2, (byte) 3), 2);
            bundle = bundle2;
        }
        return Unit.a;
    }
}
