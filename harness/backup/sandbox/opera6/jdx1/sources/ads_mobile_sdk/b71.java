package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b71 {
    public static final b71 a;
    public static final b71 b;
    public static final b71 c;
    public static final /* synthetic */ b71[] d;

    static {
        b71 b71Var = new b71("AD_REQUESTED", 0);
        a = b71Var;
        b71 b71Var2 = new b71("AD_LOADED", 1);
        b = b71Var2;
        b71 b71Var3 = new b71("AD_LOAD_FAILED", 2);
        c = b71Var3;
        d = new b71[]{b71Var, b71Var2, b71Var3};
    }

    public static b71[] values() {
        return (b71[]) d.clone();
    }
}
