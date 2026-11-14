package defpackage;

import android.graphics.drawable.Drawable;
import com.leanplum.internal.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gri {
    public static final gri j = new gri(-1, false, false, null, null, fri.a, false, false, null);
    public final long a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final Drawable e;
    public final fri f;
    public final boolean g;
    public final boolean h;
    public final cv2 i;

    public gri(long j2, boolean z, boolean z2, String str, Drawable drawable, fri friVar, boolean z3, boolean z4, cv2 cv2Var) {
        this.a = j2;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = drawable;
        this.f = friVar;
        this.g = z3;
        this.h = z4;
        this.i = cv2Var;
    }

    public static gri a(gri griVar, Drawable drawable, int i) {
        fri friVar = fri.c;
        long j2 = griVar.a;
        boolean z = griVar.b;
        boolean z2 = griVar.c;
        String str = griVar.d;
        if ((i & 32) != 0) {
            friVar = griVar.f;
        }
        return new gri(j2, z, z2, str, drawable, friVar, griVar.g, griVar.h, (i & Constants.Crypt.KEY_LENGTH) != 0 ? griVar.i : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gri)) {
            return false;
        }
        gri griVar = (gri) obj;
        return this.a == griVar.a && this.b == griVar.b && this.c == griVar.c && Intrinsics.a(this.d, griVar.d) && Intrinsics.a(this.e, griVar.e) && this.f == griVar.f && this.g == griVar.g && this.h == griVar.h && Intrinsics.a(this.i, griVar.i);
    }

    public final int hashCode() {
        int iK = fki.k(fki.k(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        Drawable drawable = this.e;
        int iK2 = fki.k(fki.k((this.f.hashCode() + ((iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31)) * 31, 31, this.g), 31, this.h);
        cv2 cv2Var = this.i;
        return iK2 + (cv2Var != null ? cv2Var.hashCode() : 0);
    }

    public final String toString() {
        return "";
    }
}
