package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u65 {
    public static final u65 a;
    public static final u65 b;
    public static final u65 c;
    public static final u65 d;
    public static final u65 e;
    public static final u65 f;
    public static final /* synthetic */ u65[] g;

    static {
        u65 u65Var = new u65("ACCEPT_ALL", 0);
        a = u65Var;
        u65 u65Var2 = new u65("DENY_ALL", 1);
        b = u65Var2;
        u65 u65Var3 = new u65("GRANULAR", 2);
        c = u65Var3;
        u65 u65Var4 = new u65("SKIP", 3);
        d = u65Var4;
        u65 u65Var5 = new u65("NEXT", 4);
        e = u65Var5;
        u65 u65Var6 = new u65("NO_INTERACTION", 5);
        f = u65Var6;
        g = new u65[]{u65Var, u65Var2, u65Var3, u65Var4, u65Var5, u65Var6};
    }

    public static u65 valueOf(String str) {
        return (u65) Enum.valueOf(u65.class, str);
    }

    public static u65[] values() {
        return (u65[]) g.clone();
    }
}
