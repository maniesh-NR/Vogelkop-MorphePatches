package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lu4 {
    public static final lu4 a;
    public static final lu4 b;
    public static final lu4 c;
    public static final lu4 d;
    public static final /* synthetic */ lu4[] e;

    static {
        lu4 lu4Var = new lu4("APP_DISCLAMER", 0);
        a = lu4Var;
        lu4 lu4Var2 = new lu4("APP_RESPONSE", 1);
        b = lu4Var2;
        lu4 lu4Var3 = new lu4("USER", 2);
        c = lu4Var3;
        lu4 lu4Var4 = new lu4("ASSISTANT", 3);
        d = lu4Var4;
        e = new lu4[]{lu4Var, lu4Var2, lu4Var3, lu4Var4};
    }

    public static lu4 valueOf(String str) {
        return (lu4) Enum.valueOf(lu4.class, str);
    }

    public static lu4[] values() {
        return (lu4[]) e.clone();
    }
}
