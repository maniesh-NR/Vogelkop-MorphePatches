package defpackage;

/* loaded from: classes.dex */
public final class ouc extends gv9 implements svd {
    private static final ouc DEFAULT_INSTANCE;
    public static final int HAS_CLICKED_UPSELL_NOTIFICATION_FIELD_NUMBER = 2;
    public static final int HAS_SHOWN_UPSELL_IN_APP_FIELD_NUMBER = 3;
    public static final int HAS_SHOWN_UPSELL_NOTIFICATION_FIELD_NUMBER = 1;
    private static volatile p1g PARSER;
    private int bitField0_;
    private boolean hasClickedUpsellNotification_;
    private boolean hasShownUpsellInApp_;
    private boolean hasShownUpsellNotification_;

    static {
        ouc oucVar = new ouc();
        DEFAULT_INSTANCE = oucVar;
        gv9.registerDefaultInstance(ouc.class, oucVar);
    }

    public static ouc b() {
        return DEFAULT_INSTANCE;
    }

    public final boolean c() {
        return this.hasClickedUpsellNotification_;
    }

    public final boolean d() {
        return this.hasShownUpsellInApp_;
    }

    public final Object dynamicMethod(gv9$f gv9_f, Object obj, Object obj2) {
        b bVar;
        switch (muc.a[gv9_f.ordinal()]) {
            case 1:
                return new ouc();
            case 2:
                return new nuc(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "hasShownUpsellNotification_", "hasClickedUpsellNotification_", "hasShownUpsellInApp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (ouc.class) {
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

    public final boolean e() {
        return this.hasShownUpsellNotification_;
    }

    public final void f() {
        this.bitField0_ |= 2;
        this.hasClickedUpsellNotification_ = true;
    }

    public final void g() {
        this.bitField0_ |= 4;
        this.hasShownUpsellInApp_ = true;
    }

    public final void h() {
        this.bitField0_ |= 1;
        this.hasShownUpsellNotification_ = true;
    }
}
