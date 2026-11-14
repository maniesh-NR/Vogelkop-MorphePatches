package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes.dex */
public enum rm {
    NATIVE("native"),
    BANNER_SMALL("banner/small"),
    /* JADX INFO: Fake field, exist only in values array */
    BANNER_MEDIUM("banner/medium"),
    BANNER_INLINE("banner/inline"),
    BANNER_INLINE_MEDIUM("banner/inline_medium"),
    INTERSTITIAL("interstitial"),
    ICON("icon");

    public final String a;
    public static final rm h = NATIVE;
    public static final Set i = Collections.unmodifiableSet(EnumSet.allOf(rm.class));

    rm(String str) {
        this.a = str;
    }

    public static rm d(String str) {
        if (TextUtils.isEmpty(str)) {
            return h;
        }
        for (rm rmVar : values()) {
            if (rmVar.a.equals(str)) {
                return rmVar;
            }
        }
        qp2.o(sko.j("unknown ad format: ", str));
        return null;
    }
}
