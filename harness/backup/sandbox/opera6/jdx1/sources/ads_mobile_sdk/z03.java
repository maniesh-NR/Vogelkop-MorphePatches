package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.jjj;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z03 implements zcp {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public z03(int i, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final void a(jjj jjjVar) {
        jjjVar.afmaVersion = this.a;
        jjjVar.isDecagon = true;
        jjjVar.additionalCapabilities = this.b;
        jjjVar.targetApi = Integer.valueOf(this.c);
        jjjVar.granularVersion = this.d;
        jjjVar.sdkEnvironment.isInstantApp = Boolean.valueOf(this.e);
        jjjVar.sdkEnvironment.isPrivilegedProcess = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z03)) {
            return false;
        }
        z03 z03Var = (z03) obj;
        return Intrinsics.a(this.a, z03Var.a) && Intrinsics.a(this.b, z03Var.b) && this.c == z03Var.c && Intrinsics.a(this.d, z03Var.d) && this.e == z03Var.e && this.f == z03Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = dgh.a(this.d, n6h.a(this.c, dgh.a(this.b, this.a.hashCode() * 31)));
        boolean z = this.e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iA + i) * 31;
        boolean z2 = this.f;
        return (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sbN = z1m.n("SdkEnvironmentSignal(afmaVersion=", this.a, ", additionalCapabilities=", this.b, ", targetApi=");
        sbN.append(this.c);
        sbN.append(", externalVersion=");
        sbN.append(this.d);
        sbN.append(", isInstantApp=");
        sbN.append(this.e);
        sbN.append(", isPrivilegedProcess=");
        sbN.append(this.f);
        sbN.append(", isAdapterInitConfigSet=false)");
        return sbN.toString();
    }
}
