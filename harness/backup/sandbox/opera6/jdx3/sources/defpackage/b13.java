package defpackage;

import android.content.Context;
import android.net.Uri;
import com.opera.android.OperaApplication;
import java.util.Map;

/* loaded from: classes.dex */
public final class b13 extends q37 {
    public final boolean c;

    public b13(boolean z) {
        super(12, new int[0]);
        this.c = z;
    }

    @Override // defpackage.q37, defpackage.h8f
    public final void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar) throws fva {
        if (this.c && i != 0) {
            throw new fva(sko.i(i, "Invalid deep link source: "));
        }
        String[] strArr = OperaApplication.K;
        if (!((fjn) ((OperaApplication) context.getApplicationContext()).r.l1.get()).a()) {
            throw new fva("Not supported");
        }
        super.a(lqmVar, context, i, map, uri, g8fVar);
    }

    @Override // defpackage.h8f
    public final Object b(Context context, l1b l1bVar, mt5 mt5Var) {
        String[] strArr = OperaApplication.K;
        return Boolean.valueOf(((fjn) ((OperaApplication) context.getApplicationContext()).r.l1.get()).a());
    }
}
