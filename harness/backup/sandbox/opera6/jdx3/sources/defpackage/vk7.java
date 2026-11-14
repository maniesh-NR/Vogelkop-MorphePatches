package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vk7 implements jva {
    public final Drawable a;

    public vk7(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.jva
    public final boolean a() {
        return false;
    }

    @Override // defpackage.jva
    public final long b() {
        Drawable drawable = this.a;
        long jB = (nzm.b(drawable) << 2) * nzm.a(drawable);
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    @Override // defpackage.jva
    public final void c(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk7) && Intrinsics.a(this.a, ((vk7) obj).a);
    }

    @Override // defpackage.jva
    public final int getHeight() {
        return nzm.a(this.a);
    }

    @Override // defpackage.jva
    public final int getWidth() {
        return nzm.b(this.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
