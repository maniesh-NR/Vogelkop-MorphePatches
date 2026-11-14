package ads_mobile_sdk;

import defpackage.i3p;
import defpackage.v9g;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ia1 extends ku0 {
    private static final ia1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int gesture_;
    private boolean isGloballyAllowlisted_;
    private boolean isLinkedDevice_;
    private boolean isTestMode_;
    private long networkExtrasExpirationSecs_;
    private String networkExtras_ = "";
    private String deviceIdForDebugging_ = "";
    private String debugAdUnitId_ = "";
    private String uiStorage_ = "";

    static {
        ia1 ia1Var = new ia1();
        DEFAULT_INSTANCE = ia1Var;
        ku0.a(ia1.class, ia1Var);
    }

    public static ia1 a(InputStream inputStream) {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, v9g.a(inputStream), ul0.a());
        ku0.a(ku0VarA);
        return (ia1) ku0VarA;
    }

    public static ia1 p() {
        return DEFAULT_INSTANCE;
    }

    public static i3p y() {
        return (i3p) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\f\u0004Ȉ\u0005\u0002\u0006Ȉ\u0007Ȉ\bȈ\t\u0007", new Object[]{"isTestMode_", "isLinkedDevice_", "gesture_", "networkExtras_", "networkExtrasExpirationSecs_", "deviceIdForDebugging_", "debugAdUnitId_", "uiStorage_", "isGloballyAllowlisted_"});
        }
        if (iA == 3) {
            return new ia1();
        }
        if (iA == 4) {
            return new i3p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ia1.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.debugAdUnitId_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.deviceIdForDebugging_ = str;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.networkExtras_ = str;
    }

    public final void e(String str) {
        Objects.requireNonNull(str);
        this.uiStorage_ = str;
    }

    public final String o() {
        return this.debugAdUnitId_;
    }

    public final String q() {
        return this.deviceIdForDebugging_;
    }

    public final int r$2() {
        int i2 = this.gesture_;
        int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? 0 : 3 : 2 : 1;
        if (i3 == 0) {
            return 4;
        }
        return i3;
    }

    public final boolean s() {
        return this.isGloballyAllowlisted_;
    }

    public final boolean t() {
        return this.isLinkedDevice_;
    }

    public final boolean u() {
        return this.isTestMode_;
    }

    public final String v() {
        return this.networkExtras_;
    }

    public final long w() {
        return this.networkExtrasExpirationSecs_;
    }

    public final String x() {
        return this.uiStorage_;
    }
}
