package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class yd4 {
    public static final yd4 a;
    public static final yd4 b;
    public static final yd4 c;
    public static final yd4 d;
    public static final yd4 e;
    public static final yd4 f;
    public static final yd4 g;
    public static final /* synthetic */ yd4[] h;

    static {
        yd4 yd4Var = new yd4("RELEASED", 0);
        a = yd4Var;
        yd4 yd4Var2 = new yd4("RELEASING", 1);
        b = yd4Var2;
        yd4 yd4Var3 = new yd4("CLOSED", 2);
        c = yd4Var3;
        yd4 yd4Var4 = new yd4("PENDING_OPEN", 3);
        d = yd4Var4;
        yd4 yd4Var5 = new yd4("CLOSING", 4);
        e = yd4Var5;
        yd4 yd4Var6 = new yd4("OPENING", 5);
        f = yd4Var6;
        yd4 yd4Var7 = new yd4("OPEN", 6);
        g = yd4Var7;
        h = new yd4[]{yd4Var, yd4Var2, yd4Var3, yd4Var4, yd4Var5, yd4Var6, yd4Var7, new yd4("CONFIGURED", 7)};
    }

    public static yd4 valueOf(String str) {
        return (yd4) Enum.valueOf(yd4.class, str);
    }

    public static yd4[] values() {
        return (yd4[]) h.clone();
    }
}
