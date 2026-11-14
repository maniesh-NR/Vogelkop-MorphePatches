package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n26 {
    public static final n26 a;
    public static final n26 b;
    public static final n26 c;
    public static final /* synthetic */ n26[] d;

    static {
        n26 n26Var = new n26("CROSSED", 0);
        a = n26Var;
        n26 n26Var2 = new n26("NOT_CROSSED", 1);
        b = n26Var2;
        n26 n26Var3 = new n26("COLLAPSED", 2);
        c = n26Var3;
        d = new n26[]{n26Var, n26Var2, n26Var3};
    }

    public static n26 valueOf(String str) {
        return (n26) Enum.valueOf(n26.class, str);
    }

    public static n26[] values() {
        return (n26[]) d.clone();
    }
}
