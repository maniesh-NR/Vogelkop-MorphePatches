package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b56 {
    public static final b56 a;
    public static final b56 b;
    public static final b56 c;
    public static final /* synthetic */ b56[] d;

    static {
        b56 b56Var = new b56("None", 0);
        a = b56Var;
        b56 b56Var2 = new b56("Cancelled", 1);
        b = b56Var2;
        b56 b56Var3 = new b56("Redirected", 2);
        c = b56Var3;
        d = new b56[]{b56Var, b56Var2, b56Var3, new b56("RedirectCancelled", 3)};
    }

    public static b56 valueOf(String str) {
        return (b56) Enum.valueOf(b56.class, str);
    }

    public static b56[] values() {
        return (b56[]) d.clone();
    }
}
