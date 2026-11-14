package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mzj {
    public final String a;
    public final String b;
    public final Bitmap c;
    public final boolean d;

    public /* synthetic */ mzj(String str, String str2, Bitmap bitmap, int i) {
        this(str, str2, (i & 4) != 0 ? null : bitmap, (i & 8) != 0);
    }

    public mzj(String str, String str2, Bitmap bitmap, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = bitmap;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzj)) {
            return false;
        }
        mzj mzjVar = (mzj) obj;
        return Intrinsics.a(this.a, mzjVar.a) && Intrinsics.a(this.b, mzjVar.b) && Intrinsics.a(this.c, mzjVar.c) && this.d == mzjVar.d;
    }

    public final int hashCode() {
        int iF = z1m.f(this.a.hashCode() * 31, 31, this.b);
        Bitmap bitmap = this.c;
        return Boolean.hashCode(this.d) + ((iF + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
