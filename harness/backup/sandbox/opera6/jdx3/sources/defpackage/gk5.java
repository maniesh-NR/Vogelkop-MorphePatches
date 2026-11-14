package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gk5 {
    public static final gk5 a;
    public static final gk5 b;
    public static final /* synthetic */ gk5[] c;

    static {
        gk5 gk5Var = new gk5("FIRST_INSTALL", 0);
        a = gk5Var;
        gk5 gk5Var2 = new gk5("DEEP_LINK", 1);
        b = gk5Var2;
        c = new gk5[]{gk5Var, gk5Var2};
    }

    public static gk5 valueOf(String str) {
        return (gk5) Enum.valueOf(gk5.class, str);
    }

    public static gk5[] values() {
        return (gk5[]) c.clone();
    }
}
