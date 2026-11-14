package defpackage;

import android.media.ImageWriter;

/* loaded from: classes.dex */
public final class m71 implements ImageWriter.OnImageReleasedListener, inm, AutoCloseable {
    public final ImageWriter a;
    public final int b;
    public final ef2 c = c26.k(null);

    public m71(ImageWriter imageWriter, int i) {
        this.a = imageWriter;
        this.b = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // defpackage.inm
    public final Object E(s15 s15Var) {
        if (s15Var.equals(uqh.a(ImageWriter.class))) {
            return this.a;
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.c.a == null) {
            return;
        }
        h9o.t();
    }

    public final String toString() {
        return "ImageWriter-" + rfk.a(this.a.getFormat()) + '-' + ((Object) ("Input-" + this.b));
    }
}
