package ads_mobile_sdk;

import defpackage.j4n;
import defpackage.jjj;
import defpackage.ukh;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class nv1 implements zcp {
    public final Integer a;
    public final ArrayList b;
    public final List c;
    public final Boolean d;
    public final String e;
    public final Boolean f;
    public final Integer g;
    public final Boolean h;
    public final ukh i;
    public final Boolean j;
    public final Integer k;
    public final Boolean l;
    public final Integer m;

    public nv1(Integer num, ArrayList arrayList, List list, Boolean bool, String str, Boolean bool2, Integer num2, Boolean bool3, ukh ukhVar, Boolean bool4, Integer num3, Boolean bool5, Integer num4) {
        this.a = num;
        this.b = arrayList;
        this.c = list;
        this.d = bool;
        this.e = str;
        this.f = bool2;
        this.g = num2;
        this.h = bool3;
        this.i = ukhVar;
        this.j = bool4;
        this.k = num3;
        this.l = bool5;
        this.m = num4;
    }

    public final void a(jjj jjjVar) {
        j4n j4nVar;
        jjjVar.nativeVersion = this.a;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            jjjVar.nativeTemplates = arrayList;
        }
        jjjVar.nativeCustomTemplates = this.c;
        jjjVar.enableNativeMediaOrientation = this.d;
        jjjVar.nativeMediaOrientation = this.e;
        jjjVar.customMuteThisAdRequested = this.f;
        jjjVar.customClickGestureDirection = this.g;
        jjjVar.customClickGestureAllowTaps = this.h;
        ukh ukhVar = this.i;
        if (ukhVar != null) {
            j4nVar = new j4n(ukhVar.b, ukhVar.d, ukhVar.c);
        } else {
            j4nVar = null;
        }
        jjjVar.videoOptionsSignal = j4nVar;
        jjjVar.isImageLoadingDisabled = this.j;
        jjjVar.adChoicesPlacement = this.k;
        jjjVar.usesMediaView = this.l;
        jjjVar.numberOfAdsRequested = this.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv1)) {
            return false;
        }
        nv1 nv1Var = (nv1) obj;
        return Intrinsics.a(this.a, nv1Var.a) && Intrinsics.a(this.b, nv1Var.b) && Intrinsics.a(this.c, nv1Var.c) && Intrinsics.a(this.d, nv1Var.d) && Intrinsics.a(this.e, nv1Var.e) && Intrinsics.a(this.f, nv1Var.f) && Intrinsics.a(this.g, nv1Var.g) && Intrinsics.a(this.h, nv1Var.h) && Intrinsics.a(this.i, nv1Var.i) && Intrinsics.a(this.j, nv1Var.j) && Intrinsics.a(this.k, nv1Var.k) && Intrinsics.a(this.l, nv1Var.l) && Intrinsics.a(this.m, nv1Var.m);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        ArrayList arrayList = this.b;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool3 = this.h;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ukh ukhVar = this.i;
        int iHashCode9 = (iHashCode8 + (ukhVar == null ? 0 : ukhVar.hashCode())) * 31;
        Boolean bool4 = this.j;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num3 = this.k;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool5 = this.l;
        int iHashCode12 = (iHashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num4 = this.m;
        return iHashCode12 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdSignal(nativeVersion=" + this.a + ", nativeTemplateIds=" + this.b + ", nativeCustomTemplates=" + this.c + ", enableNativeMediaOrientation=" + this.d + ", nativeMediaOrientation=" + this.e + ", customMuteThisAdRequested=" + this.f + ", customClickGestureDirection=" + this.g + ", customClickGestureAllowTaps=" + this.h + ", videoOptions=" + this.i + ", isImageLoadingDisabled=" + this.j + ", adChoicesPlacement=" + this.k + ", usesMediaView=" + this.l + ", numberOfAdsRequested=" + this.m + ")";
    }
}
