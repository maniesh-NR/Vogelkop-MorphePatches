package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ub4 {
    public static final ub4 a;
    public static final ub4 b;
    public static final ub4 c;
    public static final ub4 d;
    public static final ub4 e;
    public static final ub4 f;
    public static final /* synthetic */ ub4[] g;

    static {
        ub4 ub4Var = new ub4("UNKNOWN", 0);
        a = ub4Var;
        ub4 ub4Var2 = new ub4("INACTIVE", 1);
        b = ub4Var2;
        ub4 ub4Var3 = new ub4("SEARCHING", 2);
        c = ub4Var3;
        ub4 ub4Var4 = new ub4("FLASH_REQUIRED", 3);
        d = ub4Var4;
        ub4 ub4Var5 = new ub4("CONVERGED", 4);
        e = ub4Var5;
        ub4 ub4Var6 = new ub4("LOCKED", 5);
        f = ub4Var6;
        g = new ub4[]{ub4Var, ub4Var2, ub4Var3, ub4Var4, ub4Var5, ub4Var6};
    }

    public static ub4 valueOf(String str) {
        return (ub4) Enum.valueOf(ub4.class, str);
    }

    public static ub4[] values() {
        return (ub4[]) g.clone();
    }
}
