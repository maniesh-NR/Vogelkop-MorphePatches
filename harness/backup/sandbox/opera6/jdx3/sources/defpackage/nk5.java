package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nk5 {
    public final String a;
    public final String b;
    public final String c;
    public final Bitmap d;
    public final List e;

    public nk5(String str, String str2, String str3, Bitmap bitmap, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bitmap;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk5)) {
            return false;
        }
        nk5 nk5Var = (nk5) obj;
        return Intrinsics.a(this.a, nk5Var.a) && Intrinsics.a(this.b, nk5Var.b) && Intrinsics.a(this.c, nk5Var.c) && Intrinsics.a(this.d, nk5Var.d) && Intrinsics.a(this.e, nk5Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
