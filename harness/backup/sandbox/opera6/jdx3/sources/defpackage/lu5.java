package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class lu5 {
    public static final lu5 a;
    public static final lu5 b;
    public static final lu5 c;
    public static final lu5 d;
    public static final /* synthetic */ lu5[] e;

    static {
        lu5 lu5Var = new lu5("VISIBLE", 0);
        a = lu5Var;
        lu5 lu5Var2 = new lu5("HIDDEN", 1);
        b = lu5Var2;
        lu5 lu5Var3 = new lu5("POSTPONED", 2);
        c = lu5Var3;
        lu5 lu5Var4 = new lu5("DISMISSED", 3);
        d = lu5Var4;
        e = new lu5[]{lu5Var, lu5Var2, lu5Var3, lu5Var4};
    }

    public static lu5 valueOf(String str) {
        return (lu5) Enum.valueOf(lu5.class, str);
    }

    public static lu5[] values() {
        return (lu5[]) e.clone();
    }
}
