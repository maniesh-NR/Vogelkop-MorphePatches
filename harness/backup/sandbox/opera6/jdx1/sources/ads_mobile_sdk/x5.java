package ads_mobile_sdk;

import defpackage.fjp;
import defpackage.jjj;
import defpackage.yvh;
import defpackage.z1m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x5 implements zcp {
    public final defpackage.r83 a;
    public final long b;
    public final yvh f;
    public final boolean g;
    public final av2 h;
    public final byte i;
    public final boolean j;
    public final boolean k;
    public final qr0 l;
    public final long m;
    public final boolean n;
    public final boolean o;

    /* JADX WARN: Multi-variable type inference failed */
    public x5(defpackage.r83 r83Var, long j, yvh yvhVar, boolean z, av2 av2Var, int i, boolean z2, boolean z3, qr0 qr0Var, long j2, boolean z4, boolean z5) {
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        this.a = r83Var;
        this.b = j;
        this.f = yvhVar;
        this.g = z;
        this.h = av2Var;
        this.i = i;
        this.j = z2;
        this.k = z3;
        this.l = qr0Var;
        this.m = j2;
        this.n = z4;
        this.o = z5;
    }

    public final void a(jjj jjjVar) {
        String str = this.f.a;
        jjjVar.requestTimeMilliseconds = this.b;
        defpackage.r83 r83Var = this.a;
        String strM = r83Var.m();
        HashSet hashSet = r83Var.f;
        HashSet hashSet2 = r83Var.e;
        LinkedHashSet linkedHashSet = r83Var.a;
        jjjVar.adUnitId = strM;
        jjjVar.contentUrl = r83Var.b;
        LinkedHashMap linkedHashMap = r83Var.c;
        if (!linkedHashMap.isEmpty() || !linkedHashSet.isEmpty()) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(linkedHashMap);
            if (!linkedHashSet.isEmpty()) {
                linkedHashMap2.put("excl_cat", CollectionsKt.P(linkedHashSet, ",", (CharSequence) null, (String) null, 0, (Function1) null, 62));
            }
            jjjVar.customTargeting = linkedHashMap2;
        }
        jjjVar.googleExtrasBundle = r83Var.d;
        if (!hashSet2.isEmpty()) {
            jjjVar.keywords = new ArrayList<>(hashSet2);
        }
        if (!hashSet.isEmpty()) {
            jjjVar.neighboringContentUrls = CollectionsKt.n0(hashSet);
        }
        jjjVar.publisherProvidedId = r83Var.h;
        jjjVar.requestAgent = null;
        awh awhVar = awh.a;
        jjjVar.tagForChildDirectedTreatment = 0;
        bwh bwhVar = bwh.a;
        jjjVar.tagForUnderAgeOfConsent = 0;
        if (str.length() > 0) {
            jjjVar.maxAdContentRating = str;
        }
        jjjVar.isTestRequest = this.g;
        jjjVar.publisherPrivacyPersonalizationState = Integer.valueOf(this.i);
        av2 av2Var = av2.j;
        av2 av2Var2 = this.h;
        if (av2Var2 == av2Var) {
            jjjVar.isRewarded = Boolean.TRUE;
        }
        if (av2Var2 == av2.k) {
            jjjVar.isRewardedInterstitial = Boolean.TRUE;
        }
        jjjVar.manualImpressionsEnabled = this.j;
        if (this.k) {
            jjjVar.isPrefetchRequest = Boolean.TRUE;
        }
        qr0 qr0Var = this.l;
        qr0Var.getClass();
        Boolean bool = Boolean.FALSE;
        fo foVar = fo.a;
        if (((Boolean) qr0Var.a("gads:enable_time_since_sdk_init:enabled", bool, foVar)).booleanValue()) {
            jjjVar.a(Long.valueOf(this.m));
        }
        if (this.n) {
            jjjVar.b();
        }
        if (this.o) {
            fjp fjpVar = qr0Var.v;
            fjpVar.getClass();
            Boolean bool2 = Boolean.TRUE;
            if (((Boolean) fjpVar.a("gads:pc:enabled", bool2, foVar)).booleanValue()) {
                jjjVar.persistentCacheRequest = bool2;
            }
        }
        ((Boolean) qr0Var.a("gads:cpaf:enabled", Boolean.TRUE, foVar)).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        if (!Intrinsics.a(this.a, x5Var.a) || this.b != x5Var.b) {
            return false;
        }
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        return this.f == x5Var.f && this.g == x5Var.g && this.h == x5Var.h && this.i == x5Var.i && this.j == x5Var.j && this.k == x5Var.k && Intrinsics.a(this.l, x5Var.l) && this.m == x5Var.m && this.n == x5Var.n && this.o == x5Var.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((bwh.a.hashCode() + ((awh.a.hashCode() + z1m.e(this.a.hashCode() * 31, 31, this.b)) * 31)) * 961)) * 31;
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iA = n6h.a(this.i, (this.h.hashCode() + ((iHashCode + i) * 31)) * 31);
        boolean z2 = this.j;
        int i2 = z2;
        if (z2 != 0) {
            i2 = 1;
        }
        int i3 = (iA + i2) * 31;
        boolean z3 = this.k;
        int i4 = z3;
        if (z3 != 0) {
            i4 = 1;
        }
        int iE = z1m.e((this.l.hashCode() + ((i3 + i4) * 31)) * 31, 31, this.m);
        boolean z4 = this.n;
        int i5 = z4;
        if (z4 != 0) {
            i5 = 1;
        }
        int i6 = (iE + i5) * 31;
        boolean z5 = this.o;
        return i6 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final String toString() {
        return "AdRequestSignal(adRequest=" + this.a + ", timestamp=" + this.b + ", tfcd=" + awh.a + ", tfuac=" + bwh.a + ", ageRestrictedTreatment=null, maxAdContentRating=" + this.f + ", isTestRequest=" + this.g + ", requestType=" + this.h + ", publisherPrivacyPersonalizationState=" + ((int) this.i) + ", manualImpressionsRequested=" + this.j + ", isPrefetchRequest=" + this.k + ", flags=" + this.l + ", timeSinceSdkInitMs=" + this.m + ", isS2SRecursiveRequest=" + this.n + ", isPersistentCacheFillRequest=" + this.o + ")";
    }
}
