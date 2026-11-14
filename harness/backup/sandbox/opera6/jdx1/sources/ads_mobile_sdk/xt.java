package ads_mobile_sdk;

import defpackage.flp;
import defpackage.gip;
import defpackage.map;

/* loaded from: classes.dex */
public final class xt extends ku0 {
    private static final xt DEFAULT_INSTANCE;
    public static final int c = 13;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 10;
    public static final int h = 7;
    public static final int i = 4;
    public static final int j = 5;
    public static final int k = 9;
    public static final int l = 15;
    private int bitField0_;
    private long configTimeUsec_;
    private bu deviceProperties_;
    private flp downloadedBlob_;
    private gip experimentId_;
    private pl0 externalClientExperimentIds_;
    private String overrideZwiebackNid_;
    private flp serverToken_;
    private gip triggerExperimentId_;
    private zt versionInfo_;
    private int experimentIdMemoizedSerializedSize = -1;
    private int triggerExperimentIdMemoizedSerializedSize = -1;
    private hr gzipCompressed_ = hr.b;

    static {
        xt xtVar = new xt();
        DEFAULT_INSTANCE = xtVar;
        ku0.a(xt.class, xtVar);
    }

    public xt() {
        qb1 qb1Var = qb1.e;
        this.experimentId_ = qb1Var;
        this.triggerExperimentId_ = qb1Var;
        am2 am2Var = am2.e;
        this.serverToken_ = am2Var;
        this.overrideZwiebackNid_ = "";
        this.downloadedBlob_ = am2Var;
    }

    public static xt a(byte[] bArr, ul0 ul0Var) throws bj1 {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, bArr, bArr.length, ul0Var);
        ku0.a(ku0VarA);
        return (xt) ku0VarA;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"bitField0_", "experimentId_", "configTimeUsec_", "triggerExperimentId_", "downloadedBlob_", jt.class, "versionInfo_", "overrideZwiebackNid_", "deviceProperties_", "serverToken_", "gzipCompressed_", "externalClientExperimentIds_"});
        }
        if (iA == 3) {
            return new xt();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(xt.class);
        }
        throw null;
    }
}
