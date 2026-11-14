package ads_mobile_sdk;

import defpackage.ipo;

/* loaded from: classes.dex */
public final class db1 extends ku0 {
    private static final db1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private boolean googlePlayInstant_;
    private long installBeginTimestampSeconds_;
    private long installBeginTimestampServerSeconds_;
    private int installReferrerErrorCode_;
    private String installReferrer_ = "";
    private String installVersion_ = "";
    private long referrerClickTimestampSeconds_;
    private long referrerClickTimestampServerSeconds_;

    static {
        db1 db1Var = new db1();
        DEFAULT_INSTANCE = db1Var;
        ku0.a(db1.class, db1Var);
    }

    public static ipo o() {
        return (ipo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"installReferrer_", "referrerClickTimestampSeconds_", "installBeginTimestampSeconds_", "googlePlayInstant_", "referrerClickTimestampServerSeconds_", "installBeginTimestampServerSeconds_", "installVersion_", "installReferrerErrorCode_"});
        }
        if (iA == 3) {
            return new db1();
        }
        if (iA == 4) {
            return new ipo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(db1.class);
        }
        throw null;
    }

    public final void b(String str) {
        this.installReferrer_ = str;
    }

    public final void c(String str) {
        this.installVersion_ = str;
    }
}
