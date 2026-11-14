package ads_mobile_sdk;

import defpackage.flp;
import defpackage.xlp;

/* loaded from: classes.dex */
public final class zt extends ku0 {
    private static final zt DEFAULT_INSTANCE;
    public static final int c = 5;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 8;
    public static final int h = 4;
    public static final int i = 10;
    public static final int j = 9;
    private int bitField0_;
    private flp blobSet_;
    private flp blob_;
    private ym3 compatInfo_;
    private String debugOnlyVersion_;
    private flp pluginSets_;
    private int velourSdkInt_;
    private String appName_ = "";
    private String version_ = "";

    static {
        zt ztVar = new zt();
        DEFAULT_INSTANCE = ztVar;
        ku0.a(zt.class, ztVar);
    }

    public zt() {
        am2 am2Var = am2.e;
        this.blob_ = am2Var;
        this.blobSet_ = am2Var;
        this.pluginSets_ = am2Var;
        this.velourSdkInt_ = -1;
        this.debugOnlyVersion_ = "";
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"bitField0_", "version_", "blob_", jt.class, "blobSet_", rt.class, "velourSdkInt_", "appName_", "pluginSets_", hu.class, "debugOnlyVersion_", "compatInfo_"});
        }
        if (iA == 3) {
            return new zt();
        }
        if (iA == 4) {
            return new xlp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(zt.class);
        }
        throw null;
    }
}
