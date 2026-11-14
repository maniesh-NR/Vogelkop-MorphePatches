package ads_mobile_sdk;

import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w13 implements zcp {
    public final String a;

    public w13(String str) {
        this.a = str;
    }

    public final void a(jjj jjjVar) {
        jjjVar.sessionId = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w13) && Intrinsics.a(this.a, ((w13) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return sko.k("SessionIdSignal(sessionId=", this.a, ")");
    }
}
