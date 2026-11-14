package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public interface h8f {
    void a(lqm lqmVar, Context context, int i, Map map, Uri uri, g8f g8fVar);

    default Object b(Context context, l1b l1bVar, mt5 mt5Var) {
        return Boolean.TRUE;
    }

    default Object c(Context context, kk6 kk6Var) {
        return Boolean.FALSE;
    }
}
