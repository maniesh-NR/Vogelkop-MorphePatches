package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ga8 {
    public static final ga8 a;
    public static final ga8 b;
    public static final ga8 c;
    public static final /* synthetic */ ga8[] d;

    static {
        ga8 ga8Var = new ga8("UNKNOWN", 0);
        a = ga8Var;
        ga8 ga8Var2 = new ga8("HAS_PLANS", 1);
        b = ga8Var2;
        ga8 ga8Var3 = new ga8("NO_PLANS", 2);
        c = ga8Var3;
        d = new ga8[]{ga8Var, ga8Var2, ga8Var3};
    }

    public static ga8 valueOf(String str) {
        return (ga8) Enum.valueOf(ga8.class, str);
    }

    public static ga8[] values() {
        return (ga8[]) d.clone();
    }
}
