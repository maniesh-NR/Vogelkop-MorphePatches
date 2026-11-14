package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pod {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final npd a;

    public pod(Context context, String str, gk9 gk9Var, csh cshVar, csh cshVar2, csh cshVar3, kod kodVar, Bundle bundle, Bundle bundle2, bpd bpdVar) {
        synchronized (b) {
            HashMap map = c;
            if (map.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
            map.put(str, this);
        }
        this.a = new npd(this, context, str, gk9Var, cshVar, cshVar2, cshVar3, kodVar, bundle, bundle2, bpdVar);
    }

    public final void a() {
        try {
            synchronized (b) {
                c.remove(this.a.i);
            }
            this.a.q();
        } catch (Exception unused) {
        }
    }
}
