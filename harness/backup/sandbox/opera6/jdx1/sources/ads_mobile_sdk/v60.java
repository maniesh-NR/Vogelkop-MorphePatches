package ads_mobile_sdk;

import defpackage.dbp;
import defpackage.flp;
import defpackage.y7h;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v60 extends ku0 {
    public static final int A = 25;
    public static final int B = 26;
    public static final int C = 27;
    public static final int D = 29;
    private static final v60 DEFAULT_INSTANCE;
    public static final int E = 30;
    public static final int F = 31;
    public static final int G = 32;
    public static final int H = 33;
    public static final int I = 34;
    public static final int J = 35;
    public static final int K = 36;
    public static final int L = 37;
    public static final int c = 10;
    public static final int d = 11;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 12;
    public static final int i = 4;
    public static final int j = 16;
    public static final int k = 13;
    public static final int l = 14;
    public static final int m = 5;
    public static final int n = 6;
    public static final int o = 7;
    public static final int p = 8;
    public static final int q = 9;
    public static final int r = 15;
    public static final int s = 17;
    public static final int t = 18;
    public static final int u = 19;
    public static final int v = 20;
    public static final int w = 21;
    public static final int x = 22;
    public static final int y = 23;
    public static final int z = 24;
    private int bitField0_;
    private String clickUrl_;
    private flp clientAsn_;
    private String clientCountry_;
    private e60 clientProperties_;
    private boolean complete_;
    private o40 creativeProperties_;
    private boolean didProceed_;
    private flp disallowedPermissions_;
    private flp dom_;
    private s40 downloadItemInfo_;
    private int downloadVerdict_;
    private flp downloadWarningActions_;
    private flp interstitialInteractions_;
    private String locale_;
    private o50 permissionPromptInfo_;
    private flp phishySiteInteractions_;
    private j40 population_;
    private flp referrerChain_;
    private flp rejectedPermissions_;
    private w50 renderedAd_;
    private boolean repeatVisit_;
    private flp resources_;
    private String safetyNetId_;
    private flp serviceWorkerBehaviors_;
    private boolean showDownloadInFolder_;
    private hr token_;
    private int type_;
    private m60 urlRealTimeAndHashRealTimeDiscrepancyInfo_;
    private int urlRequestDestination_;
    private String userAgent_;
    private q60 userInfo_;
    private u60 warningShownInfo_;
    private long warningShownTimestampMsec_;
    private byte memoizedIsInitialized = 2;
    private String url_ = "";
    private String pageUrl_ = "";
    private String referrerUrl_ = "";

    static {
        v60 v60Var = new v60();
        DEFAULT_INSTANCE = v60Var;
        ku0.a(v60.class, v60Var);
    }

    public v60() {
        am2 am2Var = am2.e;
        this.resources_ = am2Var;
        this.dom_ = am2Var;
        this.clickUrl_ = "";
        this.clientAsn_ = am2Var;
        this.clientCountry_ = "";
        this.token_ = hr.b;
        this.userAgent_ = "";
        this.disallowedPermissions_ = am2Var;
        this.rejectedPermissions_ = am2Var;
        this.referrerChain_ = am2Var;
        this.safetyNetId_ = "";
        this.downloadWarningActions_ = am2Var;
        this.interstitialInteractions_ = am2Var;
        this.phishySiteInteractions_ = am2Var;
        this.locale_ = "";
        this.serviceWorkerBehaviors_ = am2Var;
    }

    public static dbp o() {
        return (dbp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        switch (zwg.a(i2)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (ku0Var == null ? 0 : 1);
                return null;
            case 2:
                return new zq2(DEFAULT_INSTANCE, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"bitField0_", "url_", "pageUrl_", "referrerUrl_", "resources_", c60.class, "complete_", "clientAsn_", "clientCountry_", "didProceed_", "repeatVisit_", "type_", st.a$8, "downloadVerdict_", ad.a$17, "creativeProperties_", "clickUrl_", "renderedAd_", "token_", "dom_", z60.class, "clientProperties_", "showDownloadInFolder_", "userAgent_", "disallowedPermissions_", "rejectedPermissions_", "userInfo_", "referrerChain_", h70.class, "downloadItemInfo_", "safetyNetId_", "population_", "downloadWarningActions_", y40.class, "urlRequestDestination_", ad.a$25, "interstitialInteractions_", m50.class, "phishySiteInteractions_", s50.class, "warningShownTimestampMsec_", "warningShownInfo_", "permissionPromptInfo_", "locale_", "urlRealTimeAndHashRealTimeDiscrepancyInfo_", "serviceWorkerBehaviors_", i60.class});
            case 3:
                return new v60();
            case 4:
                return new dbp(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                return ku0.b(v60.class);
            default:
                throw null;
        }
    }

    public final void a(c60 c60Var) {
        flp flpVarC = this.resources_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.resources_ = flpVarC;
        }
        flpVarC.add(c60Var);
    }

    public final void a(e60 e60Var) {
        this.clientProperties_ = e60Var;
        this.bitField0_ |= 8192;
    }

    public final void a(o40 o40Var) {
        this.creativeProperties_ = o40Var;
        this.bitField0_ |= 32;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.clickUrl_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 8;
        this.pageUrl_ = str;
    }

    public final void d(String str) {
        this.bitField0_ |= 4;
        this.url_ = str;
    }
}
