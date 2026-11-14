package defpackage;

import android.os.Build;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class jb7 {
    public final DisplayCutout a;

    public jb7(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final r9b a() {
        return Build.VERSION.SDK_INT >= 30 ? r9b.d(r9n.y(this.a)) : r9b.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jb7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((jb7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
