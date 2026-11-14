package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class km6 {
    public static final km6 a;
    public static final km6 b;
    public static final km6 c;
    public static final km6 d;
    public static final km6 e;
    public static final km6 f;
    public static final /* synthetic */ km6[] g;

    static {
        km6 km6Var = new km6("None", 0);
        a = km6Var;
        km6 km6Var2 = new km6("Manual", 1);
        b = km6Var2;
        km6 km6Var3 = new km6("Auto", 2);
        c = km6Var3;
        km6 km6Var4 = new km6("DeepLink", 3);
        d = km6Var4;
        km6 km6Var5 = new km6("AutoSystem", 4);
        e = km6Var5;
        km6 km6Var6 = new km6("AutoSystem2", 5);
        f = km6Var6;
        g = new km6[]{km6Var, km6Var2, km6Var3, km6Var4, km6Var5, km6Var6, new km6("SettingsBanner", 6)};
    }

    public static km6 valueOf(String str) {
        return (km6) Enum.valueOf(km6.class, str);
    }

    public static km6[] values() {
        return (km6[]) g.clone();
    }
}
