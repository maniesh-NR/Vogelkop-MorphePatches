package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d59 {
    public static final d59 a;
    public static final d59 b;
    public static final d59 c;
    public static final d59 d;
    public static final d59 e;
    public static final d59 f;
    public static final d59 g;
    public static final /* synthetic */ d59[] h;

    static {
        d59 d59Var = new d59("APPSFLYER", 0);
        a = d59Var;
        d59 d59Var2 = new d59("FLOW_TOUCH", 1);
        b = d59Var2;
        d59 d59Var3 = new d59("SYNC", 2);
        c = d59Var3;
        d59 d59Var4 = new d59("LEANPLUM", 3);
        d = d59Var4;
        d59 d59Var5 = new d59("NEWS_SERVER", 4);
        e = d59Var5;
        d59 d59Var6 = new d59("SUBSCRIPTIONS", 5);
        f = d59Var6;
        d59 d59Var7 = new d59("REWARDS", 6);
        g = d59Var7;
        h = new d59[]{d59Var, d59Var2, d59Var3, d59Var4, d59Var5, d59Var6, d59Var7};
    }

    public static d59 valueOf(String str) {
        return (d59) Enum.valueOf(d59.class, str);
    }

    public static d59[] values() {
        return (d59[]) h.clone();
    }
}
