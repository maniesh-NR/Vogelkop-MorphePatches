package ads_mobile_sdk;

import defpackage.ita;
import defpackage.jjj;
import defpackage.kta;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m31 implements zcp {
    public final kta a;

    public m31(kta ktaVar) {
        this.a = ktaVar;
    }

    public final void a(jjj jjjVar) {
        jjjVar.isIconAdRequest = Boolean.TRUE;
        kta ktaVar = this.a;
        ktaVar.getClass();
        jjjVar.correlator = "";
        ita itaVar = ktaVar.j;
        if (itaVar != null) {
            jjjVar.iconAdPlacement = Integer.valueOf(itaVar.a);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m31) && Intrinsics.a(this.a, ((m31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IconAdSignal(iconRequest=" + this.a + ")";
    }
}
