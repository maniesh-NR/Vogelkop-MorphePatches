package defpackage;

/* loaded from: classes.dex */
public final class h38 {
    public static final h38 b = new h38(new ix5((byte) 6));
    public static final h38 c = new h38(new s16());
    public static final h38 d = new h38(new hr5());
    public static final h38 e = new h38(new a36());
    public static final h38 f;
    public final g38 a;

    static {
        new h38(new i06((byte) 6));
        new h38(new r16());
        f = new h38(new j06((byte) 6));
    }

    public h38(u38 u38Var) {
        if (tql.a()) {
            this.a = new d06(u38Var);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.a = new qq6(u38Var, (byte) 10);
        } else {
            this.a = new xm5(u38Var);
        }
    }
}
