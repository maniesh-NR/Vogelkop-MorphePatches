package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class phg {
    public final egd a;
    public final vjd b;
    public final Bitmap c;

    public phg(egd egdVar, vjd vjdVar, Bitmap bitmap) {
        this.a = egdVar;
        this.b = vjdVar;
        this.c = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (phg.class.equals(obj != null ? obj.getClass() : null)) {
            return this.a.equals(((phg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
