package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class i82 {
    public static final i82 a;
    public static final i82 b;
    public static final i82 c;
    public static final /* synthetic */ i82[] d;

    static {
        i82 i82Var = new i82("VIDEO", 0);
        a = i82Var;
        i82 i82Var2 = new i82("DISPLAY", 1);
        b = i82Var2;
        i82 i82Var3 = new i82("UNKNOWN", 2);
        c = i82Var3;
        d = new i82[]{i82Var, i82Var2, i82Var3};
    }

    public static i82[] values() {
        return (i82[]) d.clone();
    }
}
