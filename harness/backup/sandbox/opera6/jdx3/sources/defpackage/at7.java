package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class at7 {
    public static final at7 a;
    public static final at7 b;
    public static final at7 c;
    public static final at7 d;
    public static final at7 e;
    public static final at7 f;
    public static final /* synthetic */ at7[] g;

    static {
        at7 at7Var = new at7("BLUR", 0);
        a = at7Var;
        at7 at7Var2 = new at7("PEN", 1);
        b = at7Var2;
        at7 at7Var3 = new at7("TEXT", 2);
        c = at7Var3;
        at7 at7Var4 = new at7("EMOJI", 3);
        d = at7Var4;
        at7 at7Var5 = new at7("CUTOUT", 4);
        e = at7Var5;
        at7 at7Var6 = new at7("VIEW", 5);
        f = at7Var6;
        g = new at7[]{at7Var, at7Var2, at7Var3, at7Var4, at7Var5, at7Var6, new at7("FREEZE", 6)};
    }

    public static at7 valueOf(String str) {
        return (at7) Enum.valueOf(at7.class, str);
    }

    public static at7[] values() {
        return (at7[]) g.clone();
    }
}
