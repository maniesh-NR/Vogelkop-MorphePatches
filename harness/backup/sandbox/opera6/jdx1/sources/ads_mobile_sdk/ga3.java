package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ga3 {
    public static final ga3 a;
    public static final ga3 b;
    public static final ga3 c;
    public static final /* synthetic */ ga3[] d;

    static {
        ga3 ga3Var = new ga3("QUERY", 0);
        a = ga3Var;
        ga3 ga3Var2 = new ga3("VIEW", 1);
        b = ga3Var2;
        ga3 ga3Var3 = new ga3("CLICK", 2);
        c = ga3Var3;
        d = new ga3[]{ga3Var, ga3Var2, ga3Var3};
    }

    public static ga3[] values() {
        return (ga3[]) d.clone();
    }
}
