package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public enum z4m {
    OPERA(true),
    /* JADX INFO: Fake field, exist only in values array */
    SEARCH_ENGINE(false);

    public final boolean a;

    z4m(boolean z) {
        this.a = z;
    }

    public final String d(q6e q6eVar, Context context) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Opera";
        }
        if (iOrdinal != 1) {
            h9o.p();
            return null;
        }
        if (p8f.H(q6eVar, context)) {
            return ybh.h(context) == szb.k ? "Яндекс" : "Yandex";
        }
        return "Google";
    }
}
