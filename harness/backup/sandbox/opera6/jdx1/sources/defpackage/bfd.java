package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class bfd implements Comparable {
    public final long a;
    public final long b;
    public final long c;

    public bfd(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((bfd) obj).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfd)) {
            return false;
        }
        bfd bfdVar = (bfd) obj;
        return this.a == bfdVar.a && this.b == bfdVar.b && this.c == bfdVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c));
    }
}
