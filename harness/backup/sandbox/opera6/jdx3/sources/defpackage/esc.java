package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class esc implements acl {
    public final fnn a;

    public esc(fnn fnnVar) {
        this.a = fnnVar;
        fsc.a.add(this);
    }

    public void a(Exception exc, Drawable drawable) {
        this.a.a(exc, drawable);
        fsc.a.remove(this);
    }

    public void b(Drawable drawable) {
        this.a.b(drawable);
    }

    public final void c(Bitmap bitmap, int i) {
        this.a.c(bitmap, i);
        fsc.a.remove(this);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof esc) && ((esc) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
