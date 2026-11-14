package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class qtk {
    public final Map a;

    public qtk() {
        this.a = Collections.synchronizedMap(new HashMap());
    }

    public qtk(HashMap map) {
        this.a = p3p.t(map);
    }
}
