package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mf8 {
    public final long a;
    public final byte[] b;
    public final long c;

    public mf8(long j, byte[] bArr, long j2) {
        this.a = j;
        this.b = bArr;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf8)) {
            return false;
        }
        mf8 mf8Var = (mf8) obj;
        return this.a == mf8Var.a && Intrinsics.a(this.b, mf8Var.b) && this.c == mf8Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = sko.q(this.a, "Events(serial=", ", data_=", Arrays.toString(this.b));
        sbQ.append(", version=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
