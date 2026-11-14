package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class pw1 {
    public final Map a;

    public final String a(ow1 ow1Var) {
        Object obj;
        Map map = this.a;
        if (map == null || (obj = map.get(ow1Var.a)) == null) {
            return null;
        }
        return obj.toString();
    }
}
