package defpackage;

import android.hardware.HardwareBuffer;
import android.media.Image;

/* loaded from: classes.dex */
public final class i71 implements g0b {
    public final Image a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public i71(Image image) {
        this.a = image;
        this.b = image.getFormat();
        this.c = image.getWidth();
        this.d = image.getHeight();
        this.e = image.getTimestamp();
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        boolean zEquals = s15Var.equals(uqh.a(Image.class));
        Image image = this.a;
        if (zEquals) {
            return image;
        }
        if (s15Var.equals(uqh.a(HardwareBuffer.class))) {
            return image.getHardwareBuffer();
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return "Image-" + rfk.a(this.b) + "-w" + this.c + 'h' + this.d + "-t" + this.e;
    }
}
