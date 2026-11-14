package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fj6 {
    public static final fj6 a;
    public static final fj6 b;
    public static final /* synthetic */ fj6[] c;

    static {
        fj6 fj6Var = new fj6("WHITESPACE_SEPARATED", 0);
        a = fj6Var;
        fj6 fj6Var2 = new fj6("ARRAY_WRAPPED", 1);
        b = fj6Var2;
        c = new fj6[]{fj6Var, fj6Var2, new fj6("AUTO_DETECT", 2)};
    }

    public static fj6 valueOf(String str) {
        return (fj6) Enum.valueOf(fj6.class, str);
    }

    public static fj6[] values() {
        return (fj6[]) c.clone();
    }
}
