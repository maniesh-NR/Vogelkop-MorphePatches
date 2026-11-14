package ads_mobile_sdk;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class zf1 {
    public final Drawable a;
    public final Uri b;
    public final double c;
    public final int d;
    public final int e;

    public zf1(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.a = drawable;
        this.b = uri;
        this.c = d;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf1)) {
            return false;
        }
        zf1 zf1Var = (zf1) obj;
        return Intrinsics.a(this.a, zf1Var.a) && Intrinsics.a(this.b, zf1Var.b) && Double.compare(this.c, zf1Var.c) == 0 && this.d == zf1Var.d && this.e == zf1Var.e;
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return Integer.hashCode(this.e) + n6h.a(this.d, (Double.hashCode(this.c) + ((this.b.hashCode() + ((drawable == null ? 0 : drawable.hashCode()) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalNativeAdImage(drawable=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", scale=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.d);
        return rfp.p(sb, ", height=", this.e, ")");
    }
}
