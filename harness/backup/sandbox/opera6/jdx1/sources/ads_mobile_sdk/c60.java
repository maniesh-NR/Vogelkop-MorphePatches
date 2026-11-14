package ads_mobile_sdk;

import defpackage.flp;
import defpackage.gip;
import defpackage.uoo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c60 extends ku0 {
    private static final c60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int adResourceType_;
    private int bitField0_;
    private int id_;
    private int parentId_;
    private e50 request_;
    private i50 response_;
    private byte memoizedIsInitialized = 2;
    private String url_ = "";
    private gip childIds_ = qb1.e;
    private String tagName_ = "";
    private flp matchedBlacklist_ = am2.e;

    static {
        c60 c60Var = new c60();
        DEFAULT_INSTANCE = c60Var;
        ku0.a(c60.class, c60Var);
    }

    public static uoo o() {
        return (uoo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        switch (zwg.a(i2)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (ku0Var == null ? 0 : 1);
                return null;
            case 2:
                return new zq2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"bitField0_", "id_", "url_", "request_", "response_", "parentId_", "childIds_", "tagName_", "adResourceType_", st.a$11, "matchedBlacklist_"});
            case 3:
                return new c60();
            case 4:
                return new uoo(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                return ku0.b(c60.class);
            default:
                throw null;
        }
    }

    public final void a(e50 e50Var) {
        this.request_ = e50Var;
        this.bitField0_ |= 4;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.url_ = str;
    }
}
