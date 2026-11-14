package ads_mobile_sdk;

import defpackage.jjj;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c41 implements zcp {
    public final Map a;

    public c41(Map map) {
        this.a = map;
    }

    public final void a(jjj jjjVar) {
        Map<String, String> map = this.a;
        if (map.isEmpty()) {
            return;
        }
        jjjVar.inMemorySdkCoreData = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c41) && Intrinsics.a(this.a, ((c41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InMemorySdkCoreDataSignal(inMemorySdkCoreData=" + this.a + ")";
    }
}
