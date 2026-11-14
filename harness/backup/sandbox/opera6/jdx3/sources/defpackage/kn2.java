package defpackage;

/* loaded from: classes.dex */
public final class kn2 {
    public static final kn2 f = new kn2(200, 10000, 81920, 10485760, 604800000);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public kn2(int i, int i2, int i3, long j, long j2) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kn2) {
            kn2 kn2Var = (kn2) obj;
            if (this.a == kn2Var.a && this.b == kn2Var.b && this.c == kn2Var.c && this.d == kn2Var.d && this.e == kn2Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return p3p.k(this.e, "}", sb);
    }
}
