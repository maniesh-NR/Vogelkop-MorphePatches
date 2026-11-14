package defpackage;

import defpackage.gv9;

/* loaded from: classes.dex */
public final class luc extends gv9 implements svd {
    public static final int ACTIVATION_TIME_FIELD_NUMBER = 4;
    private static final luc DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int ISO3_COUNTRY_CODE_FIELD_NUMBER = 1;
    public static final int IS_FREE_PLAN_FIELD_NUMBER = 5;
    private static volatile p1g PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 3;
    private long activationTime_;
    private int bitField0_;
    private long duration_;
    private boolean isFreePlan_;
    private String iso3CountryCode_ = "";
    private int status_;

    static {
        luc lucVar = new luc();
        DEFAULT_INSTANCE = lucVar;
        gv9.registerDefaultInstance(luc.class, lucVar);
    }

    public static luc c() {
        return DEFAULT_INSTANCE;
    }

    public static kuc j() {
        return (kuc) DEFAULT_INSTANCE.createBuilder();
    }

    public final long b() {
        return this.activationTime_;
    }

    public final long d() {
        return this.duration_;
    }

    @Override // defpackage.gv9
    public final Object dynamicMethod(gv9.f fVar, Object obj, Object obj2) {
        p1g bVar;
        switch (juc.a[fVar.ordinal()]) {
            case 1:
                return new luc();
            case 2:
                return new kuc(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ဃ\u0001\u0003ဌ\u0002\u0004ဃ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "iso3CountryCode_", "duration_", "status_", "activationTime_", "isFreePlan_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (luc.class) {
                    bVar = PARSER;
                    if (bVar == null) {
                        bVar = new gv9.b(DEFAULT_INSTANCE);
                        PARSER = bVar;
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final boolean e() {
        return this.isFreePlan_;
    }

    public final String f() {
        return this.iso3CountryCode_;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0014 A[PHI: r1
      0x0014: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:5:0x0006, B:9:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g() {
        /*
            r2 = this;
            int r2 = r2.status_
            r0 = 1
            if (r2 == 0) goto L15
            r1 = 2
            if (r2 == r0) goto L14
            r0 = 3
            if (r2 == r1) goto L15
            r1 = 4
            if (r2 == r0) goto L14
            if (r2 == r1) goto L12
            r0 = 0
            goto L15
        L12:
            r0 = 5
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L19
            r2 = 6
            return r2
        L19:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.luc.g():int");
    }

    public final boolean h() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean i() {
        return (this.bitField0_ & 16) != 0;
    }

    public final void k(long j) {
        this.bitField0_ |= 8;
        this.activationTime_ = j;
    }

    public final void l(long j) {
        this.bitField0_ |= 2;
        this.duration_ = j;
    }

    public final void m(boolean z) {
        this.bitField0_ |= 16;
        this.isFreePlan_ = z;
    }

    public final void n(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.iso3CountryCode_ = str;
    }

    public final void o(int i) {
        int i2;
        if (i != 6) {
            switch (i) {
                case 1:
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 2;
                    break;
                case 4:
                    i2 = 3;
                    break;
                case 5:
                    i2 = 4;
                    break;
                case 6:
                    i2 = -1;
                    break;
                default:
                    throw null;
            }
            this.status_ = i2;
            this.bitField0_ |= 4;
        }
        qp2.o("Can't get the number of an unknown enum value.");
        i2 = 0;
        this.status_ = i2;
        this.bitField0_ |= 4;
    }
}
