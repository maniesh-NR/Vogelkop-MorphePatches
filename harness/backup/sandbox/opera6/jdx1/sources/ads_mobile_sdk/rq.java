package ads_mobile_sdk;

import defpackage.cpj;
import defpackage.gip;
import defpackage.nbp;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rq extends ku0 {
    private static final rq DEFAULT_INSTANCE;
    public static final int c = 5;
    public static final int d = 4;
    private static final djp dEPRECATEDAdapterBehavior_converter_ = new cpj((byte) 14);
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    private int adapterBehaviorBitmap_;
    private qq adapterVersion_;
    private int bitField0_;
    private int dEPRECATEDAdapterBehaviorMemoizedSerializedSize;
    private oq error_;
    private boolean isPublisherCreated_;
    private long latencyMs_;
    private qq sdkVersion_;
    private String adapterClassName_ = "";
    private String buyerGeneratedRequestData_ = "";
    private gip dEPRECATEDAdapterBehavior_ = qb1.e;

    static {
        rq rqVar = new rq();
        DEFAULT_INSTANCE = rqVar;
        ku0.a(rq.class, rqVar);
    }

    public static nbp o() {
        return (nbp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0001\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဈ\u0001\u0005ဈ\u0000\u0006ဇ\u0004\u0007ဉ\u0005\bဂ\u0006\tࠬ\nဋ\u0007", new Object[]{"bitField0_", "sdkVersion_", "adapterVersion_", "buyerGeneratedRequestData_", "adapterClassName_", "isPublisherCreated_", "error_", "latencyMs_", "dEPRECATEDAdapterBehavior_", ad.a$20, "adapterBehaviorBitmap_"});
        }
        if (iA == 3) {
            return new rq();
        }
        if (iA == 4) {
            return new nbp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(rq.class);
        }
        throw null;
    }

    public final void a(oq oqVar) {
        this.error_ = oqVar;
        this.bitField0_ |= 32;
    }

    public final void a(qq qqVar) {
        this.adapterVersion_ = qqVar;
        this.bitField0_ |= 8;
    }

    public final void b(qq qqVar) {
        this.sdkVersion_ = qqVar;
        this.bitField0_ |= 4;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.adapterClassName_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 2;
        this.buyerGeneratedRequestData_ = str;
    }
}
