package defpackage;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class iuc extends gv9 implements svd {
    private static final iuc DEFAULT_INSTANCE;
    public static final int FREE_ESIM_ELIGIBILITY_FIELD_NUMBER = 1;
    public static final int HAS_SEEN_ONBOARDING_FIELD_NUMBER = 6;
    public static final int LAST_PROMOTED_COUNTRY_CODE_FIELD_NUMBER = 2;
    private static volatile p1g PARSER = null;
    public static final int PLANS_FIELD_NUMBER = 4;
    public static final int PLAN_METADATA_FIELD_NUMBER = 5;
    public static final int USER_PLAN_STATE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int freeEsimEligibility_;
    private boolean hasSeenOnboarding_;
    private int userPlanState_;
    private fad plans_ = fad.emptyMapField();
    private fad planMetadata_ = fad.emptyMapField();
    private String lastPromotedCountryCode_ = "";

    static {
        iuc iucVar = new iuc();
        DEFAULT_INSTANCE = iucVar;
        gv9.registerDefaultInstance(iuc.class, iucVar);
    }

    public static iuc d() {
        return DEFAULT_INSTANCE;
    }

    public static iuc n(InputStream inputStream) {
        return (iuc) gv9.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public final void b() {
        this.bitField0_ &= -2;
        this.freeEsimEligibility_ = 0;
    }

    public final void c() {
        this.bitField0_ &= -3;
        this.lastPromotedCountryCode_ = DEFAULT_INSTANCE.lastPromotedCountryCode_;
    }

    public final Object dynamicMethod(gv9$f gv9_f, Object obj, Object obj2) {
        b bVar;
        switch (euc.a[gv9_f.ordinal()]) {
            case 1:
                return new iuc();
            case 2:
                return new fuc(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0002\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဌ\u0002\u00042\u00052\u0006ဇ\u0003", new Object[]{"bitField0_", "freeEsimEligibility_", "lastPromotedCountryCode_", "userPlanState_", "plans_", huc.a, "planMetadata_", guc.a, "hasSeenOnboarding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (iuc.class) {
                    bVar = PARSER;
                    if (bVar == null) {
                        bVar = new b(DEFAULT_INSTANCE);
                        PARSER = bVar;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final suc e() {
        int i = this.freeEsimEligibility_;
        suc sucVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : suc.LOCAL_FREE_ESIM_ELIGIBILITY_ALREADY_CLAIMED : suc.LOCAL_FREE_ESIM_ELIGIBILITY_ELIGIBLE : suc.LOCAL_FREE_ESIM_ELIGIBILITY_NOT_COVERED : suc.LOCAL_FREE_ESIM_ELIGIBILITY_UNSPECIFIED;
        return sucVar == null ? suc.UNRECOGNIZED : sucVar;
    }

    public final boolean f() {
        return this.hasSeenOnboarding_;
    }

    public final String g() {
        return this.lastPromotedCountryCode_;
    }

    public final Map h() {
        return Collections.unmodifiableMap(this.planMetadata_);
    }

    public final ouc i(String str, ouc oucVar) {
        str.getClass();
        ouc oucVar2 = (ouc) this.planMetadata_.get(str);
        return oucVar2 != null ? oucVar2 : oucVar;
    }

    public final Map j() {
        return Collections.unmodifiableMap(this.plans_);
    }

    public final puc k() {
        int i = this.userPlanState_;
        puc pucVar = i != 0 ? i != 1 ? i != 2 ? null : puc.LOCAL_ESIM_USER_PLAN_STATE_NO_PLANS : puc.LOCAL_ESIM_USER_PLAN_STATE_HAS_PLANS : puc.LOCAL_ESIM_USER_PLAN_STATE_UNSPECIFIED;
        return pucVar == null ? puc.UNRECOGNIZED : pucVar;
    }

    public final fad l() {
        if (!this.planMetadata_.isMutable()) {
            this.planMetadata_ = this.planMetadata_.mutableCopy();
        }
        return this.planMetadata_;
    }

    public final fad m() {
        if (!this.plans_.isMutable()) {
            this.plans_ = this.plans_.mutableCopy();
        }
        return this.plans_;
    }

    public final void o(suc sucVar) {
        this.freeEsimEligibility_ = sucVar.getNumber();
        this.bitField0_ |= 1;
    }

    public final void p() {
        this.bitField0_ |= 8;
        this.hasSeenOnboarding_ = true;
    }

    public final void q(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.lastPromotedCountryCode_ = str;
    }

    public final void r(puc pucVar) {
        this.userPlanState_ = pucVar.getNumber();
        this.bitField0_ |= 4;
    }
}
