package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class ww0 extends xw0 {
    public final Bitmap a;

    public ww0(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ww0) && this.a.equals(((ww0) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
