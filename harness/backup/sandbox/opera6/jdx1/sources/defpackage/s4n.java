package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s4n {
    public static final /* synthetic */ int c = 0;
    public final wfh a;
    public final int b;

    static {
        wfh wfhVar = wfh.c;
    }

    public s4n(wfh wfhVar, int i) {
        this.a = wfhVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4n)) {
            return false;
        }
        s4n s4nVar = (s4n) obj;
        return Intrinsics.a(this.a, s4nVar.a) && this.b == s4nVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, 0, 0, Integer.valueOf(this.b), "video/*");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.a);
        sb.append(", encodeFrameRate=0, bitrate=0, aspectRatio=");
        return p3p.k(this.b, ", mimeType=video/*}", sb);
    }
}
