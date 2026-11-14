package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kt1 {
    public static final kt1 a;
    public static final kt1 b;
    public static final kt1 c;
    public static final /* synthetic */ kt1[] d;

    static {
        kt1 kt1Var = new kt1("POSITIVE_BTN_CLICKED", 0);
        a = kt1Var;
        kt1 kt1Var2 = new kt1("NEGATIVE_BTN_CLICKED", 1);
        b = kt1Var2;
        kt1 kt1Var3 = new kt1("DISMISSED", 2);
        c = kt1Var3;
        d = new kt1[]{kt1Var, kt1Var2, kt1Var3};
    }

    public static kt1 valueOf(String str) {
        return (kt1) Enum.valueOf(kt1.class, str);
    }

    public static kt1[] values() {
        return (kt1[]) d.clone();
    }
}
