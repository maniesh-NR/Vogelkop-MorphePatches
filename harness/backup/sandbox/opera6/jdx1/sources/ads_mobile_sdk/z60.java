package ads_mobile_sdk;

import defpackage.flp;
import defpackage.gip;
import defpackage.xlp;

/* loaded from: classes.dex */
public final class z60 extends ku0 {
    private static final z60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private int bitField0_;
    private int id_;
    private int resourceId_;
    private String tag_ = "";
    private gip childIds_ = qb1.e;
    private flp attribute_ = am2.e;
    private hr innerHtml_ = hr.b;

    static {
        z60 z60Var = new z60();
        DEFAULT_INSTANCE = z60Var;
        ku0.a(z60.class, z60Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"bitField0_", "id_", "tag_", "childIds_", "resourceId_", "attribute_", x60.class, "innerHtml_"});
        }
        if (iA == 3) {
            return new z60();
        }
        if (iA == 4) {
            return new xlp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(z60.class);
        }
        throw null;
    }
}
