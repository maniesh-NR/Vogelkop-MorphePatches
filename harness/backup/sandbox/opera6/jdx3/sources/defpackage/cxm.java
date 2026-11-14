package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cxm {
    public final String a;
    public final Map b;

    public cxm(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxm)) {
            return false;
        }
        cxm cxmVar = (cxm) obj;
        return Intrinsics.a(this.a, cxmVar.a) && Intrinsics.a(this.b, cxmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UsercentricsServiceDecision(serviceId=" + this.a + ", consentTypeValues=" + this.b + ")";
    }
}
