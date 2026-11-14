package defpackage;

/* loaded from: classes.dex */
public final class q0e extends gv9 implements svd {
    public static final int CITY_FIELD_NUMBER = 3;
    private static final q0e DEFAULT_INSTANCE;
    public static final int ICON_ID_FIELD_NUMBER = 2;
    public static final int LOCATION_ID_FIELD_NUMBER = 1;
    private static volatile p1g PARSER = null;
    public static final int TEMPERATURES_FIELD_NUMBER = 4;
    private int bitField0_;
    private bel temperatures_;
    private String locationId_ = "";
    private String iconId_ = "";
    private String city_ = "";

    static {
        q0e q0eVar = new q0e();
        DEFAULT_INSTANCE = q0eVar;
        gv9.registerDefaultInstance(q0e.class, q0eVar);
    }

    public static q0e c() {
        return DEFAULT_INSTANCE;
    }

    public static o0e g() {
        return (o0e) DEFAULT_INSTANCE.createBuilder();
    }

    public final String b() {
        return this.city_;
    }

    public final String d() {
        return this.iconId_;
    }

    public final Object dynamicMethod(gv9$f gv9_f, Object obj, Object obj2) {
        b bVar;
        switch (n0e.a[gv9_f.ordinal()]) {
            case 1:
                return new q0e();
            case 2:
                return new o0e(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "locationId_", "iconId_", "city_", "temperatures_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (q0e.class) {
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

    public final String e() {
        return this.locationId_;
    }

    public final bel f() {
        bel belVar = this.temperatures_;
        return belVar == null ? bel.b() : belVar;
    }

    public final void h(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.city_ = str;
    }

    public final void i(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.iconId_ = str;
    }

    public final void j(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.locationId_ = str;
    }

    public final void k(bel belVar) {
        belVar.getClass();
        this.temperatures_ = belVar;
        this.bitField0_ |= 8;
    }
}
