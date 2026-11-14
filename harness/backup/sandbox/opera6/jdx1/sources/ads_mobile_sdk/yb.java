package ads_mobile_sdk;

import defpackage.jjj;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class yb implements zcp {
    public final Map a;

    public yb(Map map) {
        this.a = map;
    }

    public final void a(jjj jjjVar) {
        jjjVar.adapterVersionData.putAll(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yb) && Intrinsics.a(this.a, ((yb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdapterVersionsSignal(adapterNameToVersionsMap=" + this.a + ")";
    }
}
