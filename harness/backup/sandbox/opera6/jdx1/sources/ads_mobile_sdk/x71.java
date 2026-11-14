package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x71 {
    public static final x71 a;
    public static final x71 c;
    public static final x71 d;
    public static final /* synthetic */ x71[] e;

    static {
        x71 x71Var = new x71("UNKNOWN", 0);
        a = x71Var;
        x71 x71Var2 = new x71("API", 1);
        x71 x71Var3 = new x71("GESTURE", 2);
        c = x71Var3;
        x71 x71Var4 = new x71("DEBUG_MENU", 3);
        d = x71Var4;
        e = new x71[]{x71Var, x71Var2, x71Var3, x71Var4};
    }

    public static x71[] values() {
        return (x71[]) e.clone();
    }
}
