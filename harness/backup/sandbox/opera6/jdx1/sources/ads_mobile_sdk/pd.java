package ads_mobile_sdk;

import androidx.core.app.NotificationCompat;
import defpackage.flp;
import defpackage.gip;
import defpackage.k3p;
import defpackage.y7h;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pd extends ku0 {
    public static final int A = 29;
    public static final int A0 = 96;
    public static final int B = 31;
    public static final int B0 = 82;
    public static final int C = 32;
    public static final int C0 = 83;
    public static final int D = 33;
    public static final int D0 = 84;
    private static final pd DEFAULT_INSTANCE;
    public static final int E = 34;
    public static final int E0 = 85;
    public static final int F = 35;
    public static final int F0 = 86;
    public static final int G = 36;
    public static final int G0 = 87;
    public static final int H = 37;
    public static final int H0 = 97;
    public static final int I = 38;
    public static final int I0 = 88;
    public static final int J = 39;
    public static final int J0 = 89;
    public static final int K = 40;
    public static final int K0 = 103;
    public static final int L = 41;
    public static final int L0 = 90;
    public static final int M = 42;
    public static final int M0 = 91;
    public static final int N = 44;
    public static final int N0 = 92;
    public static final int O = 45;
    public static final int O0 = 93;
    public static final int P = 46;
    public static final int P0 = 94;
    public static final int Q = 47;
    public static final int Q0 = 98;
    public static final int R = 74;
    public static final int R0 = 99;
    public static final int S = 48;
    public static final int S0 = 100;
    public static final int T = 49;
    public static final int T0 = 101;
    public static final int U = 51;
    public static final int U0 = 102;
    public static final int V = 52;
    public static final int V0 = 104;
    public static final int W = 53;
    public static final int W0 = 105;
    public static final int X = 54;
    public static final int X0 = 21;
    public static final int Y = 55;
    public static final int Y0 = 24;
    public static final int Z = 56;
    public static final int Z0 = 26;
    public static final int a0 = 50;
    public static final int a1 = 28;
    public static final int b0 = 43;
    public static final int b1 = 30;
    public static final int c = 1;
    public static final int c0 = 57;
    public static final int c1 = 25;
    public static final int d = 2;
    public static final int d0 = 58;
    public static final int d1 = 201;
    public static final int e = 3;
    public static final int e0 = 59;
    public static final int e1 = 301;
    public static final int f = 4;
    public static final int f0 = 60;
    public static final int f1 = 302;
    public static final int g = 5;
    public static final int g0 = 61;
    public static final int g1 = 106;
    public static final int h = 6;
    public static final int h0 = 71;
    public static final int h1 = 107;
    public static final int i = 7;
    public static final int i0 = 72;
    public static final int i1 = 108;
    public static final int j = 8;
    public static final int j0 = 62;
    public static final int j1 = 109;
    public static final int k = 9;
    public static final int k0 = 63;
    public static final int k1 = 110;
    public static final int l = 10;
    public static final int l0 = 67;
    public static final int l1 = 111;
    public static final int m = 11;
    public static final int m0 = 64;
    public static final int n = 12;
    public static final int n0 = 65;
    public static final int o = 13;
    public static final int o0 = 66;
    public static final int p = 14;
    public static final int p0 = 95;
    public static final int q = 15;
    public static final int q0 = 68;
    public static final int r = 16;
    public static final int r0 = 69;
    public static final int s = 17;
    public static final int s0 = 70;
    public static final int t = 18;
    public static final int t0 = 73;
    public static final int u = 19;
    public static final int u0 = 76;
    public static final int v = 20;
    public static final int v0 = 77;
    public static final int w = 22;
    public static final int w0 = 78;
    public static final int x = 23;
    public static final int x0 = 79;
    public static final int y = 27;
    public static final int y0 = 80;
    public static final int z = 75;
    public static final int z0 = 81;
    private long actSignal_;
    private gip activeExperimentIds_;
    private long activityIntentSignal_;
    private String activityNameSignal_;
    private long activityStackSizeSignal_;
    private long acxSignal_;
    private long acySignal_;
    private long aczSignal_;
    private rd adAttestationSignal_;
    private long adeventToVpnOffMs_;
    private String adshieldVersion_;
    private long attSignal_;
    private long attitudeSignal_;
    private long atvSignal_;
    private long batteryTemperatureSignal_;
    private int bitField0_;
    private int bitField1_;
    private int bitField2_;
    private int bitField3_;
    private long bootCountSignal_;
    private long btlSignal_;
    private long btsSignal_;
    private long clsSignal_;
    private int debuggerStateSignal_;
    private String deviceModelSignal_;
    private boolean didOptOut_;
    private String didSignalAndroidAdId_;
    private int didSignalType_;
    private String didSignal_;
    private int encryptionMethod_;
    private long evtTime_;
    private long experimentalInt64Signal_;
    private String experimentalStringSignal_;
    private int fallbackSignalsType_;
    private flp functionDenylistSignal_;
    private long gmscoreVersionSignal_;
    private tc hwInfo_;
    private long impressionDurationHighAttentionMs_;
    private long impressionDurationMs_;
    private vc inputEvent_;
    private boolean iomSignal_;
    private int iosomSignal_;
    private int isLauncherSignal_;
    private long jbkSignal_;
    private xc keyEvent_;
    private long keyId_;
    private long lastKnownDeviceTrustworthiness_;
    private long lastKnownHumannessScore_;
    private long lastKnownTrustDecisionLabel_;
    private int launcherActivityEnabled_;
    private String lccSignal_;
    private String llcSignal_;
    private int mpSignal_;
    private int navigationTriggerType_;
    private long netSignal_;
    private int niSignal_;
    private long ornSignal_;
    private long pkgNameDetailSignal_;
    private long pmSignal_;
    private flp previousTouches_;
    private long processImportanceSignal_;
    private int protoName_;
    private int proxyDetectedSignal_;
    private long psnSignal_;
    private long ratSignal_;
    private he rawAdAttestationSignal_;
    private long recentForegroundTimeSignal_;
    private long reqType_;
    private je requestData_;
    private flp resetCounters_;
    private String sccSignal_;
    private id screenInfo_;
    private long screenStateSignal_;
    private String sftnIdSignal_;
    private kd soundInfoSignal_;
    private long swzSignal_;
    private long tctSignal_;
    private long tcxSignal_;
    private long tcySignal_;
    private long timeSinceVpnOnMs_;
    private long totalForegroundTimeSignal_;
    private md touch_;
    private long uhSignal_;
    private long uptSignal_;
    private long usgSignal_;
    private long utzSignal_;
    private long uwSignal_;
    private long vcdSignal_;
    private long virtualIntegrityType_;
    private long visSignal_;
    private od visibilitySignal_;
    private int vpnSignal_;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private String osVersion_ = "";
    private String afmaVersion_ = "";
    private String stkSignal_ = "";
    private String intSignal_ = "";
    private String midSignal_ = "D";
    private String cerSignal_ = "";
    private String vnmSignal_ = "";
    private long tcpSignal_ = -1;
    private long tcdSignal_ = -1;
    private long tcuSignal_ = -1;
    private long tcmSignal_ = -1;
    private long tcdnSignal_ = -1;
    private long tccSignal_ = -1;
    private long cpuSignal_ = -1;
    private long stkDepthSignal_ = -1;
    private String appIdSignal_ = "D";
    private String installerSignal_ = "D";
    private long timeSinceInstallMinutes_ = -1;
    private int usbConnectedSignal_ = 1000;
    private int adbEnabledSignal_ = 1000;
    private long deviceElapsedRealTimeSignal_ = -1;
    private long deviceUptimeSignal_ = -1;
    private long timeOnScreenMs_ = -1;
    private long percentAdOnScreen_ = -1;
    private long percentScreenCoveredByAd_ = -1;
    private int isNativeViewPerformclickMissing_ = 1000;

    static {
        pd pdVar = new pd();
        DEFAULT_INSTANCE = pdVar;
        ku0.a(pd.class, pdVar);
    }

    public pd() {
        am2 am2Var = am2.e;
        this.previousTouches_ = am2Var;
        this.gmscoreVersionSignal_ = -1L;
        this.batteryTemperatureSignal_ = -1L;
        this.processImportanceSignal_ = -1L;
        this.screenStateSignal_ = -1L;
        this.recentForegroundTimeSignal_ = -1L;
        this.totalForegroundTimeSignal_ = -1L;
        this.activityIntentSignal_ = -1L;
        this.activityStackSizeSignal_ = -1L;
        this.activityNameSignal_ = "D";
        this.pkgNameDetailSignal_ = -1L;
        this.attitudeSignal_ = -1L;
        this.proxyDetectedSignal_ = 1000;
        this.launcherActivityEnabled_ = 1000;
        this.sftnIdSignal_ = "D";
        this.resetCounters_ = am2Var;
        this.vpnSignal_ = 1000;
        this.functionDenylistSignal_ = am2Var;
        this.deviceModelSignal_ = "";
        this.timeSinceVpnOnMs_ = -1L;
        this.adeventToVpnOffMs_ = -1L;
        this.impressionDurationMs_ = -1L;
        this.impressionDurationHighAttentionMs_ = -1L;
        this.virtualIntegrityType_ = -1L;
        this.adshieldVersion_ = "";
        this.lastKnownTrustDecisionLabel_ = -1L;
        this.bootCountSignal_ = -1L;
        this.lccSignal_ = "";
        this.llcSignal_ = "";
        this.ratSignal_ = -1L;
        this.pmSignal_ = -1L;
        this.didSignal_ = "";
        this.didSignalType_ = 2;
        this.didSignalAndroidAdId_ = "";
        this.experimentalInt64Signal_ = -1L;
        this.experimentalStringSignal_ = "";
        this.activeExperimentIds_ = qb1.e;
        this.clsSignal_ = -1L;
        this.isLauncherSignal_ = 1000;
        this.iosomSignal_ = 1000;
        this.sccSignal_ = "";
    }

    public static pd a(byte[] bArr, ul0 ul0Var) throws bj1 {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, bArr, bArr.length, ul0Var);
        ku0.a(ku0VarA);
        return (pd) ku0VarA;
    }

    public static k3p w() {
        return (k3p) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            ad adVar = ad.a$23;
            ad adVar2 = ad.a$2;
            return new zq2(DEFAULT_INSTANCE, "\u0001r\u0000\u0004\u0001Įr\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ`\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈa\u0019ဂe\u001a᠌b\u001bဈ\u0016\u001cဇc\u001dဈ\u0018\u001eဈd\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^iဇ_j'kဂil᠌jm᠌kn᠌loဈmÉဉfĭဂgĮဈh", new Object[]{"bitField0_", "bitField1_", "bitField2_", "bitField3_", "osVersion_", "afmaVersion_", "atvSignal_", "attSignal_", "btsSignal_", "btlSignal_", "acxSignal_", "acySignal_", "aczSignal_", "actSignal_", "netSignal_", "ornSignal_", "stkSignal_", "tcxSignal_", "tcySignal_", "tctSignal_", "uptSignal_", "visSignal_", "swzSignal_", "psnSignal_", "reqType_", "jbkSignal_", "usgSignal_", "didSignal_", "evtTime_", "didSignalType_", adVar, "intSignal_", "didOptOut_", "cerSignal_", "didSignalAndroidAdId_", "uwSignal_", "uhSignal_", "utzSignal_", "vnmSignal_", "vcdSignal_", "tcpSignal_", "tcdSignal_", "adAttestationSignal_", "tcuSignal_", "tcmSignal_", "tcdnSignal_", "tccSignal_", "previousTouches_", md.class, "cpuSignal_", "stkDepthSignal_", "appIdSignal_", "installerSignal_", "usbConnectedSignal_", adVar2, "adbEnabledSignal_", adVar2, "touch_", "deviceElapsedRealTimeSignal_", "deviceUptimeSignal_", "timeOnScreenMs_", "percentAdOnScreen_", "percentScreenCoveredByAd_", "isNativeViewPerformclickMissing_", adVar2, "visibilitySignal_", "gmscoreVersionSignal_", "batteryTemperatureSignal_", "processImportanceSignal_", "screenStateSignal_", "activityIntentSignal_", "activityStackSizeSignal_", "pkgNameDetailSignal_", "encryptionMethod_", st.a$10, "protoName_", ad.a$9, "activityNameSignal_", "debuggerStateSignal_", ad.a$15, "requestData_", "attitudeSignal_", "recentForegroundTimeSignal_", "totalForegroundTimeSignal_", "proxyDetectedSignal_", adVar2, "timeSinceInstallMinutes_", "midSignal_", "launcherActivityEnabled_", adVar2, "sftnIdSignal_", "resetCounters_", gd.class, "vpnSignal_", adVar2, "functionDenylistSignal_", lc.class, "soundInfoSignal_", "deviceModelSignal_", "timeSinceVpnOnMs_", "adeventToVpnOffMs_", "impressionDurationMs_", "impressionDurationHighAttentionMs_", "lastKnownDeviceTrustworthiness_", "virtualIntegrityType_", "adshieldVersion_", "inputEvent_", "keyEvent_", "lastKnownTrustDecisionLabel_", "bootCountSignal_", "navigationTriggerType_", ad.a, "fallbackSignalsType_", ad.a$26, "screenInfo_", "lastKnownHumannessScore_", "lccSignal_", "llcSignal_", "ratSignal_", "pmSignal_", "niSignal_", ad.a$5, "keyId_", "hwInfo_", "iomSignal_", "activeExperimentIds_", "clsSignal_", "isLauncherSignal_", adVar2, "iosomSignal_", adVar2, "mpSignal_", st.a$9, "sccSignal_", "rawAdAttestationSignal_", "experimentalInt64Signal_", "experimentalStringSignal_"});
        }
        if (iA == 3) {
            return new pd();
        }
        if (iA == 4) {
            return new k3p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(pd.class);
        }
        throw null;
    }

    public final void a(he heVar) {
        Objects.requireNonNull(heVar);
        this.rawAdAttestationSignal_ = heVar;
        this.bitField3_ |= 64;
    }

    public final void a(md mdVar) {
        flp flpVarC = this.previousTouches_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.previousTouches_ = flpVarC;
        }
        flpVarC.add(mdVar);
    }

    public final void a(od odVar) {
        this.visibilitySignal_ = odVar;
        this.bitField1_ |= 524288;
    }

    public final void a(vc vcVar) {
        this.inputEvent_ = vcVar;
        this.bitField2_ |= 1048576;
    }

    public final void b(md mdVar) {
        this.touch_ = mdVar;
        this.bitField1_ |= 262144;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= 268435456;
        this.activityNameSignal_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.bitField2_ |= 262144;
        this.adshieldVersion_ = str;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.afmaVersion_ = str;
    }

    public final void e(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= NotificationCompat.FLAG_HIGH_PRIORITY;
        this.appIdSignal_ = str;
    }

    public final void f(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16777216;
        this.cerSignal_ = str;
    }

    public final void g(String str) {
        Objects.requireNonNull(str);
        this.bitField2_ |= 1024;
        this.deviceModelSignal_ = str;
    }

    public final void h(String str) {
        Objects.requireNonNull(str);
        this.bitField1_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.installerSignal_ = str;
    }

    public final void i(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4194304;
        this.intSignal_ = str;
    }

    public final void j(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.osVersion_ = str;
    }

    public final void k(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 268435456;
        this.vnmSignal_ = str;
    }

    public final long o() {
        return this.gmscoreVersionSignal_;
    }

    public final String p() {
        return this.intSignal_;
    }

    public final long q() {
        return this.psnSignal_;
    }

    public final he r() {
        he heVar = this.rawAdAttestationSignal_;
        return heVar == null ? he.DEFAULT_INSTANCE : heVar;
    }

    public final long s() {
        return this.recentForegroundTimeSignal_;
    }

    public final boolean t() {
        return (this.bitField1_ & 1048576) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 524288) != 0;
    }

    public final boolean v() {
        return (this.bitField3_ & 64) != 0;
    }
}
