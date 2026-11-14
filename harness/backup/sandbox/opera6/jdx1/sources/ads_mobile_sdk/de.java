package ads_mobile_sdk;

import defpackage.iso;
import java.util.Objects;

/* loaded from: classes.dex */
public final class de extends ku0 {
    private static final de DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    private int bitField0_;
    private long evtTime_;
    private long uptSignal_;
    private long vcdSignal_;
    private String adshieldVersion_ = "";
    private String afmaVersion_ = "";
    private String appIdSignal_ = "D";
    private String cerSignal_ = "";

    static {
        de deVar = new de();
        DEFAULT_INSTANCE = deVar;
        ku0.a(de.class, deVar);
    }

    public static iso o() {
        return (iso) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "adshieldVersion_", "afmaVersion_", "evtTime_", "appIdSignal_", "vcdSignal_", "uptSignal_", "cerSignal_"});
        }
        if (iA == 3) {
            return new de();
        }
        if (iA == 4) {
            return new iso(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(de.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.afmaVersion_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.appIdSignal_ = str;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.cerSignal_ = str;
    }

    public final void p() {
        this.bitField0_ |= 1;
        this.adshieldVersion_ = "0.945319811";
    }
}
