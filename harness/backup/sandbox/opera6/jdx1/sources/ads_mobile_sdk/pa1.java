package ads_mobile_sdk;

import defpackage.jjj;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pa1 implements zcp {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public pa1(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final void a(jjj jjjVar) {
        String str = this.a;
        if (str != null) {
            jjjVar.inspectorExtras = str;
        }
        boolean z = this.b;
        jjjVar.testMode = z ? 1 : 0;
        boolean z2 = this.c;
        jjjVar.linkedDevice = z2 ? 1 : 0;
        if (z || z2) {
            jjjVar.requestServerData = Integer.valueOf(this.d ? 0 : 1);
            jjjVar.shouldCollectAdResponseLogs = Boolean.valueOf(this.e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa1)) {
            return false;
        }
        pa1 pa1Var = (pa1) obj;
        return Intrinsics.a(this.a, pa1Var.a) && this.b == pa1Var.b && this.c == pa1Var.c && this.d == pa1Var.d && this.e == pa1Var.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.c;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.d;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.e;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InspectorSignal(requestExtras=");
        sb.append(this.a);
        sb.append(", isTestMode=");
        sb.append(this.b);
        sb.append(", isLinkedDevice=");
        z1m.v(sb, this.c, ", hasServerData=", this.d, ", shouldCollectAdResponseLogs=");
        return z1m.m(sb, this.e, ")");
    }
}
