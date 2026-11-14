package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kk7 {
    public final Context a;
    public i97 b;
    public Bitmap c = null;
    public boolean d = true;
    public final Resources e;

    public kk7(Context context, i97 i97Var) {
        this.a = context;
        this.b = i97Var;
        this.e = context.getResources();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk7)) {
            return false;
        }
        kk7 kk7Var = (kk7) obj;
        return Intrinsics.a(this.a, kk7Var.a) && Intrinsics.a(this.b, kk7Var.b) && Intrinsics.a(this.c, kk7Var.c) && this.d == kk7Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Bitmap bitmap = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
