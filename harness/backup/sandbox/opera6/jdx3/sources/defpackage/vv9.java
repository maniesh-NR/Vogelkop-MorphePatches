package defpackage;

/* loaded from: classes.dex */
public final class vv9 extends gv9 implements svd {
    private static final vv9 DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile p1g PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int bitField0_;
    private double latitude_;
    private double longitude_;
    private long timestamp_;

    static {
        vv9 vv9Var = new vv9();
        DEFAULT_INSTANCE = vv9Var;
        gv9.registerDefaultInstance(vv9.class, vv9Var);
    }

    public static vv9 b() {
        return DEFAULT_INSTANCE;
    }

    public static tv9 f() {
        return (tv9) DEFAULT_INSTANCE.createBuilder();
    }

    public final double c() {
        return this.latitude_;
    }

    public final double d() {
        return this.longitude_;
    }

    public final Object dynamicMethod(gv9$f gv9_f, Object obj, Object obj2) {
        b bVar;
        switch (sv9.a[gv9_f.ordinal()]) {
            case 1:
                return new vv9();
            case 2:
                return new tv9(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဃ\u0002", new Object[]{"bitField0_", "latitude_", "longitude_", "timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (vv9.class) {
                    bVar = PARSER;
                    if (bVar == null) {
                        bVar = new b(DEFAULT_INSTANCE);
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

    public final long e() {
        return this.timestamp_;
    }

    public final void g(double d) {
        this.bitField0_ |= 1;
        this.latitude_ = d;
    }

    public final void h(double d) {
        this.bitField0_ |= 2;
        this.longitude_ = d;
    }

    public final void i(long j) {
        this.bitField0_ |= 4;
        this.timestamp_ = j;
    }
}
