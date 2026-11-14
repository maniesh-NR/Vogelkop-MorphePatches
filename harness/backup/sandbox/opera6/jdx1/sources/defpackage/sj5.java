package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class sj5 {
    public static final sj5 a;
    public static final sj5 b;
    public static final sj5 c;
    public static final sj5 d;
    public static final /* synthetic */ sj5[] e;

    static {
        sj5 sj5Var = new sj5("ALWAYS_OVERRIDE", 0);
        a = sj5Var;
        sj5 sj5Var2 = new sj5("HIGH_PRIORITY_REQUIRED", 1);
        b = sj5Var2;
        sj5 sj5Var3 = new sj5("REQUIRED", 2);
        c = sj5Var3;
        sj5 sj5Var4 = new sj5("OPTIONAL", 3);
        d = sj5Var4;
        e = new sj5[]{sj5Var, sj5Var2, sj5Var3, sj5Var4};
    }

    public static sj5 valueOf(String str) {
        return (sj5) Enum.valueOf(sj5.class, str);
    }

    public static sj5[] values() {
        return (sj5[]) e.clone();
    }
}
