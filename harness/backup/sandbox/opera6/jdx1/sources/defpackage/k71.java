package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* loaded from: classes.dex */
public final class k71 implements qya {
    public final Image a;
    public final eme[] b;
    public final tn2 c;

    public k71(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new eme[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new eme(planes[i]);
            }
        } else {
            this.b = new eme[0];
        }
        this.c = new tn2(hbl.b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // defpackage.qya
    public final pya[] A0() {
        return this.b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.qya
    public final int getFormat() {
        return this.a.getFormat();
    }

    @Override // defpackage.qya
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // defpackage.qya
    public final int getWidth() {
        return this.a.getWidth();
    }

    @Override // defpackage.qya
    public final sxa h1() {
        return this.c;
    }

    @Override // defpackage.qya
    public final Image y() {
        return this.a;
    }
}
