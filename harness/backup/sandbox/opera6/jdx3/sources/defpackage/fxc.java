package defpackage;

/* loaded from: classes.dex */
public final class fxc extends gv9 implements svd {
    private static final fxc DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile p1g PARSER;
    private int bitField0_;
    private String id_ = "";
    private String name_ = "";

    static {
        fxc fxcVar = new fxc();
        DEFAULT_INSTANCE = fxcVar;
        gv9.registerDefaultInstance(fxc.class, fxcVar);
    }

    public static fxc b() {
        return DEFAULT_INSTANCE;
    }

    public static exc e() {
        return (exc) DEFAULT_INSTANCE.createBuilder();
    }

    public final String c() {
        return this.id_;
    }

    public final String d() {
        return this.name_;
    }

    public final Object dynamicMethod(gv9$f gv9_f, Object obj, Object obj2) {
        b bVar;
        switch (dxc.a[gv9_f.ordinal()]) {
            case 1:
                return new fxc();
            case 2:
                return new exc(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "id_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (fxc.class) {
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

    public final void f(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    public final void g(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.name_ = str;
    }
}
