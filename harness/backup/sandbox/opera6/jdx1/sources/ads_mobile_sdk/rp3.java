package ads_mobile_sdk;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rp3 {
    public final ViewGroup.LayoutParams a;
    public final int b;
    public final ViewGroup c;
    public final Context d;

    public rp3(ViewGroup.LayoutParams layoutParams, int i, ViewGroup viewGroup, Context context) {
        this.a = layoutParams;
        this.b = i;
        this.c = viewGroup;
        this.d = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp3)) {
            return false;
        }
        rp3 rp3Var = (rp3) obj;
        return Intrinsics.a(this.a, rp3Var.a) && this.b == rp3Var.b && this.c.equals(rp3Var.c) && Intrinsics.a(this.d, rp3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + n6h.a(this.b, this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "WebViewParentLayoutInfo(layoutParams=" + this.a + ", index=" + this.b + ", parent=" + this.c + ", originalContext=" + this.d + ")";
    }
}
