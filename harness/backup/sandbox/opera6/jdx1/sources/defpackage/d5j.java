package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class d5j extends ck9 {
    public final Object d;
    public final sxa e;
    public final int f;
    public final int g;

    public d5j(qya qyaVar, Size size, sxa sxaVar) {
        super(qyaVar);
        this.d = new Object();
        if (size == null) {
            this.f = this.b.getWidth();
            this.g = this.b.getHeight();
        } else {
            this.f = size.getWidth();
            this.g = size.getHeight();
        }
        this.e = sxaVar;
    }

    @Override // defpackage.ck9, defpackage.qya
    public final int getHeight() {
        return this.g;
    }

    @Override // defpackage.ck9, defpackage.qya
    public final int getWidth() {
        return this.f;
    }

    @Override // defpackage.ck9, defpackage.qya
    public final sxa h1() {
        return this.e;
    }

    public final void k(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f, this.g)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.d) {
        }
    }
}
