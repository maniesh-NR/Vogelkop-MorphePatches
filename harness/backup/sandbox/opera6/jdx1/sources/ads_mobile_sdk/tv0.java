package ads_mobile_sdk;

import android.os.Build;
import defpackage.auj;
import defpackage.ffp;
import defpackage.flp;
import defpackage.gip;
import defpackage.lkp;
import defpackage.y7h;
import java.util.Objects;

/* loaded from: classes.dex */
public final class tv0 extends ku0 {
    public static final int A = 16;
    public static final int B = 17;
    public static final int C = 18;
    public static final int D = 19;
    private static final tv0 DEFAULT_INSTANCE;
    public static final int E = 20;
    public static final int F = 21;
    public static final int G = 22;
    public static final int H = 23;
    public static final int I = 24;
    public static final int J = 25;
    public static final int K = 26;
    public static final int L = 27;
    public static final int M = 28;
    public static final int N = 29;
    public static final int O = 30;
    public static final int P = 31;
    public static final int Q = 40;
    public static final int R = 42;
    public static final int S = 43;
    public static final int T = 44;
    public static final int U = 45;
    public static final int V = 46;
    public static final int W = 47;
    public static final int X = 48;
    public static final int Y = 49;
    public static final int Z = 50;
    public static final int a0 = 51;
    private static final djp activeCuiStack_converter_ = new auj(14);
    public static final int b0 = 52;
    public static final int c = 1;
    public static final int c0 = 53;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 41;
    public static final int m = 10;
    public static final int n = 32;
    public static final int o = 11;
    public static final int p = 12;
    public static final int q = 13;
    public static final int r = 14;
    public static final int s = 33;
    public static final int t = 34;
    public static final int u = 35;
    public static final int v = 36;
    public static final int w = 37;
    public static final int x = 38;
    public static final int y = 39;
    public static final int z = 15;
    private int activeCuiStackMemoizedSerializedSize;
    private gip activeCuiStack_;
    private int activeCui_;
    private String adUnitId_;
    private long availableMemoryBytes_;
    private int bitField0_;
    private ns chromeVariations_;
    private sv0 deobfuscatedStacktrace_;
    private int deviceAdvertisedMemTier_;
    private int deviceAvailableMemoryTier_;
    private int deviceAvailableProcessorTier_;
    private int displayHeight_;
    private int displayWidth_;
    private int format_;
    private long gmsCoreVersion_;
    private int liveWebviewCount_;
    private flp loadedAdsStats_;
    private boolean lowMemory_;
    private int mediationChainLength_;
    private int networkType_;
    private int orientation_;
    private int os_;
    private long samplingDenominator_;
    private flp showingAdsStats_;
    private int targetVersion_;
    private long thresholdMemoryBytes_;
    private long timeMsec_;
    private int totalCpu_;
    private long totalMemoryBytes_;
    private boolean trapped_;
    private int experimentIdMemoizedSerializedSize = -1;
    private String name_ = "";
    private String exceptionClass_ = "";
    private String topException_ = "";
    private String stacktrace_ = "";
    private String sdkVersion_ = "";
    private String afmaVersion_ = "";
    private String webViewVersion_ = "";
    private String appName_ = "";
    private String appVersionName_ = "";
    private String appId_ = "";
    private String osVersion_ = "";
    private String deviceModel_ = "";
    private String country_ = "";
    private lkp experimentId_ = wm1.e;
    private String sessionId_ = "";
    private String requestId_ = "";
    private String adId_ = "";
    private String backendQueryId_ = "";
    private String gwsQueryId_ = "";
    private String mediationAdapter_ = "";
    private String mediationAdapterVersion_ = "";
    private String plugin_ = "";
    private String stackTraceHash_ = "";
    private String requestAgent_ = "";
    private String unityEditorVersion_ = "";

    static {
        tv0 tv0Var = new tv0();
        DEFAULT_INSTANCE = tv0Var;
        ku0.a(tv0.class, tv0Var);
    }

    public tv0() {
        am2 am2Var = am2.e;
        this.loadedAdsStats_ = am2Var;
        this.showingAdsStats_ = am2Var;
        this.activeCuiStack_ = qb1.e;
        this.adUnitId_ = "";
    }

    public static tv0 o() {
        return DEFAULT_INSTANCE;
    }

    public static ffp p() {
        return (ffp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u00045\u0000\u0001\u000155\u0000\u0004\u0000\u0001\u0002\u0002\u0007\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007\f\bȈ\tȈ\nȈ\u000bȈ\fȈ\r\u0004\u000eȈ\u000fȈ\u0010%\u0011\f\u0012\u0004\u0013\u0002\u0014\f\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019Ȉ\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001fဉ\u0000 Ȉ!\u0004\"\u0004#\u0004$\u0002%\u0002&\u0002'\u0007(ဉ\u0001)Ȉ*Ȉ+Ȉ,\u0004-\u001b.\u001b/\f0\f1\f2,3\u00044Ȉ5\f", new Object[]{"bitField0_", "timeMsec_", "trapped_", "name_", "exceptionClass_", "topException_", "stacktrace_", "os_", "sdkVersion_", "afmaVersion_", "appName_", "appId_", "osVersion_", "targetVersion_", "deviceModel_", "country_", "experimentId_", "orientation_", "networkType_", "gmsCoreVersion_", "format_", "sessionId_", "requestId_", "adId_", "backendQueryId_", "gwsQueryId_", "mediationAdapter_", "mediationAdapterVersion_", "plugin_", "samplingDenominator_", "stackTraceHash_", "deobfuscatedStacktrace_", "appVersionName_", "displayWidth_", "displayHeight_", "totalCpu_", "totalMemoryBytes_", "availableMemoryBytes_", "thresholdMemoryBytes_", "lowMemory_", "chromeVariations_", "webViewVersion_", "requestAgent_", "unityEditorVersion_", "liveWebviewCount_", "loadedAdsStats_", pv0.class, "showingAdsStats_", pv0.class, "deviceAdvertisedMemTier_", "deviceAvailableProcessorTier_", "activeCui_", "activeCuiStack_", "mediationChainLength_", "adUnitId_", "deviceAvailableMemoryTier_"});
        }
        if (iA == 3) {
            return new tv0();
        }
        if (iA == 4) {
            return new ffp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(tv0.class);
        }
        throw null;
    }

    public final void a(ns nsVar) {
        this.chromeVariations_ = nsVar;
        this.bitField0_ |= 2;
    }

    public final void a(pv0 pv0Var) {
        flp flpVarC = this.loadedAdsStats_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.loadedAdsStats_ = flpVarC;
        }
        flpVarC.add(pv0Var);
    }

    public final void b(pv0 pv0Var) {
        flp flpVarC = this.showingAdsStats_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.showingAdsStats_ = flpVarC;
        }
        flpVarC.add(pv0Var);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.adId_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.adUnitId_ = str;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.afmaVersion_ = str;
    }

    public final void e(String str) {
        this.appId_ = str;
    }

    public final void f(String str) {
        Objects.requireNonNull(str);
        this.appName_ = str;
    }

    public final void g(String str) {
        this.appVersionName_ = str;
    }

    public final void h(String str) {
        Objects.requireNonNull(str);
        this.backendQueryId_ = str;
    }

    public final void i(String str) {
        Objects.requireNonNull(str);
        this.country_ = str;
    }

    public final void j(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.deviceModel_ = str2;
    }

    public final void k(String str) {
        this.exceptionClass_ = str;
    }

    public final void l(String str) {
        Objects.requireNonNull(str);
        this.gwsQueryId_ = str;
    }

    public final void m(String str) {
        Objects.requireNonNull(str);
        this.mediationAdapter_ = str;
    }

    public final void n(String str) {
        Objects.requireNonNull(str);
        this.mediationAdapterVersion_ = str;
    }

    public final void o(String str) {
        Objects.requireNonNull(str);
        this.name_ = str;
    }

    public final void p(String str) {
        String str2 = Build.VERSION.RELEASE;
        Objects.requireNonNull(str2);
        this.osVersion_ = str2;
    }

    public final void r(String str) {
        Objects.requireNonNull(str);
        this.requestAgent_ = str;
    }

    public final void s(String str) {
        Objects.requireNonNull(str);
        this.requestId_ = str;
    }

    public final void t(String str) {
        Objects.requireNonNull(str);
        this.sdkVersion_ = str;
    }

    public final void u(String str) {
        this.sessionId_ = str;
    }

    public final void v(String str) {
        Objects.requireNonNull(str);
        this.stackTraceHash_ = str;
    }

    public final void w(String str) {
        Objects.requireNonNull(str);
        this.stacktrace_ = str;
    }

    public final void x(String str) {
        Objects.requireNonNull(str);
        this.topException_ = str;
    }

    public final void y(String str) {
        this.unityEditorVersion_ = str;
    }

    public final void z(String str) {
        this.webViewVersion_ = str;
    }
}
