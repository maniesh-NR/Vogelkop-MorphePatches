package ads_mobile_sdk;

import defpackage.dko;
import defpackage.flp;

/* loaded from: classes.dex */
public final class i60 extends ku0 {
    private static final i60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private flp importScriptUrls_;
    private flp requestedUrls_;
    private String scopeUrl_ = "";
    private String scriptUrl_;

    static {
        i60 i60Var = new i60();
        DEFAULT_INSTANCE = i60Var;
        ku0.a(i60.class, i60Var);
    }

    public i60() {
        am2 am2Var = am2.e;
        this.requestedUrls_ = am2Var;
        this.importScriptUrls_ = am2Var;
        this.scriptUrl_ = "";
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"bitField0_", "scopeUrl_", "requestedUrls_", "importScriptUrls_", "scriptUrl_"});
        }
        if (iA == 3) {
            return new i60();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(i60.class);
        }
        throw null;
    }
}
