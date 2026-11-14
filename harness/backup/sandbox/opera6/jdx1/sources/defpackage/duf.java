package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class duf {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final cuf f;
    public final af2 g = c26.i(false);

    public duf(boolean z, long j, long j2, long j3, long j4, cuf cufVar) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = cufVar;
    }

    public final void a(long j, Object obj) {
        if (this.g.a()) {
            this.f.x(obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Output ");
        sb.append(this.d);
        sb.append(" at ");
        sb.append((Object) ho9.a(this.b));
        sb.append(" for ");
        t14.c(j7c.o(j, " was completed multiple times!", sb));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof duf) {
            duf dufVar = (duf) obj;
            if (this.a == dufVar.a && this.b == dufVar.b && this.c == dufVar.c && this.d == dufVar.d && this.e == dufVar.e && Intrinsics.a(this.f, dufVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + z1m.e(z1m.e(z1m.e(z1m.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.a + ", cameraFrameNumber=" + ((Object) ho9.a(this.b)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.c + ')')) + ", cameraOutputSequence=" + this.d + ", cameraOutputNumber=" + this.e + ", outputListener=" + this.f + ')';
    }
}
