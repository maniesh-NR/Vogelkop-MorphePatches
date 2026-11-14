package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kzo {
    public final z2p a;
    public final String b;

    public kzo(z2p z2pVar, String str) {
        this.a = z2pVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzo)) {
            return false;
        }
        kzo kzoVar = (kzo) obj;
        return this.a == kzoVar.a && Intrinsics.a(this.b, kzoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadReceipt(state=");
        sb.append(this.a);
        sb.append(", url=");
        return o18.p(sb, this.b, ')');
    }
}
