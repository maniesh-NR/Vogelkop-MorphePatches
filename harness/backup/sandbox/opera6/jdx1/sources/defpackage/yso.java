package defpackage;

import ads_mobile_sdk.ds0;
import ads_mobile_sdk.h6;
import ads_mobile_sdk.iu0;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yso extends iu0 {
    public final void b(String str) {
        Objects.requireNonNull(str);
        b$1();
        ((ds0) this.b).q().remove(str);
    }

    public final void c(String str, h6 h6Var) {
        Objects.requireNonNull(str);
        b$1();
        ((ds0) this.b).q().put(str, h6Var);
    }

    public final Map e() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((ds0) this.b).adResponseLists_));
    }
}
