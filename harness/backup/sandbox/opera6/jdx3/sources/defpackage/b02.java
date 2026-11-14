package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b02 {
    public static final b02 a;
    public static final b02 b;
    public static final b02 c;
    public static final b02 d;
    public static final /* synthetic */ b02[] e;

    static {
        b02 b02Var = new b02("LOGIN_AFTER_FIRST_INTERACTION", 0);
        a = b02Var;
        b02 b02Var2 = new b02("LOGIC_AFTER_SANDBOX_IMAGE_GENERATION_LIMIT", 1);
        b = b02Var2;
        b02 b02Var3 = new b02("LOGIN_AFTER_SANDBOX_UNAVAILABLE", 2);
        c = b02Var3;
        b02 b02Var4 = new b02("LOGIN_TO_FINISH_ANONYMOUS_ACCOUNT_SETUP", 3);
        d = b02Var4;
        e = new b02[]{b02Var, b02Var2, b02Var3, b02Var4};
    }

    public static b02 valueOf(String str) {
        return (b02) Enum.valueOf(b02.class, str);
    }

    public static b02[] values() {
        return (b02[]) e.clone();
    }
}
