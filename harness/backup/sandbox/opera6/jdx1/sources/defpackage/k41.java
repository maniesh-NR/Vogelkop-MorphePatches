package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k41 {
    public static final k41 a;
    public static final k41 b;
    public static final /* synthetic */ k41[] c;

    static {
        k41 k41Var = new k41("SHOW_ORIGINAL", 0);
        a = k41Var;
        k41 k41Var2 = new k41("SHOW_TRANSLATED", 1);
        b = k41Var2;
        c = new k41[]{k41Var, k41Var2};
    }

    public static k41 valueOf(String str) {
        return (k41) Enum.valueOf(k41.class, str);
    }

    public static k41[] values() {
        return (k41[]) c.clone();
    }
}
