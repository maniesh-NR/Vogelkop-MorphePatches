package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k11 {
    public static final k11 a;
    public static final k11 b;
    public static final /* synthetic */ k11[] c;

    static {
        k11 k11Var = new k11("CENTER", 0);
        a = k11Var;
        k11 k11Var2 = new k11("END", 1);
        b = k11Var2;
        c = new k11[]{k11Var, k11Var2, new k11("START", 2)};
    }

    public static k11 valueOf(String str) {
        return (k11) Enum.valueOf(k11.class, str);
    }

    public static k11[] values() {
        return (k11[]) c.clone();
    }
}
