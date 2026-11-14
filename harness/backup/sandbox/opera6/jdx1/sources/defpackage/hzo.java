package defpackage;

import ads_mobile_sdk.ds0;
import ads_mobile_sdk.h1;
import ads_mobile_sdk.iu0;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class hzo extends iu0 {
    public final void b(String str) {
        Objects.requireNonNull(str);
        b$1();
        ((h1) this.b).s().remove(str);
    }

    public final void c(String str, ds0 ds0Var) {
        Objects.requireNonNull(str);
        b$1();
        ((h1) this.b).s().put(str, ds0Var);
    }

    public final Map e() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((h1) this.b).pools_));
    }
}
