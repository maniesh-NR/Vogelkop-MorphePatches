package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class u4i {
    public final Context a;
    public final j4c b;

    public u4i(Context context, j4c j4cVar) {
        this.a = context;
        this.b = j4cVar;
    }

    public final boolean a(String str) {
        Uri uri = Uri.parse(str);
        lk6 lk6Var = lk6.a;
        ik6 ik6Var = ik6.b;
        lqm lqmVar = lqm.F;
        Context context = this.a;
        if (!lk6.f(1, ik6Var, lqmVar, context, uri)) {
            return false;
        }
        boolean zF = lk6.f(1, ik6.a, lqmVar, context, uri);
        if (zF) {
            nzl nzlVar = (nzl) this.b.get();
            if (((Boolean) nzlVar.c.a.getValue()).booleanValue() && (wqm.s(str) || wqm.u(str))) {
                na2.B(nzlVar.b, (CoroutineContext) null, (rx5) null, new r8h(nzlVar, str, (mt5) null, (byte) 27), 3);
            }
        }
        return zF;
    }
}
