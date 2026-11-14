package ads_mobile_sdk;

import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m8 implements zcp {
    public final String a;

    public m8(String str) {
        this.a = str;
    }

    public final void a(jjj jjjVar) {
        jjjVar.adShieldSignal = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8) && Intrinsics.a(this.a, ((m8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("AdSpamSignal(querySignal=", this.a, ")");
    }
}
