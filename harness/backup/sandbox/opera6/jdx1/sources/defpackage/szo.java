package defpackage;

import java.util.Map;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class szo extends k8 {
    public final void a(boolean z) {
        for (Map.Entry entry : ((Map) ((k8) this).b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            na2.B((nx5) ((k8) this).a, h.a, null, new fsg(new xe6(str, value, (mt5) null, z), null, (byte) 3), 2);
        }
    }
}
