package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class qi4 {
    public static final qi4 a;
    public static final qi4 b;
    public static final qi4 c;
    public static final /* synthetic */ qi4[] d;

    static {
        qi4 qi4Var = new qi4("PRE_CAPTURE", 0);
        a = qi4Var;
        qi4 qi4Var2 = new qi4("MAIN_CAPTURE", 1);
        b = qi4Var2;
        qi4 qi4Var3 = new qi4("POST_CAPTURE", 2);
        c = qi4Var3;
        d = new qi4[]{qi4Var, qi4Var2, qi4Var3};
    }

    public static qi4 valueOf(String str) {
        return (qi4) Enum.valueOf(qi4.class, str);
    }

    public static qi4[] values() {
        return (qi4[]) d.clone();
    }
}
