package defpackage;

/* loaded from: classes.dex */
public final class gae implements jxd {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public gae(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gae.class == obj.getClass()) {
            gae gaeVar = (gae) obj;
            if (this.a == gaeVar.a && this.b == gaeVar.b && this.c == gaeVar.c && this.d == gaeVar.d && this.e == gaeVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + z1m.e(z1m.e(z1m.e(z1m.e(527, 31, this.a), 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
