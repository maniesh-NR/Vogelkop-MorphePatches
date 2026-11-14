package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k3b {
    public final byte a;
    public final long b;
    public final boolean c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public k3b(int i, long j, String str, int i2) {
        j = (i2 & 2) != 0 ? 0L : j;
        boolean z = (i2 & 4) == 0;
        str = (i2 & 8) != 0 ? "" : str;
        this.a = i;
        this.b = j;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3b)) {
            return false;
        }
        k3b k3bVar = (k3b) obj;
        return this.a == k3bVar.a && this.b == k3bVar.b && this.c == k3bVar.c && Intrinsics.a(this.d, k3bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fki.k(z1m.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
