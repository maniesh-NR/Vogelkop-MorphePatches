package ads_mobile_sdk;

import android.os.Build;
import defpackage.bjp;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v7 extends ku0 {
    private static final v7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private long apiLevel_;
    private long appVersionCode_;
    private int bitField0_;
    private int hostType_;
    private int osType_;
    private hr vmVersion_ = hr.b;
    private String model_ = "";
    private String appId_ = "";
    private String hostVersion_ = "";

    static {
        v7 v7Var = new v7();
        DEFAULT_INSTANCE = v7Var;
        ku0.a(v7.class, v7Var);
    }

    public static bjp o() {
        return (bjp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"bitField0_", "vmVersion_", "apiLevel_", "model_", "appId_", "appVersionCode_", "hostVersion_", "osType_", "hostType_"});
        }
        if (iA == 3) {
            return new v7();
        }
        if (iA == 4) {
            return new bjp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(v7.class);
        }
        throw null;
    }

    public final void a(fr frVar) {
        Objects.requireNonNull(frVar);
        this.bitField0_ |= 1;
        this.vmVersion_ = frVar;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.appId_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.hostVersion_ = str;
    }

    public final void d(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.bitField0_ |= 4;
        this.model_ = str2;
    }
}
