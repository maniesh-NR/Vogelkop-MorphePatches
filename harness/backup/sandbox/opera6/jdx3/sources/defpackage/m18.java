package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m18 {
    public static final m18 a;
    public static final m18 b;
    public static final m18 c;
    public static final m18 d;
    public static final /* synthetic */ m18[] e;

    static {
        m18 m18Var = new m18("LOADING", 0);
        a = m18Var;
        m18 m18Var2 = new m18("ENABLED", 1);
        b = m18Var2;
        m18 m18Var3 = new m18("DISABLED", 2);
        c = m18Var3;
        m18 m18Var4 = new m18("FEATURE_NOT_AVAILABLE", 3);
        d = m18Var4;
        e = new m18[]{m18Var, m18Var2, m18Var3, m18Var4};
    }

    public static m18 valueOf(String str) {
        return (m18) Enum.valueOf(m18.class, str);
    }

    public static m18[] values() {
        return (m18[]) e.clone();
    }
}
