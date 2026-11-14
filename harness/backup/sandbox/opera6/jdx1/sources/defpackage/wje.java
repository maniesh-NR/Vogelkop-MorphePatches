package defpackage;

/* loaded from: classes.dex */
public final class wje {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public wje(float f, float f2, float f3, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wje.class == obj.getClass()) {
            wje wjeVar = (wje) obj;
            return this.c == wjeVar.c && this.d == wjeVar.d && this.b == wjeVar.b && this.a == wjeVar.a && this.e == wjeVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + rfp.c(this.a, sko.d(this.b, sko.d(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
