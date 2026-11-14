package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cs4 {
    public static final cs4 b;
    public static final cs4 c;
    public static final cs4 d;
    public static final cs4 e;
    public static final cs4 f;
    public static final cs4 g;
    public static final cs4 h;
    public static final cs4 i;
    public static final cs4 j;
    public static final cs4 k;
    public static final cs4 l;
    public static final cs4 m;
    public static final cs4 n;
    public static final cs4 o;
    public static final /* synthetic */ cs4[] p;
    public static final /* synthetic */ h58 q;
    public final String a;

    static {
        cs4 cs4Var = new cs4("DOMAIN_DATA", 0, "domain_data");
        b = cs4Var;
        cs4 cs4Var2 = new cs4("SUGGESTED_LANGUAGES", 1, "suggestedlanguages");
        c = cs4Var2;
        cs4 cs4Var3 = new cs4("OFA_FEATURES_2", 2, "ofa_features_2");
        d = cs4Var3;
        cs4 cs4Var4 = new cs4("CONFIG_BUNDLES", 3, "config_bundles");
        e = cs4Var4;
        cs4 cs4Var5 = new cs4("DOMAIN_VISITS", 4, "domain_visits");
        f = cs4Var5;
        cs4 cs4Var6 = new cs4("PRODUCT_SUGGESTION_SETTINGS", 5, "product_suggestion_settings");
        g = cs4Var6;
        cs4 cs4Var7 = new cs4("WEATHER_SETTINGS", 6, "weather_settings");
        h = cs4Var7;
        cs4 cs4Var8 = new cs4("GOOGLE_SETTINGS", 7, "google_settings");
        i = cs4Var8;
        cs4 cs4Var9 = new cs4("SECURITY_SETTINGS", 8, "security_settings");
        j = cs4Var9;
        cs4 cs4Var10 = new cs4("LIVESCORE_SETTINGS", 9, "livescore_settings");
        k = cs4Var10;
        cs4 cs4Var11 = new cs4("ONBOARDING_SETTINGS", 10, "onboarding_settings");
        l = cs4Var11;
        cs4 cs4Var12 = new cs4("ESIM_SETTINGS", 11, "esim_settings");
        m = cs4Var12;
        cs4 cs4Var13 = new cs4("SEARCH_ENGINES", 12, "search_engines");
        n = cs4Var13;
        cs4 cs4Var14 = new cs4("FEATURE_SUGGESTIONS", 13, "feature_suggestions");
        o = cs4Var14;
        cs4[] cs4VarArr = {cs4Var, cs4Var2, cs4Var3, cs4Var4, cs4Var5, cs4Var6, cs4Var7, cs4Var8, cs4Var9, cs4Var10, cs4Var11, cs4Var12, cs4Var13, cs4Var14};
        p = cs4VarArr;
        q = new h58(cs4VarArr);
    }

    public cs4(String str, int i2, String str2) {
        this.a = str2;
    }

    public static cs4 valueOf(String str) {
        return (cs4) Enum.valueOf(cs4.class, str);
    }

    public static cs4[] values() {
        return (cs4[]) p.clone();
    }
}
