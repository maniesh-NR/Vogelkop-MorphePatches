package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fd4 {
    public final String a;
    public final List b;
    public final List c;
    public final ArrayList d;
    public final bg4 e;
    public final int f;
    public final LinkedHashMap g;
    public final int h;
    public final u9d i;
    public final List j;
    public final List k;
    public final Map l;
    public final fyd m;
    public final hd4 n;

    public fd4(String str, List list, List list2, ArrayList arrayList, bg4 bg4Var, int i, LinkedHashMap linkedHashMap, int i2, u9d u9dVar, List list3, List list4, hd4 hd4Var) {
        n08 n08Var = n08.a;
        fyd fydVar = new fyd();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = arrayList;
        this.e = bg4Var;
        this.f = i;
        this.g = linkedHashMap;
        this.h = i2;
        this.i = u9dVar;
        this.j = list3;
        this.k = list4;
        this.l = n08Var;
        this.m = fydVar;
        this.n = hd4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd4)) {
            return false;
        }
        fd4 fd4Var = (fd4) obj;
        return Intrinsics.a(this.a, fd4Var.a) && Intrinsics.a(this.b, fd4Var.b) && Intrinsics.a(this.c, fd4Var.c) && Intrinsics.a(this.d, fd4Var.d) && Intrinsics.a(this.e, fd4Var.e) && this.f == fd4Var.f && this.g.equals(fd4Var.g) && this.h == fd4Var.h && Intrinsics.a(this.i, fd4Var.i) && Intrinsics.a(this.j, fd4Var.j) && Intrinsics.a(this.k, fd4Var.k) && Intrinsics.a(this.l, fd4Var.l) && this.m.equals(fd4Var.m) && this.n.equals(fd4Var.n);
    }

    public final int hashCode() {
        int iF = rfp.f(rfp.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ArrayList arrayList = this.d;
        int iHashCode = (iF + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        bg4 bg4Var = this.e;
        return (this.n.hashCode() + ((this.m.a.hashCode() + z1m.h(this.l, rfp.f(rfp.f((this.i.hashCode() + ((((Integer.hashCode(this.h) + ((this.g.hashCode() + rfp.c(this.f, (iHashCode + (bg4Var != null ? bg4Var.hashCode() : 0)) * 31, 31)) * 31)) * 31) + 1) * 31)) * 31, 31, this.j), 31, this.k), 29791)) * 31)) * 31;
    }

    public final String toString() {
        return "Config(camera=" + ((Object) sd4.b(this.a)) + ", streams=" + this.b + ", exclusiveStreamGroups=" + this.c + ", input=" + this.d + ", postviewStream=" + this.e + ", sessionTemplate=" + ((Object) wwh.b(this.f)) + ", sessionParameters=" + this.g + ", sessionMode=" + ((Object) phj.y0(this.h)) + ", defaultTemplate=" + ((Object) wwh.b(1)) + ", defaultParameters=" + this.i + ", defaultListeners=" + this.j + ", graphStateListeners=" + this.k + ", requiredParameters=" + this.l + ", cameraBackendId=null, customCameraBackend=null, metadataTransform=" + this.m + ", flags=" + this.n + ", sessionColorSpace=null)";
    }
}
