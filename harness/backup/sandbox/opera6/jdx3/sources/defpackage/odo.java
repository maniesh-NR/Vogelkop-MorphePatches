package defpackage;

/* loaded from: classes.dex */
public final class odo {
    public final float a;
    public final float b;
    public final float c;

    public odo(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odo)) {
            return false;
        }
        odo odoVar = (odo) obj;
        return Float.compare(this.a, odoVar.a) == 0 && Float.compare(this.b, odoVar.b) == 0 && Float.compare(this.c, odoVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + sko.d(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "ZoomValue(zoomRatio=" + this.a + ", minZoomRatio=" + this.b + ", maxZoomRatio=" + this.c + ')';
    }
}
