package ads_mobile_sdk;

import android.os.Build;
import defpackage.hzo;
import defpackage.k1p;
import defpackage.v9g;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h1 extends ku0 {
    private static final h1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int androidApiVersion_;
    private int bitField0_;
    private long versionCode_;
    private gn1 pools_ = gn1.b;
    private String packageName_ = "";
    private String deviceModel_ = "";
    private String consentStringHash_ = "";

    static {
        h1 h1Var = new h1();
        DEFAULT_INSTANCE = h1Var;
        ku0.a(h1.class, h1Var);
    }

    public static h1 a(InputStream inputStream) {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, v9g.a(inputStream), ul0.a());
        ku0.a(ku0VarA);
        return (h1) ku0VarA;
    }

    public static h1 q() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u00012\u0002ለ\u0000\u0003ဂ\u0001\u0004ለ\u0002\u0005င\u0003\u0006ለ\u0004", new Object[]{"bitField0_", "pools_", k1p.a, "packageName_", "versionCode_", "deviceModel_", "androidApiVersion_", "consentStringHash_"});
        }
        if (iA == 3) {
            return new h1();
        }
        if (iA == 4) {
            return new hzo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(h1.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.consentStringHash_ = str;
    }

    public final void c(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.bitField0_ |= 4;
        this.deviceModel_ = str2;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final int o() {
        return this.androidApiVersion_;
    }

    public final String p() {
        return this.consentStringHash_;
    }

    public final String r() {
        return this.deviceModel_;
    }

    public final gn1 s() {
        gn1 gn1Var = this.pools_;
        if (gn1Var.a) {
            return gn1Var;
        }
        gn1 gn1VarB = gn1Var.b();
        this.pools_ = gn1VarB;
        return gn1VarB;
    }

    public final String t() {
        return this.packageName_;
    }

    public final Map u() {
        return Collections.unmodifiableMap(this.pools_);
    }

    public final long v() {
        return this.versionCode_;
    }
}
