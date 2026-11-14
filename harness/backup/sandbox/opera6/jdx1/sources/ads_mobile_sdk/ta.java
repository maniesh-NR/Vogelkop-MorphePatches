package ads_mobile_sdk;

import defpackage.cpj;
import defpackage.flp;
import defpackage.gip;
import defpackage.ngp;

/* loaded from: classes.dex */
public final class ta extends ku0 {
    private static final ta DEFAULT_INSTANCE;
    private static final djp allowedFormats_converter_ = new cpj((byte) 15);
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private long adapterInitializationTimeoutMs_;
    private flp allowedAdUnits_;
    private flp allowedAdapterClasses_;
    private int allowedFormatsMemoizedSerializedSize;
    private gip allowedFormats_ = qb1.e;
    private flp excludedAdapterClasses_;
    private flp initializedAdapterClasses_;

    static {
        ta taVar = new ta();
        DEFAULT_INSTANCE = taVar;
        ku0.a(ta.class, taVar);
    }

    public ta() {
        am2 am2Var = am2.e;
        this.allowedAdUnits_ = am2Var;
        this.allowedAdapterClasses_ = am2Var;
        this.excludedAdapterClasses_ = am2Var;
        this.initializedAdapterClasses_ = am2Var;
    }

    public static ngp o() {
        return (ngp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"adapterInitializationTimeoutMs_", "allowedFormats_", "allowedAdUnits_", "allowedAdapterClasses_", "excludedAdapterClasses_", "initializedAdapterClasses_"});
        }
        if (iA == 3) {
            return new ta();
        }
        if (iA == 4) {
            return new ngp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ta.class);
        }
        throw null;
    }
}
