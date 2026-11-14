package ads_mobile_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ze1 {
    public static final ze1 a;
    public static final ze1 b;
    public static final ze1 c;
    public static final /* synthetic */ ze1[] d;

    static {
        ze1 ze1Var = new ze1("INITIALIZATION_NOT_STARTED", 0);
        a = ze1Var;
        ze1 ze1Var2 = new ze1("INITIALIZATION_STARTED", 1);
        b = ze1Var2;
        ze1 ze1Var3 = new ze1("INITIALIZATION_COMPLETE", 2);
        c = ze1Var3;
        d = new ze1[]{ze1Var, ze1Var2, ze1Var3};
    }

    public static ze1[] values() {
        return (ze1[]) d.clone();
    }
}
