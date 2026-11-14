package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fyj {
    public final dyj a;
    public final byte b;
    public final jxj c;
    public final boolean d;
    public final boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public fyj(dyj dyjVar, int i, jxj jxjVar, boolean z, int i2) {
        this.a = dyjVar;
        this.b = i;
        this.c = jxjVar;
        this.d = z;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyj)) {
            return false;
        }
        fyj fyjVar = (fyj) obj;
        return this.a == fyjVar.a && this.b == fyjVar.b && Intrinsics.a(this.c, fyjVar.c) && this.d == fyjVar.d && this.e == fyjVar.e;
    }

    public final int hashCode() {
        int iC = rfp.c(this.b, this.a.hashCode() * 31, 31);
        jxj jxjVar = this.c;
        return Integer.hashCode(this.e ? 1 : 0) + fki.k((iC + (jxjVar == null ? 0 : jxjVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
