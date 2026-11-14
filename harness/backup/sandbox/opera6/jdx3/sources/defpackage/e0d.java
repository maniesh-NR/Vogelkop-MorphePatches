package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0d {
    public final long a;
    public final String b;
    public final byte[] c;

    public e0d(String str, long j, byte[] bArr) {
        this.a = j;
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0d)) {
            return false;
        }
        e0d e0dVar = (e0d) obj;
        return this.a == e0dVar.a && this.b.equals(e0dVar.b) && Intrinsics.a(this.c, e0dVar.c);
    }

    public final int hashCode() {
        int iF = z1m.f(Long.hashCode(this.a) * 31, 31, this.b);
        byte[] bArr = this.c;
        return iF + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    public final String toString() {
        return "";
    }
}
