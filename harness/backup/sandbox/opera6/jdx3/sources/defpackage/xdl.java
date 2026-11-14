package defpackage;

/* loaded from: classes.dex */
public final class xdl extends gv9 implements svd {
    private static final xdl DEFAULT_INSTANCE;
    private static volatile p1g PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private double value_;

    static {
        xdl xdlVar = new xdl();
        DEFAULT_INSTANCE = xdlVar;
        gv9.registerDefaultInstance(xdl.class, xdlVar);
    }

    public static xdl b() {
        return DEFAULT_INSTANCE;
    }

    public static vdl d() {
        return (vdl) DEFAULT_INSTANCE.createBuilder();
    }

    public final double c() {
        return this.value_;
    }

    public final Object dynamicMethod(gv9$f gv9_f, Object obj, Object obj2) {
        b bVar;
        switch (udl.a[gv9_f.ordinal()]) {
            case 1:
                return new xdl();
            case 2:
                return new vdl(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"bitField0_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (xdl.class) {
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

    public final void e(double d) {
        this.bitField0_ |= 1;
        this.value_ = d;
    }
}
