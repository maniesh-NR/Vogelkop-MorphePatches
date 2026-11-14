package defpackage;

import android.os.Build;
import android.window.BackEvent;

/* loaded from: classes.dex */
public final class jz2 {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public jz2(float f, float f2, float f3, int i, long j) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public jz2(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public jz2(wje wjeVar) {
        this(wjeVar.c, wjeVar.d, wjeVar.b, wjeVar.a, wjeVar.e);
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
