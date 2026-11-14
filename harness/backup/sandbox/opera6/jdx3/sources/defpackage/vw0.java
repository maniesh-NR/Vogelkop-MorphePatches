package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vw0 extends xw0 {
    public final Drawable a;
    public final int b;
    public final Integer c;

    public vw0(Drawable drawable, int i, Integer num) {
        this.a = drawable;
        this.b = i;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw0)) {
            return false;
        }
        vw0 vw0Var = (vw0) obj;
        return this.a.equals(vw0Var.a) && this.b == vw0Var.b && Intrinsics.a(this.c, vw0Var.c);
    }

    public final int hashCode() {
        int iC = rfp.c(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return iC + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "";
    }
}
