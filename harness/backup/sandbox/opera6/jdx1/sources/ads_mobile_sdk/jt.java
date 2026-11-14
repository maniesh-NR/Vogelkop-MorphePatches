package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class jt extends ku0 {
    private static final jt DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    private int bitField0_;
    private int compression_;
    private int downloadPriority_;
    private ht fallbackInstruction_;
    private boolean meteredAllowed_;
    private pt postProcess_;
    private boolean roamingAllowed_;
    private int type_;
    private String name_ = "";
    private String id_ = "";
    private int state_ = 1;
    private String downloadPath_ = "";
    private String fallbackDownloadPath_ = "";

    static {
        jt jtVar = new jt();
        DEFAULT_INSTANCE = jtVar;
        ku0.a(jt.class, jtVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"bitField0_", "name_", "id_", "type_", st.a$6, "state_", st.a, "meteredAllowed_", "downloadPath_", "roamingAllowed_", "downloadPriority_", "compression_", ad.a$21, "postProcess_", "fallbackDownloadPath_", "fallbackInstruction_"});
        }
        if (iA == 3) {
            return new jt();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(jt.class);
        }
        throw null;
    }
}
