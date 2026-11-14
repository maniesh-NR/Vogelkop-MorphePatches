package ads_mobile_sdk;

import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fu2 implements zcp {
    public final String a;

    public fu2(String str) {
        this.a = str;
    }

    public final void a(jjj jjjVar) {
        jjjVar.requestId = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fu2) && Intrinsics.a(this.a, ((fu2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("RequestIdSignal(requestId=", this.a, ")");
    }
}
