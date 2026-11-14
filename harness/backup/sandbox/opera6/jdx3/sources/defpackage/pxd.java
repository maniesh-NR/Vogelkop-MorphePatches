package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pxd {
    public final i16 a;
    public final qb7 b;
    public final HashMap c;

    public pxd(Context context, qb7 qb7Var) {
        i16 i16Var = new i16(context, (byte) 24);
        this.c = new HashMap();
        this.a = i16Var;
        this.b = qb7Var;
    }

    public final synchronized o5m a(String str) {
        if (this.c.containsKey(str)) {
            return (o5m) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryP = this.a.p(str);
        if (cctBackendFactoryP == null) {
            return null;
        }
        qb7 qb7Var = this.b;
        o5m o5mVarCreate = cctBackendFactoryP.create(new bn2((Context) qb7Var.a, (t55) qb7Var.b, (t55) qb7Var.c, str));
        this.c.put(str, o5mVarCreate);
        return o5mVarCreate;
    }
}
