package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hx7 {
    public static final hx7 a;
    public static final hx7 b;
    public static final hx7 c;
    public static final /* synthetic */ hx7[] d;

    static {
        hx7 hx7Var = new hx7("ELIGIBLE", 0);
        a = hx7Var;
        hx7 hx7Var2 = new hx7("ALREADY_CLAIMED", 1);
        b = hx7Var2;
        hx7 hx7Var3 = new hx7("INVALID_COUNTRY", 2);
        c = hx7Var3;
        d = new hx7[]{hx7Var, hx7Var2, hx7Var3};
    }

    public static hx7 valueOf(String str) {
        return (hx7) Enum.valueOf(hx7.class, str);
    }

    public static hx7[] values() {
        return (hx7[]) d.clone();
    }
}
