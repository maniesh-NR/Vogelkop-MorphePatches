package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pm6 extends rm5 {
    public final Drawable m;
    public final String n;

    public pm6(Drawable drawable, String str) {
        this.m = drawable;
        this.n = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm6)) {
            return false;
        }
        pm6 pm6Var = (pm6) obj;
        return Intrinsics.a(this.m, pm6Var.m) && Intrinsics.a(this.n, pm6Var.n);
    }

    public final int hashCode() {
        Drawable drawable = this.m;
        return this.n.hashCode() + ((drawable == null ? 0 : drawable.hashCode()) * 31);
    }

    public final String toString() {
        return "";
    }
}
