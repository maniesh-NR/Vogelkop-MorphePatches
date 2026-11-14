package defpackage;

import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g57 implements Serializable {
    public final Boolean A;
    public final Boolean B;
    public final Boolean C;
    public final String D;
    public final String E;
    public final Boolean F;
    public final List G;
    public final transient g54 a;
    public transient int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final Boolean n;
    public final Boolean o;
    public final Boolean p;
    public final String q;
    public final Boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final Boolean w;
    public final Boolean x;
    public final String y;
    public final Boolean z;

    static {
        new f57(yz8.c, uqh.a(g57.class), czk.c, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v23, types: [a4, f1b] */
    public g57(boolean z, boolean z2, boolean z3, Boolean bool, String str, Boolean bool2, Boolean bool3, int i, boolean z4, boolean z5, String str2, Boolean bool4, Boolean bool5, Boolean bool6, String str3, Boolean bool7, boolean z6, boolean z7, List list, boolean z8, boolean z9, Boolean bool8, Boolean bool9, String str4, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, String str5, String str6, Boolean bool14, g54 g54Var) {
        List list2;
        this.a = g54Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = bool;
        this.g = str;
        this.h = bool2;
        this.i = bool3;
        this.j = i;
        this.k = z4;
        this.l = z5;
        this.m = str2;
        this.n = bool4;
        this.o = bool5;
        this.p = bool6;
        this.q = str3;
        this.r = bool7;
        this.s = z6;
        this.t = z7;
        this.u = z8;
        this.v = z9;
        this.w = bool8;
        this.x = bool9;
        this.y = str4;
        this.z = bool10;
        this.A = bool11;
        this.B = bool12;
        this.C = bool13;
        this.D = str5;
        this.E = str6;
        this.F = bool14;
        if (list instanceof eee) {
            h9o.t();
            throw null;
        }
        if (list == l08.a || (list instanceof f1b)) {
            list2 = list;
        } else {
            ?? f1bVar = new f1b(list);
            boolean zContains = f1bVar.contains((Object) null);
            list2 = f1bVar;
            if (zContains) {
                qp2.o("saved_test_page_urls.contains(null)");
                throw null;
            }
        }
        this.G = list2;
    }

    public static g57 d(g57 g57Var, boolean z, boolean z2, boolean z3, Boolean bool, String str, Boolean bool2, Boolean bool3, int i, boolean z4, boolean z5, String str2, Boolean bool4, Boolean bool5, Boolean bool6, String str3, Boolean bool7, boolean z6, boolean z7, boolean z8, boolean z9, Boolean bool8, Boolean bool9, String str4, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, String str5, String str6, Boolean bool14, int i2, int i3) {
        List list;
        boolean z10;
        boolean z11 = (i2 & 1) != 0 ? g57Var.c : z;
        boolean z12 = (i2 & 2) != 0 ? g57Var.d : z2;
        boolean z13 = (i2 & 4) != 0 ? g57Var.e : z3;
        g57Var.getClass();
        Boolean bool15 = (i2 & 16) != 0 ? g57Var.f : bool;
        g57Var.getClass();
        String str7 = (i2 & 64) != 0 ? g57Var.g : str;
        Boolean bool16 = (i2 & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0 ? g57Var.h : bool2;
        Boolean bool17 = (i2 & Constants.Crypt.KEY_LENGTH) != 0 ? g57Var.i : bool3;
        g57Var.getClass();
        int i4 = (i2 & 1024) != 0 ? g57Var.j : i;
        g57Var.getClass();
        boolean z14 = (i2 & 4096) != 0 ? g57Var.k : z4;
        boolean z15 = (i2 & 8192) != 0 ? g57Var.l : z5;
        String str8 = (i2 & 16384) != 0 ? g57Var.m : str2;
        g57Var.getClass();
        Boolean bool18 = (65536 & i2) != 0 ? g57Var.n : bool4;
        Boolean bool19 = (131072 & i2) != 0 ? g57Var.o : bool5;
        Boolean bool20 = (262144 & i2) != 0 ? g57Var.p : bool6;
        String str9 = (i2 & 524288) != 0 ? g57Var.q : str3;
        Boolean bool21 = (i2 & 1048576) != 0 ? g57Var.r : bool7;
        boolean z16 = (i2 & 2097152) != 0 ? g57Var.s : z6;
        if ((i2 & 4194304) != 0) {
            z7 = g57Var.t;
        }
        List list2 = g57Var.G;
        if ((i2 & 16777216) != 0) {
            list = list2;
            z10 = g57Var.u;
        } else {
            list = list2;
            z10 = z8;
        }
        boolean z17 = z10;
        boolean z18 = (i2 & 33554432) != 0 ? g57Var.v : z9;
        Boolean bool22 = (i2 & 67108864) != 0 ? g57Var.w : bool8;
        Boolean bool23 = (i2 & 134217728) != 0 ? g57Var.x : bool9;
        String str10 = (i2 & 268435456) != 0 ? g57Var.y : str4;
        Boolean bool24 = (i2 & 536870912) != 0 ? g57Var.z : bool10;
        Boolean bool25 = (i2 & 1073741824) != 0 ? g57Var.A : bool11;
        Boolean bool26 = (i2 & Integer.MIN_VALUE) != 0 ? g57Var.B : bool12;
        Boolean bool27 = (i3 & 1) != 0 ? g57Var.C : bool13;
        String str11 = (i3 & 2) != 0 ? g57Var.D : str5;
        String str12 = (i3 & 4) != 0 ? g57Var.E : str6;
        Boolean bool28 = (i3 & 8) != 0 ? g57Var.F : bool14;
        g54 g54Var = g57Var.a;
        if (g54Var == null) {
            g54Var = g54.d;
        }
        g57Var.getClass();
        return new g57(z11, z12, z13, bool15, str7, bool16, bool17, i4, z14, z15, str8, bool18, bool19, bool20, str9, bool21, z16, z7, list, z17, z18, bool22, bool23, str10, bool24, bool25, bool26, bool27, str11, str12, bool28, g54Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g57)) {
            return false;
        }
        g54 g54Var = g54.d;
        g54 g54Var2 = this.a;
        if (g54Var2 == null) {
            g54Var2 = g54Var;
        }
        g57 g57Var = (g57) obj;
        g54 g54Var3 = g57Var.a;
        if (g54Var3 != null) {
            g54Var = g54Var3;
        }
        return g54Var2.equals(g54Var) && this.c == g57Var.c && this.d == g57Var.d && this.e == g57Var.e && Intrinsics.a(this.f, g57Var.f) && Intrinsics.a(this.g, g57Var.g) && Intrinsics.a(this.h, g57Var.h) && Intrinsics.a(this.i, g57Var.i) && this.j == g57Var.j && this.k == g57Var.k && this.l == g57Var.l && Intrinsics.a(this.m, g57Var.m) && Intrinsics.a(this.n, g57Var.n) && Intrinsics.a(this.o, g57Var.o) && Intrinsics.a(this.p, g57Var.p) && Intrinsics.a(this.q, g57Var.q) && Intrinsics.a(this.r, g57Var.r) && this.s == g57Var.s && this.t == g57Var.t && Intrinsics.a(this.G, g57Var.G) && this.u == g57Var.u && this.v == g57Var.v && Intrinsics.a(this.w, g57Var.w) && Intrinsics.a(this.x, g57Var.x) && Intrinsics.a(this.y, g57Var.y) && Intrinsics.a(this.z, g57Var.z) && Intrinsics.a(this.A, g57Var.A) && Intrinsics.a(this.B, g57Var.B) && Intrinsics.a(this.C, g57Var.C) && Intrinsics.a(this.D, g57Var.D) && Intrinsics.a(this.E, g57Var.E) && Intrinsics.a(this.F, g57Var.F);
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        g54 g54Var = this.a;
        if (g54Var == null) {
            g54Var = g54.d;
        }
        int iK = fki.k(fki.k(fki.k(g54Var.hashCode() * 37, 37, this.c), 37, this.d), 1369, this.e);
        Boolean bool = this.f;
        int iHashCode = (iK + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 1369;
        String str = this.g;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool2 = this.h;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.i;
        int iHashCode4 = (((this.m.hashCode() + fki.k(fki.k((((Integer.hashCode(this.j) + ((((iHashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37) + 1237) * 37)) * 37) + 1237) * 37, 37, this.k), 37, this.l)) * 37) + 1237) * 37;
        Boolean bool4 = this.n;
        int iHashCode5 = (iHashCode4 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.o;
        int iHashCode6 = (iHashCode5 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.p;
        int iHashCode7 = (iHashCode6 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        String str2 = this.q;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool7 = this.r;
        int iK2 = fki.k(fki.k(rfp.f(fki.k(fki.k((iHashCode8 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37, 37, this.s), 37, this.t), 37, this.G), 37, this.u), 37, this.v);
        Boolean bool8 = this.w;
        int iHashCode9 = (iK2 + (bool8 != null ? Boolean.hashCode(bool8.booleanValue()) : 0)) * 37;
        Boolean bool9 = this.x;
        int iHashCode10 = (iHashCode9 + (bool9 != null ? Boolean.hashCode(bool9.booleanValue()) : 0)) * 37;
        String str3 = this.y;
        int iHashCode11 = (iHashCode10 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool10 = this.z;
        int iHashCode12 = (iHashCode11 + (bool10 != null ? Boolean.hashCode(bool10.booleanValue()) : 0)) * 37;
        Boolean bool11 = this.A;
        int iHashCode13 = (iHashCode12 + (bool11 != null ? Boolean.hashCode(bool11.booleanValue()) : 0)) * 37;
        Boolean bool12 = this.B;
        int iHashCode14 = (iHashCode13 + (bool12 != null ? Boolean.hashCode(bool12.booleanValue()) : 0)) * 37;
        Boolean bool13 = this.C;
        int iHashCode15 = (iHashCode14 + (bool13 != null ? Boolean.hashCode(bool13.booleanValue()) : 0)) * 37;
        String str4 = this.D;
        int iHashCode16 = (iHashCode15 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.E;
        int iHashCode17 = (iHashCode16 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool14 = this.F;
        int iHashCode18 = iHashCode17 + (bool14 != null ? Boolean.hashCode(bool14.booleanValue()) : 0);
        this.b = iHashCode18;
        return iHashCode18;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("developer_mode_enabled=" + this.c);
        arrayList.add("web_view_debug_enabled=" + this.d);
        arrayList.add("use_test_net=" + this.e);
        Boolean bool = this.f;
        if (bool != null) {
            arrayList.add("use_mobile_auth_staging=" + bool);
        }
        String str = this.g;
        if (str != null) {
            arrayList.add("country_code=".concat(sgb.V(str)));
        }
        Boolean bool2 = this.h;
        if (bool2 != null) {
            arrayList.add("simulate_full_cloud_storage=" + bool2);
        }
        Boolean bool3 = this.i;
        if (bool3 != null) {
            arrayList.add("simulate_save_error_cloud_storage=" + bool3);
        }
        arrayList.add("enable_add_cash_v3=false");
        arrayList.add("navigation_session_timeout=" + this.j);
        arrayList.add("enable_withdraw_v3=false");
        arrayList.add("highlight_provisional_transaction=" + this.k);
        arrayList.add("enable_virtual_account=" + this.l);
        arrayList.add("discover_environment=".concat(sgb.V(this.m)));
        arrayList.add("force_enable_local_payments=false");
        Boolean bool4 = this.n;
        if (bool4 != null) {
            arrayList.add("enable_virtual_cards=" + bool4);
        }
        Boolean bool5 = this.o;
        if (bool5 != null) {
            arrayList.add("use_fake_gnosis_api=" + bool5);
        }
        Boolean bool6 = this.p;
        if (bool6 != null) {
            arrayList.add("filter_discover_data=" + bool6);
        }
        String str2 = this.q;
        if (str2 != null) {
            arrayList.add("virtual_card_provider=".concat(sgb.V(str2)));
        }
        Boolean bool7 = this.r;
        if (bool7 != null) {
            arrayList.add("show_provider_label_for_local_payments=" + bool7);
        }
        arrayList.add("enable_sumsub_kyc=" + this.s);
        arrayList.add("force_enable_lock_screen=" + this.t);
        List list = this.G;
        if (!list.isEmpty()) {
            arrayList.add("saved_test_page_urls=".concat(CollectionsKt.P(list, (CharSequence) null, "[", "]", 0, rgb.a, 25)));
        }
        arrayList.add("use_gnosis_sandbox=" + this.u);
        arrayList.add("skip_virtual_card_account_restoration_onboarding=" + this.v);
        Boolean bool8 = this.w;
        if (bool8 != null) {
            arrayList.add("fail_gnosis_api=" + bool8);
        }
        Boolean bool9 = this.x;
        if (bool9 != null) {
            arrayList.add("squid_withdraws=" + bool9);
        }
        String str3 = this.y;
        if (str3 != null) {
            arrayList.add("feature_environment=".concat(sgb.V(str3)));
        }
        Boolean bool10 = this.z;
        if (bool10 != null) {
            arrayList.add("enable_apple_pay=" + bool10);
        }
        Boolean bool11 = this.A;
        if (bool11 != null) {
            arrayList.add("dynamic_tipping=" + bool11);
        }
        Boolean bool12 = this.B;
        if (bool12 != null) {
            arrayList.add("report_to_osp_dump=" + bool12);
        }
        Boolean bool13 = this.C;
        if (bool13 != null) {
            arrayList.add("enable_wc_pay=" + bool13);
        }
        String str4 = this.D;
        if (str4 != null) {
            arrayList.add("rain_api_key=".concat(sgb.V(str4)));
        }
        String str5 = this.E;
        if (str5 != null) {
            arrayList.add("sumsub_environment=".concat(sgb.V(str5)));
        }
        Boolean bool14 = this.F;
        if (bool14 != null) {
            arrayList.add("enable_native_intercom=" + bool14);
        }
        return CollectionsKt.P(arrayList, ", ", "DeveloperPreferencesProto{", "}", 0, (Function1) null, 56);
    }
}
