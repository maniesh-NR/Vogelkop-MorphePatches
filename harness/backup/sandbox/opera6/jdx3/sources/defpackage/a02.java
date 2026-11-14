package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a02 {
    public static final a02 a;
    public static final a02 b;
    public static final a02 c;
    public static final /* synthetic */ a02[] d;

    static {
        a02 a02Var = new a02("OPERA", 0);
        a = a02Var;
        a02 a02Var2 = new a02("GOOGLE", 1);
        b = a02Var2;
        a02 a02Var3 = new a02("SANDBOX", 2);
        c = a02Var3;
        d = new a02[]{a02Var, a02Var2, a02Var3};
    }

    public static a02 valueOf(String str) {
        return (a02) Enum.valueOf(a02.class, str);
    }

    public static a02[] values() {
        return (a02[]) d.clone();
    }
}
