package ads_mobile_sdk;

import defpackage.flp;
import defpackage.gip;
import defpackage.lkp;
import defpackage.map;

/* loaded from: classes.dex */
public final class rd extends ku0 {
    private static final rd DEFAULT_INSTANCE;
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
    private td automationVerdict_;
    private int bitField0_;
    private long deviceTrustworthinessDecisionLabel_;
    private long deviceTrustworthinessLevel_;
    private long humannessLevel_;
    private boolean isBattlestarEmulator_;
    private boolean isInvalidDeviceExperiment_;
    private boolean isInvalidDevice_;
    private long pairId_;
    private int responseType_;
    private boolean suspicious_;
    private long timestampMs_;
    private gip reasons_ = qb1.e;
    private flp crowdValidationOutcomes_ = am2.e;
    private lkp malwareClassifications_ = wm1.e;

    static {
        rd rdVar = new rd();
        DEFAULT_INSTANCE = rdVar;
        ku0.a(rd.class, rdVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014\rဇ\t\u000eဇ\n", new Object[]{"bitField0_", "timestampMs_", "responseType_", "suspicious_", "reasons_", "pairId_", "isBattlestarEmulator_", "crowdValidationOutcomes_", xd.class, "deviceTrustworthinessLevel_", "deviceTrustworthinessDecisionLabel_", "humannessLevel_", "automationVerdict_", "malwareClassifications_", "isInvalidDevice_", "isInvalidDeviceExperiment_"});
        }
        if (iA == 3) {
            return new rd();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(rd.class);
        }
        throw null;
    }
}
