package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class one {
    public static final one b = new one(rbd.i(new LinkedHashMap()));
    public final Map a;

    public one(Map map) {
        this.a = map;
    }

    public final String a() {
        List list = (List) this.a.get("Content-Type".toLowerCase(Locale.ROOT));
        if (list != null) {
            return (String) CollectionsKt.R(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof one) && Intrinsics.a(this.a, ((one) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NetworkHeaders(data=" + this.a + ")";
    }
}
