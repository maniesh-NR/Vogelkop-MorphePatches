package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wu {
    public final zt1 a;
    public final Drawable b;

    public wu(zt1 zt1Var, Drawable drawable) {
        this.a = zt1Var;
        this.b = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu)) {
            return false;
        }
        wu wuVar = (wu) obj;
        return Intrinsics.a(this.a, wuVar.a) && Intrinsics.a(this.b, wuVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Drawable drawable = this.b;
        return iHashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "";
    }
}
