package ads_mobile_sdk;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import defpackage.flp;
import defpackage.gip;
import defpackage.lgp;
import defpackage.y7h;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t7 extends ku0 {
    private static final t7 DEFAULT_INSTANCE;
    public static final int c = 8;
    public static final int d = 21;
    public static final int e = 22;
    public static final int f = 23;
    public static final int g = 24;
    public static final int h = 25;
    public static final int i = 40;
    public static final int j = 41;
    public static final int k = 60;
    public static final int l = 61;
    public static final int m = 62;
    public static final int n = 63;
    public static final int o = 64;
    public static final int p = 65;
    public static final int q = 66;
    private long apiLevel_;
    private long appVersionCode_;
    private int bitField0_;
    private int deviceType_;
    private int hostType_;
    private int osType_;
    private long requestedAdshieldVersion_;
    private long samplingDenominator_;
    private int experimentIdsMemoizedSerializedSize = -1;
    private flp logEvents_ = am2.e;
    private String model_ = "";
    private String locale_ = "";
    private String country_ = "";
    private String appId_ = "";
    private String hostVersion_ = "";
    private String adshieldVersion_ = "";
    private gip experimentIds_ = qb1.e;

    static {
        t7 t7Var = new t7();
        DEFAULT_INSTANCE = t7Var;
        ku0.a(t7.class, t7Var);
    }

    public static lgp o() {
        return (lgp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"bitField0_", "logEvents_", em1.class, "apiLevel_", "model_", "locale_", "country_", "deviceType_", st.a$1, "appId_", "appVersionCode_", "hostVersion_", "adshieldVersion_", "samplingDenominator_", "requestedAdshieldVersion_", "experimentIds_", "hostType_", "osType_"});
        }
        if (iA == 3) {
            return new t7();
        }
        if (iA == 4) {
            return new lgp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(t7.class);
        }
        throw null;
    }

    public final void a(em1 em1Var) {
        flp flpVarC = this.logEvents_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.logEvents_ = flpVarC;
        }
        flpVarC.add(em1Var);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.adshieldVersion_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.appId_ = str;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.country_ = str;
    }

    public final void e(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= NotificationCompat.FLAG_HIGH_PRIORITY;
        this.hostVersion_ = str;
    }

    public final void f(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.locale_ = str;
    }

    public final void g(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.bitField0_ |= 2;
        this.model_ = str2;
    }
}
