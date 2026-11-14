package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t62 {
    public static final t62 a;
    public static final t62 b;
    public static final /* synthetic */ t62[] c;

    static {
        t62 t62Var = new t62("SHEET", 0);
        a = t62Var;
        t62 t62Var2 = new t62("TAB", 1);
        b = t62Var2;
        c = new t62[]{t62Var, t62Var2};
    }

    public static t62 valueOf(String str) {
        return (t62) Enum.valueOf(t62.class, str);
    }

    public static t62[] values() {
        return (t62[]) c.clone();
    }
}
