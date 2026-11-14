package ads_mobile_sdk;

import defpackage.flp;
import defpackage.gip;
import defpackage.ioj;
import defpackage.xlp;

/* loaded from: classes.dex */
public final class j40 extends ku0 {
    private static final j40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    public static final int o = 13;
    public static final int p = 14;
    public static final int q = 15;
    public static final int r = 16;
    public static final int s = 17;
    public static final int t = 18;
    public static final int u = 19;
    private long aesbLastUpdateTimeWindowsEpochMicros_;
    private int bitField0_;
    private String finchActiveGroup_ = "";
    private flp finchActiveGroups_;
    private boolean isAesbEnabled_;
    private boolean isHighRiskUser_;
    private boolean isHistorySyncEnabled_;
    private boolean isIncognito_;
    private boolean isMbbEnabled_;
    private boolean isSignedIn_;
    private boolean isUnderAdvancedProtection_;
    private int numberOfLoadedProfiles_;
    private int numberOfOpenProfiles_;
    private int numberOfProfiles_;
    private flp pageLoadTokens_;
    private int polarbearPopulationMemoizedSerializedSize;
    private gip polarbearPopulation_;
    private int profileManagementStatus_;
    private int serverExperimentGroupsMemoizedSerializedSize;
    private gip serverExperimentGroups_;
    private String userAgent_;
    private int userPopulation_;
    private static final djp polarbearPopulation_converter_ = new ioj((byte) 16);
    private static final djp serverExperimentGroups_converter_ = new dpj((byte) 16);

    static {
        j40 j40Var = new j40();
        DEFAULT_INSTANCE = j40Var;
        ku0.a(j40.class, j40Var);
    }

    public j40() {
        am2 am2Var = am2.e;
        this.finchActiveGroups_ = am2Var;
        this.userAgent_ = "";
        this.pageLoadTokens_ = am2Var;
        qb1 qb1Var = qb1.e;
        this.polarbearPopulation_ = qb1Var;
        this.serverExperimentGroups_ = qb1Var;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"bitField0_", "userPopulation_", ad.a$14, "isHistorySyncEnabled_", "finchActiveGroup_", "finchActiveGroups_", "profileManagementStatus_", ad.a$7, "isUnderAdvancedProtection_", "isIncognito_", "isMbbEnabled_", "userAgent_", "numberOfProfiles_", "numberOfLoadedProfiles_", "numberOfOpenProfiles_", "isHighRiskUser_", "pageLoadTokens_", c40.class, "isAesbEnabled_", "aesbLastUpdateTimeWindowsEpochMicros_", "polarbearPopulation_", ad.a$24, "isSignedIn_", "serverExperimentGroups_", ad.a$10});
        }
        if (iA == 3) {
            return new j40();
        }
        if (iA == 4) {
            return new xlp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(j40.class);
        }
        throw null;
    }
}
