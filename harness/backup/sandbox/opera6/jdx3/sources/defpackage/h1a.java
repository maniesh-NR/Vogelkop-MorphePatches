package defpackage;

/* loaded from: classes.dex */
public final class h1a extends gv9 implements svd {
    public static final int CONTEXT_PRIVATE_FIELD_NUMBER = 6;
    public static final int CONTEXT_REGULAR_FIELD_NUMBER = 5;
    private static final h1a DEFAULT_INSTANCE;
    public static final int ERROR_PRIVATE_FIELD_NUMBER = 9;
    public static final int ERROR_REGULAR_FIELD_NUMBER = 8;
    public static final int INTENTS_REGULAR_FIELD_NUMBER = 10;
    public static final int OMNIBAR_PRIVATE_FIELD_NUMBER = 2;
    public static final int OMNIBAR_REGULAR_FIELD_NUMBER = 1;
    private static volatile p1g PARSER = null;
    public static final int SD_PRIVATE_FIELD_NUMBER = 4;
    public static final int SD_REGULAR_FIELD_NUMBER = 3;
    public static final int WIDGET_REGULAR_FIELD_NUMBER = 7;
    private int bitField0_;
    private String omnibarRegular_ = "";
    private String omnibarPrivate_ = "";
    private String sdRegular_ = "";
    private String sdPrivate_ = "";
    private String contextRegular_ = "";
    private String contextPrivate_ = "";
    private String widgetRegular_ = "";
    private String errorRegular_ = "";
    private String errorPrivate_ = "";
    private String intentsRegular_ = "";

    static {
        h1a h1aVar = new h1a();
        DEFAULT_INSTANCE = h1aVar;
        gv9.registerDefaultInstance(h1a.class, h1aVar);
    }

    public static h1a c() {
        return DEFAULT_INSTANCE;
    }

    public final String a() {
        return this.contextPrivate_;
    }

    public final String b() {
        return this.contextRegular_;
    }

    public final String d() {
        return this.errorPrivate_;
    }

    public final Object dynamicMethod(gv9$f gv9_f, Object obj, Object obj2) {
        b bVar;
        switch (g1a.a[gv9_f.ordinal()]) {
            case 1:
                return new h1a();
            case 2:
                return new a(DEFAULT_INSTANCE);
            case 3:
                return gv9.newMessageInfo(DEFAULT_INSTANCE, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t", new Object[]{"bitField0_", "omnibarRegular_", "omnibarPrivate_", "sdRegular_", "sdPrivate_", "contextRegular_", "contextPrivate_", "widgetRegular_", "errorRegular_", "errorPrivate_", "intentsRegular_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p1g p1gVar = PARSER;
                if (p1gVar != null) {
                    return p1gVar;
                }
                synchronized (h1a.class) {
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
        return this.errorRegular_;
    }

    public final String f() {
        return this.intentsRegular_;
    }

    public final String g() {
        return this.omnibarPrivate_;
    }

    public final String h() {
        return this.omnibarRegular_;
    }

    public final String i() {
        return this.sdPrivate_;
    }

    public final String j() {
        return this.sdRegular_;
    }

    public final String k() {
        return this.widgetRegular_;
    }
}
