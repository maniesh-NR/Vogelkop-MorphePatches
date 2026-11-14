package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cv7 {
    public final Drawable a;
    public final fri b;
    public final boolean c;
    public final String d;
    public final cv2 e;

    public cv7(Drawable drawable, fri friVar, boolean z, String str, cv2 cv2Var) {
        this.a = drawable;
        this.b = friVar;
        this.c = z;
        this.d = str;
        this.e = cv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv7)) {
            return false;
        }
        cv7 cv7Var = (cv7) obj;
        return Intrinsics.a(this.a, cv7Var.a) && this.b == cv7Var.b && this.c == cv7Var.c && Intrinsics.a(this.d, cv7Var.d) && Intrinsics.a(this.e, cv7Var.e);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        int iK = fki.k((this.b.hashCode() + ((drawable == null ? 0 : drawable.hashCode()) * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        cv2 cv2Var = this.e;
        return iHashCode + (cv2Var != null ? cv2Var.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
