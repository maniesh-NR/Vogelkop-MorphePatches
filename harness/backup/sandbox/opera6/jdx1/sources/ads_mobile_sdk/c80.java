package ads_mobile_sdk;

import defpackage.jjj;
import defpackage.prb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c80 implements zcp {
    public final prb a;

    public c80(prb prbVar) {
        this.a = prbVar;
    }

    public final void a(jjj jjjVar) {
        jjjVar.csrbEcoData = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c80) && Intrinsics.a(this.a, ((c80) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "CsrbEcoDataSignal(consentStateJson=" + this.a + ")";
    }
}
