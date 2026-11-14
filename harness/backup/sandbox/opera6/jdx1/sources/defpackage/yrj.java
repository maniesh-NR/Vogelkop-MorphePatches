package defpackage;

/* loaded from: classes.dex */
public final class yrj implements jxd {
    public final float a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public yrj(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yrj.class != obj.getClass()) {
            return false;
        }
        yrj yrjVar = (yrj) obj;
        return this.a == yrjVar.a && this.b == yrjVar.b;
    }

    public final int hashCode() {
        return sko.d(this.a, 527, 31) + this.b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + ((int) this.b);
    }
}
