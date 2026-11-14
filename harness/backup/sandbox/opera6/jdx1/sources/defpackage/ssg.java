package defpackage;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ssg {
    public final Rect a;
    public final Size b;
    public final Size c;

    public ssg(Rect rect, Size size, Size size2) {
        this.a = rect;
        this.b = size;
        this.c = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssg)) {
            return false;
        }
        ssg ssgVar = (ssg) obj;
        return this.a.equals(ssgVar.a) && Intrinsics.a(this.b, ssgVar.b) && Intrinsics.a(this.c, ssgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.a + ", childSizeToScale=" + this.b + ", originalSelectedChildSize=" + this.c + ')';
    }
}
