package ads_mobile_sdk;

import android.graphics.Insets;
import android.os.Build;
import defpackage.jjj;
import defpackage.z1m;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e8 implements zcp {
    public final String a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Insets g;
    public final String h;
    public final Boolean i;
    public final String j;
    public final String k;
    public final ArrayList l;
    public final ay2 m;
    public final boolean n;

    public e8(String str, float f, int i, int i2, int i3, int i4, Insets insets, String str2, Boolean bool, String str3, String str4, ArrayList arrayList, ay2 ay2Var, boolean z) {
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = insets;
        this.h = str2;
        this.i = bool;
        this.j = str3;
        this.k = str4;
        this.l = arrayList;
        this.m = ay2Var;
        this.n = z;
    }

    public final void a(jjj jjjVar) {
        Insets insets;
        jjjVar.format = this.a;
        jjjVar.screenDensity = this.b;
        jjjVar.screenHeight = this.d;
        jjjVar.screenWidth = this.c;
        jjjVar.screenHeightDip = this.f;
        jjjVar.screenWidthDip = this.e;
        if (Build.VERSION.SDK_INT >= 30 && (insets = this.g) != null) {
            jjjVar.safeAreaMarginLeftDip = Integer.valueOf(insets.left);
            jjjVar.safeAreaMarginTopDip = Integer.valueOf(insets.top);
            jjjVar.safeAreaMarginRightDip = Integer.valueOf(insets.right);
            jjjVar.safeAreaMarginBottomDip = Integer.valueOf(insets.bottom);
        }
        jjjVar.responsiveAutoFormat = this.h;
        jjjVar.adaptiveSlot = this.i;
        jjjVar.fluidType = this.j;
        jjjVar.multipleAdSizeString = this.k;
        jjjVar.adSizeArray.addAll(this.l);
        ay2 ay2Var = this.m;
        if (ay2Var != null) {
            jjjVar.roundedCornerTopLeftDip = Integer.valueOf(ay2Var.a);
            jjjVar.roundedCornerTopRightDip = Integer.valueOf(ay2Var.b);
            jjjVar.roundedCornerBottomLeftDip = Integer.valueOf(ay2Var.d);
            jjjVar.roundedCornerBottomRightDip = Integer.valueOf(ay2Var.c);
        }
        jjjVar.isGreaterThanMaxAllowedBannerSize = this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return Intrinsics.a(this.a, e8Var.a) && Float.compare(this.b, e8Var.b) == 0 && this.c == e8Var.c && this.d == e8Var.d && this.e == e8Var.e && this.f == e8Var.f && Intrinsics.a(this.g, e8Var.g) && Intrinsics.a(this.h, e8Var.h) && Intrinsics.a(this.i, e8Var.i) && Intrinsics.a(this.j, e8Var.j) && Intrinsics.a(this.k, e8Var.k) && this.l.equals(e8Var.l) && Intrinsics.a(this.m, e8Var.m) && this.n == e8Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = n6h.a(this.f, n6h.a(this.e, n6h.a(this.d, n6h.a(this.c, sko.d(this.b, this.a.hashCode() * 31, 31)))));
        Insets insets = this.g;
        int iHashCode = (iA + (insets == null ? 0 : insets.hashCode())) * 31;
        String str = this.h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iG = z1m.g(this.l, (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        ay2 ay2Var = this.m;
        int iHashCode5 = (iG + (ay2Var != null ? ay2Var.hashCode() : 0)) * 31;
        boolean z = this.n;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (iHashCode5 + i) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdSizeSignal(formatString=");
        sb.append(this.a);
        sb.append(", screenDensity=");
        sb.append(this.b);
        sb.append(", screenWidth=");
        sko.r(this.c, this.d, ", screenHeight=", ", screenWidthDip=", sb);
        sko.r(this.e, this.f, ", screenHeightDip=", ", safeAreaMarginsDip=", sb);
        sb.append(this.g);
        sb.append(", responsiveAutoFormat=");
        sb.append(this.h);
        sb.append(", isInlineAdaptive=");
        sb.append(this.i);
        sb.append(", fluidType=");
        sb.append(this.j);
        sb.append(", multipleAdSizeString=");
        sb.append(this.k);
        sb.append(", supportedAdSizes=");
        sb.append(this.l);
        sb.append(", roundedCornerRadii=");
        sb.append(this.m);
        sb.append(", isGreaterThanMaxAllowedBannerSize=");
        sb.append(this.n);
        sb.append(", maxSlotWidth=null, maxSlotHeight=null)");
        return sb.toString();
    }
}
