package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l28 {
    public final String a;
    public final ec4 b;
    public final byte c;
    public final v3n d;

    /* JADX WARN: Multi-variable type inference failed */
    public l28(String str, ec4 ec4Var, int i, v3n v3nVar) {
        this.a = str;
        this.b = ec4Var;
        this.c = i;
        this.d = v3nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l28)) {
            return false;
        }
        l28 l28Var = (l28) obj;
        return Intrinsics.a(this.a, l28Var.a) && Intrinsics.a(this.b, l28Var.b) && this.c == l28Var.c && Intrinsics.a(this.d, l28Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rfp.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 961);
    }

    public final String toString() {
        return "CacheKey(cameraId=" + this.a + ", cameraConfig=" + this.b + ", videoRecordingType=" + ((int) this.c) + ", videoCapabilitiesSource=0, videoEncoderInfoFinder=" + this.d + ')';
    }
}
