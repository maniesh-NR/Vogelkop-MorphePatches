package defpackage;

import android.content.Context;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v8k {
    public static final v8k a;
    public static final v8k b;
    public static final /* synthetic */ v8k[] c;

    static {
        v8k v8kVar = new v8k("DEFAULT", 0);
        a = v8kVar;
        v8k v8kVar2 = new v8k("VARIANT", 1);
        b = v8kVar2;
        c = new v8k[]{v8kVar, v8kVar2};
    }

    public static v8k valueOf(String str) {
        return (v8k) Enum.valueOf(v8k.class, str);
    }

    public static v8k[] values() {
        return (v8k[]) c.clone();
    }

    public final int d(Context context) {
        int i;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            i = 2130970842;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return 0;
            }
            i = 2130970843;
        }
        return f03.t(i, context, 2131101243);
    }
}
