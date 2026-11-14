package ads_mobile_sdk;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import defpackage.auj;
import defpackage.gip;
import defpackage.lkp;
import defpackage.zso;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nw0 extends ku0 {
    public static final int A = 23;
    public static final int A0 = 69;
    public static final int B = 77;
    public static final int B0 = 71;
    public static final int C = 78;
    public static final int C0 = 79;
    public static final int D = 91;
    public static final int D0 = 80;
    private static final nw0 DEFAULT_INSTANCE;
    public static final int E = 24;
    public static final int E0 = 73;
    public static final int F = 25;
    public static final int F0 = 74;
    public static final int G = 9;
    public static final int G0 = 81;
    public static final int H = 53;
    public static final int H0 = 82;
    public static final int I = 10;
    public static final int I0 = 83;
    public static final int J = 72;
    public static final int J0 = 84;
    public static final int K = 11;
    public static final int K0 = 85;
    public static final int L = 66;
    public static final int L0 = 86;
    public static final int M = 67;
    public static final int M0 = 88;
    public static final int N = 68;
    public static final int N0 = 89;
    public static final int O = 12;
    public static final int O0 = 90;
    public static final int P = 13;
    public static final int Q = 14;
    public static final int R = 26;
    public static final int S = 27;
    public static final int T = 46;
    public static final int U = 45;
    public static final int V = 43;
    public static final int W = 87;
    public static final int X = 48;
    public static final int Y = 44;
    public static final int Z = 49;
    public static final int a0 = 50;
    public static final int b0 = 28;
    public static final int c = 1;
    public static final int c0 = 60;
    public static final int d = 40;
    public static final int d0 = 15;
    public static final int e = 30;
    public static final int e0 = 16;
    public static final int f = 31;
    public static final int f0 = 17;
    public static final int g = 32;
    public static final int g0 = 18;
    public static final int h = 33;
    public static final int h0 = 19;
    public static final int i = 37;
    public static final int i0 = 20;
    public static final int j = 2;
    public static final int j0 = 29;
    public static final int k = 3;
    public static final int k0 = 55;
    public static final int l = 34;
    public static final int l0 = 56;
    public static final int m = 75;
    public static final int m0 = 38;
    public static final int n = 76;
    public static final int n0 = 39;
    public static final int o = 35;
    public static final int o0 = 57;
    public static final int p = 36;
    public static final int p0 = 47;
    public static final int q = 4;
    public static final int q0 = 41;
    public static final int r = 5;
    public static final int r0 = 42;
    public static final int s = 21;
    public static final int s0 = 52;
    public static final int t = 70;
    public static final int t0 = 54;
    private static final djp tag_converter_ = new auj(12);
    public static final int u = 22;
    public static final int u0 = 58;
    public static final int v = 64;
    public static final int v0 = 59;
    public static final int w = 6;
    public static final int w0 = 61;
    public static final int x = 51;
    public static final int x0 = 62;
    public static final int y = 7;
    public static final int y0 = 63;
    public static final int z = 8;
    public static final int z0 = 65;
    private int adConfigurationIndex_;
    private ta adapterInitializationDetails_;
    private int bitField0_;
    private int cachedSignalState_;
    private ks centralizedManagerPreloadData_;
    private long childCpuTimeMillis_;
    private ns chromeVariations_;
    private int contentProviderType_;
    private long cpuTimeMillis_;
    private int customTabsNavigationEvent_;
    private int deviceAdvertisedMemTier_;
    private int deviceAvailableMemoryTier_;
    private int deviceAvailableProcessorTier_;
    private int format_;
    private long gmsCoreVersion_;
    private int gmsgName_;
    private uz0 h5Data_;
    private boolean hadCachedFlags_;
    private w01 hsdpServiceData_;
    private db1 installReferrerDetails_;
    private boolean isFirstSessionAfterInstall_;
    private boolean isHtmlResponse_;
    private el1 jsEngineData_;
    private long latencyMillis_;
    private int liveWebviewCount_;
    private int mediationChainLength_;
    private iq1 mraidData_;
    private int name_;
    private int networkTypeCoarse_;
    private int networkType_;
    private e42 offlineData_;
    private int orientation_;
    private int os_;
    private long parentTraceId_;
    private cc2 persistentCacheEventData_;
    private ee2 persistentCacheRequestData_;
    private tf2 postClickLifecycleMonitoringData_;
    private jh2 preloadData_;
    private int previousAppExitReason_;
    private int previousAppExitSignal_;
    private int processState_;
    private long samplingDenominator_;
    private tz2 scarCacheEvictionData_;
    private int scarRequestType_;
    private int sequenceNumber_;
    private z33 signalCacheData_;
    private e43 signalData_;
    private int signalId_;
    private boolean skipUninitializedAdapters_;
    private long startTimeMillis_;
    private boolean success_;
    private ic3 swipeableInterstitialSettleData_;
    private int tagMemoizedSerializedSize;
    private int targetVersion_;
    private long timeSinceSdkInitCompleteMillis_;
    private long timeSinceSdkInitStartMillis_;
    private long traceDepth_;
    private long traceId_;
    private no3 webviewData_;
    private boolean wereCachedFlagsReset_;
    private int experimentIdMemoizedSerializedSize = -1;
    private String rootTraceId_ = "";
    private gip tag_ = qb1.e;
    private String sdkVersion_ = "";
    private String canonicalSdkVersion_ = "";
    private String webViewVersion_ = "";
    private String appName_ = "";
    private String appVersionName_ = "";
    private String appId_ = "";
    private String adUnitId_ = "";
    private String osVersion_ = "";
    private String deviceModel_ = "";
    private String country_ = "";
    private lkp experimentId_ = wm1.e;
    private String backendQueryId_ = "";
    private String gwsQueryId_ = "";
    private String sessionId_ = "";
    private String requestId_ = "";
    private String signalGenerationRequestId_ = "";
    private String internalRequestId_ = "";
    private String renderId_ = "";
    private String renderer_ = "";
    private String adId_ = "";
    private String preloadId_ = "";
    private String mediationAdapter_ = "";
    private String mediationAdapterVersion_ = "";
    private String plugin_ = "";
    private String topException_ = "";
    private String stackTraceHash_ = "";
    private String cause_ = "";
    private String cronetProvider_ = "";
    private String rawChromeVariations_ = "";
    private String requestAgent_ = "";
    private String unityEditorVersion_ = "";

    static {
        nw0 nw0Var = new nw0();
        DEFAULT_INSTANCE = nw0Var;
        ku0.a(nw0.class, nw0Var);
    }

    public static zso o() {
        return (zso) DEFAULT_INSTANCE.e();
    }

    public final void A(String str) {
        this.sessionId_ = str;
    }

    public final void B() {
        this.signalGenerationRequestId_ = "";
    }

    public final void C(String str) {
        this.stackTraceHash_ = str;
    }

    public final void D(String str) {
        Objects.requireNonNull(str);
        this.topException_ = str;
    }

    public final void E(String str) {
        this.unityEditorVersion_ = str;
    }

    public final void F(String str) {
        this.webViewVersion_ = str;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004[\u0000\u0001\u0001[[\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000bH\u0004I\u0004J\u0004K\u0002L\u0002M\fN\fOဉ\fPဉ\rQ\u0007RȈSȈTဉ\u000eUဉ\u000fVဉ\u0010W\u0007Xဉ\u0011Y\fZ\u0004[\f", new Object[]{"bitField0_", "name_", "success_", "latencyMillis_", "os_", "sdkVersion_", "appId_", "osVersion_", "targetVersion_", "orientation_", "networkType_", "gmsCoreVersion_", "format_", "backendQueryId_", "gwsQueryId_", "mediationAdapter_", "mediationAdapterVersion_", "plugin_", "topException_", "stackTraceHash_", "cause_", "canonicalSdkVersion_", "appName_", "deviceModel_", "country_", "experimentId_", "sessionId_", "requestId_", "adId_", "samplingDenominator_", "rootTraceId_", "traceId_", "parentTraceId_", "traceDepth_", "startTimeMillis_", "cpuTimeMillis_", "childCpuTimeMillis_", "tag_", "signalId_", "cachedSignalState_", "gmsgName_", "scarCacheEvictionData_", "h5Data_", "sequenceNumber_", "renderId_", "internalRequestId_", "signalGenerationRequestId_", "scarRequestType_", "mediationChainLength_", "adConfigurationIndex_", "renderer_", "adUnitId_", "mraidData_", "processState_", "jsEngineData_", "cronetProvider_", "customTabsNavigationEvent_", "signalData_", "signalCacheData_", "preloadData_", "preloadId_", "offlineData_", "chromeVariations_", "rawChromeVariations_", "appVersionName_", "webviewData_", "isFirstSessionAfterInstall_", "hadCachedFlags_", "wereCachedFlagsReset_", "postClickLifecycleMonitoringData_", "webViewVersion_", "installReferrerDetails_", "networkTypeCoarse_", "previousAppExitReason_", "previousAppExitSignal_", "timeSinceSdkInitStartMillis_", "timeSinceSdkInitCompleteMillis_", "deviceAdvertisedMemTier_", "deviceAvailableProcessorTier_", "adapterInitializationDetails_", "centralizedManagerPreloadData_", "skipUninitializedAdapters_", "requestAgent_", "unityEditorVersion_", "swipeableInterstitialSettleData_", "persistentCacheRequestData_", "persistentCacheEventData_", "isHtmlResponse_", "hsdpServiceData_", "contentProviderType_", "liveWebviewCount_", "deviceAvailableMemoryTier_"});
        }
        if (iA == 3) {
            return new nw0();
        }
        if (iA == 4) {
            return new zso(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(nw0.class);
        }
        throw null;
    }

    public final void a(cc2 cc2Var) {
        this.persistentCacheEventData_ = cc2Var;
        this.bitField0_ |= 65536;
    }

    public final void a(db1 db1Var) {
        this.installReferrerDetails_ = db1Var;
        this.bitField0_ |= 2048;
    }

    public final void a(e42 e42Var) {
        this.offlineData_ = e42Var;
        this.bitField0_ |= NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    public final void a(e43 e43Var) {
        this.signalData_ = e43Var;
        this.bitField0_ |= 1;
    }

    public final void a(ee2 ee2Var) {
        this.persistentCacheRequestData_ = ee2Var;
        this.bitField0_ |= 32768;
    }

    public final void a(el1 el1Var) {
        this.jsEngineData_ = el1Var;
        this.bitField0_ |= 16;
    }

    public final void a(ic3 ic3Var) {
        this.swipeableInterstitialSettleData_ = ic3Var;
        this.bitField0_ |= 16384;
    }

    public final void a(iq1 iq1Var) {
        this.mraidData_ = iq1Var;
        this.bitField0_ |= 8;
    }

    public final void a(ks ksVar) {
        this.centralizedManagerPreloadData_ = ksVar;
        this.bitField0_ |= 8192;
    }

    public final void a(no3 no3Var) {
        this.webviewData_ = no3Var;
        this.bitField0_ |= NotificationCompat.FLAG_GROUP_SUMMARY;
    }

    public final void a(ns nsVar) {
        this.chromeVariations_ = nsVar;
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final void a(ta taVar) {
        this.adapterInitializationDetails_ = taVar;
        this.bitField0_ |= 4096;
    }

    public final void a(tf2 tf2Var) {
        this.postClickLifecycleMonitoringData_ = tf2Var;
        this.bitField0_ |= 1024;
    }

    public final void a(tz2 tz2Var) {
        this.scarCacheEvictionData_ = tz2Var;
        this.bitField0_ |= 2;
    }

    public final void a(w01 w01Var) {
        this.hsdpServiceData_ = w01Var;
        this.bitField0_ |= 131072;
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
        this.appId_ = str;
    }

    public final void e(String str) {
        Objects.requireNonNull(str);
        this.appName_ = str;
    }

    public final void f(String str) {
        this.appVersionName_ = str;
    }

    public final void g(String str) {
        Objects.requireNonNull(str);
        this.backendQueryId_ = str;
    }

    public final void h(String str) {
        Objects.requireNonNull(str);
        this.canonicalSdkVersion_ = str;
    }

    public final void i(String str) {
        Objects.requireNonNull(str);
        this.cause_ = str;
    }

    public final void j(String str) {
        Objects.requireNonNull(str);
        this.country_ = str;
    }

    public final void k(String str) {
        this.cronetProvider_ = str;
    }

    public final void l(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.deviceModel_ = str2;
    }

    public final void m(String str) {
        Objects.requireNonNull(str);
        this.gwsQueryId_ = str;
    }

    public final void n(String str) {
        Objects.requireNonNull(str);
        this.internalRequestId_ = str;
    }

    public final void o(String str) {
        Objects.requireNonNull(str);
        this.mediationAdapter_ = str;
    }

    public final void p(String str) {
        Objects.requireNonNull(str);
        this.mediationAdapterVersion_ = str;
    }

    public final void q() {
        String str = Build.VERSION.RELEASE;
        Objects.requireNonNull(str);
        this.osVersion_ = str;
    }

    public final void s(String str) {
        this.preloadId_ = "";
    }

    public final void t(String str) {
        this.rawChromeVariations_ = str;
    }

    public final void u(String str) {
        Objects.requireNonNull(str);
        this.renderId_ = str;
    }

    public final void v(String str) {
        Objects.requireNonNull(str);
        this.renderer_ = str;
    }

    public final void w(String str) {
        Objects.requireNonNull(str);
        this.requestAgent_ = str;
    }

    public final void x(String str) {
        Objects.requireNonNull(str);
        this.requestId_ = str;
    }

    public final void y(String str) {
        Objects.requireNonNull(str);
        this.rootTraceId_ = str;
    }

    public final void z(String str) {
        Objects.requireNonNull(str);
        this.sdkVersion_ = str;
    }
}
