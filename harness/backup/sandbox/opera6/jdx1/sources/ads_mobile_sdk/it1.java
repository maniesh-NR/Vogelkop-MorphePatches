package ads_mobile_sdk;

import android.os.Bundle;
import android.view.View;
import defpackage.prb;
import defpackage.z1m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class it1 {
    public int a;
    public gt1 b;
    public String c;
    public final LinkedHashMap d;
    public Double e;
    public zf1 f;
    public zf1 g;
    public rd1 h;
    public final LinkedHashMap i;
    public cy0 j;
    public View k;
    public bz0 l;
    public m3n m;
    public j82 n;
    public h07 o;
    public final ArrayList p;
    public wf1 q;
    public Bundle r;
    public float s;
    public View t;
    public defpackage.zk u;
    public String v;
    public prb w;

    public it1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        this.a = -1;
        this.b = null;
        this.c = null;
        this.d = linkedHashMap;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = linkedHashMap2;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = arrayList;
        this.q = null;
        this.r = bundle;
        this.s = 0.0f;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it1)) {
            return false;
        }
        it1 it1Var = (it1) obj;
        return this.a == it1Var.a && this.b == it1Var.b && Intrinsics.a(this.c, it1Var.c) && this.d.equals(it1Var.d) && Intrinsics.a(this.e, it1Var.e) && Intrinsics.a(this.f, it1Var.f) && Intrinsics.a(this.g, it1Var.g) && Intrinsics.a(this.h, it1Var.h) && this.i.equals(it1Var.i) && Intrinsics.a(this.j, it1Var.j) && Intrinsics.a(this.k, it1Var.k) && Intrinsics.a(this.l, it1Var.l) && Intrinsics.a(this.m, it1Var.m) && Intrinsics.a(this.n, it1Var.n) && Intrinsics.a(this.o, it1Var.o) && this.p.equals(it1Var.p) && Intrinsics.a(this.q, it1Var.q) && Intrinsics.a(this.r, it1Var.r) && Float.compare(this.s, it1Var.s) == 0 && Intrinsics.a(this.t, it1Var.t) && this.u == it1Var.u && Intrinsics.a(this.v, it1Var.v) && Intrinsics.a(this.w, it1Var.w);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        gt1 gt1Var = this.b;
        int iHashCode2 = (iHashCode + (gt1Var == null ? 0 : gt1Var.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Double d = this.e;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        zf1 zf1Var = this.f;
        int iHashCode5 = (iHashCode4 + (zf1Var == null ? 0 : zf1Var.hashCode())) * 31;
        zf1 zf1Var2 = this.g;
        int iHashCode6 = (iHashCode5 + (zf1Var2 == null ? 0 : zf1Var2.hashCode())) * 31;
        rd1 rd1Var = this.h;
        int iHashCode7 = (this.i.hashCode() + ((iHashCode6 + (rd1Var == null ? 0 : rd1Var.hashCode())) * 31)) * 31;
        cy0 cy0Var = this.j;
        int iHashCode8 = (iHashCode7 + (cy0Var == null ? 0 : cy0Var.hashCode())) * 31;
        View view = this.k;
        int iHashCode9 = (iHashCode8 + (view == null ? 0 : view.hashCode())) * 31;
        bz0 bz0Var = this.l;
        int iHashCode10 = (iHashCode9 + (bz0Var == null ? 0 : bz0Var.hashCode())) * 31;
        m3n m3nVar = this.m;
        int iHashCode11 = (iHashCode10 + (m3nVar == null ? 0 : m3nVar.hashCode())) * 31;
        j82 j82Var = this.n;
        int iHashCode12 = (iHashCode11 + (j82Var == null ? 0 : j82Var.hashCode())) * 31;
        h07 h07Var = this.o;
        int iG = z1m.g(this.p, (iHashCode12 + (h07Var == null ? 0 : h07Var.hashCode())) * 31, 31);
        wf1 wf1Var = this.q;
        int iD = sko.d(this.s, (this.r.hashCode() + ((iG + (wf1Var == null ? 0 : wf1Var.hashCode())) * 31)) * 31, 31);
        View view2 = this.t;
        int iHashCode13 = (iD + (view2 == null ? 0 : view2.hashCode())) * 31;
        defpackage.zk zkVar = this.u;
        int iHashCode14 = (iHashCode13 + (zkVar == null ? 0 : zkVar.hashCode())) * 31;
        String str2 = this.v;
        int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        prb prbVar = this.w;
        return iHashCode15 + (prbVar != null ? prbVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "NativeAdAssets(templateId=" + this.a + ", nativeAdType=" + this.b + ", customTemplateId=" + this.c + ", stringAssets=" + this.d + ", starRating=" + this.e + ", image=" + this.f + ", icon=" + this.g + ", attributionInfo=" + this.h + ", customImageAssets=" + this.i + ", mediaWebView=" + this.j + ", mediaView=" + this.k + ", gmaWebViewVideoController=" + this.l + ", videoController=" + this.m + ", omidSettings=" + this.n + ", omidDisplayWebView=" + this.o + ", muteThisAdReasons=" + this.p + ", defaultMuteThisAdReason=" + this.q + ", extras=" + this.r + ", mediaContentAspectRatio=" + this.s + ", adChoicesContent=" + this.t + ", pubProvidedAttributionInfoPlacement=" + this.u + ", watermark=" + this.v + ", adSpecificResponseInfoExtras=" + this.w + ")";
    }
}
