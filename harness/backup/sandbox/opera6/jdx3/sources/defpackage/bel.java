package defpackage;

/* loaded from: classes.dex */
public final class bel extends gv9 implements svd {
    private static final bel DEFAULT_INSTANCE;
    public static final int IMPERIAL_FIELD_NUMBER = 2;
    public static final int METRIC_FIELD_NUMBER = 1;
    private static volatile p1g PARSER;
    private int bitField0_;
    private xdl imperial_;
    private xdl metric_;

    static {
        bel belVar = new bel();
        DEFAULT_INSTANCE = belVar;
        gv9.registerDefaultInstance(bel.class, belVar);
    }

    public static bel b() {
        return DEFAULT_INSTANCE;
    }

    public static zdl e() {
        return (zdl) DEFAULT_INSTANCE.createBuilder();
    }

    public final xdl c() {
        xdl xdlVar = this.imperial_;
        return xdlVar == null ? xdl.b() : xdlVar;
    }

    public final xdl d() {
        xdl xdlVar = this.metric_;
        return xdlVar == null ? xdl.b() : xdlVar;
    }

    public final Object dynamicMethod(gv9$f gv9_f, Object obj, Object obj2) {
        b bVar;
        switch (ydl.a[gv9_f.ordinal()]) {
            case 1:
                return new bel();
            case 2:
                return new zdl(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "metric_", "imperial_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (bel.class) {
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

    public final void f(xdl xdlVar) {
        xdlVar.getClass();
        this.imperial_ = xdlVar;
        this.bitField0_ |= 2;
    }

    public final void g(xdl xdlVar) {
        xdlVar.getClass();
        this.metric_ = xdlVar;
        this.bitField0_ |= 1;
    }
}
