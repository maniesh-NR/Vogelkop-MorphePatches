package ads_mobile_sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.cs5;
import defpackage.nxg;
import defpackage.p3p;
import defpackage.z1m;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ub2 {
    public Integer A;
    public final z33 B;
    public final Boolean D;
    public final Integer E;
    public final Integer F;
    public no3 G;
    public tf2 H;
    public w01 I;
    public db1 J;
    public ta K;
    public ks L;
    public final ic3 M;
    public cc2 N;
    public final Integer O;
    public int Q;
    public int R;
    public int a;
    public final kh3 b;
    public final fw0 c;
    public final List d;
    public final UUID e;
    public final int f;
    public final int g;
    public final long h;
    public final long i;
    public final long j;
    public final boolean k;
    public int l;
    public boolean m;
    public Throwable n;
    public Throwable o;
    public long p;
    public long q;
    public long r;
    public final ArrayList s;
    public e63 t;
    public final tz2 u;
    public iq1 w;
    public int x;
    public el1 y;
    public String z;

    public ub2(int i, kh3 kh3Var, fw0 fw0Var, List list, UUID uuid, int i2, int i3, long j, long j2, long j3, boolean z, Boolean bool, Integer num, Integer num2, Integer num3, int i4) {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.e;
        long jX0 = cs5.x0(0, un7Var);
        long jX02 = cs5.x0(0, un7Var);
        long jX03 = cs5.x0(0, un7Var);
        ArrayList arrayList = new ArrayList();
        Boolean bool2 = (i4 & 536870912) != 0 ? null : bool;
        Integer num4 = (i4 & 1073741824) != 0 ? null : num;
        Integer num5 = (i4 & LinearLayoutManager.INVALID_OFFSET) != 0 ? null : num2;
        this.a = i;
        this.b = kh3Var;
        this.c = fw0Var;
        this.d = list;
        this.e = uuid;
        this.f = i2;
        this.g = i3;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = z;
        this.l = 0;
        this.m = true;
        this.n = null;
        this.o = null;
        this.p = jX0;
        this.q = jX02;
        this.r = jX03;
        this.s = arrayList;
        this.t = null;
        this.u = null;
        this.w = null;
        this.x = 1;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.D = bool2;
        this.E = num4;
        this.F = num5;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = num3;
        this.Q = -1;
        this.R = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub2)) {
            return false;
        }
        ub2 ub2Var = (ub2) obj;
        return this.a == ub2Var.a && Intrinsics.a(this.b, ub2Var.b) && this.c == ub2Var.c && Intrinsics.a(this.d, ub2Var.d) && Intrinsics.a(this.e, ub2Var.e) && this.f == ub2Var.f && this.g == ub2Var.g && this.h == ub2Var.h && this.i == ub2Var.i && this.j == ub2Var.j && this.k == ub2Var.k && this.l == ub2Var.l && this.m == ub2Var.m && Intrinsics.a(this.n, ub2Var.n) && Intrinsics.a(this.o, ub2Var.o) && pn7.e(this.p, ub2Var.p) && pn7.e(this.q, ub2Var.q) && pn7.e(this.r, ub2Var.r) && this.s.equals(ub2Var.s) && Intrinsics.a(this.t, ub2Var.t) && Intrinsics.a(this.u, ub2Var.u) && Intrinsics.a(this.w, ub2Var.w) && this.x == ub2Var.x && Intrinsics.a(this.y, ub2Var.y) && Intrinsics.a(this.z, ub2Var.z) && Intrinsics.a(this.A, ub2Var.A) && Intrinsics.a(this.B, ub2Var.B) && Intrinsics.a(this.D, ub2Var.D) && Intrinsics.a(this.E, ub2Var.E) && Intrinsics.a(this.F, ub2Var.F) && Intrinsics.a(this.G, ub2Var.G) && Intrinsics.a(this.H, ub2Var.H) && Intrinsics.a(this.I, ub2Var.I) && Intrinsics.a(this.J, ub2Var.J) && Intrinsics.a(this.K, ub2Var.K) && Intrinsics.a(this.L, ub2Var.L) && Intrinsics.a(this.M, ub2Var.M) && Intrinsics.a(this.N, ub2Var.N) && this.O.equals(ub2Var.O) && this.Q == ub2Var.Q && this.R == ub2Var.R;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = z1m.e(z1m.e(z1m.e(n6h.a(this.g, n6h.a(this.f, (this.e.hashCode() + nxg.c((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31, this.d)) * 31)), 31, this.h), 31, this.i), 31, this.j);
        boolean z = this.k;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iE + i) * 31;
        int i3 = this.l;
        int iA = (i2 + (i3 == 0 ? 0 : vep.A(i3))) * 31;
        boolean z2 = this.m;
        int i4 = (iA + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Throwable th = this.n;
        int iHashCode = (i4 + (th == null ? 0 : th.hashCode())) * 31;
        Throwable th2 = this.o;
        int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        long j = this.p;
        on7 on7Var = pn7.b;
        int iG = z1m.g(this.s, z1m.e(z1m.e(z1m.e(iHashCode2, 31, j), 31, this.q), 31, this.r), 31);
        e63 e63Var = this.t;
        int iHashCode3 = (iG + (e63Var == null ? 0 : e63Var.hashCode())) * 31;
        tz2 tz2Var = this.u;
        int iHashCode4 = (iHashCode3 + (tz2Var == null ? 0 : tz2Var.hashCode())) * 961;
        iq1 iq1Var = this.w;
        int iA2 = (vep.A(this.x) + ((iHashCode4 + (iq1Var == null ? 0 : iq1Var.hashCode())) * 31)) * 31;
        el1 el1Var = this.y;
        int iHashCode5 = (iA2 + (el1Var == null ? 0 : el1Var.hashCode())) * 31;
        String str = this.z;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        z33 z33Var = this.B;
        int iHashCode8 = (iHashCode7 + (z33Var == null ? 0 : z33Var.hashCode())) * 961;
        Boolean bool = this.D;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.E;
        int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.F;
        int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        no3 no3Var = this.G;
        int iHashCode12 = (iHashCode11 + (no3Var == null ? 0 : no3Var.hashCode())) * 31;
        tf2 tf2Var = this.H;
        int iHashCode13 = (iHashCode12 + (tf2Var == null ? 0 : tf2Var.hashCode())) * 31;
        w01 w01Var = this.I;
        int iHashCode14 = (iHashCode13 + (w01Var == null ? 0 : w01Var.hashCode())) * 31;
        db1 db1Var = this.J;
        int iHashCode15 = (iHashCode14 + (db1Var == null ? 0 : db1Var.hashCode())) * 31;
        ta taVar = this.K;
        int iHashCode16 = (iHashCode15 + (taVar == null ? 0 : taVar.hashCode())) * 31;
        ks ksVar = this.L;
        int iHashCode17 = (iHashCode16 + (ksVar == null ? 0 : ksVar.hashCode())) * 31;
        ic3 ic3Var = this.M;
        int iHashCode18 = (iHashCode17 + (ic3Var == null ? 0 : ic3Var.hashCode())) * 31;
        cc2 cc2Var = this.N;
        return Integer.hashCode(this.R) + n6h.a(this.Q, (this.O.hashCode() + ((iHashCode18 + (cc2Var != null ? cc2Var.hashCode() : 0)) * 31)) * 961);
    }

    public final String toString() {
        String str;
        int i = this.a;
        int i2 = this.l;
        boolean z = this.m;
        Throwable th = this.n;
        Throwable th2 = this.o;
        String strQ = pn7.q(this.p);
        String strQ2 = pn7.q(this.q);
        String strQ3 = pn7.q(this.r);
        e63 e63Var = this.t;
        iq1 iq1Var = this.w;
        int i3 = this.x;
        el1 el1Var = this.y;
        String str2 = this.z;
        Integer num = this.A;
        no3 no3Var = this.G;
        tf2 tf2Var = this.H;
        w01 w01Var = this.I;
        db1 db1Var = this.J;
        ta taVar = this.K;
        ks ksVar = this.L;
        cc2 cc2Var = this.N;
        int i4 = this.Q;
        int i5 = this.R;
        StringBuilder sb = new StringBuilder("PerTraceMeta(id=");
        sb.append(i);
        sb.append(", traceMetaSet=");
        sb.append(this.b);
        sb.append(", cuiName=");
        sb.append(this.c);
        sb.append(", tags=");
        sb.append(this.d);
        sb.append(", rootTraceId=");
        sb.append(this.e);
        sb.append(", parentTraceId=");
        sb.append(this.f);
        sb.append(", traceDepth=");
        sb.append(this.g);
        sb.append(", startTimeMillis=");
        sb.append(this.h);
        p3p.u(sb, ", timeSinceSdkInitStartMillis=", this.i, ", timeSinceSdkInitCompleteMillis=");
        sb.append(this.j);
        sb.append(", useAsyncAndroidTrace=");
        sb.append(this.k);
        sb.append(", gmsgName=");
        String str3 = "UNRECOGNIZED";
        switch (i2) {
            case 1:
                str = "GMSG_NAME_UNKNOWN";
                break;
            case 2:
                str = "GMSG_NAME_SDK_CORE_LOADED";
                break;
            case 3:
                str = "GMSG_NAME_RESULT";
                break;
            case 4:
                str = "GMSG_NAME_OPEN";
                break;
            case 5:
                str = "GMSG_NAME_CLICK";
                break;
            case 6:
                str = "GMSG_NAME_HTTP_TRACK";
                break;
            case 7:
                str = "GMSG_NAME_REFRESH";
                break;
            case 8:
                str = "GMSG_DELAY_PAGE_LOADED";
                break;
            case 9:
                str = "GMSG_DELAY_PAGE_CLOSED";
                break;
            case 10:
                str = "GMSG_VIDEO_METADATA";
                break;
            case 11:
                str = "GMSG_VIDEO";
                break;
            case 12:
                str = "GMSG_UPDATE_CONSENT_ALLOWLIST";
                break;
            case 13:
                str = "GMSG_APP_EVENT";
                break;
            case 14:
                str = "GMSG_TOUCH_EVENT";
                break;
            case 15:
                str = "GMSG_INTERSTITIAL_PROPERTIES";
                break;
            case 16:
                str = "GMSG_CUSTOM_CLOSE";
                break;
            case 17:
                str = "GMSG_CLOSE";
                break;
            case 18:
                str = "GMSG_BACK_BUTTON";
                break;
            case 19:
                str = "GMSG_REWARD";
                break;
            case 20:
                str = "GMSG_AD_METADATA_CHANGED";
                break;
            case 21:
                str = "GMSG_INSTRUMENT";
                break;
            case 22:
                str = "GMSG_CAN_OPEN_URLS";
                break;
            case 23:
                str = "GMSG_H5";
                break;
            case 24:
                str = "GMSG_VIEW_LOCATION";
                break;
            case 25:
                str = "GMSG_MRAID_LOADED";
                break;
            case 26:
                str = "GMSG_MRAID";
                break;
            case 27:
                str = "GMSG_RESET_PAID";
                break;
            case 28:
                str = "GMSG_SET_PAIDV2_PERSONALIZATION_ENABLED";
                break;
            case 29:
                str = "GMSG_LOG";
                break;
            case 30:
                str = "GMSG_NATIVE_IMPRESSION";
                break;
            case 31:
                str = "GMSG_TRACK_ACTIVE_VIEW_UNIT";
                break;
            case 32:
                str = "GMSG_UNTRACK_ACTIVE_VIEW_UNIT";
                break;
            case 33:
                str = "GMSG_CAN_OPEN_INTENTS";
                break;
            case 34:
                str = "GMSG_CAN_OPEN_APP";
                break;
            case 35:
                str = "GMSG_CUSTOM_CLICK";
                break;
            case 36:
                str = "GMSG_NATIVE_CLICK_RECORDED";
                break;
            case 37:
                str = "GMSG_NATIVE_AD_VIEW_SIGNALS";
                break;
            case 38:
                str = "GMSG_NATIVE_CLICK_META";
                break;
            case 39:
                str = "GMSG_NATIVE_VIDEO_CLICKED";
                break;
            case 40:
                str = "GMSG_INSPECTOR_SET_APPLICATION_STATE";
                break;
            case 41:
                str = "GMSG_INSPECTOR_SINGLE_AD_SOURCE_TEST";
                break;
            case 42:
                str = "GMSG_INSPECTOR_UI_STORAGE";
                break;
            case 43:
                str = "GMSG_SHARE_SHEET";
                break;
            case 44:
                str = "GMSG_OUT_OF_CONTEXT_TESTING";
                break;
            case 45:
                str = "GMSG_HIDE_OVERLAY";
                break;
            case 46:
                str = "GMSG_SHOW_OVERLAY";
                break;
            case 47:
                str = "GMSG_LOAD_OVERLAY_HTML";
                break;
            case 48:
                str = "GMSG_SEND_MESSAGE_TO_NATIVE_JS";
                break;
            case 49:
                str = "GMSG_LOG_SCION_EVENT";
                break;
            case 50:
                str = "GMSG_HIDE_VALIDATOR_OVERLAY";
                break;
            case 51:
                str = "GMSG_LOAD_NATIVE_AD_POLICY_VIOLATIONS";
                break;
            case 52:
                str = "GMSG_SHOW_VALIDATOR_OVERLAY";
                break;
            case 53:
                str = "GMSG_IN_MEMORY_SDK_CORE_DATA";
                break;
            case 54:
                str = "GMSG_PERSISTENT_SDK_CORE_DATA";
                break;
            case 55:
                str = "GMSG_FLUID_HEIGHT";
                break;
            case 56:
                str = "GMSG_NATIVE_IMPRESSION_FLOW_CONTROL";
                break;
            case 57:
                str = "UNRECOGNIZED";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", isSuccess=");
        sb.append(z);
        sb.append(", exception=");
        sb.append(th);
        sb.append(", causingException=");
        sb.append(th2);
        z1m.t(sb, ", latency=", strQ, ", cpuTime=", strQ2);
        sb.append(", childCpuTime=");
        sb.append(strQ3);
        sb.append(", errorMessages=");
        sb.append(this.s);
        sb.append(", signalMeta=");
        sb.append(e63Var);
        sb.append(", scarCacheEvictionData=");
        sb.append(this.u);
        sb.append(", h5Data=null, mraidData=");
        sb.append(iq1Var);
        sb.append(", processState=");
        if (i3 == 1) {
            str3 = "PROCESS_STATE_UNKNOWN";
        } else if (i3 == 2) {
            str3 = "PROCESS_STATE_FOREGROUND";
        } else if (i3 == 3) {
            str3 = "PROCESS_STATE_BACKGROUND";
        } else if (i3 != 4) {
            str3 = "null";
        }
        sb.append(str3);
        sb.append(", jsEngineData=");
        sb.append(el1Var);
        sb.append(", cronetProvider=");
        sb.append(str2);
        sb.append(", customTabsNavigationEvent=");
        sb.append(num);
        sb.append(", signalCacheData=");
        sb.append(this.B);
        sb.append(", preloadData=null, hasNetworkConnectivity=");
        sb.append(this.D);
        sb.append(", networkType=");
        sb.append(this.E);
        sb.append(", networkTypeCoarse=");
        sb.append(this.F);
        sb.append(", webViewData=");
        sb.append(no3Var);
        sb.append(", postClickLifecycleMonitoringData=");
        sb.append(tf2Var);
        sb.append(", hsdpServiceData=");
        sb.append(w01Var);
        sb.append(", installReferrerDetails=");
        sb.append(db1Var);
        sb.append(", adapterInitializationData=");
        sb.append(taVar);
        sb.append(", centralizedManagerPreloadData=");
        sb.append(ksVar);
        sb.append(", swipeableInterstitialSettleData=");
        sb.append(this.M);
        sb.append(", persistentCacheEventData=");
        sb.append(cc2Var);
        sb.append(", liveWebViewCount=");
        sb.append(this.O);
        sb.append(", contentProviderType=");
        sb.append("null");
        sb.append(", previousAppExitReason=");
        sb.append(i4);
        return rfp.p(sb, ", previousAppExitSignal=", i5, ")");
    }
}
