package ads_mobile_sdk;

import android.widget.ImageView;
import defpackage.fq;
import defpackage.p3p;
import defpackage.she;
import defpackage.ukh;
import defpackage.z1m;
import defpackage.z2j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w92 {
    public final String a;
    public final av2 b;
    public final defpackage.zk c;
    public final defpackage.hp d;
    public final fq e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final she i;
    public final z2j j;
    public final ukh k;
    public final String l;
    public final boolean m;
    public final ImageView.ScaleType n;
    public final int o;

    public w92(String str, av2 av2Var, defpackage.zk zkVar, defpackage.hp hpVar, fq fqVar, boolean z, List list, boolean z2, she sheVar, z2j z2jVar, ukh ukhVar, String str2, boolean z3, ImageView.ScaleType scaleType, int i) {
        this.a = str;
        this.b = av2Var;
        this.c = zkVar;
        this.d = hpVar;
        this.e = fqVar;
        this.f = z;
        this.g = list;
        this.h = z2;
        this.i = sheVar;
        this.j = z2jVar;
        this.k = ukhVar;
        this.l = str2;
        this.m = z3;
        this.n = scaleType;
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w92)) {
            return false;
        }
        w92 w92Var = (w92) obj;
        return this.a.equals(w92Var.a) && this.b == w92Var.b && this.c == w92Var.c && Intrinsics.a(this.d, w92Var.d) && Intrinsics.a(this.e, w92Var.e) && this.f == w92Var.f && Intrinsics.a(this.g, w92Var.g) && this.h == w92Var.h && this.i == w92Var.i && Intrinsics.a(this.j, w92Var.j) && Intrinsics.a(this.k, w92Var.k) && this.l.equals(w92Var.l) && this.m == w92Var.m && this.n == w92Var.n && this.o == w92Var.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        defpackage.hp hpVar = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (hpVar == null ? 0 : hpVar.hashCode())) * 31)) * 31;
        boolean z = this.f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode2 + i) * 31;
        List list = this.g;
        int iHashCode3 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        boolean z2 = this.h;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int iHashCode4 = (this.i.hashCode() + ((iHashCode3 + i3) * 31)) * 31;
        z2j z2jVar = this.j;
        int iHashCode5 = (iHashCode4 + (z2jVar == null ? 0 : z2jVar.hashCode())) * 31;
        ukh ukhVar = this.k;
        int iF = z1m.f((iHashCode5 + (ukhVar != null ? ukhVar.hashCode() : 0)) * 31, 31, this.l);
        boolean z3 = this.m;
        return Integer.hashCode(this.o) + ((this.n.hashCode() + ((iF + (z3 ? 1 : z3 ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutOfContextTestingConfiguration(adUnitId=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append(this.b);
        sb.append(", adChoicesPosition=");
        sb.append(this.c);
        sb.append(", adRequest=");
        sb.append(this.d);
        sb.append(", adSize=");
        sb.append(this.e);
        sb.append(", customMuteThisAd=");
        sb.append(this.f);
        sb.append(", customNativeTemplates=");
        sb.append(this.g);
        sb.append(", isImageLoadingDisabled=");
        sb.append(this.h);
        sb.append(", mediaAspectRatio=");
        sb.append(this.i);
        sb.append(", serverSideVerificationOptions=");
        sb.append(this.j);
        sb.append(", videoOptions=");
        sb.append(this.k);
        sb.append(", bannerPosition=");
        sb.append(this.l);
        sb.append(", isImmersiveMode=");
        sb.append(this.m);
        sb.append(", imageScaleType=");
        sb.append(this.n);
        sb.append(", widthConstraint=");
        return p3p.k(this.o, ")", sb);
    }
}
