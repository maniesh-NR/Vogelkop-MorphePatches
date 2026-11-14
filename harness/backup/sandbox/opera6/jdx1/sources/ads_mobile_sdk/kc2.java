package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kc2 {
    public static final kc2 a;
    public static final kc2 b;
    public static final kc2 c;
    public static final kc2 d;
    public static final /* synthetic */ kc2[] e;

    static {
        kc2 kc2Var = new kc2("SUCCESS", 0);
        a = kc2Var;
        kc2 kc2Var2 = new kc2("FAILURE", 1);
        b = kc2Var2;
        kc2 kc2Var3 = new kc2("RETRY", 2);
        c = kc2Var3;
        kc2 kc2Var4 = new kc2("CACHE_DISABLED", 3);
        d = kc2Var4;
        e = new kc2[]{kc2Var, kc2Var2, kc2Var3, kc2Var4};
    }

    public static kc2[] values() {
        return (kc2[]) e.clone();
    }
}
