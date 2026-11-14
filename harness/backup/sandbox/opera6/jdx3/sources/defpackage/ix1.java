package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ix1 {
    public static final ix1 a;
    public static final ix1 b;
    public static final /* synthetic */ ix1[] c;

    static {
        ix1 ix1Var = new ix1("SUCCESS", 0);
        a = ix1Var;
        ix1 ix1Var2 = new ix1("FAILURE", 1);
        b = ix1Var2;
        c = new ix1[]{ix1Var, ix1Var2};
    }

    public static ix1 valueOf(String str) {
        return (ix1) Enum.valueOf(ix1.class, str);
    }

    public static ix1[] values() {
        return (ix1[]) c.clone();
    }
}
