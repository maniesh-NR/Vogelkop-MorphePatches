package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class lzh {
    public final Resources a;
    public final Resources.Theme b;

    public lzh(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lzh.class == obj.getClass()) {
            lzh lzhVar = (lzh) obj;
            if (this.a.equals(lzhVar.a) && Objects.equals(this.b, lzhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
